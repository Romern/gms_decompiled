package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pia {

    /* renamed from: d */
    private static long f39172d = qay.m31777a();

    /* renamed from: a */
    public final long f39173a;

    /* renamed from: b */
    public final phx f39174b;

    /* renamed from: c */
    public final int[] f39175c;

    /* renamed from: e */
    private final AtomicInteger f39176e = new AtomicInteger();

    /* renamed from: f */
    private int f39177f;

    /* renamed from: g */
    private boolean f39178g;

    /* renamed from: h */
    private boolean f39179h;

    public pia(phx phx, boolean z, Integer num) {
        sdo.checkIfNull(phx, "The local network ID must be valid.");
        this.f39174b = phx;
        this.f39178g = z;
        synchronized (pia.class) {
            this.f39173a = f39172d;
            f39172d++;
        }
        if (num != null) {
            int[] iArr = new int[1];
            this.f39175c = iArr;
            iArr[0] = num.intValue();
            return;
        }
        this.f39175c = new int[0];
    }

    /* renamed from: a */
    public final synchronized int mo23147a() {
        return this.f39176e.incrementAndGet();
    }

    /* renamed from: a */
    public final synchronized void mo23148a(int i) {
        this.f39177f = i;
    }

    /* renamed from: b */
    public final synchronized boolean mo23149b() {
        return this.f39178g;
    }

    /* renamed from: c */
    public final synchronized boolean mo23150c() {
        return this.f39179h;
    }

    /* renamed from: d */
    public final synchronized void mo23151d() {
        this.f39178g = true;
        this.f39179h = true;
    }

    /* renamed from: e */
    public final synchronized int mo23152e() {
        return this.f39177f;
    }
}
