/*
 * $Id: BaseAction.java 54929 2004-10-16 16:38:42Z germuska $ 
 *
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.struts.webapp.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.webapp.example.UserDatabase;
import javax.servlet.http.HttpServletRequest;

/**
 * Base Action for MailReader application.
 *
 * @version $Rev: 54929 $ $Date: 2004-10-17 01:38:42 +0900 (日, 17 10月 2004) $
 */
public class BaseAction extends Action {

    // ----------------------------------------------------- Instance Variables

    /**
     * The <code>Log</code> instance for this application.
     */
    protected Log log = LogFactory.getLog(Constants.PACKAGE);

    // ------------------------------------------------------ Protected Methods

    /**
     * Return a reference to the UserDatabase
     * or null if the database is not available.
     * @param request The request we are processing
     * @return a reference to the UserDatabase or null if the database is not available
     */
    protected UserDatabase getUserDatabase(HttpServletRequest request) {
        return (UserDatabase) servlet.getServletContext().getAttribute(
                Constants.DATABASE_KEY);
    }

    /**
     * Return the local or global forward named "failure"
     * or null if there is no such forward.
     * @param mapping Our ActionMapping
     * @return Return the mapping named "failure" or null if there is no such mapping.
     */
    protected ActionForward findFailure(ActionMapping mapping) {
        return (mapping.findForward(Constants.FAILURE));
    }


    /**
     * Return the mapping labeled "success"
     * or null if there is no such mapping.
     * @param mapping Our ActionMapping
     * @return Return the mapping named "success" or null if there is no such mapping.
     */
    protected ActionForward findSuccess(ActionMapping mapping) {
        return (mapping.findForward(Constants.SUCCESS));
    }

}
