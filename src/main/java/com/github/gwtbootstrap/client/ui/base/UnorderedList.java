/*
 *  Copyright 2012 GWT-Bootstrap
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.gwtbootstrap.client.ui.base;

import com.github.gwtbootstrap.client.ui.constants.Constants;


/**
 * Simple wrapper for an HTML {@code <ul>} tag.
 * 
 * @since 2.0.4.0
 * 
 * @author Carlos Alexandro Becker
 */
public class UnorderedList extends ComplexWidget {

	/**
	 * Creates an empty list.
	 */
	public UnorderedList() {
		super("ul");
	}

	/**
	 * Creates a list and adds the given widgets.
	 * 
	 * @param widgets
	 *            widgets to be added
	 */
	public UnorderedList(ListItem... widgets) {
		this();
		for (ListItem li : widgets) {
			add(li);
		}
	}
	
	public void setUnstyled(boolean unstyled) {
	    setStyleName(Constants.UNSTYLED, unstyled);
	}
}
