package com.example.jagodavat;

public class Root {

    public Result result;

    public Root(Result result) {
        this.result = result;
    }

    public String getVatStatus(){
        return result.getSubject().getStatusVat();
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

}
