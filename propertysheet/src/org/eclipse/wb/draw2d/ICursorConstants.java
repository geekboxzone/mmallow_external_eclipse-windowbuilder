/*******************************************************************************
 * Copyright (c) 2011 Google, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Google, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.wb.draw2d;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;

/**
 * A collection of cursors.
 *
 * @author lobas_av
 * @coverage gef.draw2d
 */
public interface ICursorConstants {
  /**
   * System resize west-east cursor
   */
  Cursor SIZEWE = new Cursor(null, SWT.CURSOR_SIZEWE);
}