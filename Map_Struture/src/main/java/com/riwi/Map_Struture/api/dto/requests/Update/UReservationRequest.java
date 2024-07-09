package com.riwi.Map_Struture.api.dto.requests.Update;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UReservationRequest {
    @NotBlank(message= "El campo reservation_date es requerido")
    private LocalDateTime reservation_date;
    @NotBlank(message= "El campo status es requerido")
    @Size(min = 0 , max = 20, message = "El nombre de status supera la cantidad de caracteres permitidos")
    private String status;
}
