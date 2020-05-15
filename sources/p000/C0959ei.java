package p000;

/* renamed from: ei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0959ei implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f15028a;

    /* renamed from: b */
    final /* synthetic */ C0960ej f15029b;

    public C0959ei(C0960ej ejVar, Runnable runnable) {
        this.f15029b = ejVar;
        this.f15028a = runnable;
    }

    public final void run() {
        try {
            this.f15028a.run();
        } finally {
            this.f15029b.mo10186a();
        }
    }
}
