package pro.sky.bankingservice.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserDtoIn {

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull(message = "Счет не должен быть пустым!")
    @DecimalMin(value = "0.01", message = "Значение счета должно быть больше 0")
    private BigDecimal balance;

    @NotNull
    private long accountNumber;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")
    private String email;

    @NotNull
    @Pattern(regexp = "\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}",
            message = "Телефон должен соответствовать следующему шаблону: +7(000)000-00-00")
    private String phone;

}
