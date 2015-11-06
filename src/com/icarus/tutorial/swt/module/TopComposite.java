package com.icarus.tutorial.swt.module;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;

public class TopComposite extends Composite {
	private Text text;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TopComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setText("Preferred Site");
		
		Label lblColumnWidth = new Label(composite, SWT.NONE);
		lblColumnWidth.setText("Column Width");
		
		text = new Text(composite, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
