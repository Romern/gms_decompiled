package p000;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationRequest;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;

/* renamed from: bhbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhbv extends bhbu {
    public bhbv(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final String mo63528a() {
        return this.f118271a.getExtraLocationControllerPackage();
    }

    /* renamed from: a */
    public final void mo63533a(String str) {
        this.f118271a.setExtraLocationControllerPackage(str);
    }

    /* renamed from: a */
    public final void mo63534a(String str, long j, LocationListener locationListener, Looper looper, Collection collection, boolean z) {
        LocationRequest createFromDeprecatedProvider = LocationRequest.createFromDeprecatedProvider(str, j, 0.0f, false);
        createFromDeprecatedProvider.setWorkSource(saq.m34797a(collection));
        createFromDeprecatedProvider.setHideFromAppOps(true);
        createFromDeprecatedProvider.setLocationSettingsIgnored(z);
        if (cevw.m138319d()) {
            try {
                this.f118271a.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
            } catch (SecurityException e) {
                Log.wtf("LocationManagerCompat", "exception when requesting location updates", e);
            }
        } else {
            this.f118271a.requestLocationUpdates(createFromDeprecatedProvider, locationListener, looper);
        }
    }

    /* renamed from: a */
    public final void mo63537a(boolean z) {
        this.f118271a.setExtraLocationControllerPackageEnabled(z);
    }
}
