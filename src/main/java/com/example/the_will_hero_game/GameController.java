package com.example.the_will_hero_game;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicBoolean;

public class GameController implements Initializable {



    @FXML
    private Text scoreText;

    @FXML
    private Label coinLabel;

    public Label getCoinLabel() {
        return coinLabel;
    }

    public void setCoinLabel(Label coinLabel) {
        this.coinLabel = coinLabel;
    }

    @FXML
    private ImageView bossOrc;

    @FXML
    private ImageView chestClosed;

    @FXML
    private ImageView chestClosed1;

    @FXML
    private ImageView cloud1;

    @FXML
    private ImageView cloud2;

    @FXML
    private ImageView cloud3;

    @FXML
    private ImageView cloud4;

    @FXML
    private ImageView cloud5;

    @FXML
    private ImageView cloud6;

    @FXML
    private ImageView cloud7;

    @FXML
    private ImageView cloud8;

    @FXML
    private ImageView cloud9;

    @FXML
    private ImageView coin1;

    @FXML
    private ImageView coin10;

    @FXML
    private ImageView coin11;

    @FXML
    private ImageView coin12;

    @FXML
    private ImageView coin13;

    @FXML
    private ImageView coin14;

    @FXML
    private ImageView coin15;

    @FXML
    private ImageView coin2;

    @FXML
    private ImageView coin3;

    @FXML
    private ImageView coin4;

    @FXML
    private ImageView coin5;

    @FXML
    private ImageView coin6;

    @FXML
    private ImageView coin7;

    @FXML
    private ImageView coin8;

    @FXML
    private ImageView coin9;

    @FXML
    private ImageView orc1;

    @FXML
    private ImageView orc2;

    @FXML
    private ImageView orc3;

    @FXML
    private ImageView orc4;

    @FXML
    private ImageView orc5;

    @FXML
    private ImageView orc6;

    @FXML
    private ImageView orc7;

    @FXML
    private ImageView rock1;

    @FXML
    private ImageView rock10;

    @FXML
    private ImageView rock11;

    @FXML
    private ImageView rock2;

    @FXML
    private ImageView rock3;

    @FXML
    private ImageView rock4;

    @FXML
    private ImageView rock5;

    @FXML
    private ImageView rock6;

    @FXML
    private ImageView rock7;

    @FXML
    private ImageView rock8;

    @FXML
    private ImageView rock9;

    @FXML
    private ImageView stick_wind_mill_3;

    @FXML
    private ImageView tree1;

    @FXML
    private ImageView tree2;

    @FXML
    private ImageView tree3;

    @FXML
    private ImageView tree4;

    @FXML
    private ImageView tree5;

    @FXML
    private ImageView tree6;

    @FXML
    private ImageView tree7;

    @FXML
    private ImageView tree8;

    @FXML
    private ImageView tree9;

    @FXML
    private ImageView up_rock1;

    @FXML
    private ImageView up_rock10;

    @FXML
    private ImageView up_rock2;

    @FXML
    private ImageView up_rock3;

    @FXML
    private ImageView up_rock4;

    @FXML
    private ImageView up_rock5;

    @FXML
    private ImageView up_rock6;

    @FXML
    private ImageView up_rock7;

    @FXML
    private ImageView up_rock8;

    @FXML
    private ImageView up_rock9;

    @FXML
    private Rectangle rect1;
    @FXML
    private Rectangle rect2;
    @FXML
    private Rectangle rect3;
    @FXML
    private Rectangle rect4;
    @FXML
    private Rectangle rect5;
    @FXML
    private Rectangle rect6;
    @FXML
    private Rectangle rect7;
    @FXML
    private Rectangle rect8;
    @FXML
    private Rectangle rect9;
    @FXML
    private Rectangle rect10;
    @FXML
    private AnchorPane anchor_pane;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private int num_taps;

    private WillGame realGame;
    private Hero realHero;
    private CoinChest[] RealCoinChests;
    private Orc[] realOrcs;
    private BossOrc realBoss;

    private ImageView[] orcsViews;
    private ImageView[] coinsViews;
    private ImageView[] coinChestViews;
    private ImageView lanceWeaponView;
    ArrayList<ImageView> rock_list;
    ArrayList<Rectangle> valley_list;
    private boolean weapon1_flag = false;


