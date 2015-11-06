package com.icarus.tutorial.swt.layout;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;

public class GridLayoutDemo {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GridLayoutDemo window = new GridLayoutDemo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shell, SWT.NONE);
		GridLayout gl_composite = new GridLayout(3, false);
		composite.setLayout(gl_composite);
		
		Button btnB = new Button(composite, SWT.NONE);
		btnB.setText("B1");
		
		Button btnLongButton = new Button(composite, SWT.NONE);
		btnLongButton.setText("Long Button 2");
		
		Button btnB_1 = new Button(composite, SWT.NONE);
		btnB_1.setText("B3");
		
		Button btnB_2 = new Button(composite, SWT.NONE);
		btnB_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		btnB_2.setText("B4");
		
		Button btnButton = new Button(composite, SWT.NONE);
		GridData gd_btnButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
		gd_btnButton.widthHint = 70;
		gd_btnButton.heightHint = 70;
		btnButton.setLayoutData(gd_btnButton);
		btnButton.setText("Button 5");

	}

}
