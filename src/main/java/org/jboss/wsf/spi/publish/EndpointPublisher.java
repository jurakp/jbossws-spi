/* 
 * JBoss, Home of Professional Open Source 
 * Copyright 2011 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved. 
 * See the copyright.txt in the distribution for a 
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use, 
 * modify, copy, or redistribute it subject to the terms and conditions 
 * of the GNU Lesser General Public License, v. 2.1. 
 * This program is distributed in the hope that it will be useful, but WITHOUT A 
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A 
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details. 
 * You should have received a copy of the GNU Lesser General Public License, 
 * v.2.1 along with this distribution; if not, write to the Free Software 
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.jboss.wsf.spi.publish;

import java.util.Map;

import org.jboss.wsf.spi.metadata.webservices.JBossWebservicesMetaData;
import org.jboss.wsf.spi.metadata.webservices.WebservicesMetaData;

/**
 * EndpointPublisher defines the interface for facilities allowing to publish/destroy
 * WS endpoints on top of the running JBoss Application Server container.
 *
 * @author <a href="mailto:alessio.soldano@jboss.com">Alessio Soldano</a>
 */
public interface EndpointPublisher
{
   public Context publish(String contextRoot, ClassLoader loader, Map<String, String> urlPatternToClassNameMap) throws Exception;
   
   public Context publish(String contextRoot, ClassLoader loader, Map<String, String> urlPatternToClassNameMap, WebservicesMetaData metadata) throws Exception;
   
   public Context publish(String contextRoot, ClassLoader loader, Map<String, String> urlPatternToClassNameMap, WebservicesMetaData metadata, JBossWebservicesMetaData jbwsMetadata) throws Exception;
   
   public void destroy(Context context) throws Exception;
}
