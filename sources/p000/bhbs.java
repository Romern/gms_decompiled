package p000;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationRequest;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;

/* renamed from: bhbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bhbs extends bhbr {
    public bhbs(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo63534a(String str, long j, LocationListener locationListener, Looper looper, Collection collection, boolean z) {
        try {
            LocationRequest createFromDeprecatedProvider = LocationRequest.createFromDeprecatedProvider(str, j, 0.0f, false);
            createFromDeprecatedProvider.setWorkSource(saq.m34797a(collection));
            createFromDeprecatedProvider.setHideFromAppOps(true);
            this.f118271a.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
        } catch (Exception e) {
            Log.e("LocationManagerCompat", "Unable to assign LocationManager blame through WorkSource", e);
            super.mo63534a(str, j, locationListener, looper, collection, z);
        }
    }
}
