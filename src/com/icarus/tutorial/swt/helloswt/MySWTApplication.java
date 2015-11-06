package com.icarus.tutorial.swt.helloswt;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;

public class MySWTApplication {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MySWTApplication window = new MySWTApplication();
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
		composite.setLayout(new GridLayout(3, false));
		
		Button btnMyButton = new Button(composite, SWT.NONE);
		btnMyButton.setText("My Button");
		
		Button btnRadioButton = new Button(composite, SWT.RADIO);
		btnRadioButton.setText("Radio Button");
		
		Button btnCheckButton = new Button(composite, SWT.CHECK);
		btnCheckButton.setText("Check Button");

	}
}
