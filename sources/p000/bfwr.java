package p000;

import android.location.Location;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: bfwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwr extends bfwz {

    /* renamed from: c */
    private final List f115533c;

    /* renamed from: d */
    private final int f115534d;

    /* renamed from: e */
    private final Location f115535e;

    public bfwr(List list, int i, Location location) {
        super(275770293);
        this.f115533c = list;
        this.f115534d = i;
        this.f115535e = new Location(location);
    }

    /* renamed from: a */
    public final void mo62393a(PrintWriter printWriter) {
        printWriter.printf("%s FireAlerts(%08x): transition=%d, location=%s, geofences=%s%n", mo62409a(), Integer.valueOf(this.f115567a), Integer.valueOf(this.f115534d), this.f115535e, this.f115533c);
    }
}
