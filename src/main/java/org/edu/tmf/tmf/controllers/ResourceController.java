package org.edu.tmf.tmf.controllers;

import org.edu.tmf.tmf.dto.PatchReservationState;
import org.edu.tmf.tmf.dto.ReservationRequest;
import org.edu.tmf.tmf.dto.ReservationResponse;
import org.edu.tmf.tmf.services.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resource")
public class ResourceController { //todo: add argument validation!

    private final ResourceService resourceService;

    @Autowired
    public ResourceController(final ResourceService resourceService) {
        this.resourceService = resourceService;
    }


    @GetMapping
    public List<String> getResources(
            @RequestParam("type") final Long type,
            @RequestParam("quantity") final Integer quantity
    ) {
        return resourceService.getResourcesByTMF639(type, quantity);
    }

    @PostMapping(value = "/reservation")
    public ResponseEntity<ReservationResponse> reserveResource(@RequestBody final ReservationRequest reservationRequest) {
        return ResponseEntity.ok(this.resourceService.reserveResourceByTMF641(reservationRequest));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Long> changeReservationState(
            @PathVariable("id") final Long reservationId,
            @RequestBody final PatchReservationState state
    ) {
        return ResponseEntity.ok(this.resourceService.changeReservationState(reservationId, state));
    }
}
