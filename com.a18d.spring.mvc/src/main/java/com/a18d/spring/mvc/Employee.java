package com.a18d.spring.mvc;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @NotNull
    @Size(min =5, message = "name must be minimum 2 symbols")
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map <String, String> departments;
    private String eng;
    private Map<String, String> lang;
    private String [] books;
    private Map<String, String> booksMap;

    public Employee() {
        departments = new HashMap<>();
        departments.put("rubl", "RUB");
        departments.put("dollar", "USA");
        departments.put("iena", "JPY");

        lang = new HashMap<>();
        lang.put("Yes", "Yes");
        lang.put("No", "No");

        booksMap = new HashMap<>();
        booksMap.put("Pushkin", "AS _Pushkin");
        booksMap.put("Goncharov", "I Goncharov");
        booksMap.put("Mitchell", "M Mitchell");
        booksMap.put("Sabbatini", "R Sabbatini");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Map<String, String> getBooksMap() {
        return booksMap;
    }

    public void setBooksMap(Map<String, String> booksMap) {
        this.booksMap = booksMap;
    }

    public int getSalary() {
        return salary;
    }

    public String getEng() {
        return eng;
    }

    public Map<String, String> getLang() {
        return lang;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setLang(Map<String, String> lang) {
        this.lang = lang;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
