package mw.gov.health.lmis.upload;

import org.springframework.stereotype.Service;

@Service
public class SupervisoryNodeService extends BaseCommunicationService {

  @Override
  protected String getUrl() {
    return "/api/supervisoryNodes";
  }

}
