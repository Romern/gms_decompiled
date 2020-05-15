package p000;

import android.content.Context;
import android.database.ContentObserver;
import android.location.LocationManager;

/* renamed from: bfzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfzx {

    /* renamed from: a */
    public final Context f115842a;

    /* renamed from: b */
    public final ContentObserver f115843b;

    /* renamed from: c */
    private final LocationManager f115844c;

    public bfzx(Context context, ContentObserver contentObserver) {
        this.f115842a = context;
        this.f115843b = contentObserver;
        this.f115844c = (LocationManager) context.getSystemService("location");
    }

    /* renamed from: a */
    public final boolean mo62522a() {
        try {
            return this.f115844c.isProviderEnabled("network") && aymk.m84257a(this.f115842a.getContentResolver(), "network_location_opt_in", -1) == 1;
        } catch (NullPointerException e) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo62523b() {
        try {
            return this.f115844c.isProviderEnabled("gps");
        } catch (NullPointerException e) {
            return false;
        }
    }
}
