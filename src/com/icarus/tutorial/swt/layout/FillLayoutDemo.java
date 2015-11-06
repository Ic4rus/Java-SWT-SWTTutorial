package com.icarus.tutorial.swt.layout;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class FillLayoutDemo {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FillLayoutDemo window = new FillLayoutDemo();
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
		FillLayout fl_shell = new FillLayout(SWT.VERTICAL);
		fl_shell.spacing = 15;
		fl_shell.marginWidth = 5;
		fl_shell.marginHeight = 5;
		shell.setLayout(fl_shell);
		
		Composite composite = new Composite(shell, SWT.BORDER);
		FillLayout fl_composite = new FillLayout(SWT.HORIZONTAL);
		fl_composite.spacing = 10;
		fl_composite.marginWidth = 5;
		fl_composite.marginHeight = 5;
		composite.setLayout(fl_composite);
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setText("New Button");
		
		Button btnNewButton_2 = new Button(composite, SWT.NONE);
		btnNewButton_2.setText("New Button");
		
		Button btnNewButton_3 = new Button(composite, SWT.NONE);
		btnNewButton_3.setText("New Button");
		
		Composite composite_1 = new Composite(shell, SWT.BORDER);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setText("New Button");
		
		text = new Text(shell, SWT.BORDER);

	}
}
