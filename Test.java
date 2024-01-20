import java.awt.*;

class Test extends Frame{
    public static void main(String[] q){
        new Test();
    }

    public Test(){
        this.setVisible(true);
        this.setSize(500,500);
    }
    @Override
    public void paint(Graphics g){
        
        try{Thread.sleep(2000);}
        catch(InterruptedException e){}
        
        int i = 50, j = 10;
        while(i < 500 && j< 250){
            g.drawOval(j, i,50,50);
            i += 45;
            j += 25;
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            g.clearRect(0,0,500,500);
        }

        i = 500; j = 250;
        while(i > 300 && j < 400){
            g.drawOval(j, i,50,50);
            i -= 40;
            j += 30;
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            g.clearRect(0,0,500,500);
        }

        i = 300; j = 400;
        while(i < 500 && j < 450){
            g.drawOval(j, i,50,50);
            i += 20;
            j += 5;
            try{Thread.sleep(100);}
            catch(InterruptedException e){}
            g.clearRect(0,0,500,500);
        }

        g.drawOval(500, 450, 5, 5);
    }
}
