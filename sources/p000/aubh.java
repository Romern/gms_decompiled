package p000;

/* renamed from: aubh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aubh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aucb f91350a;

    /* renamed from: b */
    final /* synthetic */ aubi f91351b;

    public aubh(aubi aubi, aucb aucb) {
        this.f91351b = aubi;
        this.f91350a = aucb;
    }

    public final void run() {
        if (((auck) this.f91350a).f91396d) {
            this.f91351b.f91353b.mo50400f();
            return;
        }
        try {
            this.f91351b.f91353b.mo50398a(this.f91351b.f91352a.mo7031a(this.f91350a));
        } catch (aubz e) {
            if (e.getCause() instanceof Exception) {
                this.f91351b.f91353b.mo50397a((Exception) e.getCause());
            } else {
                this.f91351b.f91353b.mo50397a((Exception) e);
            }
        } catch (Exception e2) {
            this.f91351b.f91353b.mo50397a(e2);
        }
    }
}
