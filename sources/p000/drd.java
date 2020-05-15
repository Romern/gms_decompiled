package p000;

import java.util.Collection;

/* renamed from: drd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class drd extends dwu {

    /* renamed from: a */
    private final doh f13858a;

    /* renamed from: b */
    private final Collection f13859b;

    /* renamed from: c */
    private final dpv f13860c;

    /* renamed from: d */
    private final dqb f13861d;

    /* renamed from: e */
    private final dqx f13862e;

    public drd(doh doh, Collection collection, dpv dpv, dqb dqb, dqx dqx) {
        super("ContextManagerFEServerConsumer", "syncing context, account %s", doh);
        sdo.m34959a(doh);
        this.f13858a = doh;
        sdo.m34959a(collection);
        this.f13859b = collection;
        sdo.m34959a(dqb);
        this.f13860c = dpv;
        this.f13861d = dqb;
        this.f13862e = dqx;
    }

    /* renamed from: a */
    public final void mo9477a(int i) {
        super.mo9477a(i);
        dwq.m9672p().mo10040a(this.f13859b, 1, dwq.m9665i().mo20505a(), dwq.m9652a(this.f13858a, "ContextManagerFEServerConsumer"));
        dpy.m9066b(this.f13860c, this.f13861d, this.f13862e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        bxjt bxjt = (bxjt) obj;
        new Object[1][0] = this.f13858a;
        dwq.m9672p().mo10040a(this.f13859b, 3, dwq.m9665i().mo20505a(), dwq.m9652a(this.f13858a, "ContextManagerFEServerConsumer"));
        dpy.m9065a(this.f13860c, this.f13861d, this.f13862e);
    }
}
