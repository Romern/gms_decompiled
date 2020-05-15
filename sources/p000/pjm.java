package p000;

/* renamed from: pjm */
final /* synthetic */ class pjm implements aubw {

    /* renamed from: a */
    private final pjs f39367a;

    public pjm(pjs pjs) {
        this.f39367a = pjs;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        pjs pjs = this.f39367a;
        ptc ptc = (ptc) obj;
        pjs.f39373a.mo23857a("Joined application successfully. Device = %s Metadata = %s", pjs.f39375c, ptc.f40176a);
        if (pjs.f39380h == null) {
            pjs.f39373a.mo23861b("Api client is already disconnected after sender joined application");
            return;
        }
        pjs.f39379g.mo23624g();
        pjs.f39383k = ptc.f40177b;
        pjs.f39373a.mo23856a("Session ID: %s", pjs.f39383k);
        pjs.f39382j = true;
    }
}
