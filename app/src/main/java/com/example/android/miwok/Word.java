package com.example.android.miwok;

/**
 * Created by AhmedCo on 27/01/2018.
 */

public class Word {

  private static final int NO_IMAGE_PROVIDED = -1;
  /** Default translation for the word */
  private String mDefaultTranslation;
  /** Miwok translation for the word */
  private String mMiwokTranslation;

  private int mImageResourceId = NO_IMAGE_PROVIDED;

  /**
   * Create a new Word object.
   *
   * @param defaultTranslation is the word in a language that the user is already familiar with
   * (such as English)
   * @param miwokTranslation is the word in the Miwok language
   */
  public Word(String defaultTranslation, String miwokTranslation) {
    mDefaultTranslation = defaultTranslation;
    mMiwokTranslation = miwokTranslation;
  }

  public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
    mDefaultTranslation = defaultTranslation;
    mMiwokTranslation = miwokTranslation;
    mImageResourceId = imageResourceId;
  }

  /**
   * Get the default translation of the word.
   */
  public String getDefaultTranslation() {
    return mDefaultTranslation;
  }

  /**
   * Get the Miwok translation of the word.
   */
  public String getMiwokTranslation() {
    return mMiwokTranslation;
  }

  public int getImageResourceId() {
    return mImageResourceId;
  }

  public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }
}
