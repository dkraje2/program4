import java.io.*;
import java.util.Scanner;
import java.lang.String;


public class BSTprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Create_Tree("input.txt");

	}
	
	public static void Create_Tree(String file)
	{
		BinarySearchTree<Integer> BinaryNode = new BinarySearchTree<Integer>();
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(new File(file));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while (scan.hasNext())
		{
			String line = scan.next().replaceAll(",",  "");
			
			int y = Integer.parseInt((scan.next().replaceAll(",", "")));
			
			if(line.compareTo("+") == 0) BinaryNode.insert(y);
			
			else {
				if (BinaryNode.contains(y)) BinaryNode.remove(y);
			}
			
			System.out.println("\n" + "In order tree traversal: \n\n");
			BinaryNode.printTreeInOrder();
			
			System.out.println("\n" + "PreOrder tree traversal: \n\n");
			BinaryNode.printTreePreOrder();
			
		}
	}

}
