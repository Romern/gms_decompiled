package p000;

import android.content.Context;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: ebr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebr implements GpsStatus.Listener {

    /* renamed from: a */
    public final LocationManager f14614a;

    /* renamed from: b */
    public volatile boolean f14615b;

    /* renamed from: c */
    public volatile ecb f14616c;

    /* renamed from: d */
    public int f14617d;

    /* renamed from: e */
    public final Handler f14618e = new adzt(Looper.getMainLooper());

    /* renamed from: f */
    public final ebu f14619f;

    /* renamed from: g */
    private final Handler f14620g;

    public ebr(Context context, ebu ebu, Looper looper) {
        this.f14614a = (LocationManager) context.getSystemService("location");
        this.f14619f = ebu;
        this.f14620g = new adzt(looper);
    }

    public final void onGpsStatusChanged(int i) {
        if (this.f14615b && i == 4) {
            try {
                this.f14620g.post(new ebo(this, this.f14614a.getGpsStatus(null)));
            } catch (NullPointerException e) {
                Log.e("IndoorOutdoorPredictor", "Null Pointer in getGpsStatus");
            }
        }
    }
}
