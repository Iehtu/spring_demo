package ru.iehtu.stage1;

public class Work {
    private Man worker;
    private String description;

    public Work(String description) {
        this.description = description;
    }

    public Man getWorker() {
        return worker;
    }

    public void setWorker(Man worker) {
        this.worker = worker;
    }

    public String getDescription() {
        return description;
    }
    
    public int getLoss(){
        return worker.getSalary() * 20;
    }

}