    public void changingScene(MouseEvent event, String fileName) throws IOException {
        root = FXMLLoader.load(getClass().getResource(fileName));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    private RotateTransition getRotateTransition(ImageView imageView, String axis) {
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(imageView);
        rotateTransition.setDuration(Duration.seconds(1));
        rotateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setByAngle(360);

        if (axis.equals("Y") || axis.equals("y")) {
            rotateTransition.setAxis(Rotate.Y_AXIS);
        } else if (axis.equals("Z") || axis.equals("y")) {
            rotateTransition.setAxis(Rotate.Z_AXIS);
        } else {
            rotateTransition.setAxis(Rotate.X_AXIS);
        }

        rotateTransition.play();
        return rotateTransition;
    }


    private TranslateTransition getTranslateTransitionBackGround(ImageView imageView) {
        TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.25), imageView);
        translateTransition1.setByX(-50);
        translateTransition1.setInterpolator(Interpolator.LINEAR);
        translateTransition1.setCycleCount(1);
        return translateTransition1;
    }

    private TranslateTransition getTranslateTransitionValley(Rectangle rect) {
        TranslateTransition translateTransition1 = new TranslateTransition(Duration.seconds(0.25), rect);
        translateTransition1.setByX(-50);
        translateTransition1.setInterpolator(Interpolator.LINEAR);
        translateTransition1.setCycleCount(1);
        return translateTransition1;
    }


    private TranslateTransition getTranslateTransitionOrcs(ImageView imageView, int value_negative_for_X,
                                                           Boolean moveY_direction, Boolean countIndefinite, Boolean autoReverse) {
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(0.5), imageView);

        if (moveY_direction) {
            translateTransition.setByY(value_negative_for_X);
        } else {
            translateTransition.setByX(-value_negative_for_X);
        }

        translateTransition.setAutoReverse(autoReverse);
        translateTransition.setInterpolator(Interpolator.LINEAR);

        if (countIndefinite) {
            translateTransition.setCycleCount(Animation.INDEFINITE);
        } else {
            translateTransition.setCycleCount(1);
        }


        return translateTransition;
    }


    @FXML
    void move_the_obstacles_back(MouseEvent event) {
        num_taps++;
        // Group group1 = new Group(stick_wind_mill_3,tree1,tree3);

        TranslateTransition[] translateBackground = getTranslateTransitionsBackGround();
        GameStarter.getHeroJump().pause();
        //same way move the next slide too
        ParallelTransition parallelTransition = new ParallelTransition(translateBackground);
        realGame.setScore(realGame.getScore() + 1);
        scoreText.setText("" + realGame.getScore());
        parallelTransition.play();
        parallelTransition.setOnFinished(xyz -> GameStarter.getHeroJump().play());

        ImageView rocketWeaponView= new ImageView();

        if (weapon1_flag && num_taps%1==0){

            Image rocket_img = new Image("file:src/main/resources/com/example/the_will_hero_game/assets/Rockets.jpg",20,20, false,false);

            rocketWeaponView.setImage(rocket_img);
            rocketWeaponView.setLayoutX(GameStarter.getHeroView().getLayoutX());
            rocketWeaponView.setLayoutY(GameStarter.getHeroView().getLayoutY()-40);
            anchor_pane.getChildren().add(rocketWeaponView);
            rocketWeaponView.setLayoutX(GameStarter.getHeroView().getLayoutX()+20);
            Weapon rocket = new Weapon(rocketWeaponView, "Rocket");
            TranslateTransition rocket1 = new TranslateTransition();
            rocket1.setNode(rocketWeaponView);
            rocket1.setToX(2000);
            rocket1.setDuration(Duration.seconds(5));
            rocket1.setInterpolator(Interpolator.LINEAR);
            rocket1.play();

            for ( int i=0 ; i< orcsViews.length; i++){
                if(  orcsViews[i].getBoundsInParent().intersects(rocketWeaponView.getBoundsInParent())){
                    //animation to die
                    RotateTransition rotateOrcsBeforeDeathTransition = getRotateTransition(orcsViews[i], "Z");
                    TranslateTransition riseOrcsUpTransition = getTranslateTransitionOrcs(orcsViews[i], -50, true, false, true);
                    TranslateTransition goDownTransition = getTranslateTransitionOrcs(orcsViews[i], 150, true, false, true);
                    rotateOrcsBeforeDeathTransition.play();
                    riseOrcsUpTransition.play();

                    realOrcs[i].setPower(0);

                    realGame.setCoins(realGame.getCoins()+realOrcs[i].getCoins_on_killing());
                    coinLabel.setText("" + realGame.getCoins());

                    int finalI = i;
                    riseOrcsUpTransition.setOnFinished(ee -> {
                        goDownTransition.play();
                        goDownTransition.setOnFinished(eee -> {
                            orcsViews[finalI].setImage(null);
                        });
                    });

                }

            }

            }
        if(rocketWeaponView.getBoundsInParent().intersects(bossOrc.getBoundsInParent())){
            System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            System.out.println("boss die");
        }
//        if (Game.getHeroView().getBoundsInParent().intersects(coin1.getBoundsInParent())) {
//            System.out.println("collision c");
//        }


    }

    public void change_to_victory(){
        String score= ""+realGame.getScore();
        String coins= ""+realGame.getCoins();

        FXMLLoader loader= new FXMLLoader(getClass().getResource("victory.fxml"));
        try {
            root=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        VictoryController victoryController= loader.getController();

        stage=(Stage) coin1.getScene().getWindow();
        victoryController.display(coins, score,stage );

        stage = new Stage();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void change_to_result(){
        String score= ""+realGame.getScore();
        String coins= ""+realGame.getCoins();
        System.out.println("inside");

        FXMLLoader loader= new FXMLLoader(getClass().getResource("result.fxml"));
        try  {
            root=loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage=(Stage) coin1.getScene().getWindow();
        ResultController resultController= loader.getController();
        resultController.display(coins, score,stage, realHero,realGame, this );

        stage = new Stage();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    //rotate coin
    private RotateTransition[] getRotateTransitionsCoins() {
        RotateTransition rotateTransitions[] = {
                getRotateTransition(coin1, "Y"), getRotateTransition(coin2, "Y"), getRotateTransition(coin3, "Y"),
                getRotateTransition(coin4, "Y"), getRotateTransition(coin5, "Y"), getRotateTransition(coin6, "Y"),
                getRotateTransition(coin7, "Y"), getRotateTransition(coin8, "Y"), getRotateTransition(coin9, "Y"),
                getRotateTransition(coin10, "Y"), getRotateTransition(coin11, "Y"), getRotateTransition(coin12, "Y"),
                getRotateTransition(coin13, "Y"), getRotateTransition(coin14, "Y"), getRotateTransition(coin15, "Y"),
        };
        return rotateTransitions;
    }

    //move bg on click
    private TranslateTransition[] getTranslateTransitionsBackGround() {
        //TranslateTransition[] translateTransitions= new TranslateTransition[8];
        //        for( int i=0;i<7; i++){
        //            translateTransitions[i]=getTranslateTransitionOrcs(orcsViews[i], -50, true, true);
        //        }
        //        translateTransitions[7]=getTranslateTransitionOrcs(bossOrc, -50, true, true);
        //
        //        return translateTransitions;

        TranslateTransition translateObjects[]= {
                getTranslateTransitionBackGround(coin1), getTranslateTransitionBackGround(coin2),
                getTranslateTransitionBackGround(coin3), getTranslateTransitionBackGround(coin4), getTranslateTransitionBackGround(coin5),
                getTranslateTransitionBackGround(coin6), getTranslateTransitionBackGround(coin7), getTranslateTransitionBackGround(coin8),
                getTranslateTransitionBackGround(coin9), getTranslateTransitionBackGround(coin10), getTranslateTransitionBackGround(coin11),
                getTranslateTransitionBackGround(coin12), getTranslateTransitionBackGround(coin13), getTranslateTransitionBackGround(coin14),
                getTranslateTransitionBackGround(coin15),

                getTranslateTransitionBackGround(rock1), getTranslateTransitionBackGround(rock2), getTranslateTransitionBackGround(rock3),
                getTranslateTransitionBackGround(rock4), getTranslateTransitionBackGround(rock5), getTranslateTransitionBackGround(rock6),
                getTranslateTransitionBackGround(rock7), getTranslateTransitionBackGround(rock8), getTranslateTransitionBackGround(rock9),
                getTranslateTransitionBackGround(rock10), getTranslateTransitionBackGround(rock11),

                getTranslateTransitionBackGround(tree1), getTranslateTransitionBackGround(tree2), getTranslateTransitionBackGround(tree3),
                getTranslateTransitionBackGround(tree4), getTranslateTransitionBackGround(tree5), getTranslateTransitionBackGround(tree6),
                getTranslateTransitionBackGround(tree7), getTranslateTransitionBackGround(tree8), getTranslateTransitionBackGround(tree9),

                getTranslateTransitionBackGround(orc1), getTranslateTransitionBackGround(orc2), getTranslateTransitionBackGround(orc3),
                getTranslateTransitionBackGround(orc4), getTranslateTransitionBackGround(orc5), getTranslateTransitionBackGround(orc6),
                getTranslateTransitionBackGround(orc7),

                getTranslateTransitionBackGround(cloud1), getTranslateTransitionBackGround(cloud2), getTranslateTransitionBackGround(cloud3),
                getTranslateTransitionBackGround(cloud4), getTranslateTransitionBackGround(cloud5), getTranslateTransitionBackGround(cloud6),
                getTranslateTransitionBackGround(cloud7), getTranslateTransitionBackGround(cloud8), getTranslateTransitionBackGround(cloud9),

                getTranslateTransitionBackGround(up_rock1), getTranslateTransitionBackGround(up_rock2), getTranslateTransitionBackGround(up_rock3),
                getTranslateTransitionBackGround(up_rock4), getTranslateTransitionBackGround(up_rock5), getTranslateTransitionBackGround(up_rock6),
                getTranslateTransitionBackGround(up_rock7), getTranslateTransitionBackGround(up_rock8), getTranslateTransitionBackGround(up_rock9),
                getTranslateTransitionBackGround(up_rock10),
                getTranslateTransitionBackGround(bossOrc),

                getTranslateTransitionBackGround(stick_wind_mill_3), getTranslateTransitionBackGround(GameStarter.getWindmill_view()),

                getTranslateTransitionBackGround(chestClosed), getTranslateTransitionBackGround(chestClosed1), getTranslateTransitionValley(rect1), getTranslateTransitionValley(rect2),
                getTranslateTransitionValley(rect3), getTranslateTransitionValley(rect4), getTranslateTransitionValley(rect5), getTranslateTransitionValley(rect6), getTranslateTransitionValley(rect7), getTranslateTransitionValley(rect8), getTranslateTransitionValley(rect9),
                getTranslateTransitionValley(rect10)
        };
        return translateObjects;
    }
//    private TranslateTransition[] getTransitionsValley(){
//        TranslateTransition translateObjects[] = {getTranslateTransitionValley(rect1),getTranslateTransitionValley(rect2),
//                getTranslateTransitionValley(rect3), getTranslateTransitionValley(rect4), getTranslateTransitionValley(rect5),
//                getTranslateTransitionValley(rect6),getTranslateTransitionValley(rect7),getTranslateTransitionValley(rect8),getTranslateTransitionValley(rect9),
//                getTranslateTransitionValley(rect10)};
//
//        return translateObjects;
//    }


    public void pause_game(MouseEvent event) throws IOException {
        changingScene(event, "pause_menu.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        realHero = new Hero(GameStarter.getHeroView());
        Helmet helmet = new Mouse();
        realBoss= new BossOrc();
        realGame = new WillGame(helmet, realHero);
        realOrcs = new StdOrc[7];

        for(int i = 0; i< realOrcs.length; i++){
            realOrcs[i]= new StdOrc();
        }

        RealCoinChests = new CoinChest[1];
        for(int i = 0; i< RealCoinChests.length; i++){
            RealCoinChests[i]=new CoinChest();
        }

        lanceWeaponView = new ImageView();
        Image lance_img = new Image("file:src/main/resources/com/example/the_will_hero_game/assets/WeaponChampionLance.png",20, 20,false,false);
        lanceWeaponView.setImage(lance_img);

        coinChestViews=new ImageView[]{
                chestClosed, chestClosed1
        };

        orcsViews = new ImageView[]{
                orc1, orc2, orc3, orc4, orc5, orc6, orc7
        };

        coinsViews = new ImageView[]{
                coin1, coin2, coin3, coin4, coin5, coin6, coin7, coin8, coin9, coin10, coin11, coin12, coin13,
                coin14, coin15
        };

        rock_list = new ArrayList<>(List.of(rock1, rock2, rock3, rock4, rock5, rock6, rock7, rock8,
                rock9, rock10, rock11));

        valley_list = new ArrayList<>(List.of(rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8, rect9, rect10));

        AtomicBoolean entered_islost= new AtomicBoolean(false);
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(10), e -> {


            if( !entered_islost.get() && realGame.isLost()){
                change_to_result();
                entered_islost.set(true);
            }

            if (realBoss.getPower()!= 0 && GameStarter.getHeroView().getBoundsInParent().intersects(bossOrc.getBoundsInParent())) {

                TranslateTransition pushHeroBackTransition = getTranslateTransitionOrcs(bossOrc, -100, false, false, false);
               pushHeroBackTransition.play();
                System.out.println("colliding with boss");
                realBoss.setPower(realBoss.getPower()-1);


                if( realBoss.getPower()==0){
                    RotateTransition rotateOrcsBeforeDeathTransition = getRotateTransition(bossOrc, "Z");
                    TranslateTransition riseOrcsUpTransition = getTranslateTransitionOrcs(bossOrc, -50, true, false, true);
                    TranslateTransition goDownTransition = getTranslateTransitionOrcs(bossOrc, 150, true, false, true);
                    rotateOrcsBeforeDeathTransition.play();
                    riseOrcsUpTransition.play();

                    realGame.setCoins(realGame.getCoins()+realBoss.getCoins_on_killing());
                    coinLabel.setText("" + realGame.getCoins());

                    riseOrcsUpTransition.setOnFinished(ee -> {
                        goDownTransition.play();
                        goDownTransition.setOnFinished(eee -> {
                            bossOrc.setImage(null);
                            change_to_victory();
                        });
                    });

                }


            }

            for(int i = 0; i< RealCoinChests.length; i++){
                if (RealCoinChests[i].isClosed() && realHero.getImageView().getBoundsInParent().intersects(coinChestViews[i].getBoundsInParent())) {
                    //System.out.println("collision chest");

                    coinChestViews[i].setImage(new Image("file:src/main/resources/com/example/the_will_hero_game/assets/ChestOpen.png"));
                    realGame.setCoins(realGame.getCoins() + realGame.getCoinChest().getCoins());
                    coinLabel.setText("" + realGame.getCoins());
                    RealCoinChests[i].setClosed(false);
                }

                if (realHero.getImageView().getBoundsInParent().intersects(coinChestViews[1].getBoundsInParent())){
                    weapon1_flag = true;
                }
            }

            for( int i=0; i< orcsViews.length; i++){
                for( int j=0 ;j<valley_list.size();j++){
                    if( realOrcs[i].getPower()!=0 && orcsViews[i].getBoundsInParent().intersects(valley_list.get(j).getBoundsInParent())){
                        //System.out.println("realOrcs"+i+"valley"+j);
                        //animation to die
                        RotateTransition rotateOrcsBeforeDeathTransition = getRotateTransition(orcsViews[i], "Z");
                        TranslateTransition riseOrcsUpTransition = getTranslateTransitionOrcs(orcsViews[i], -50, true, false, true);
                        TranslateTransition goDownTransition = getTranslateTransitionOrcs(orcsViews[i], 150, true, false, true);
                        rotateOrcsBeforeDeathTransition.play();
                        riseOrcsUpTransition.play();

                        realOrcs[i].setPower(0);


                        realGame.setCoins(realGame.getCoins()+realOrcs[i].getCoins_on_killing());
                        coinLabel.setText("" + realGame.getCoins());

                        int finalI = i;
                        riseOrcsUpTransition.setOnFinished(ee -> {
                            goDownTransition.play();
                            goDownTransition.setOnFinished(eee -> {
                                orcsViews[finalI].setImage(null);
                            });
                        });

                    }


                }
            }

            for (ImageView i : coinsViews) {

                if (i.getImage()!=null && GameStarter.getHeroView().getBoundsInParent().intersects(i.getBoundsInParent())) {

                    //System.out.println("coin");
                    realGame.setCoins(realGame.getCoins() + 5);
                    coinLabel.setText("" + realGame.getCoins());
                    i.setImage(null);
                }
            }
            if ( !realGame.isLost() && GameStarter.getHeroView().getBoundsInParent().intersects(GameStarter.getWindmill_view().getBoundsInParent())) {

                System.out.println("hit windmill, you lose");
                //uncomment this later
                realGame.setLost(true);

            }

            for (Rectangle i : valley_list) {

                if (!realGame.isLost() && GameStarter.getHeroView().getBoundsInParent().intersects(i.getBoundsInParent())) {
                    System.out.println("you lose");
                    //uncomment this later
                    realGame.setLost(true);
                }
            }

            for (int i = 0; i< orcsViews.length; i++) {

                if (realOrcs[i].getPower()!= 0 && GameStarter.getHeroView().getBoundsInParent().intersects(orcsViews[i].getBoundsInParent())) {
                    //System.out.println("hero: "+realHero.getImageView().getBoundsInParent()+" orc: "+orcsViews[i].getBoundsInParent());
                    System.out.println("collision hero hit Orc");

//        for( int i=0;i<7; i++){
//            translateTransitions[i]=getTranslateTransitionOrcs(orcs[i], false, false);
//        }
//        translateTransitions[7]=getTranslateTransitionOrcs(bossOrc, false, false);
//
//        return translateTransitions;
                    TranslateTransition pushingOrcsBackTransition = getTranslateTransitionOrcs(orcsViews[i], -50, false, false, true);
                    pushingOrcsBackTransition.play();

                    for (ImageView j : orcsViews) {
                        if (orcsViews[i].getImage()!=null && (orcsViews[i] != j) && (orcsViews[i].getBoundsInParent().intersects(j.getBoundsInParent()))) {
                            pushingOrcsBackTransition.stop();

                            TranslateTransition pushingOrcOrcBackTransition = getTranslateTransitionOrcs(j, -50, false, false, true);
                            pushingOrcOrcBackTransition.play();

                            //animation to die have to give some extra coins
//                        RotateTransition rotateOrcsBeforeDeathTransition=getRotateTransition(i);
//                        TranslateTransition riseOrcsUpTransition=getTranslateTransitionOrcs(i, -100, true,false);
//                        TranslateTransition goDownTransition= getTranslateTransitionOrcs(i,200,true,false);
////                        rotateOrcsBeforeDeathTransition.play();
////                        riseOrcsUpTransition.play();
////                        goDownTransition.play();
//                        //i.setImage(null);
//                        ParallelTransition transition= new ParallelTransition(rotateOrcsBeforeDeathTransition,riseOrcsUpTransition,goDownTransition);
//                        transition.play();

                        }
                    }

                }
            }


        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();



        RotateTransition[] rotateCoins = getRotateTransitionsCoins();// where is declaration and play?
        TranslateTransition[] makingOrcsJump = getMakingOrcsJump();

        //got to parallize rotate coin and making orcs jump or just remove it
        ParallelTransition parallelTransition = new ParallelTransition(rotateCoins);
        parallelTransition.play();
        ParallelTransition parallelTransitionOrcJump = new ParallelTransition(makingOrcsJump);
        parallelTransitionOrcJump.play();

    }
    private TranslateTransition[] getMakingOrcsJump() {
        TranslateTransition[] translateTransitions= new TranslateTransition[8];
        for( int i=0;i<7; i++){
            translateTransitions[i]= getTranslateTransitionOrcs(orcsViews[i], -50, true, true, true);
        }
        translateTransitions[7]= getTranslateTransitionOrcs(bossOrc, -50, true, true, true);

        return translateTransitions;
    }

//    private TranslateTransition[] getMakingOrcsMoveBackOnHit(ImageView arc) {
//        TranslateTransition[] translateTransitions= new TranslateTransition[8];
//        for( int i=0;i<7; i++){
//            translateTransitions[i]=getTranslateTransitionOrcs(orcs[i], false, false);
//        }
//        translateTransitions[7]=getTranslateTransitionOrcs(bossOrc, false, false);
//
//        return translateTransitions;
//    }
}

