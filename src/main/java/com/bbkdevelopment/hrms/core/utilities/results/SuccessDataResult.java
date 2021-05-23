package com.bbkdevelopment.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{
    public SuccessDataResult(T data) {
        super(data, true);
    }

    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }

    public SuccessDataResult() {
        super(null, true);
    }

    public SuccessDataResult(String message) {
        super(null, true,message);
    }
}
