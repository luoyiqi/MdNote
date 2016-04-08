package com.xdsjs.mdnote.view.adapter;

import android.content.Context;
import android.databinding.ObservableList;
import android.view.View;
import android.view.ViewGroup;

import com.xdsjs.mdnote.databinding.RecyMainpageItemBinding;
import com.xdsjs.mdnote.model.bean.Note;

/**
 * 作者: hzsongjinsheng on 2016-04-08 10:46
 * 邮箱: hzsongjinsheng@corp.netease.com
 */
public class MainActAdapter extends BindingRecyclerView.ListAdapter<Note, MainActAdapter.ViewHolder> {

    public MainActAdapter(Context context, ObservableList<Note> data) {
        super(context, data);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(RecyMainpageItemBinding.inflate(inflater, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Note note = data.get(position);
        holder.binding.setNote(note);
        holder.binding.executePendingBindings();
    }

    public class ViewHolder extends BindingRecyclerView.ViewHolder<RecyMainpageItemBinding> {

        public ViewHolder(RecyMainpageItemBinding binding) {
            super(binding);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    return false;
                }
            });
        }
    }
}
