package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;
import com.google.android.gms.trustlet.place.tracker.LocationProviderTracker$LocationProviderStateChangedReceiver;

/* renamed from: auxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auxp {

    /* renamed from: a */
    public static final aunx f92732a = new aunx("TrustAgent", "LocationProviderTracker");

    /* renamed from: b */
    public final Context f92733b;

    /* renamed from: c */
    public final auxo f92734c;

    /* renamed from: d */
    public final IntentFilter f92735d = new IntentFilter("android.location.PROVIDERS_CHANGED");

    /* renamed from: e */
    public final LocationProviderTracker$LocationProviderStateChangedReceiver f92736e = new LocationProviderTracker$LocationProviderStateChangedReceiver(this);

    /* renamed from: f */
    public boolean f92737f = false;

    /* renamed from: g */
    private final LocationManager f92738g = ((LocationManager) this.f92733b.getSystemService("location"));

    public auxp(Context context, auxo auxo) {
        this.f92733b = context;
        this.f92734c = auxo;
    }

    /* renamed from: a */
    public final boolean mo51034a() {
        return this.f92738g.isProviderEnabled("gps") || this.f92738g.isProviderEnabled("network");
    }
}
