public class ProjectTest {
    public static void main(String[] args) {
        Project a = new Project("Alfred, A helpful bot");
        System.out.println(a.myNameIs());
        System.out.println(a.myDescription());
    }
}