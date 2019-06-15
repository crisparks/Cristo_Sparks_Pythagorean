public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double a = Math.pow(legA, 2);
        double b = Math.pow(legB, 2);
        double c = a + b;
        double Hypotenuse = Math.sqrt(c);
        // a^2+b^2=C^2
        //System.out.println("The Hypotenuse of " + legA +" and " + legB + " is " + Hypotenuse);
        return Hypotenuse;
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB
    }
}

