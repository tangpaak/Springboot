package com.example.demoproject.service.impl;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.example.demoproject.infra.BusinessException;
import com.example.demoproject.infra.Code;
import com.example.demoproject.infra.Protocol;
import com.example.demoproject.mapper.ProfileMapper;
import com.example.demoproject.mapper.QuoteMapper;
import com.example.demoproject.mapper.TargetMapper;
import com.example.demoproject.model.Profile;
import com.example.demoproject.model.ProfileDTO;
import com.example.demoproject.model.Quote;
import com.example.demoproject.model.QuoteDTO;
import com.example.demoproject.model.Target;
import com.example.demoproject.model.TargetDTO;
import com.example.demoproject.service.ProfileService;
import org.springframework.beans.factory.annotation.Value;

@Service
public class ProfileServiceImpl implements ProfileService {

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.finnhub.domain}")
  private String profilehDomain; // from yml

  @Value(value = "${api.finnhub.endpoints.profile}")
  private String profileEndpoint; // from yml

  @Value(value = "${api.finnhub.endpoints.quote}")
  private String quoteEndpoint; // from yml


  @Override
  public ProfileDTO findProfiles() throws BusinessException {
    String url =
        "https://finnhub.io/api/v1/stock/profile2?cusip=023135106&token=ck4fv49r01qus81pv8jgck4fv49r01qus81pv8k0";

    System.out.println("url=" + url);

    // Invoke API + Jaskson Deserialization (JSON -> Object)
    // try {
    Profile profiles = restTemplate.getForObject(url, Profile.class);
    ProfileDTO profileDTO = ProfileMapper.map(profiles);

    return profileDTO;
  }

  @Override
  public QuoteDTO findQuotes() throws BusinessException {
    String url2 =
        "https://finnhub.io/api/v1/quote?symbol=AAPL&token=ck4fv49r01qus81pv8jgck4fv49r01qus81pv8k0";

    System.out.println("url=" + url2);
    Quote quote = restTemplate.getForObject(url2, Quote.class);
    QuoteDTO quoteDTO = QuoteMapper.map(quote);

    return quoteDTO;

  }

  @Override
  public TargetDTO findTarget(){

    String url =
        "https://finnhub.io/api/v1/stock/profile2?cusip=023135106&token=ck4fv49r01qus81pv8jgck4fv49r01qus81pv8k0";

    String url2 =
        "https://finnhub.io/api/v1/quote?symbol=AAPL&token=ck4fv49r01qus81pv8jgck4fv49r01qus81pv8k0";

        System.out.println("url=" + url);
        System.out.println("url=" + url2);
        Profile profiles = restTemplate.getForObject(url, Profile.class);
        Quote quote = restTemplate.getForObject(url2, Quote.class);
        TargetDTO target = TargetMapper.map(profiles, quote);
    
        return target;

  }


  // @Override
  // public Target findTarget() throws BusinessException {
  // return null;
  // }


}
