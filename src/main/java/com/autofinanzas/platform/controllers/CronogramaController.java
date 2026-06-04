package com.autofinanzas.platform.controllers;

import com.autofinanzas.platform.dto.CronogramaDTO;
import com.autofinanzas.platform.entidades.CronogramaPagos;
import com.autofinanzas.platform.interfaces.CronogramaPagosInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Cronograma")
public class CronogramaController {
    @Autowired
    private CronogramaPagosInterface ci;

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar(@RequestBody CronogramaDTO dto) {

        ModelMapper m = new ModelMapper();

        CronogramaPagos entidad = m.map(dto, CronogramaPagos.class);

        ci.insert(entidad);

        CronogramaDTO responseDTO = m.map(entidad, CronogramaDTO.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseDTO);
    }
    @GetMapping("/listar")
    public List<CronogramaDTO> findAll(){
        return ci.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CronogramaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/listar/{id}")
    public ResponseEntity<List<CronogramaDTO>> findById(@PathVariable("id") int id) {

        List<CronogramaPagos> lista = ci.findByIdCronogramaPago(id);

        if (lista.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        ModelMapper mapper = new ModelMapper();

        List<CronogramaDTO> dtoList = lista.stream()
                .map(c -> mapper.map(c, CronogramaDTO.class))
                .toList();

        return ResponseEntity.ok(dtoList);
    }

    @PutMapping("/update")
    public ResponseEntity<String> modificar(@RequestBody CronogramaDTO dto) {

        ModelMapper m = new ModelMapper();
        CronogramaPagos c = m.map(dto, CronogramaPagos.class);

        List<CronogramaPagos> existentes =
                ci.findByIdCronogramaPago(c.getIdCronogramaPago());

        if (existentes.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se puede modificar. No existe un registro con el ID: "
                            + c.getIdCronogramaPago());
        }

        ci.update(c);

        return ResponseEntity.ok(
                "Registro con ID " + c.getIdCronogramaPago()
                        + " modificado correctamente.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable int id) {
        ci.delete(id);
        return ResponseEntity.noContent().build();
    }
}
