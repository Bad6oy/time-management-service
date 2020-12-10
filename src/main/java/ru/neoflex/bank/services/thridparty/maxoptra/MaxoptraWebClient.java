package ru.neoflex.bank.services.thridparty.maxoptra;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import ru.neoflex.bank.web.requests.TimeSlotRequest;
import ru.neoflex.bank.web.thirdparty.maxoptra.VacantDateResponse;

@Slf4j
@Service
@RequiredArgsConstructor
public class MaxoptraWebClient implements IMaxoptraWebClient {

    private static final String GET_ALL_SLOTS = "/slots";

    @Qualifier("maxoptraWebClientBuilder")
    private final WebClient webClient;

    @Override
    public Mono<VacantDateResponse> getAvailableDates(TimeSlotRequest request) {
        return webClient.post().uri(GET_ALL_SLOTS)
                .accept(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(VacantDateResponse.class);
    }
}
