package thias.meetsuu;

/**
 * Created by Thias on 15-02-2018.
 */

class Activity {
    private String title;
    private String description;
    private String theme;

    public Activity(String title, String description, String theme){
        if(title!=null) {
            this.title = title;
        }else{
            this.title="No Title";
        }

        if(description!=null) {
            this.description = description;
        }else{
            this.description="No description was given";
        }

        this.theme = theme;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

}
