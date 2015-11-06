package com.icarus.tutorial.swt.subclass;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class MyButton extends Button {

	public MyButton(Composite parent, int style) {
		super(parent, style);
	}

	// Cần phải ghi đề method này
	// Vì method cha ném ra ngoại lệ
	@Override
	protected void checkSubclass() {
	}

}
