package p000;

/* renamed from: ciuq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciuq {

    /* renamed from: a */
    public Thread f191501a = Thread.currentThread();

    /* renamed from: a */
    public final void mo86583a() {
        if (this.f191501a == null) {
            this.f191501a = Thread.currentThread();
        }
        if (Thread.currentThread() != this.f191501a) {
            throw new IllegalStateException("Wrong thread");
        }
    }
}
