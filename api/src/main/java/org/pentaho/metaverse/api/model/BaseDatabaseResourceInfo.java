/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2015 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.metaverse.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.pentaho.di.core.database.DatabaseMeta;

/**
 * User: RFellows Date: 12/5/14
 */
public class BaseDatabaseResourceInfo extends BaseResourceInfo implements IExternalResourceInfo {
  private String pluginId;

  public static final String JSON_PROPERTY_PLUGIN_ID = "pluginId";

  public BaseDatabaseResourceInfo() {
  }

  public BaseDatabaseResourceInfo( DatabaseMeta databaseMeta ) {
    setName( databaseMeta.getName() );
    setDescription( databaseMeta.getDescription() );
    setPluginId( databaseMeta.getDatabaseInterface().getPluginId() );
  }

  @JsonProperty( JSON_PROPERTY_PLUGIN_ID )
  public String getPluginId() {
    return pluginId;
  }

  public void setPluginId( String pluginId ) {
    this.pluginId = pluginId;
  }

}
