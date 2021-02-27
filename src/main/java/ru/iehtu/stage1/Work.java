package ru.iehtu.stage1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Work {
    
    
    private Man worker;
    private String description;

    @Autowired
    public Work(Man worker, @Value("Газонокосильщик") String description){
        this.worker = worker;
        this.description = description;
    }

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

    public String getInfoLos(){
        return "\nЗа " + getDescription() + " " + worker.getName() + " заработал " + getLoss() + " руб.\n";
    }

}