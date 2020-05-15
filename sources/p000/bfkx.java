package p000;

/* renamed from: bfkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkx {

    /* renamed from: a */
    public final Thread f114324a;

    /* renamed from: b */
    private final String f114325b;

    public bfkx(String str) {
        this(str, Thread.currentThread());
    }

    /* renamed from: a */
    public final void mo61864a() {
        if (ceze.f183524a.mo6606a().enforceThreadAffinity()) {
            Thread currentThread = Thread.currentThread();
            if (this.f114324a.getId() != currentThread.getId()) {
                throw new bfky(this.f114325b, this.f114324a, currentThread);
            }
        }
    }

    public bfkx(String str, Thread thread) {
        this.f114325b = str;
        this.f114324a = thread;
    }
}
