package p000;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ugy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ugy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f47582a;

    /* renamed from: b */
    final /* synthetic */ AtomicReference f47583b;

    /* renamed from: c */
    final /* synthetic */ ugz f47584c;

    public ugy(ugz ugz, String str, AtomicReference atomicReference) {
        this.f47584c = ugz;
        this.f47582a = str;
        this.f47583b = atomicReference;
    }

    public final void run() {
        uij a = this.f47584c.mo27367a(this.f47582a);
        if (a == null) {
            a = new uij(this.f47584c.f47578a, -1, this.f47582a);
            a.mo27725t();
        }
        this.f47583b.set(a);
    }
}
