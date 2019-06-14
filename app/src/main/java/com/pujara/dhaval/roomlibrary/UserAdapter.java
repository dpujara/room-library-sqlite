package com.pujara.dhaval.roomlibrary;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private List<User> users;

    UserAdapter(List<User> users){
        this.users = users;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_row,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder viewHolder, int i) {
        viewHolder.firstname.setText(users.get(i).getFirstName());
        viewHolder.lastname.setText(users.get(i).getLastName());
        viewHolder.email.setText(users.get(i).getEmail());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstname,lastname,email;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstname = itemView.findViewById(R.id.first_name);
            lastname = itemView.findViewById(R.id.last_name);
            email = itemView.findViewById(R.id.email);

        }
    }
}
