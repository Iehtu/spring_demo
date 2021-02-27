package ru.iehtu.stage1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Man {
    private static int counter = 0;
    private int id;
    
    @Value("Олег")
    private String name;
    
    @Value("100")
    private int salary;

    public Man() {
        id=counter++;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
