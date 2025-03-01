package se.hjulverkstan.main.location.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/location")
public class LocationController {
    private final LocationService service;

    public LocationController(LocationService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<GetAllLocationDto> getAllLocations() {
        return new ResponseEntity<>(service.getAllLocation(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LocationDto> getLocationById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getLocationById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<LocationDto> createLocation(@Valid @RequestBody NewLocationDto newLocation) {
        return new ResponseEntity<>(service.createLocation(newLocation), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LocationDto> editLocation(@PathVariable Long id, @Valid @RequestBody LocationDto location) {
        return new ResponseEntity<>(service.editLocation(id, location), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<LocationDto> deleteLocation(@PathVariable Long id) {
        return new ResponseEntity<>(service.deleteLocation(id), HttpStatus.OK);
    }
}