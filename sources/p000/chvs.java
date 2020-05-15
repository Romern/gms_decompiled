package p000;

/* renamed from: chvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvs extends chqv {

    /* renamed from: b */
    final /* synthetic */ chvt f189290b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chvs(chvt chvt, chqs chqs) {
        super(chqs);
        this.f189290b = chvt;
    }

    /* renamed from: b */
    public final void mo85555b(chqr chqr, chtr chtr) {
        chtn chtn = chvt.f189291a;
        String valueOf = String.valueOf(this.f189290b.f189292b);
        chtr.mo85648a(chtn, valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
        this.f189016a.mo56351a(new chvr(this, chqr), chtr);
    }
}
