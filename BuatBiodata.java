package com.okedroid.biodatadirisqlite;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BuatBiodata extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    EditText etChek;
    EditText etSearch;
    TextView tvNumber;
    TextView tvTableX;
    TextView tvTableY;
    TextView table1;
    TextView table2;
    TextView table3;
    TextView table4;
    TextView table5;
    TextView table6;
    TextView table7;
    TextView table8;
    TextView table9;
    TextView table10;
    Button btsave, btexport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_biodata);

        dbHelper = new DataHelper(this);
        tvNumber = (TextView) findViewById(R.id.tv_number);
        tvTableX = (TextView) findViewById(R.id.tv_table_x);
        tvTableY = (TextView) findViewById(R.id.tv_table_y);
        etSearch = (EditText) findViewById(R.id.et_search);
        etChek = (EditText) findViewById(R.id.et_chek);
        btsave = (Button) findViewById(R.id.bt_save);
        table1 = (TextView) findViewById(R.id.table_1);
        table2 = (TextView) findViewById(R.id.table_2);
        table3 = (TextView) findViewById(R.id.table_3);
        table4 = (TextView) findViewById(R.id.table_4);
        table5 = (TextView) findViewById(R.id.table_5);
        table6 = (TextView) findViewById(R.id.table_6);
        table7 = (TextView) findViewById(R.id.table_7);
        table8 = (TextView) findViewById(R.id.table_8);
        table9 = (TextView) findViewById(R.id.table_9);
        table10 = (TextView) findViewById(R.id.table_10);
        btexport = (Button) findViewById(R.id.bt_export);


        String tableX1 = "isi table x1";
        tvTableX.setText(tableX1);

        final String tableY1 = "isi table y1";
        tvTableY.setText(tableY1);

        int satu = 1;
        tvNumber.setText(""+satu);

        btsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub


                int limaRatus = 1;

                String aaab = tvNumber.getText().toString().trim();

                int angkaSekaranx = Integer.parseInt(aaab);

                if (angkaSekaranx == 10) {
                    tvNumber.setText("" + limaRatus);
                } else {
                    int halamanSelanjutnya = 1;
                    String aaac = tvNumber.getText().toString().trim();
                    int angkaSekarang = Integer.parseInt(aaac);
                    int angkaSebenarnya = halamanSelanjutnya + angkaSekarang;
                    tvNumber.setText("" + angkaSebenarnya);
                }


                if (angkaSekaranx == 1) {
                    table1.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 2) {
                    table2.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 3) {
                    table3.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 4) {
                    table4.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 5) {
                    table5.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 6) {
                    table6.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 7) {
                    table7.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 8) {
                    table8.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 9) {
                    table9.setText(etChek.getText().toString());
                } else if (angkaSekaranx == 10) {
                    table10.setText(etChek.getText().toString());
                }


                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.execSQL("insert into biodata(table1, table2, table3, table4, table5, table6, table7, table8, table9, table10) values('" +
                        table1.getText().toString()+"','"+
                        table2.getText().toString() +"','" +
                        table3.getText().toString()+"','"+
                        table4.getText().toString() +"','" +
                        table5.getText().toString() +"','" +
                        table6.getText().toString() +"','" +
                        table7.getText().toString() +"','" +
                        table8.getText().toString() +"','" +
                        table9.getText().toString() +"','" +
                        table10.getText().toString() + "')");
                Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                MainActivity.ma.RefreshList();
                finish();
            }
        });
        btexport.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void btNext(View view) {

        int limaRatus = 1;

        String aaab = tvNumber.getText().toString().trim();

        int angkaSekaranx = Integer.parseInt(aaab);

        if (angkaSekaranx == 10) {
            tvNumber.setText("" + limaRatus);
        } else {

            int halamanSelanjutnya = 1;

            String aaac = tvNumber.getText().toString().trim();

            int angkaSekarang = Integer.parseInt(aaac);

            int angkaSebenarnya = halamanSelanjutnya + angkaSekarang;

            tvNumber.setText("" + angkaSebenarnya);
        }

        String tableX2 = "isi table x2";
        String tableX3 = "isi table x3";
        String tableX4 = "isi table x4";
        String tableX5 = "isi table x5";
        String tableX6 = "isi table x6";
        String tableX7 = "isi table x7";
        String tableX8 = "isi table x8";
        String tableX9 = "isi table x9";
        String tableX10 = "isi table x10";
        String tableX1 = "isi table x1";
        String tableY2 = "isi table y2";
        String tableY3 = "isi table y3";
        String tableY4 = "isi table y4";
        String tableY5 = "isi table y5";
        String tableY6 = "isi table y6";
        String tableY7 = "isi table y7";
        String tableY8 = "isi table y8";
        String tableY9 = "isi table y9";
        String tableY10 = "isi table y10";
        String tableY1 = "isi table y1";

        if (angkaSekaranx == 1) {
            tvTableX.setText(tableX2);
            tvTableY.setText(tableY2);
            table1.setText(etChek.getText().toString());
            etChek.setText(table2.getText().toString());
        } else if (angkaSekaranx == 2) {
            tvTableX.setText(tableX3);
            tvTableY.setText(tableY3);
            table2.setText(etChek.getText().toString());
            etChek.setText(table3.getText().toString());
        } else if (angkaSekaranx == 3) {
            tvTableX.setText(tableX4);
            tvTableY.setText(tableY4);
            table3.setText(etChek.getText().toString());
            etChek.setText(table4.getText().toString());
        } else if (angkaSekaranx == 4) {
            tvTableX.setText(tableX5);
            tvTableY.setText(tableY5);
            table4.setText(etChek.getText().toString());
            etChek.setText(table5.getText().toString());
        } else if (angkaSekaranx == 5) {
            tvTableX.setText(tableX6);
            tvTableY.setText(tableY6);
            table5.setText(etChek.getText().toString());
            etChek.setText(table6.getText().toString());
        } else if (angkaSekaranx == 6) {
            tvTableX.setText(tableX7);
            tvTableY.setText(tableY7);
            table6.setText(etChek.getText().toString());
            etChek.setText(table7.getText().toString());
        } else if (angkaSekaranx == 7) {
            tvTableX.setText(tableX8);
            tvTableY.setText(tableY8);
            table7.setText(etChek.getText().toString());
            etChek.setText(table8.getText().toString());
        } else if (angkaSekaranx == 8) {
            tvTableX.setText(tableX9);
            tvTableY.setText(tableY9);
            table8.setText(etChek.getText().toString());
            etChek.setText(table9.getText().toString());
        } else if (angkaSekaranx == 9) {
            tvTableX.setText(tableX10);
            tvTableY.setText(tableY10);
            table9.setText(etChek.getText().toString());
            etChek.setText(table10.getText().toString());
        } else if (angkaSekaranx == 10) {
            tvTableX.setText(tableX1);
            tvTableY.setText(tableY1);
            table10.setText(etChek.getText().toString());
            etChek.setText(table1.getText().toString());
        }


    }
    public void btPerv(View view){
        int limaRatus = 10;

        String aaab = tvNumber.getText().toString().trim();

        int angkaSekaranx = Integer.parseInt(aaab);

        if (angkaSekaranx == 1) {
            tvNumber.setText(""+limaRatus);
        } else {

            int halamanSelanjutnya = 1;

            String aaac = tvNumber.getText().toString().trim();

            int angkaSekarang = Integer.parseInt(aaac);

            int angkaSebenarnya = angkaSekarang-halamanSelanjutnya;

            tvNumber.setText(""+angkaSebenarnya);
        }
        String tableX2 = "isi table x2";
        String tableX3 = "isi table x3";
        String tableX4 = "isi table x4";
        String tableX5 = "isi table x5";
        String tableX6 = "isi table x6";
        String tableX7 = "isi table x7";
        String tableX8 = "isi table x8";
        String tableX9 = "isi table x9";
        String tableX10 = "isi table x10";
        String tableX1 = "isi table x1";
        String tableY2 = "isi table y2";
        String tableY3 = "isi table y3";
        String tableY4 = "isi table y4";
        String tableY5 = "isi table y5";
        String tableY6 = "isi table y6";
        String tableY7 = "isi table y7";
        String tableY8 = "isi table y8";
        String tableY9 = "isi table y9";
        String tableY10 = "isi table y10";
        String tableY1 = "isi table y1";

        if (angkaSekaranx == 3) {
            tvTableX.setText(tableX2);
            tvTableY.setText(tableY2);
            table3.setText(etChek.getText().toString());
            etChek.setText(table2.getText().toString());
        } else if (angkaSekaranx == 4) {
            tvTableX.setText(tableX3);
            tvTableY.setText(tableY3);
            table4.setText(etChek.getText().toString());
            etChek.setText(table3.getText().toString());
        } else if (angkaSekaranx == 5) {
            tvTableX.setText(tableX4);
            tvTableY.setText(tableY4);
            table5.setText(etChek.getText().toString());
            etChek.setText(table4.getText().toString());
        } else if (angkaSekaranx == 6) {
            tvTableX.setText(tableX5);
            tvTableY.setText(tableY5);
            table6.setText(etChek.getText().toString());
            etChek.setText(table5.getText().toString());
        } else if (angkaSekaranx == 7) {
            tvTableX.setText(tableX6);
            tvTableY.setText(tableY6);
            table7.setText(etChek.getText().toString());
            etChek.setText(table6.getText().toString());
        } else if (angkaSekaranx == 8) {
            tvTableX.setText(tableX7);
            tvTableY.setText(tableY7);
            table8.setText(etChek.getText().toString());
            etChek.setText(table7.getText().toString());
        } else if (angkaSekaranx == 9) {
            tvTableX.setText(tableX8);
            tvTableY.setText(tableY8);
            table9.setText(etChek.getText().toString());
            etChek.setText(table8.getText().toString());
        } else if (angkaSekaranx == 10) {
            tvTableX.setText(tableX9);
            tvTableY.setText(tableY9);
            table10.setText(etChek.getText().toString());
            etChek.setText(table9.getText().toString());
        } else if (angkaSekaranx == 1) {
            tvTableX.setText(tableX10);
            tvTableY.setText(tableY10);
            table1.setText(etChek.getText().toString());
            etChek.setText(table10.getText().toString());
        } else if (angkaSekaranx == 2) {
            tvTableX.setText(tableX1);
            tvTableY.setText(tableY1);
            table2.setText(etChek.getText().toString());
            etChek.setText(table1.getText().toString());
        }
    }

}
