package android.studioprojects.everydayspells.Adapter;

import android.content.Context;
import android.studioprojects.everydayspells.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import android.studioprojects.everydayspells.Model.ListItem;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private List<ListItem> listItems;



    public Adapter(Context context, List listItem) {
        this.context = context;
        this.listItems = listItem;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        ListItem item = listItems.get(position);
        holder.name.setText(item.getName());
        holder.description
                .setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.categoryTextView);
            description = (TextView) itemView.findViewById(R.id.categoryDescTextView);




        }

        @Override
        public void onClick(View itemView) {
            int position = getAdapterPosition();

            ListItem item = listItems.get(position);
            Toast.makeText(context, item.getName(), Toast.LENGTH_SHORT).show();
        }
    }
}
