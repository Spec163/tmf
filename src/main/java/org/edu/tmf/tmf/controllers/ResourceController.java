package org.edu.tmf.tmf.controllers;

import org.edu.tmf.tmf.dto.EntityDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/resource")
public class ResourceController {


    @GetMapping(value = "/get", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EntityDTO> getResources(
            @RequestParam("type") final String type,
            @RequestParam("quantity") final Integer quantity
    ) {
        // todo: return n (quantity) resources of type = type

        return new ArrayList<>();
    }

}
