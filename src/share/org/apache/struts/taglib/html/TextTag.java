/*
 * $Id: TextTag.java 164530 2005-04-25 03:11:07Z niallp $ 
 *
 * Copyright 1999-2005 The Apache Software Foundation.
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


package org.apache.struts.taglib.html;


/**
 * Custom tag for input fields of type "text".
 *
 * @version $Rev: 164530 $ $Date: 2005-04-25 12:11:07 +0900 (月, 25  4月 2005) $
 */

public class TextTag extends BaseFieldTag {


    /**
     * Construct a new instance of this tag.
     */
    public TextTag() {

         super();
         this.type = "text";
         doReadonly = true;

    }


}
