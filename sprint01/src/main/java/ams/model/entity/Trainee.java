package ams.model.entity;

import ams.enums.AllowanceGroup;
import ams.enums.Gender;
import ams.enums.TraineeStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
public class Trainee extends BaseEntity {
    @NotNull
    private String account;
    @NotNull
    @Nationalized
    private String fullName;
    @NotNull
    private LocalDate dob;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String university;
    private String faculty;
    @Pattern(regexp = "^(\\+84|0)\\d{9,10}$")
    private String phone;
    @Email
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private TraineeStatus status;
    private String tpbAccount;
    private Double salary;
    private Date commitment;
    private AllowanceGroup allowanceGroup;;



}
