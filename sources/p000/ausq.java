package p000;

/* renamed from: ausq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ausq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ausr f92442a;

    /* renamed from: b */
    final /* synthetic */ long f92443b;

    public ausq(ausr ausr, long j) {
        this.f92442a = ausr;
        this.f92443b = j;
    }

    public final void run() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f92442a.mo50873c()) {
            auss.f92444a.mo50711a("stop %s after %d ms", this.f92442a.mo50871a(), Long.valueOf(currentTimeMillis - this.f92443b));
            this.f92442a.mo50872b();
        }
    }
}
