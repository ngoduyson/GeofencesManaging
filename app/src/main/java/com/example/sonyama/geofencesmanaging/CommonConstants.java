package com.example.sonyama.geofencesmanaging;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by sonyama on 5/30/16.
 */
public final class CommonConstants {
    private CommonConstants() {
    }

    public static final String PACKAGE_NAME = "com.example.sonyama.geofencesmanaging";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    // Nên để bán kính geofence là 1km cho dế check nhé
    public static final float GEOFENCE_RADIUS_IN_METERS = 1000;

    // List các geofences muốn track
    public static final HashMap<String, LatLng> AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {
        AREA_LANDMARKS.put("Hanoi, KeangNam Landmark 72", new LatLng(21.017564, 105.784075));
        AREA_LANDMARKS.put("Tokyo, Metropolitan Government Building", new LatLng(35.689896, 139.692111));
        AREA_LANDMARKS.put("New York City Police Department", new LatLng(40.860085, -73.843970));
    }
}
