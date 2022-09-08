public class encapsulation {

	public static class TV{
		private int lenght;
		private int width;
		private int height;
		public void setLen(int p) {
			lenght = p;
		}
		public void setWid(int p) {
			width = p;
		}
		public void setHe(int p) {
			height = p;
		}
		public int getSound() {
			return (lenght * width * height);
		}
	
	public static void main(String[] args) {
		TV object = new TV();
		float sound;
		object.setLen(10);
		object.setWid(8);
		object.setHe(6);
		sound = object.getSound();
		System.out.println("Sound setting = " + sound + " monad");
	}
	}
}
