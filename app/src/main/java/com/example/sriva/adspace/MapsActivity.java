package com.example.sriva.adspace;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng auckland = new LatLng(-36.835475, 174.741720);
        mMap.addMarker(new MarkerOptions().position(auckland).title("Bunjee Jump #BucketList"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(auckland));

        LatLng wellington = new LatLng(-41.289091, 174.785321);
        mMap.addMarker(new MarkerOptions().position(wellington).title("Watch match"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wellington));

        LatLng hamilton = new LatLng(-37.785945, 175.280045);
        mMap.addMarker(new MarkerOptions().position(hamilton).title("Bunjee Jump #BucketList"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hamilton));


    }
}
