package p000;

/* renamed from: aqki */
public final /* synthetic */ class aqki implements aubg {

    /* renamed from: a */
    private final aqkk f86278a;

    public aqki(aqkk aqkk) {
        this.f86278a = aqkk;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        aqkk aqkk = this.f86278a;
        if (!aucb.mo50384b()) {
            aqkk.f86279a.mo25420f("Failed checking usage reporting status", new Object[0]);
        }
        rkj rkj = (rkj) aucb.mo50386d();
        sdo.m34959a(rkj);
        if (((avuw) rkj.f43190a).f93946b.f109539b) {
            if (aqkk.f86279a.mo19637a(3)) {
                aqkk.f86279a.mo25412b("Sending Clearcut event:\n%s", new String(((boct) aqkk.f86285g.mo74062i()).mo73642k()));
            }
            aqkk.f86283e.f86287a.mo24335a(((boct) aqkk.f86285g.mo74062i()).mo73642k()).mo24327b();
            return null;
        }
        aqkk.f86279a.mo25412b("Opted out of usage reporting: %s", rkj);
        return null;
    }
}
