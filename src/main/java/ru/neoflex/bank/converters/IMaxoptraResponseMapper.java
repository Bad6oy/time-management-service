package ru.neoflex.bank.converters;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.neoflex.bank.web.responses.*;
import ru.neoflex.bank.web.thirdparty.maxoptra.VacantDateResponse;

@Mapper(componentModel = "spring")
public interface IMaxoptraResponseMapper {

    @Mapping(target ="id", source ="maxoptraResponse.id")
    @Mapping(target = "date", source = "maxoptraResponse.date")
    DateResponse maxoptraToResponse(VacantDateResponse maxoptraResponse);
}
