package p000;

/* renamed from: aguz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aguz implements aubt {

    /* renamed from: a */
    final /* synthetic */ boolean f66612a;

    /* renamed from: b */
    final /* synthetic */ agtw f66613b;

    public aguz(boolean z, agtw agtw) {
        this.f66612a = z;
        this.f66613b = agtw;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        if (this.f66612a) {
            bnsl a = agve.f66617a.mo26019b(agyt.m55307c());
            a.mo68437a(exc);
            a.mo68405a("Set consent status failed on UX");
            this.f66613b.mo36095a(exc);
        }
    }
}
