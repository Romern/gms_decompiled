package p000;

/* renamed from: rlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rlv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ rly f43250a;

    public rlv(rly rly) {
        this.f43250a = rly;
    }

    public final void run() {
        this.f43250a.f43259g.lock();
        try {
            this.f43250a.mo24889h();
        } finally {
            this.f43250a.f43259g.unlock();
        }
    }
}
