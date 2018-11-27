public class test{
		private int num = 3;//test comment
		public static void main(String[] args) {
		
		try {
			Lexical_analyzer analyzer = new Lexical_analyzer(new File("res/test.txt"));
			while (analyzer.hasNextWord()) {
				System.out.println(analyzer.nextWord());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
};