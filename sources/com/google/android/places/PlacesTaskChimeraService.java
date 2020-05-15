package com.google.android.places;

import android.content.Intent;
import android.content.SharedPreferences;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PlacesTaskChimeraService extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        char c;
        String str = aecc.f63128a;
        if (str.hashCode() == -684799771 && str.equals("Places.PlacesTaskChimeraService.PREFETCHING_TASK_TAG")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            return 2;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("PlacesTaskChimeraServicePreferences", 0);
        long j = sharedPreferences.getLong("lastPrefetchMillis", -1);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j > cggv.f186908a.mo6606a().mo83769d()) {
            Intent intent = new Intent("com.google.android.gms.location.places.PlaceDetectionAsyncService");
            intent.setPackage(getPackageName());
            intent.putExtra("PREFETCHING", "PREFETCHING");
            startService(intent);
            sharedPreferences.edit().putLong("lastPrefetchMillis", currentTimeMillis).apply();
        }
        return 0;
    }
}
