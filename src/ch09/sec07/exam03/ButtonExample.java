package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		Button okButton = new Button();
		Button cancelButton = new Button();

		
		okButton.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok");
			}
		});
		okButton.click();
		
		cancelButton.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel");
			}
		});
		cancelButton.click();
	}
}