package ru.neoflex.bank.web.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;
import ru.neoflex.bank.services.ITimeManagementService;
import ru.neoflex.bank.web.api.ITimeManagementApi;
import ru.neoflex.bank.web.requests.TimeSlotRequest;
import ru.neoflex.bank.web.responses.*;

@Controller
@RequiredArgsConstructor
public class TimeManagementController implements ITimeManagementApi {

    private final ITimeManagementService timeManagementService;

    @Override
    public Mono<DateResponse> getVacantDates(TimeSlotRequest request) {
        return timeManagementService.getVacantDate(request);
    }
}
