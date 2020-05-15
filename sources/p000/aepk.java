package p000;

/* renamed from: aepk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aepk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f63592a;

    /* renamed from: b */
    final /* synthetic */ aepl f63593b;

    public aepk(aepl aepl, CharSequence charSequence) {
        this.f63593b = aepl;
        this.f63592a = charSequence;
    }

    public final void run() {
        aepm aepm = this.f63593b.f63594a;
        aenc aenc = aepm.f63604i;
        rkb rkb = aepm.f63598c;
        String charSequence = this.f63592a.toString();
        aepm aepm2 = this.f63593b.f63594a;
        rke a = aenc.m52184a(rkb, charSequence, aepm2.f63600e, aepm2.f63601f);
        this.f63593b.f63594a.mo34424a(a);
        a.mo9458a(new aepj(this));
    }
}
