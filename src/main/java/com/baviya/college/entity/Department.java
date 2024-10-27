package com.baviya.college.entity;
// Importing required classes
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Annotations
    @Entity
    @Table(name="Department")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder

// Class
    public class Department {

        @Id
      //  @GeneratedValue(strategy = GenerationType.AUTO)
        private Long departmentId;
        private String departmentName;
        private String departmentAddress;
        private String departmentCode;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode=" + departmentCode +
                '}';
    }
   /* public Department() {
        // Default constructor
    }
    public Department(Long departmentId,String departmentName, String departmentAddress, String departmentCode) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode=departmentCode;
    }*/

}


