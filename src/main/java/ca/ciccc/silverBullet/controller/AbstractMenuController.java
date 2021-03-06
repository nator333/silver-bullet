package ca.ciccc.silverBullet.controller;


import ca.ciccc.silverBullet.utils.MediaUtil;
import javafx.scene.media.AudioClip;

public abstract class AbstractMenuController extends AbstractController {

  protected static final AudioClip MENU_CLIP =
      MediaUtil.createClip("file:src/main/resources/Sound/BitShift.wav");

  public static AudioClip getMenuClip() {
    return MENU_CLIP;
  }

  public static AudioClip getBattleClip() {
    return BATTLE_CLIP;
  }

  protected static final AudioClip BATTLE_CLIP =
      MediaUtil.createClip("file:src/main/resources/Sound/Overworld.wav");
}
