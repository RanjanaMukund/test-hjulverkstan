package se.hjulverkstan.main.location.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.location.dto.request.LocationDto;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLocationDto {
    private List<LocationDto> locations;
}