
class FreshJuice {

	enum FreshJuiceTaste{
		ORANGE,
		APPLE,
		PINEAPPLE,
		GRAPPLE
	}
	enum FreshJuiceSize{SMALL, MEDIUM, BIG}
	FreshJuiceTaste taste;
	FreshJuiceSize size;
}

public class FreshJuiceTest {
	public static void main(String Args[]) {
		int juiceNumber;
		int sizeNumber;
		FreshJuice.FreshJuiceTaste[] tasteTypes = FreshJuice.FreshJuiceTaste.values(); //values возвращает массив всех констант перечислени€
		FreshJuice.FreshJuiceSize[] sizeTypes = FreshJuice.FreshJuiceSize.values();
		FreshJuice glass = new FreshJuice(); //new создает экземпл€р указанного класса и возвращает ссылку на новый объект
		
		glass.taste = FreshJuice.FreshJuiceTaste.PINEAPPLE;
		glass.size = FreshJuice.FreshJuiceSize.SMALL;
		
		System.out.println("Tastes of juise:");
		for (FreshJuice.FreshJuiceTaste tastes : tasteTypes){
			juiceNumber = tastes.ordinal() + 1;
			System.out.printf("\t%d.%s\t\t\n", juiceNumber, tastes);
		}
		System.out.println("\nSizes of glass:");
		for (FreshJuice.FreshJuiceSize sizes : sizeTypes) {
			sizeNumber = sizes.ordinal() + 1;
			System.out.println("\t" + sizeNumber + "." + sizes);
		}
		System.out.printf("Current juice's taste is a %s", glass.taste + " in a " + glass.size + " glass");
	}
}