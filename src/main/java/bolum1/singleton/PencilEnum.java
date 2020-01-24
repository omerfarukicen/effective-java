
package bolum1.singleton;

public enum PencilEnum {
	INSTANCE; // guarantee against multiple instantiation and thread safe for free

	public void write() {
		System.out.println("write !");
	}


	public static void main(String[] args) {
		PencilEnum pencil = PencilEnum.INSTANCE;
		pencil.write();



	}
}
