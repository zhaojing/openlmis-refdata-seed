/*
 * This program is part of the OpenLMIS logistics management information system platform software.
 * Copyright © 2017 VillageReach
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Affero General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *  
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU Affero General Public License for more details. You should have received a copy of
 * the GNU Affero General Public License along with this program. If not, see
 * http://www.gnu.org/licenses.  For additional information contact info@OpenLMIS.org. 
 */

package org.openlmis.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import javax.json.JsonObject;

@Service
public class CommodityTypeService extends BaseCommunicationService {

  @Autowired
  private OrderableService orderableService;

  @Override
  protected String getUrl() {
    return "/api/commodityTypes";
  }

  @Override
  public HttpMethod getCreateMethod() {
    return HttpMethod.PUT;
  }

  @Override
  public String buildUpdateUrl(String base, String id) {
    return base;
  }

  @Override
  public JsonObject findUnique(JsonObject object) {
    return orderableService.findUnique(object);
  }
}
