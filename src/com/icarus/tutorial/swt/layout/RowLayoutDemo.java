package com.icarus.tutorial.swt.layout;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class RowLayoutDemo {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RowLayoutDemo window = new RowLayoutDemo();
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
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnShortTitleButton = new Button(composite, SWT.NONE);
		btnShortTitleButton.setText("Short Title Button");
		
		Button btnLongTitleButton = new Button(composite, SWT.NONE);
		btnLongTitleButton.setText("Long Title Button ......................................");
		
		text = new Text(composite, SWT.BORDER);

	}

}
