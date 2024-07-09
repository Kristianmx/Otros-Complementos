package com.riwi.Map_Struture.api.error_handler.errors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorsResponse  extends BaseErrorResponse{
    private List<String> errors;
}
