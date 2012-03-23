package org.eclipse.wb.core.controls;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.eclipse.wb.core.controls.messages"; //$NON-NLS-1$
  public static String CSpinner_canNotParse;
  public static String CSpinner_outOfRange;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }
}
