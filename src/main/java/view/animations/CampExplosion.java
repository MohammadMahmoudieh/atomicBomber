package view.animations;

import javafx.animation.Transition;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.util.Duration;
import model.Camp;
import model.Missile;
import model.Truck;

public class CampExplosion extends Transition {
    private final Missile missile;
    private final Camp truck;
    private final Pane pane;

    public CampExplosion (Missile missile, Pane pane, Camp truck) {
        this.missile = missile;
        this.pane = pane;
        this.truck = truck;
        this.setCycleCount(1);
        this.setCycleDuration(Duration.millis(1000));
    }

    @Override
    protected void interpolate(double v) {
        int number = 1;
        if (0 <= v && v <= 0.33) number = 1;
        else if (0.33 < v && v <= 0.66) number = 2;
        else if (0.66 < v && v <= 1) number = 3;


        truck.setFill(new ImagePattern(new Image(
                ShootingAnimation.class.getResource("/Images/meteorCollapse" + number + ".png").toExternalForm(),112,76,false,false)));
    }
}
