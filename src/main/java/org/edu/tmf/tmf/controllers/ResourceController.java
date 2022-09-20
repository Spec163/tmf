package org.edu.tmf.tmf.controllers;

import org.edu.tmf.tmf.model.ObjectsEntity;
import org.edu.tmf.tmf.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resource")
public class ResourceController {

    private final ResourceService resourceService;

    @Autowired
    public ResourceController(final ResourceService resourceService) {
        this.resourceService = resourceService;
    }


    @GetMapping(value = "/get")
    public List<ObjectsEntity> getResources(
            @RequestParam("type") final Long type,
            @RequestParam("quantity") final Integer quantity
    ) {
        // todo: return n (quantity) resources of type = type

        return resourceService.getResourcesByTMF639(type, quantity);
    }

}
