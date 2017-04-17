package com.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */

public class AdapterRec extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<String> mStringList=new ArrayList<>();

    public void addData(int a ,boolean mist){
        if (mist){
            this.mis=mist;
            return;
        }
        for (int i = 0; i < a; i++) {
            mStringList.add("jjj");
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        if (viewType==0){
             v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        }else {
             v= LayoutInflater.from(parent.getContext()).inflate(R.layout.mistake_net,parent,false);
        }
        return new RecyclerView.ViewHolder(v) {};
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {
        if (mis){
            return 1;
        }
        return 0;
    }

    boolean mis=false;
    @Override
    public int getItemCount() {
       if (mis){
           return 1;
       }
        return mStringList.size();
    }



}
