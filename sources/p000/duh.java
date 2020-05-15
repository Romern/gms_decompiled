package p000;

import android.app.PendingIntent;
import java.util.IdentityHashMap;

/* renamed from: duh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class duh {

    /* renamed from: a */
    public final IdentityHashMap f14039a = new IdentityHashMap();

    /* renamed from: b */
    public final PendingIntent f14040b;

    /* renamed from: c */
    public final int f14041c;

    public duh(PendingIntent pendingIntent, int i) {
        this.f14040b = pendingIntent;
        this.f14041c = i;
    }

    /* renamed from: a */
    public final void mo9612a(dvd dvd) {
        this.f14039a.put(dvd, dvd);
    }

    /* renamed from: a */
    public final boolean mo9613a() {
        return !this.f14039a.isEmpty();
    }
}
