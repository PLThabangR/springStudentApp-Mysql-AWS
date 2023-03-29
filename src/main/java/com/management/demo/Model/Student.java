package com.management.demo.Model;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Students")
public class Student {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="First_name",nullable = false)
    private String firstName;
    @Column(name="Last_name",nullable = false)
    private String lastName;
    @Column(name="Email",nullable = false)
    private String email;
    @Column(name="Phone_number",nullable = false)
    private String phoneNum;

    public Student(String firstName, String lastName, String email, String phoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNum = phoneNum;
    }
}
