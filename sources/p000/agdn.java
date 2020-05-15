package p000;

/* renamed from: agdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agdn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ agjw f65312a;

    /* renamed from: b */
    final /* synthetic */ agdo f65313b;

    public agdn(agdo agdo, agjw agjw) {
        this.f65313b = agdo;
        this.f65312a = agjw;
    }

    public final void run() {
        if (agde.m54034a()) {
            this.f65312a.mo35498F().mo35492a(this);
            return;
        }
        boolean b = this.f65313b.mo35369b();
        this.f65313b.f65315a = 0;
        if (b) {
            this.f65313b.mo35367a();
        }
    }
}
