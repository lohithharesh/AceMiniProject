package com.example.lohith.ace;

import java.util.List;
import com.example.lohith.ace.RowItem;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardAdapter extends ArrayAdapter<RowItem> {

    Context context;

    public CardAdapter(Context context, int resourceId,
                                 List<RowItem> items) {
        super(context, resourceId, items);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        RowItem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.card_list, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.icon);
            holder.imageView2 = (ImageView) convertView.findViewById(R.id.icon2);
            holder.imageView3 = (ImageView) convertView.findViewById(R.id.icon3);
            holder.imageView4 = (ImageView) convertView.findViewById(R.id.icon4);
            holder.imageView5 = (ImageView) convertView.findViewById(R.id.icon5);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();


        int len = rowItem.getLen();
        if(len==1)
         holder.imageView.setImageResource(rowItem.getImageId());
        else if(len==2)
        {
            holder.imageView.setImageResource(rowItem.getImageId());
            holder.imageView2.setImageResource(rowItem.getImageId2());
        }
        else if(len==3)
        {
            holder.imageView.setImageResource(rowItem.getImageId());
            holder.imageView2.setImageResource(rowItem.getImageId2());
            holder.imageView3.setImageResource(rowItem.getImageId3());

        }

        else if(len==4)
        {
            holder.imageView.setImageResource(rowItem.getImageId());
            holder.imageView2.setImageResource(rowItem.getImageId2());
            holder.imageView3.setImageResource(rowItem.getImageId3());
            holder.imageView4.setImageResource(rowItem.getImageId4());

        }

        else if(len==5)
        {
            holder.imageView.setImageResource(rowItem.getImageId());
            holder.imageView2.setImageResource(rowItem.getImageId2());
            holder.imageView3.setImageResource(rowItem.getImageId3());
            holder.imageView4.setImageResource(rowItem.getImageId4());
            holder.imageView5.setImageResource(rowItem.getImageId5());

        }


        return convertView;
    }
}