package p000;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: ebt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebt {

    /* renamed from: d */
    private static final long f14621d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    public boolean f14622a = false;

    /* renamed from: b */
    public volatile boolean f14623b;

    /* renamed from: c */
    private final LocationListener f14624c = new ebs("contextmanager", "GpsManager");

    /* renamed from: e */
    private final LocationManager f14625e;

    public ebt(Context context) {
        this.f14625e = (LocationManager) context.getSystemService("location");
    }

    /* renamed from: a */
    public final void mo9928a() {
        this.f14625e.requestLocationUpdates("gps", f14621d, 1.0E30f, this.f14624c, Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo9929b() {
        this.f14625e.removeUpdates(this.f14624c);
    }
}
