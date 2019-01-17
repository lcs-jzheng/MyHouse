
/**
 * Creates an instance of a Tree.
 *
 * @author R. Gordon
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square root;
        private Triangle leaf1;
        private Triangle leaf2;
        private Triangle leaf3;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        root = new Square();
        leaf1 = new Triangle();
        leaf2 = new Triangle();
        leaf3 = new Triangle();
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // Put the root
        root.moveHorizontal(x-25);
        root.changeColor("brown");
        root.moveVertical(y-20);
        root.makeVisible();
        
        //Put the leaf1
        leaf1.moveHorizontal(x);
        leaf1.moveVertical(y-10);
        leaf1.changeColor("green");
        leaf1.changeSize(30, 60);
        leaf1.makeVisible();
        
        //Put the leaf2
        leaf2.moveHorizontal(x);
        leaf2.moveVertical(y-25);
        leaf2.changeColor("green");
        leaf2.changeSize(30, 60);
        leaf2.makeVisible();
        
        //Put the leaf3
        leaf3.moveHorizontal(x);
        leaf3.moveVertical(y-40);
        leaf3.changeColor("green");
        leaf3.changeSize(30, 60);
        leaf3.makeVisible();
    }
    
}