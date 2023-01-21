public class NinjaDemo {
    public static void main(String[] args) {
        Ninja n1 = new Ninja();
        n1.setName("Sasuke");
        n1.setBloodLineType("Rinnegan");
        n1.setVillage("Konoha");
        n1.setChakraPoints(800);
        n1.setBloodLineChakraCost(400);

        Ninja n2 = new Ninja();
        n2.setName("Naruto");
        n2.setBloodLineType("Kyuubi Chakra Mode");
        n2.setVillage("Konoha");
        n2.setChakraPoints(1500);
        n2.setBloodLineChakraCost(250);

        Ninja n3 = new Ninja();
        n3.setName("Sarada");
        n3.setBloodLineType("Sharingan");
        n3.setVillage("Konoha");
        n3.setChakraPoints(200);
        n3.setBloodLineChakraCost(35);

        n1.bloodlineAttack();
        n1.bodyFlicker();
        n1.bloodlineAttack();
        n2.bloodlineAttack();
        n2.bodyFlicker();
        n3.bloodlineAttack();
        n3.bodyFlicker();


        if (n1.isEqual(n2))
        {
            System.out.println(n1.getName() + " is the same as " + n2.getName());
        }
        else
        {
            System.out.println(n1.getName() + " is not the same as " + n2.getName());
        }
    }
}
