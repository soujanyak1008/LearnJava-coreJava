package com.tutorials.coreJava.comparatorEx;

public class Employees {

   private String name;
   private String role;
   private int ranking;

    public Employees(String name, String role, int ranking) {
        this.name = name;
        this.role = role;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", ranking=" + ranking +
                '}';
    }
}
