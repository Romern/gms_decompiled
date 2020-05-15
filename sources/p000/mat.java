package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: mat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mat {

    /* renamed from: a */
    public final long f33366a;

    public mat() {
    }

    /* renamed from: a */
    public static mat m24776a(long j, TimeUnit timeUnit) {
        return new mat(timeUnit.toMillis(j));
    }

    public mat(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "delayMillis must be non-negative.");
        this.f33366a = j;
    }
}
