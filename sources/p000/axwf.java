package p000;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: axwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axwf implements axxc {

    /* renamed from: a */
    long f96550a = -1;

    /* renamed from: b */
    public String f96551b = "";

    /* renamed from: c */
    public long f96552c = 0;

    /* renamed from: d */
    public volatile long f96553d = -1;

    /* renamed from: e */
    public long f96554e = -1;

    /* renamed from: f */
    public long f96555f = -1;

    /* renamed from: g */
    public long f96556g = -1;

    /* renamed from: h */
    public String f96557h;

    /* renamed from: i */
    public long[] f96558i;

    /* renamed from: j */
    final /* synthetic */ axwi f96559j;

    /* renamed from: k */
    private long f96560k = -1;

    /* renamed from: l */
    private volatile boolean f96561l = false;

    public axwf(axwi axwi) {
        this.f96559j = axwi;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.f96559j.f96579d;
        this.f96555f = sharedPreferences.getLong("cloud_last_active_connection", currentTimeMillis);
        this.f96553d = sharedPreferences.getLong("cloud_last_upload", currentTimeMillis);
    }

    /* renamed from: a */
    public final void mo53600a(axzf axzf) {
    }

    /* renamed from: a */
    public final void mo53601a(axzf axzf, int i, boolean z) {
    }

    /* renamed from: b */
    public final void mo53665b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f96560k > 300000) {
            axwi axwi = this.f96559j;
            int i = axwi.f96566A;
            axwi.f96579d.edit().putLong("cloud_last_active_connection", this.f96555f).putLong("cloud_last_upload", this.f96553d).commit();
            this.f96560k = elapsedRealtime;
        }
    }

    /* renamed from: c */
    public final boolean mo53666c() {
        return this.f96550a > 0;
    }

    /* renamed from: a */
    public final void mo53663a(String str) {
        this.f96550a = System.currentTimeMillis();
        this.f96551b = str;
    }

    /* renamed from: a */
    public final void mo53602a(Collection collection) {
        boolean z;
        axwi axwi = this.f96559j;
        int i = axwi.f96566A;
        if (axwi.f96577b) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                ayac ayac = (ayac) it.next();
                if (axzm.m83604a(ayac.f96884a, ayac.f96885b)) {
                    z = true;
                    break;
                }
            }
            this.f96561l = z;
        }
        if (this.f96552c != 0 && this.f96559j.f96592q && this.f96559j.f96601z.mo53565d() && mo53664a()) {
            if (Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "onConnectedNodes: new connection while throttled, restarting sync");
            }
            this.f96559j.f96585j.mo53669a(2);
        } else if (Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "onConnectedNodes: not throttled, ignoring connection event");
        }
    }

    /* renamed from: a */
    public final boolean mo53664a() {
        axwi axwi = this.f96559j;
        int i = axwi.f96566A;
        return !axwi.f96577b || !this.f96561l;
    }
}
