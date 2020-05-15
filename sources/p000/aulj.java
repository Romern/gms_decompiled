package p000;

import android.os.SystemClock;

/* renamed from: aulj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aulj {

    /* renamed from: d */
    private static aulj f92034d;

    /* renamed from: a */
    public long f92035a = -1;

    /* renamed from: b */
    public boolean f92036b = true;

    /* renamed from: c */
    public final Object f92037c = new Object();

    private aulj() {
    }

    /* renamed from: a */
    public static synchronized aulj m77263a() {
        aulj aulj;
        synchronized (aulj.class) {
            if (f92034d == null) {
                f92034d = new aulj();
            }
            aulj = f92034d;
        }
        return aulj;
    }

    /* renamed from: b */
    public final void mo50655b() {
        synchronized (this.f92037c) {
            this.f92035a = SystemClock.elapsedRealtime();
        }
    }
}
