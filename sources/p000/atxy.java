package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: atxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atxy {

    /* renamed from: a */
    public final long f91099a;

    /* renamed from: b */
    public final AtomicLong f91100b = new AtomicLong(0);

    /* renamed from: c */
    public final AtomicInteger f91101c;

    public atxy(long j) {
        boolean z = false;
        this.f91101c = new AtomicInteger(0);
        sdo.m34974b(true);
        sdo.m34974b(j > 0 ? true : z);
        this.f91099a = j;
    }
}
