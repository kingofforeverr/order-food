package com.example.myapplication;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] countryNames = {"Vietnam","Vietnam","Vietnam","Vietnam","Vietnam","Vietnam", "United States", "Russia"};
    int[] flags = {R.drawable.vn,R.drawable.vn,R.drawable.vn,R.drawable.vn,R.drawable.vn,R.drawable.vn, R.drawable.us, R.drawable.rs};
    String[] populations = {"98000000","98000000","98000000","98000000","98000000","98000000","331000000", "144000000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        GridAdapter adapter = new GridAdapter(this, countryNames, flags, populations);
        gridView.setAdapter(adapter);
    }
}

//public class MainActivity extends AppCompatActivity {
//
//    private ListView listView;
//    private List<Contact> contactList;
//    private ContactAdapter adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        listView = findViewById(R.id.listView);
//        contactList = new ArrayList<>();
//
//        contactList.add(new Contact("Viet Nam", "Population  9800000000", R.drawable.vn));
//        contactList.add(new Contact("Viet Nam", "Population  9800000000", R.drawable.vn));
//        contactList.add(new Contact("Viet Nam", "Population  9800000000", R.drawable.vn));
//        contactList.add(new Contact("Viet Nam", "Population  9800000000", R.drawable.vn));
//        contactList.add(new Contact("Viet Nam", "Population  9800000000", R.drawable.vn));
//        contactList.add(new Contact("Mỹ", "Population  9800000000", R.drawable.us));
//        contactList.add(new Contact("Russian", "Population  9800000000", R.drawable.rs));
//        contactList.add(new Contact("Russian", "Population  9800000000", R.drawable.rs));
//
//
//        adapter = new ContactAdapter(this, contactList);
//        listView.setAdapter(adapter);
//        // Xử lý sự kiện click vào từng item
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Contact selectedContact = contactList.get(position);
//                Toast.makeText(MainActivity.this, "Bạn đã chọn: " + selectedContact.getName()+"  " + selectedContact.getPhone(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}