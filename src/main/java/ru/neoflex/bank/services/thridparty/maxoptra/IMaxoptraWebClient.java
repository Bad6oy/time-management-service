package ru.neoflex.bank.services.thridparty.maxoptra;

import reactor.core.publisher.Mono;
import ru.neoflex.bank.web.requests.TimeSlotRequest;
import ru.neoflex.bank.web.thirdparty.maxoptra.VacantDateResponse;

public interface IMaxoptraWebClient {

    Mono<VacantDateResponse> getAvailableDates(TimeSlotRequest request);
}
