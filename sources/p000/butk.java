package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: butk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butk {

    /* renamed from: a */
    public final Runnable f154852a;

    /* renamed from: b */
    public final AtomicBoolean f154853b;

    /* renamed from: c */
    public final int f154854c;

    public butk(Runnable runnable, AtomicBoolean atomicBoolean, int i) {
        this.f154852a = runnable == null ? buth.f154847a : runnable;
        this.f154853b = atomicBoolean == null ? new AtomicBoolean(false) : atomicBoolean;
        this.f154854c = i;
    }
}
