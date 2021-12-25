package com.list.bayutugas4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterBahasaPemrograman extends ArrayAdapter{

    Context context;
    ArrayList<DataBahasaPemrograman> datas;
    LayoutInflater layoutInflater;

    ImageView logo;
    TextView title, deskripsi, helo_word, detail_web;

    public AdapterBahasaPemrograman(Context context, ArrayList<DataBahasaPemrograman> data) {
        super(context, R.layout.listpemrograman, data);
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.datas = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.listpemrograman, parent, false);
        DataBahasaPemrograman data = datas.get(position);

        logo = convertView.findViewById(R.id.logo);
        title = convertView.findViewById(R.id.NamePerograman);
        helo_word = convertView.findViewById(R.id.heloWord);
        deskripsi = convertView.findViewById(R.id.deskripsi);
        detail_web = convertView.findViewById(R.id.detailJava);

        Glide
                .with(context)
                .load(data.getLogo())
                .placeholder(R.drawable.ic_refres_foreground)
                .into(logo);
        title.setText(data.getNameAlgoritma());
        deskripsi.setText(data.getDescription());
        helo_word.setText(data.getHello_world());
        detail_web.setText(data.getBaca_lebih_lanjut());

        return convertView;
    }
}