

	import java.io.*;
	import java.util.Scanner;
	import java.lang.String;


	public class AVLprogram {

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			
			Create_Tree("input.txt");

		}
		
		public static void Create_Tree(String file)
		{
			AvlTree<Integer> AvlNode = new AvlTree<Integer>();
			
			Scanner scan = null;
			
			try {
				scan = new Scanner(new File(file));
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			while (scan.hasNext())
			{
				String line = scan.next().replaceAll(",", "");
				
				int y = Integer.parseInt((scan.next().replaceAll(",", "")));
				
				if(line.compareTo("+") == 0) AvlNode.insert(y);
				
				else {
					if (AvlNode.contains(y)) AvlNode.remove(y);
				}
				
				System.out.println("\n" + "Pre order tree traversal: \n\n");
				AvlNode.printTree();
			}
		}

	}
