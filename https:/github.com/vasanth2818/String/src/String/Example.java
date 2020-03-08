package String;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = { "kedi", "noki", "dinesh" };
		int i = 0;
		int count = 0;
		while (i < name.length) {
			char na[] = name[i].toCharArray();
			char f = na[0];
			switch (f) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;

			}
			i++;
		}
		System.out.println(count);
	}

}
