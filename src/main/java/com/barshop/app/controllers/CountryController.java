package com.barshop.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barshop.app.App;
import com.barshop.app.models.dto.Country;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Setter;

//@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/v1/country")
@Api(value = "Country", tags = { App.COUNTRY_TAG })
@Setter
public class CountryController implements BaseRestController<Country, Long> {

    private static final Logger LOGGER = Logger.getLogger(CountryController.class.getName());

    private final static String RESOURCE = "Country";

    @ApiOperation(value = "Finds all countries", tags = { App.COUNTRY_TAG })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Country[].class), @ApiResponse(code = 500, message = "Failure") })
    @GetMapping(value = "", consumes = {}, produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE })
    @Override
    public ResponseEntity<Object> findAll() {

        List<Country> countries = new ArrayList<>();
        Country c1 = new Country();
        c1.setId(56);
        c1.setName("Chile");
        c1.setCountryCode(56);
        c1.setTwoDigitIso("CL");
        c1.setThreeDigitIso("CHL");
        c1.setCountryCallingCode("+56");
        countries.add(c1);
        Country c2 = new Country();
        c2.setId(1);
        c2.setName("Estados Unidos");
        c2.setCountryCode(1);
        c2.setTwoDigitIso("US");
        c2.setThreeDigitIso("USA");
        c2.setCountryCallingCode("+1");
        countries.add(c2);        
        ResponseEntity<Object> resp = new ResponseEntity<>(countries, HttpStatus.OK);
        LOGGER.info("resp -> " + resp);
        return resp;
    }

}