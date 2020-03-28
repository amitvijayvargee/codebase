package com.chc.experience.mule.exception;

public class InvalidAccountPermissionException extends ChcExperienceBaseException {

    private static final long serialVersionUID = 1L;

    public InvalidAccountPermissionException(Integer errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public InvalidAccountPermissionException(Integer errorCode) {
        super(errorCode, null);
    }
}
