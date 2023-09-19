package com.example.demoproject.controller;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demoproject.infra.ApiResponse;
import com.example.demoproject.model.Profile;
import com.example.demoproject.model.ProfileDTO;
import com.example.demoproject.model.Quote;
import com.example.demoproject.model.QuoteDTO;
import com.example.demoproject.model.Target;
import com.example.demoproject.model.TargetDTO;


public interface ProfileOperation {

@GetMapping(value = "/profileDTO")
ProfileDTO findProfiles() throws Exception;

@GetMapping(value = "/quoteDTO")
QuoteDTO findQuotes() throws Exception;

@GetMapping(value = "/Target")
TargetDTO findTarget();



  
}
