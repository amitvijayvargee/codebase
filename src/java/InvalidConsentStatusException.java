package com.chc.experience.mule.exception;

public class InvalidConsentStatusException extends ChcExperienceBaseException {

    private static final long serialVersionUID = 1L;

    public InvalidConsentStatusException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public InvalidConsentStatusException(Integer errorCode) {
        super(errorCode, null);
    }
}
