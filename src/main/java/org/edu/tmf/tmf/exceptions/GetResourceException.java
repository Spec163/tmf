package org.edu.tmf.tmf.exceptions;

public class GetResourceException extends RuntimeException {
    public GetResourceException(final Long typeId, final Throwable cause) {
        super(String.format("Failed to find resources by objectTypeId=%s", typeId), cause);
    }
}
