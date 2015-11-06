package com.icarus.tutorial.swt.event;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonEventDemo {

	protected Shell shlButtonEventDemo;

	public static void main(String[] args) {
		try {
			ButtonEventDemo window = new ButtonEventDemo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlButtonEventDemo.open();
		shlButtonEventDemo.layout();
		while (!shlButtonEventDemo.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void createContents() {
		shlButtonEventDemo = new Shell();
		shlButtonEventDemo.setSize(296, 205);
		shlButtonEventDemo.setText("Button Event Demo");
		shlButtonEventDemo.setLayout(new RowLayout(SWT.HORIZONTAL));

		Button btnClickToMe = new Button(shlButtonEventDemo, SWT.NONE);
		btnClickToMe.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// Handle Button selected here!
				System.out.println("Button selected!");
			}
		});
		btnClickToMe.setText("Click to me");

	}

}
