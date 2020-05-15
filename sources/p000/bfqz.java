package p000;

import android.location.Location;

/* renamed from: bfqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfqz {

    /* renamed from: a */
    public Location f114963a;

    /* renamed from: b */
    public Location f114964b;

    /* renamed from: c */
    private long f114965c = -600000000000L;

    /* renamed from: a */
    public final Location mo62168a() {
        if (this.f114963a != null) {
            return this.f114964b;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo62169a(Location location) {
        this.f114963a = location;
        if (cevw.m138330o() || "network".equals(location.getProvider()) || aeim.m51899d(location, "noGPSLocation")) {
            long a = bfoy.m97457a(location);
            if (a - this.f114965c >= 600000000000L) {
                this.f114964b = location;
                this.f114965c = a;
            }
        }
    }
}
