package com.icarus.tutorial.swt.module;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class BottomComposite extends Composite {
	private Text text;
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public BottomComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
        
	       Composite composite = new Composite(this, SWT.NONE);
	       composite.setLayout(new GridLayout(1, false));
	        
	       Composite composite_1 = new Composite(composite, SWT.NONE);
	       GridLayout gl_composite_1 = new GridLayout(3, false);
	       gl_composite_1.marginHeight = 0;
	       gl_composite_1.marginWidth = 0;
	       composite_1.setLayout(gl_composite_1);
	       composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	        
	       Button btnNewButton = new Button(composite_1, SWT.NONE);
	       btnNewButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	       btnNewButton.setText("Add");
	        
	       Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
	       btnNewButton_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	       btnNewButton_1.setText("Delete");
	        
	       Button btnNewButton_2 = new Button(composite_1, SWT.NONE);
	       btnNewButton_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	       btnNewButton_2.setText("Clear");
	        
	       text = new Text(composite, SWT.BORDER | SWT.MULTI);
	       text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
