package ru.neoflex.bank.services;

import reactor.core.publisher.Mono;
import ru.neoflex.bank.web.requests.TimeSlotRequest;
import ru.neoflex.bank.web.responses.*;

public interface ITimeManagementService {
   Mono<DateResponse> getVacantDate(TimeSlotRequest request);
}
