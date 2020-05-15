package p000;

/* renamed from: lqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lqt implements aubq {

    /* renamed from: a */
    private final bqgy f26614a;

    public lqt(bqgy bqgy) {
        this.f26614a = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (((auck) aucb).f91396d) {
            this.f26614a.cancel(false);
        } else if (aucb.mo50384b()) {
            this.f26614a.mo69138b(aucb.mo50386d());
        } else {
            Exception e = aucb.mo50387e();
            if (e != null) {
                this.f26614a.mo69136a((Throwable) e);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
