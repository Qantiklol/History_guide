package ru.startandroid.develop.historyguide;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class eraAdapter extends RecyclerView.Adapter<eraAdapter.EraViewHolder> {

    Context context;
    List<era> eras;

    public eraAdapter(Context context, List<era> eras) {
        this.context = context;
        this.eras = eras;
    }

    @NonNull
    @Override
    public EraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View eraItems = LayoutInflater.from(context).inflate(R.layout.era_item, parent, false);
        return new eraAdapter.EraViewHolder(eraItems);
    }

    @Override
    public void onBindViewHolder(@NonNull EraViewHolder holder, int position) {
        holder.eraBg.setCardBackgroundColor(Color.parseColor(eras.get(position).getColor()));


        int imageId = context.getResources().getIdentifier(eras.get(position).getImg(), "drawable", context.getPackageName());
        holder.eraImage.setImageResource(imageId);

        holder.eraTitle.setText(eras.get(position).getTitle());
        holder.eraStartDate.setText(eras.get(position).getEra_start());
        holder.eraEndDate.setText(eras.get(position).getEra_end());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EraPage.class);

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation((Activity) context, new Pair<View, String>(holder.eraImage, "eraImage"));

                intent.putExtra("eraBg", Color.parseColor(eras.get(position).getColor()));
                intent.putExtra("eraImage", imageId);
                intent.putExtra("eraTitle", eras.get(position).getTitle());
                intent.putExtra("eraStartDate", eras.get(position).getEra_start());
                intent.putExtra("eraEndDate", eras.get(position).getEra_end());
                intent.putExtra("eraText", eras.get(position).getText());
                intent.putExtra("eraId", eras.get(position).getId());

                context.startActivity(intent, options.toBundle());

            }
        });
    }


    @Override
    public int getItemCount() {
        return eras.size();
    }

    public static final class EraViewHolder extends RecyclerView.ViewHolder {

        CardView eraBg;
        ImageView eraImage;
        TextView eraTitle, eraStartDate, eraEndDate;

        public EraViewHolder(@NonNull View itemView) {
            super(itemView);

            eraBg = itemView.findViewById(R.id.eraBG);
            eraImage = itemView.findViewById(R.id.eraImage);
            eraTitle = itemView.findViewById(R.id.eraTitle);
            eraStartDate = itemView.findViewById(R.id.eraStart);
            eraEndDate = itemView.findViewById(R.id.eraEnd);
        }
    }
}
