package com.example.miguel.yep;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by Miguel on 19/05/2016.
 */
public class UserInfoWindowAdapter implements GoogleMap.InfoWindowAdapter{
    LayoutInflater inflater= null;

    UserInfoWindowAdapter(LayoutInflater inflater){
        this.inflater=inflater;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {




        MapsActivity myMapsAct = new MapsActivity();
        View infoWindows = inflater.inflate(R.layout.user_info_windows, null);

        TextView title= (TextView)infoWindows.findViewById(R.id.title);
        // TextView description = (TextView)infoWindows.findViewById(R.id.snippet);
        title.setText(marker.getTitle());
        // description.setText(marker.getSnippet());




        return(infoWindows);
    }
}

