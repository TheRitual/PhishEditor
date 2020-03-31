package eu.theritual.phisher.editor;

public class ElemetSizes {
    private int minimumWidth, maximumWidth, minimumHeight, maximumHeight, width, height;

    public ElemetSizes(int width, int height, int maximumWidth, int maximumHeight, int minimumWidth, int minimumHeight) {
        this.minimumWidth = minimumWidth;
        this.maximumWidth = maximumWidth;
        this.minimumHeight = minimumHeight;
        this.maximumHeight = maximumHeight;
        this.width = width;
        this.height = height;
    }

    public ElemetSizes(int width, int height, int maximumWidth, int maximumHeight) {
        this(width, height, maximumWidth,maximumHeight,1,1);
    }

    public ElemetSizes(int width, int height) {
        this(width, height, 9000,9000,1,1);
    }

    public ElemetSizes() {
        this(800,600, 9000, 9000,1,1);
    }

    public int getMinimumWidth() {
        return minimumWidth;
    }

    public void setMinimumWidth(int minimumWidth) {
        this.minimumWidth = Math.max(minimumWidth, 1);
    }

    public int getMaximumWidth() {
        return maximumWidth;
    }

    public void setMaximumWidth(int maximumWidth) {
        this.maximumWidth = Math.min(maximumWidth, 9000);
    }

    public int getMinimumHeight() {
        return minimumHeight;
    }

    public void setMinimumHeight(int minimumHeight) {
        this.minimumHeight = Math.max(minimumHeight, 1);
    }

    public int getMaximumHeight() {
        return maximumHeight;
    }

    public void setMaximumHeight(int maximumHeight) {
        this.maximumHeight = Math.min(maximumHeight, 9000);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width >= 1 && width <= 9000) {
            this.width = width;
        } else {
            if(width <1) {
                this.width = 1;
            }
            if(width > 9000) {
                this.width = 9000;
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
