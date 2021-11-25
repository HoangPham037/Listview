package com.android45.danhsachmonan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView lvMonAn;
List<Mon_an> list;
Mon_an mon_an1, mon_an2, mon_an3, mon_an4, mon_an5, mon_an6, mon_an7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonAn = findViewById(R.id.lvMonAn);
        AdrapterMon_an adrapterMonAn;
        list = new ArrayList<>();
        mon_an1 = new Mon_an("Món Huế","Phở-Mì-Bún, Ẩm thực miền bắc", "Tối thiểu: 30.000đ",R.drawable.img_bunhue);
        mon_an2 = new Mon_an("Joma Bakery","Bánh ngọt, Salad, Sandwich","Tối thiểu: 45.000đ", R.drawable.img_humberger);
        mon_an3 = new Mon_an("Donner Kebab 1995","Món Thổ Nhĩ Kỳ, Món Châu Á khác","Tối thiểu: 50.000đ", R.drawable.ic_tnk);
        mon_an4 = new Mon_an("Cơm Đại Vương - Cơm Đài Loan","Cơm, món Châu Á khác", "Tối thiểu: 35.000đ",R.drawable.ic_comdailoan);
        mon_an5 = new Mon_an("Cơm Đại Vương - Cơm Đài Loan","Cơm, món Châu Á khác", "Tối thiểu: 35.000đ",R.drawable.ic_comdailoan);
        mon_an6 = new Mon_an("Cơm Đại Vương - Cơm Đài Loan","Cơm, món Châu Á khác", "Tối thiểu: 35.000đ",R.drawable.ic_comdailoan);
        mon_an7 = new Mon_an("Cơm Đại Vương - Cơm Đài Loan","Cơm, món Châu Á khác", "Tối thiểu: 35.000đ",R.drawable.ic_comdailoan);

        list.add(mon_an1);
        list.add(mon_an2);
        list.add(mon_an3);
        list.add(mon_an4);
        list.add(mon_an5);
        list.add(mon_an6);
        list.add(mon_an7);

        adrapterMonAn = new AdrapterMon_an(MainActivity.this, R.layout.ic_mon_an,list);
        lvMonAn.setAdapter(adrapterMonAn);

    }
}