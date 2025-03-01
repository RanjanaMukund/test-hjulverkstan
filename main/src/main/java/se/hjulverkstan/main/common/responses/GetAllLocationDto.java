package se.hjulverkstan.main.common.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.dto.LocationDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLocationDto {
    private List<LocationDto> locations;
}