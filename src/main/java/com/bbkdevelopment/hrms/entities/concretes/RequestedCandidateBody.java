package com.bbkdevelopment.hrms.entities.concretes;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class RequestedCandidateBody extends Candidate {
    @NotEmpty
    @NotBlank(message = "Second password can not be empty!")
    private String secondPassword;
}
