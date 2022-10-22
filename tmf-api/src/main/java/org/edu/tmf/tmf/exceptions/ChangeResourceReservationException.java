package org.edu.tmf.tmf.exceptions;

public class ChangeResourceReservationException extends RuntimeException {
    public ChangeResourceReservationException(final Long reservationId) {
        super(String.format("Reservation with ID=%s not found!", reservationId));
    }
    public ChangeResourceReservationException(final String incorrectState) {
        super(String.format("Incorrect state - %s", incorrectState));
    }

    public ChangeResourceReservationException() {
        super("Failed to change reservation state, because reservation state equals COMPLETED or CANCELLED!");
    }
}
