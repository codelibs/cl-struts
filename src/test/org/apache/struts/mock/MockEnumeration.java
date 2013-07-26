/*
 * $Id: MockEnumeration.java 54929 2004-10-16 16:38:42Z germuska $ 
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


package org.apache.struts.mock;


import java.util.Enumeration;
import java.util.Iterator;


/**
 * <p>General purpose <code>Enumeration</code> wrapper around an
 * <code>Iterator</code> specified to our controller.</p>
 *
 * @version $Rev: 54929 $ $Date: 2004-10-17 01:38:42 +0900 (日, 17 10月 2004) $
 */

public class MockEnumeration implements Enumeration {


    public MockEnumeration(Iterator iterator) {
        this.iterator = iterator;
    }


    protected Iterator iterator;


    public boolean hasMoreElements() {
        return (iterator.hasNext());
    }


    public Object nextElement() {
        return (iterator.next());
    }


}
