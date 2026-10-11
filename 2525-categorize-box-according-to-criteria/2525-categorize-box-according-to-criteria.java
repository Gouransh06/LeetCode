class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        boolean isbulky = false;
        boolean isheavy = false;

        if(mass >= 100){
            isheavy = true;
        }
        if(length >= 10000 || width >= 10000 || height >= 10000){
            isbulky = true;
        }
        if((long)length * width * height >= 1000000000){
            isbulky = true;
        } 
        if((isheavy) && (isbulky)){
            return "Both";
        }
        if((isbulky)){
            return "Bulky";
        }
        if((isheavy)){
            return "Heavy";
        }
        return "Neither";
    }
}