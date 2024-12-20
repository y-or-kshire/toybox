package day2;

class Problem401{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        System.out.println(dice);
        for (int i=1; i<=dice; i++){
            System.out.print("■");
        }

        System.out.println("");
    }
}

class Problem402{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        System.out.println(dice);

        int t = 1;
        while (t <= dice){
            System.out.print("■");
            t++;
        }

        System.out.println("");
    }

}

class Problem403{
    public static void main(String[] args){
        int dice = (int)(Math.random()*10)+1;
        System.out.println(dice);

        
    }
}