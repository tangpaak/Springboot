package com.example.demoproject.service;


import java.util.*;
import com.example.demoproject.infra.BusinessException;
import com.example.demoproject.model.Profile;
import com.example.demoproject.model.ProfileDTO;
import com.example.demoproject.model.Quote;
import com.example.demoproject.model.QuoteDTO;
import com.example.demoproject.model.Target;
import com.example.demoproject.model.TargetDTO;


public interface ProfileService {

ProfileDTO findProfiles() throws BusinessException;

QuoteDTO findQuotes() throws BusinessException;

TargetDTO findTarget();


  
}
