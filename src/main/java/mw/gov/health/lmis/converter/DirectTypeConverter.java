package mw.gov.health.lmis.converter;

import org.springframework.stereotype.Component;

import javax.json.JsonObjectBuilder;

@Component 
class DirectTypeConverter extends BaseTypeConverter {

  @Override
  public boolean supports(String type) {
    return "DIRECT".equalsIgnoreCase(type);
  }

  @Override
  public void convert(JsonObjectBuilder builder, Mapping mapping, String value) {
    builder.add(mapping.getTo(), value);
  }

}
