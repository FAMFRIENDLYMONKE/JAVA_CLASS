import java.awt.*;

class Test extends Frame{
    public static void main(String[] q){
        new Test();
    }

    public Test(){
        this.setVisible(true);
        this.setSize(500,500);
        this.setBackground(Color.yellow);
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        try{Thread.sleep(2000);}
        catch(InterruptedException e){}
        
        int i = 50, j = 10;
        while(i < 500 && j< 250){
            g.fillOval(j, i,50,50);
            i += 45;
            j += 25;
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            g.clearRect(0,0,500,500);
        }

        i = 500; j = 250;
        while(i > 300 && j < 400){
            g.fillOval(j, i,50,50);
            i -= 20;
            j += 15;
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            g.clearRect(0,0,500,500);
        }

        i = 300; j = 400;
        while(i < 500 && j < 450){
            g.fillOval(j, i,50,50);
            i += 20;
            j += 5;
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            g.clearRect(0,0,500,500);
        }

        g.fillOval(500, 450, 5, 5);
    }
}
