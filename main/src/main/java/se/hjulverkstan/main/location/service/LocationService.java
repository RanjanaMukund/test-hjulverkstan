package se.hjulverkstan.main.location.service;

import se.hjulverkstan.main.location.dto.request.LocationDto;
import se.hjulverkstan.main.location.dto.request.NewLocationDto;
import se.hjulverkstan.main.location.dto.response.GetAllLocationDto;

public interface LocationService {
    GetAllLocationDto getAllLocation();

    LocationDto getLocationById(Long id);

    LocationDto deleteLocation(Long id);

    LocationDto editLocation(Long id, LocationDto location);

    LocationDto createLocation(NewLocationDto newLocation);
}