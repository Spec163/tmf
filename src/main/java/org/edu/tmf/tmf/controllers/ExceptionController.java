package org.edu.tmf.tmf.controllers;

import org.edu.tmf.tmf.exceptions.ChangeResourceReservationException;
import org.edu.tmf.tmf.exceptions.ReservationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {ReservationException.class})
    public ResponseEntity<Object> reserveException(final ReservationException re) {
        return new ResponseEntity<>(re.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {ChangeResourceReservationException.class})
    public ResponseEntity<Object> changeResourceReservationException(final ChangeResourceReservationException cre) {
        return new ResponseEntity<>(cre.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
