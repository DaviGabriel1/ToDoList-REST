package br.org.davi.todolistwithrest.enums;

public enum Status {
    PENDING("pending"),COMPLETED("completed");

    private String statusName;

    private Status(String name){
        this.statusName=name;
    }


}
