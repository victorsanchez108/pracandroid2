package com.example.practica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.content.Intent;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Create image list


    }


    public void irAOtroLayout(View view) {
        ;
        setContentView(R.layout.layout2);
    }

    public void irAOtroLayout2(View view) {
        ;
        setContentView(R.layout.activity_main);

    }

    public void irAOtroLayout3(View view) {
        ;
        setContentView(R.layout.layout3);
        List<SlideModel> imageList = new ArrayList<>();

// Add images to the list
        imageList.add(new SlideModel(R.drawable._54d5fb3a_9fcb_485e_8979_e049b7bd0f1d,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.lovepik_car_phone_wallpaper_background_image_400356948,  ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.desktop_wallpaper_lexus_lfa,  ScaleTypes.CENTER_CROP));

// Find the ImageSlider view by ID
        ImageSlider imageSlider = findViewById(R.id.imageSlider);

// Set the image list for the ImageSlider
        imageSlider.setImageList(imageList);

    }

}