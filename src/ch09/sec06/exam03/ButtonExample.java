package ch09.sec06.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button okButton = new Button();
		Button cancelButton = new Button();

		class OkListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("ok");
			}
		}
		class CancleListener implements Button.ClickListener {
			@Override
			public void onClick() {
				System.out.println("cancle");
			}

		}
		OkListener okListener = new OkListener();
		okButton.setClickListener(okListener);
//		okButton.setClickListener(new OkListener());
		okButton.click();
		CancleListener cancleListener = new CancleListener();
		cancelButton.setClickListener(cancleListener);
//		cancelButton.setClickListener(new CancleListener());
		cancelButton.click();
	}
}