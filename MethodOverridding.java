package assignment.one.mca;

class someClass {
	public void showMessage() {
		System.out.println("message from parent class");
	}
}

public class MethodOverridding extends someClass {

	public void showMessage() {
		System.out.println("message from child class");
	}
	public static void main(String[] args) {
		MethodOverridding overrideObject = new MethodOverridding();
		overrideObject.showMessage();
	}

}
