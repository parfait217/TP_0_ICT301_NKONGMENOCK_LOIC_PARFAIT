public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);  // Force hauteur = largeur
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);  // Force largeur = hauteur
    }
}