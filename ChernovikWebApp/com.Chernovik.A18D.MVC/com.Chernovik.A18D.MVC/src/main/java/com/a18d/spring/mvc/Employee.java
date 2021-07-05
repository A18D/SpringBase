package com.a18d.spring.mvc;

import com.a18d.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min =5, message = "name must be minimum 5 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value=500, message="must be greater than 499")
    @Max(value=1000, message="must be less than 1001")
    private int salary;
    private String department;
    private Map <String, String> departments;
    private String eng;
    private Map<String, String> lang;
    private String [] books;
    private Map<String, String> booksMap;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "use pattern XXX-XX-XX")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
