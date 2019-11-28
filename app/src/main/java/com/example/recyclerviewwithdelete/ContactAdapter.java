package com.example.recyclerviewwithdelete;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contact> contactList;

    //Constructor
    public ContactAdapter(Context mContext,List<Contact> contactList){
        this.mContext=mContext;
        this.contactList=contactList;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contacts,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        final Contact contact=contactList.get(position);
        holder.imgImage.setImageResource(contact.getGender().equals("Male")?R.drawable.male:R.drawable.female);
        holder.tvName.setText(contact.getName());
        holder.tvAge.setText(contact.getAge());
        holder.tvLocation.setText(contact.getLocation());
        holder.tvGender.setText(contact.getGender());
        holder.imgImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,DetailsActivity.class);
                intent.putExtra("Image",contact.getImageId());
                intent.putExtra("name",contact.getName());
                intent.putExtra("age",contact.getAge());
                intent.putExtra("gender",contact.getGender());
                intent.putExtra("location",contact.getLocation());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgImage;
        TextView tvAge,tvName,tvGender,tvLocation;
        ImageButton imgDelete;
        public ContactsViewHolder(@NonNull View itemView){
            super(itemView);
            imgImage=itemView.findViewById(R.id.imgIcon);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvLocation=itemView.findViewById(R.id.tvLocation);
            tvGender=itemView.findViewById(R.id.tvGender);
        }
    }
}
