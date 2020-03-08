package String;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String name = "Imthiaz";
		char ch = 'I';// ASCII values
		int c = (int) ch;
		c = ch + 32;
		char cap = (char) c;
		System.out.println(ch);

		char nameArr[] = name.toCharArray();
		for (int i = 0; i < nameArr.length; i++)

		{
			if ((nameArr[i] == ch) || (nameArr[i] == cap)) {
				count++;

			}

		}
		System.out.println("i appears" + count);

	}

}
