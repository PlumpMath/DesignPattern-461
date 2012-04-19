package com.jasonfc.decorator;

public abstract class Decorator implements Component {

	protected Component component;

	protected void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void dressUp() {
		if (component != null) {
			component.dressUp();
		}
	}
}
