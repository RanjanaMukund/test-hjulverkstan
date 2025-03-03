package se.hjulverkstan.main.vehicle.service;

import se.hjulverkstan.main.vehicle.dto.response.GetAllVehicleDto;
import se.hjulverkstan.main.vehicle.dto.request.EditVehicleDto;
import se.hjulverkstan.main.vehicle.dto.request.NewVehicleDto;
import se.hjulverkstan.main.vehicle.dto.request.EditVehicleStatusDto;
import se.hjulverkstan.main.vehicle.dto.request.VehicleDto;

public interface VehicleService {
    VehicleDto createVehicle(NewVehicleDto newVehicle);

    GetAllVehicleDto getAllVehicles();

    VehicleDto deleteVehicle(Long id);

    VehicleDto getVehicleById(Long id);

    EditVehicleDto editVehicle(Long id, EditVehicleDto Vehicle);
    VehicleDto editVehicleStatus(Long id, EditVehicleStatusDto newStatus);
}