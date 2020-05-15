package p000;

import java.util.Locale;

/* renamed from: bfcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcs {

    /* renamed from: a */
    public final long f113429a;

    /* renamed from: b */
    public final long f113430b;

    /* renamed from: c */
    public final long f113431c;

    public bfcs(long j, long j2, long j3) {
        this.f113429a = j;
        this.f113430b = j2;
        this.f113431c = j3;
    }

    public final String toString() {
        return String.format(Locale.US, "[Capacity: %d, Refill Amount: %d, Refill interval: %d]", Long.valueOf(this.f113431c), Long.valueOf(this.f113429a), Long.valueOf(this.f113430b));
    }
}
