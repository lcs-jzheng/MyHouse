
/**
 * It draws a complete house on screen using individual shapes
 *
 * Jeff Zheng
 * 11th,Jan. 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square window;
    private Circle doorUp;
    private Square doorDown;
    private Circle doorH;
    private Square chim;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    
    /**
     * The job of a constructor is to intialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        window = new Square();
        doorUp = new Circle();
        doorDown = new Square();
        doorH = new Circle();
        chim = new Square();
        tree1 = new Tree(0,250);
        tree2 = new Tree(200,250);
        tree3 = new Tree(125,70);
        //invoke the method to draw the house
        drawHouse();
    }

    /**
     * Dear the house for us
     */
    public void drawHouse()
    {
        // Put the sun in position
        sun.changeColor("yellow");
        sun.moveVertical(-100);
        sun.moveHorizontal(320);
        sun.changeSize(100);
        sun.makeVisible();
        
        //Make the base of the house
        base.makeVisible();
        base.changeSize(120);
        base.moveVertical(130);
        base.moveHorizontal(30);
        base.changeColor("yellow");
        
        //Make the roof of the house
        roof.makeVisible();
        roof.changeSize(50,180);
        roof.moveVertical(115);
        roof.moveHorizontal(100);
        roof.changeColor("red");
        
        //Make the window of the house
        window.makeVisible();
        window.changeColor("blue");
        window.changeSize(40);
        window.moveVertical(150);
        window.moveHorizontal(40);
        
        //Make the upper part of the door of the house
        doorUp.makeVisible();
        doorUp.changeColor("black");
        doorUp.moveVertical(195);
        doorUp.moveHorizontal(145);
        
        //Make the lower part of the door of the house
        doorDown.makeVisible();
        doorDown.changeColor("black");
        doorDown.moveVertical(220);
        doorDown.moveHorizontal(105);
        
        //Make the door handle of the door of the house
        doorH.makeVisible();
        doorH.changeColor("yellow");
        doorH.changeSize(5);
        doorH.moveVertical(220);
        doorH.moveHorizontal(148);
        
        //Make the chimney of the house
        chim.makeVisible();
        chim.moveVertical(90);
        chim.moveHorizontal(115);
    }
}






















