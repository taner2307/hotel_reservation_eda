package com.taner23.common.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationCreatedEvent {

    private UUID reservationId;
    private Long customerId;
    private Long roomId;
    private BigDecimal totalPrice;
    private String status; // PENDING, SUCCESS, FAILED
}
