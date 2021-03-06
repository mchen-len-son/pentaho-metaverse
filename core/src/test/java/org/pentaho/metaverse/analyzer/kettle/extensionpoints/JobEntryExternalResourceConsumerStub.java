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

package org.pentaho.metaverse.analyzer.kettle.extensionpoints;

import org.pentaho.di.job.entry.JobEntryBase;
import org.pentaho.metaverse.api.IAnalysisContext;
import org.pentaho.metaverse.api.analyzer.kettle.jobentry.IJobEntryExternalResourceConsumer;
import org.pentaho.metaverse.api.model.IExternalResourceInfo;

import java.util.Collection;

/**
 * Helper class to provide an implementation of IJobEntryExternalResourceConsumer for testing
 */
public class JobEntryExternalResourceConsumerStub implements IJobEntryExternalResourceConsumer {

  @Override
  public boolean isDataDriven( Object meta ) {
    return false;
  }

  @Override
  public Collection<IExternalResourceInfo> getResourcesFromMeta( Object meta ) {
    return null;
  }

  @Override
  public Collection<IExternalResourceInfo> getResourcesFromMeta( Object consumer, IAnalysisContext context ) {
    return null;
  }

  @Override
  public Class<?> getMetaClass() {
    return JobEntryBase.class;
  }
}
