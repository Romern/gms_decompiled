package p000;

import java.util.Locale;

/* renamed from: bfkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkk {

    /* renamed from: a */
    public static final String[] f114300a = {"d", "r", "w", "b", "i"};

    /* renamed from: b */
    public final boolean f114301b;

    /* renamed from: c */
    public final boolean f114302c;

    /* renamed from: d */
    public final int f114303d;

    /* renamed from: e */
    public final long f114304e;

    public bfkk(boolean z, boolean z2, int i, long j) {
        this.f114301b = z;
        this.f114302c = z2;
        this.f114303d = i;
        this.f114304e = j;
    }

    public final String toString() {
        return String.format(Locale.US, "GmmNavEvent: {isForeground: %b, isNavigating: %b, travelMode: %d, millisSinceBoot: %d}", Boolean.valueOf(this.f114301b), Boolean.valueOf(this.f114302c), Integer.valueOf(this.f114303d), Long.valueOf(this.f114304e));
    }
}
