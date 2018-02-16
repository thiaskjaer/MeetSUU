package thias.meetsuu;

/**
 * Created by Thias on 15-02-2018.
 */

class Activity {
    private String description;
    private int theme;

    private Activity(String description, int theme){
        if(description!=null) {
            this.description = description;
        }else{
            this.description="No description was given";
        }
    }
}
