package com.pjonas.employees.dtos;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmployeeDto(
    @NotNull String matriculaId, 
    @NotBlank String numeral, 
    @NotNull String postoGrad, 
    @NotNull String nomeCompleto,
    @NotNull Date dataNascimento,
    @NotNull String cpf,
    @NotNull String idCivil) {
    
}
