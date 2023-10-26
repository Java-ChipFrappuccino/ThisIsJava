package ch09.sec07.exam03;

public class Button {
	private ClickListener clickListener;


	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void click() {
		clickListener.onClick();
	}

	public static interface ClickListener {
		public void onClick(); 
	}
}

