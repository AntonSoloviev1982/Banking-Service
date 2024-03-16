package pro.sky.bankingservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "`user`")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;

    private String password;

    private String email;

    private String phone;

    @OneToOne(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Account account;

    private String firstName;

    private String patronymic;

    private String lastName;

    private LocalDate birthday;

}


