package ru.sber.uderganie.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@ToString
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "CLAIM")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_claim_id")
    @SequenceGenerator(name = "seq_claim_id", sequenceName = "seq_claim_id", allocationSize = 1)
    private Long id;

    // Табельный номер сотрудинка
    String empleyeeId;

    // ID заявления
    String claimId;

    // Дата увольнения
    LocalDate fireDate;

    // Тип увольнения, например, по собственному желанию
    String fireType;

    // Статус заявления
    String claimStatus;

    // Статус исполнения
    String executionStatus;

    // Причина указанная сотрудником
    String employeeReason;
}
