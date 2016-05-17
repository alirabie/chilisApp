package iperfect.emasoft.com.chilisapp.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import iperfect.emasoft.com.chilisapp.R;

public class Tablenumbers extends AppCompatActivity {
    private ImageView n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablenumbers);
        n1=(ImageView)findViewById(R.id.num1);
        n2=(ImageView)findViewById(R.id.num2);
        n3=(ImageView)findViewById(R.id.num3);
        n4=(ImageView)findViewById(R.id.num4);
        n5=(ImageView)findViewById(R.id.num5);
        n6=(ImageView)findViewById(R.id.num6);
        n7=(ImageView)findViewById(R.id.num7);
        n8=(ImageView)findViewById(R.id.num8);
        n9=(ImageView)findViewById(R.id.num9);
        n10=(ImageView)findViewById(R.id.num10);
        n11=(ImageView)findViewById(R.id.num11);
        n12=(ImageView)findViewById(R.id.num12);
        n13=(ImageView)findViewById(R.id.num13);
        n14=(ImageView)findViewById(R.id.num14);
        n15=(ImageView)findViewById(R.id.num15);





        //Buttons Actions

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

        n15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Tablenumbers.this, Categories.class).putExtra("TableNum", 1));

            }
        });

















    }

}
