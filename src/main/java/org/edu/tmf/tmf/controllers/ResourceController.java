package org.edu.tmf.tmf.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "TMF API")
public class ResourceController { //todo: add argument validation!

    private final ResourceService resourceService;

    @Autowired
    public ResourceController(final ResourceService resourceService) {
        this.resourceService = resourceService;
    }


    @GetMapping
    @Operation(
        summary = "Get Resources by TMF639",
        description = "Returns resources by object types",
        method = "GET")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the resources",
            content = { @Content(mediaType = "application/json",
                schema = @Schema(implementation = ReservationResponse.class)) }),
        @ApiResponse(responseCode = "400", description = "Incorrect object type Id",
            content = @Content) })
    public List<String> getResources(
        @Parameter(name = "type", description = "Object type of resource", required = true)
        @RequestParam("type") final Long type,
        @Parameter(name = "quantity", description = "Number of resource", required = true)
        @RequestParam("quantity") final Integer quantity
    ) {
        return resourceService.getResourcesByTMF639(type, quantity);
    }

    @PostMapping(value = "/reservation")
    @Operation(
            summary = "Reserve Resources by TMF641",
            description = "Returns reservation response with reservation info",
            method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Resource Reservation  has been created and moved to IN_PROGRESS state",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = ReservationResponse.class)) }),
            @ApiResponse(responseCode = "400", description = "Incorrect input data or resource state",
                    content = @Content) })
    public ResponseEntity<ReservationResponse> reserveResource(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Resource type, pool, name", required = true, content = @Content)
            @RequestBody final ReservationRequest reservationRequest
    ) {
        return ResponseEntity.ok(this.resourceService.reserveResourceByTMF641(reservationRequest));
    }

    @PatchMapping("/{id}")
    @Operation(
            summary = "Change reservation state",
            method = "PATCH")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Resource Reservation  has been created and moved to IN_PROGRESS state",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Long.class)) }),
            @ApiResponse(responseCode = "400", description = "Incorrect reservation state",
                    content = @Content) })
    public ResponseEntity<Long> changeReservationState(
        @PathVariable("id") final Long reservationId,
        @RequestBody final PatchReservationState state
    ) {
        return ResponseEntity.ok(this.resourceService.changeReservationState(reservationId, state.getReservationState()));
    }
}
