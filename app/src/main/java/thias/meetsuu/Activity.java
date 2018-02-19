package thias.meetsuu;

/**
 * Created by Thias on 15-02-2018.
 */

class Activity {
    private String description;
    private int theme;

    public Activity(String description, int theme){
        if(description!=null) {
            this.description = description;
        }else{
            this.description="No description was given";
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTheme() {
        return theme;
    }

    public void setTheme(int theme) {
        this.theme = theme;
    }
}
