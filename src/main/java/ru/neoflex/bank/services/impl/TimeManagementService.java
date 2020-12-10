package ru.neoflex.bank.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.neoflex.bank.converters.IMaxoptraResponseMapper;
import ru.neoflex.bank.web.requests.TimeSlotRequest;
import ru.neoflex.bank.web.responses.*;
import ru.neoflex.bank.services.ITimeManagementService;
import ru.neoflex.bank.services.thridparty.maxoptra.IMaxoptraWebClient;

@Service
@RequiredArgsConstructor
public class TimeManagementService implements ITimeManagementService {

    private final IMaxoptraWebClient maxoptraServiceApiClient;
    private final IMaxoptraResponseMapper maxoptraResponseMapper;

    @Override
    public Mono<DateResponse> getVacantDate(TimeSlotRequest request) {
        return maxoptraServiceApiClient.getAvailableDates(request)
                .map(maxoptraResponseMapper::maxoptraToResponse);
    }
}
