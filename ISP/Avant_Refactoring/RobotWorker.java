public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Les Robots travaillent sans fatigue");
    }

    @Override
    public void eat() {
        // Méthode inutile pour un robot → implémentation forcée
        throw new UnsupportedOperationException("Les Robots ne mangent pas");
    }
}