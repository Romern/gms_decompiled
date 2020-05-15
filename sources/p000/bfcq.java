package p000;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bfcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcq {

    /* renamed from: a */
    public final bfda f113412a;

    /* renamed from: b */
    public volatile long f113413b;

    /* renamed from: c */
    public final AtomicLong f113414c;

    /* renamed from: d */
    public final AtomicLong f113415d;

    /* renamed from: e */
    private volatile boolean f113416e = false;

    public bfcq(int i) {
        new AtomicLong(0);
        new AtomicLong(0);
        this.f113414c = new AtomicLong();
        this.f113415d = new AtomicLong();
        this.f113412a = new bfda(i);
    }
}
