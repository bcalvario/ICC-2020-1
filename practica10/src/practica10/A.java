package practica10;

import processing.core.PApplet;

public class A extends PApplet{
    
    public static void main(String[] args){
    
        main("practica10.A");

    }

        @Override
        public void settings(){
            size(800,800);
        }

        @Override
        public void setup(){
            
        }

        @Override
        public void draw(){
            
            double n, m;
            m = width;
            n = height;

            fill(0xFFFFFFFF);
            rect(0,0, (int)m, (int)n);


            for (int i = 0; i < 8; i++) {

                for (int j = 0; j < 8; j++) {

                    if ((i + j) % 2 == 1 ) {
                        
                        double x = ( (double)i) * (n / 8.0);
                        double y = ( (double)j) * (m / 8.0);
                        double a = (n / 8.0);
                        double b = (m / 8.0);

                        fill (0xFF000000);
                        rect ((int)y, (int)x, (int)b, (int)a);
                   }
                }
            }




            
            //ARGB A=transparencia R=red G=green B=blue FF
 
        }

    }
