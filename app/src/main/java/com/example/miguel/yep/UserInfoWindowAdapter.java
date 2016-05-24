package com.example.miguel.yep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.squareup.picasso.Picasso;

/**
 * Created by Miguel on 19/05/2016.
 */
public class UserInfoWindowAdapter implements GoogleMap.InfoWindowAdapter{
    LayoutInflater inflater= null;
    Context c;

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
        String snippet = String.valueOf(infoWindows.findViewById(R.id.snippet));



        ImageView img = (ImageView)infoWindows.findViewById(R.id.imagenEdificio);



/*        try {
            URL newURL = new URL("https://lh6.googleusercontent.com/proxy/uquEHFM9S_iAbjGmj7Jw_7t4kNSyWav2KqldpjafRE4wYN0V17dt82lbBbOdOsFJQKJ2dljonPWwYwBLXJ0qTAGe3Tj4kxO4gAqRDshXnvSeQQQwou2T8mgTbo2JAq6TC_gOQQ");
            Bitmap mIcon_val = BitmapFactory.decodeStream(newURL.openConnection() .getInputStream());
            img.setImageBitmap(mIcon_val);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       Picasso.with(this.c).load(snippet).into(img);

        return(infoWindows);
    }


}

