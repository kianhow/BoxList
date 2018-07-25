package sg.edu.rp.c346.boxlist;

/**
 * Created by 17001227 on 25/7/2018.
 */

public class BoxItem {

    private boolean isBlue;
    private boolean isBrown;

    public BoxItem(boolean isBlue, boolean isBrown) {
        this.isBlue = isBlue;
        this.isBrown = isBrown;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    public boolean isBrown() {
        return isBrown;
    }

    public void setBrown(boolean brown) {
        isBrown = brown;
    }

    @Override
    public String toString() {
        return "BoxItem{" +
                "isBlue=" + isBlue +
                ", isBrown=" + isBrown +
                '}';
    }
}
