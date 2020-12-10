package ru.neoflex.bank.web.thirdparty.maxoptra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacantDateResponse {
    private int id;
    private List<String> date;
}
