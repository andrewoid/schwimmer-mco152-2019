package schwimmer.physics;

public class Physics {

    public static void main(String args[]) {
        Projectile p = new Projectile(50, 67);

        for (int i = 0; i <= 10; i++) {
            System.out.println(p);
            p.addTime(1);
        }

    }

}
