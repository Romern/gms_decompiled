package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahfk {

    /* renamed from: a */
    private final Set f67115a;

    /* renamed from: b */
    private final AtomicBoolean f67116b;

    public ahfk() {
        this(false);
    }

    /* renamed from: a */
    public final void mo36398a() {
        C1225nr<ahfj> nrVar;
        if (!this.f67116b.getAndSet(true)) {
            synchronized (this) {
                nrVar = new C1225nr(this.f67115a);
            }
            for (ahfj ahfj : nrVar) {
                ahfj.mo36397a();
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo36400b(ahfj ahfj) {
        this.f67115a.remove(ahfj);
    }

    /* renamed from: c */
    public final synchronized AtomicBoolean mo36402c() {
        return this.f67116b;
    }

    public ahfk(boolean z) {
        this.f67115a = new C1225nr();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.f67116b = atomicBoolean;
        atomicBoolean.set(z);
    }

    /* renamed from: b */
    public final synchronized boolean mo36401b() {
        return this.f67116b.get();
    }

    /* renamed from: a */
    public final synchronized void mo36399a(ahfj ahfj) {
        this.f67115a.add(ahfj);
    }
}
