package p000;

import android.location.Location;
import java.io.PrintWriter;

/* renamed from: bfwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwy extends bfwz {

    /* renamed from: c */
    private final Location f115565c;

    /* renamed from: d */
    private final String f115566d;

    public bfwy(int i, Location location, String str) {
        super(i);
        this.f115565c = new Location(location);
        this.f115566d = str;
    }

    /* renamed from: a */
    public final void mo62393a(PrintWriter printWriter) {
        printWriter.printf("%s LocationReceived(%08x): location=%s, message=%s%n", mo62409a(), Integer.valueOf(this.f115567a), this.f115565c, this.f115566d);
    }
}
