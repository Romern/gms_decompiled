package p000;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: to */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1384to {

    /* renamed from: a */
    public static C1384to f27149a;

    /* renamed from: b */
    public final Context f27150b;

    /* renamed from: c */
    public final C1383tn f27151c = new C1383tn();

    /* renamed from: d */
    private final LocationManager f27152d;

    public C1384to(Context context, LocationManager locationManager) {
        this.f27150b = context;
        this.f27152d = locationManager;
    }

    /* renamed from: a */
    public final Location mo16021a(String str) {
        try {
            if (this.f27152d.isProviderEnabled(str)) {
                return this.f27152d.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
