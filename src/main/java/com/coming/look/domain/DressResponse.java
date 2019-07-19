package com.coming.look.domain;

/**
 * @Date: 2019/7/8
 * @Description
 */
public class DressResponse {

    private boolean isSuccess;

    private Object data;

    public DressResponse(boolean isSuccess, Object obj){
        this.isSuccess = isSuccess;
        this.data = obj;
    }

    public DressResponse(){
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
