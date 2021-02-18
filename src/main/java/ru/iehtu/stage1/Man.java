package ru.iehtu.stage1;

public class Man {
    private static int counter = 0;
    private int id;
    private String name;
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
