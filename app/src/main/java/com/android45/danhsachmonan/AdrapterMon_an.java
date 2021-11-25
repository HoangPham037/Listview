package com.android45.danhsachmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdrapterMon_an extends BaseAdapter {
    private Context context;
    private  int layout;
    private List<Mon_an> list;

    public AdrapterMon_an(Context context, int layout, List<Mon_an> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {

        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        Mon_an monAn = list.get(position);

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvMoTa = convertView.findViewById(R.id.tvMoTa);
        TextView tvGia = convertView.findViewById(R.id.tvGia);
        ImageView imgMonAn = convertView.findViewById((R.id.imgMonAn));

        tvName.setText(monAn.getName());
        tvMoTa.setText(monAn.getMota());
        tvGia.setText(monAn.getGia());
        imgMonAn.setImageResource(monAn.getAnh());

        return convertView;
    }
}
