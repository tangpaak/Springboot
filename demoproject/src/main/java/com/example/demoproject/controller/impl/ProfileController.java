package com.example.demoproject.controller.impl;


import java.util.*;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demoproject.controller.ProfileOperation;
import com.example.demoproject.infra.ApiResponse;
import com.example.demoproject.model.Profile;
import com.example.demoproject.model.ProfileDTO;
import com.example.demoproject.model.Quote;
import com.example.demoproject.model.QuoteDTO;
import com.example.demoproject.model.Target;
import com.example.demoproject.model.TargetDTO;
import com.example.demoproject.service.ProfileService;

@RestController
@RequestMapping(value = "api/v1")
public class ProfileController implements ProfileOperation {

  @Autowired
  ProfileService profileService;


  @Override
  public ProfileDTO findProfiles() throws Exception {
    ProfileDTO profiles = profileService.findProfiles();

    return profiles;
  }

  @Override
  public QuoteDTO findQuotes() throws Exception {
    QuoteDTO quotes = profileService.findQuotes();
    return quotes;

  }

  @Override
  public TargetDTO findTarget() {
    TargetDTO target = profileService.findTarget();
    return target;
  }


}


