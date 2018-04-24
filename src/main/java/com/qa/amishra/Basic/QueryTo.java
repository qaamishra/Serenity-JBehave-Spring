package com.qa.amishra.Basic;

public class QueryTo {

    public static String dropEmpolyeeTable() {
        return "DROP TABLE IF EXISTS Employee;";
    }

    public static String createEmpolyeeTable() {
        return "CREATE TABLE Employee(ID INT PRIMARY KEY, NAME VARCHAR(255),PHONE number(10));";
    }

    public static String insertIntoEmpolyeeTable() {
        return "INSERT INTO Employee(ID,NAME,PHONE) VALUES(?,?,?);";
    }

    public static String insertIntoEmpolyeeTableWhere() {

        return "UPDATE Employee SET NAME=?,PHONE=? WHERE ID=?;";
    }

    public static String selectFromEmpolyeeTableWhere() {

        return "SELECT * FROM Employee WHERE ID=?";
    }
}
