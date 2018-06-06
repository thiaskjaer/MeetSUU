package thias.meetsuu;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Thias on 18-02-2018.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private ArrayList<Activity> activityList;

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, description, theme;
        CardView cv;
        private ImageView pic;

        private ViewHolder(View view) {
            super(view);
            cv = itemView.findViewById(R.id.cv);
            title = view.findViewById(R.id.title);
            description = view.findViewById(R.id.desc);
            theme = view.findViewById(R.id.theme);
            pic = view.findViewById(R.id.pic);
        }
    }


    public RecycleAdapter(ArrayList<Activity> activityList) {
        this.activityList = activityList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Activity activity = activityList.get(position);

        holder.title.setText(activity.getTitle());

        holder.description.setText(activity.getDescription());

        if(activity.getTheme().equals("snow")){
            holder.pic.setImageResource(R.drawable.snow);
        } else{
            holder.pic.setImageResource(R.drawable.soccer);
        }
        //holder.theme.setText(activity.getTheme());
    }


    @Override
    public int getItemCount() {
        return activityList.size();
    }
}

