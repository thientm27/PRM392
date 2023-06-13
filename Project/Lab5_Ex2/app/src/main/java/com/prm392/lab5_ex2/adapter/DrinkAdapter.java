package com.prm392.lab5_ex2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.prm392.lab5_ex2.R;
import com.prm392.lab5_ex2.model.Drink;

import java.util.List;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkAdapter.ViewHolder> {
    private List<Drink> drinks;

    public DrinkAdapter(List<Drink> drinks) {
        this.drinks = drinks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View userView = inflater.inflate(R.layout.row_drink, parent, false);
        ViewHolder viewHolder = new ViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Drink drink = drinks.get(position);
        holder.imagePhone.setImageResource(drink.getImage());
        holder.tvPhoneName.setText(drink.getName());
        holder.tvBrandValue.setText(drink.getBrand());
        holder.tvYearValue.setText(String.valueOf(drink.getReleaseYear()));
        holder.tvPrice.setText("$" + drink.getPrice());
    }

    @Override
    public int getItemCount() {
        return drinks.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imagePhone;
        TextView tvPhoneName;
        TextView tvBrandValue;
        TextView tvYearValue;
        TextView tvPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagePhone = itemView.findViewById(R.id.imagePhone);
            tvPhoneName = itemView.findViewById(R.id.tvPhoneName);
            tvBrandValue = itemView.findViewById(R.id.tvBrandValue);
            tvYearValue = itemView.findViewById(R.id.tvYearValue);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }
}
