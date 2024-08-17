interface Resizable 
{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable 
{
    private int width;
    private int height;

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) 
    {
        this.width = width;
    }

    public void resizeHeight(int height) 
    {
        this.height = height;
    }

    public void print1()
    {
        System.out.println("Before : Width : "+width+" "+"Height : "+height+"");
    } 

    public void print2()
    {
        System.out.println("After : Width : "+width+" "+"Height : "+height+"");
    } 
}

class Test
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(100, 150);
        rectangle.print1();
        rectangle.resizeWidth(25);
        rectangle.resizeHeight(55);
        rectangle.print2();
    }
}
