package p000;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: altl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altl {

    /* renamed from: a */
    private final ReentrantLock f74222a = new ReentrantLock();

    /* renamed from: a */
    public final void mo40733a() {
        this.f74222a.lock();
    }

    /* renamed from: b */
    public final void mo40734b() {
        this.f74222a.unlock();
    }

    /* renamed from: c */
    public final void mo40735c() {
        sdo.m34970a(this.f74222a.isHeldByCurrentThread());
    }
}
