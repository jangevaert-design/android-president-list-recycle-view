package edu.cnm.deepdive.presidenlistrecycleview;

import static edu.cnm.deepdive.presidenlistrecycleview.R.id.iv_presidentPicture;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

  List<President> presidentList;
  Context context;

  public RecycleViewAdapter(
      List<President> presidentList, Context context) {
    this.presidentList = presidentList;
    this.context = context;
  }

  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_president, parent, false);
    MyViewHolder holder = new MyViewHolder(view);

    return holder;
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
      holder.tv_presName.setText(presidentList.get(position).getName());
      holder.tv_presDate.setText(String.valueOf(presidentList.get(position).getDateOfElection()));
      Glide.with(this.context).load(presidentList.get(position).getImageURL()).into(holder.iv_presPic);

      holder.parentLayout.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
          Intent intent = new Intent(context, AddEditOne.class);
          intent.putExtra("id", presidentList.get(position).getId());
          context.startActivity(intent);
        }
      });
  }

  @Override
  public int getItemCount() {
    return presidentList.size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder {
      ImageView iv_presPic;
      TextView tv_presName;
      TextView tv_presDate;
      ConstraintLayout parentLayout;


    public MyViewHolder(@NonNull View itemView) {
      super(itemView);
      iv_presPic = itemView.findViewById(iv_presidentPicture);
      tv_presName = itemView.findViewById(R.id.tv_presName);
      tv_presDate = itemView.findViewById(R.id.tv_dateElection);
      parentLayout = itemView.findViewById(R.id.oneLinePresidentLayout);
    }
  }
}
