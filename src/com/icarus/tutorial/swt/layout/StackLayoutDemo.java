package com.icarus.tutorial.swt.layout;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.custom.StackLayout;

public class StackLayoutDemo {

	protected Shell shell;
	private Composite parent;
	private Button widget1;
	private Composite widget2;
	private Button widget3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			StackLayoutDemo window = new StackLayoutDemo();
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
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite composite = new Composite(shell, SWT.BORDER);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showWidget1();
			}
		});
		btnNewButton.setText("Show Widget 1");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showWidget2();
			}
		});
		btnNewButton_1.setText("Show Widget 2");
		
		Button btnShowWidget = new Button(composite, SWT.NONE);
		btnShowWidget.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				showWidget3();
			}
		});
		btnShowWidget.setText("Show Widget 3");
		
		parent = new Composite(shell, SWT.BORDER);
		StackLayout sl_parent = new StackLayout();
		sl_parent.marginWidth = 5;
		sl_parent.marginHeight = 5;
		parent.setLayout(sl_parent);
		
		widget1 = new Button(parent, SWT.NONE);
		widget1.setText("Button 1");
		
		widget2 = new Composite(parent, SWT.NONE);
		
		widget3 = new Button(parent, SWT.NONE);
		widget3.setText("Button 3");

	}
	
	private void showWidget1() {
		StackLayout layout = (StackLayout) this.parent.getLayout();
		layout.topControl = this.widget1;
		this.parent.layout();
	}
	
	private void showWidget2() {
		StackLayout layout = (StackLayout) this.parent.getLayout();
		layout.topControl = this.widget2;
		this.parent.layout();
	}
	
	private void showWidget3() {
		StackLayout layout = (StackLayout) this.parent.getLayout();
		layout.topControl = this.widget3;
		this.parent.layout();
	}

}
