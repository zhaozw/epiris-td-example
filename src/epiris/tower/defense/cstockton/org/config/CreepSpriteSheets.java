package epiris.tower.defense.cstockton.org.config;

import epiris.tower.defense.cstockton.org.sprite.ISpriteSheet;

public enum CreepSpriteSheets implements ISpriteSheet {

    CREEPS01 ("creeps01.png", 1024, 1024, 16, 16),
    CREEPS02 ("creeps02.png", 1024, 1024, 16, 16),

    ;

    private final String mSheet;

    private final int mWidth;
    private final int mHeight;
    private final int mCols;
    private final int mRows;

    CreepSpriteSheets(final String pSheet, final int pWidth, final int pHeight, final int pCols, final int pRows) {
        mSheet = pSheet;

        mWidth = pWidth;
        mHeight = pHeight;
        mCols = pCols;
        mRows = pRows;
    }

    @Override
    public String getSheet() {
        return mSheet;
    }

    @Override
    public int getWidth() {
        return mWidth;
    }

    @Override
    public int getHeight() {
        return mHeight;
    }

    @Override
    public int getTileWidth() {
        return mWidth / mCols;
    }

    @Override
    public int getTileHeight() {
        return mHeight / mRows;
    }

    @Override
    public int getCols() {
        return mCols;
    }

    @Override
    public int getRows() {
        return mRows;
    }
}