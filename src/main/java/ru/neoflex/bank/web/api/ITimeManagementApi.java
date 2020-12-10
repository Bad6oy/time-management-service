package ru.neoflex.bank.web.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reactor.core.publisher.Mono;
import ru.neoflex.bank.web.requests.TimeSlotRequest;
import ru.neoflex.bank.web.responses.*;

@Api(value = "Api provide access to obtain information about vacant slots for delivery any " +
        "product of bank(credit card, money, e.t.c")
@RequestMapping("/reservations")
public interface ITimeManagementApi {

    @RequestMapping(value = "/dates", method = RequestMethod.GET, produces = {"application/json"})
    @ApiOperation(value = "Get all vacant date to obtain any bank product")
    @ApiResponses({
            @ApiResponse(code = 404, message = "Not found any vacant slots"),
            @ApiResponse(code = 200, message = "Found vacant slot")
    })
    Mono<DateResponse> getVacantDates(TimeSlotRequest request);
}
