package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yuc {

    /* renamed from: a */
    public final int f54632a;

    /* renamed from: b */
    public final long f54633b;

    /* renamed from: c */
    public final AtomicLong f54634c = new AtomicLong(0);

    /* renamed from: d */
    public final AtomicInteger f54635d;

    public yuc(int i, long j) {
        boolean z;
        boolean z2 = false;
        this.f54635d = new AtomicInteger(0);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        bmxy.m108588a(j > 0 ? true : z2);
        this.f54632a = i;
        this.f54633b = j;
    }
}
