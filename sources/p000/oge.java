package p000;

/* renamed from: oge */
final /* synthetic */ class oge implements Runnable {

    /* renamed from: a */
    private final ogs f37548a;

    /* renamed from: b */
    private final bive f37549b;

    public oge(ogs ogs, bive bive) {
        this.f37548a = ogs;
        this.f37549b = bive;
    }

    public final void run() {
        ogs ogs = this.f37548a;
        bive bive = this.f37549b;
        ogr ogr = ogs.f37591o;
        bivb bivb = bive.f121968b;
        if (bivb == null) {
            bivb = bivb.f121921l;
        }
        ojp[] ojpArr = ((ojq) ogr).f37797g;
        if (ojpArr != null) {
            int length = ojpArr.length;
            int i = 0;
            while (i < length) {
                ojp ojp = ojpArr[i];
                if (ojp.f37786a != bivb.f121924b) {
                    i++;
                } else {
                    ofs ofs = ojp.f37789d;
                    if (ofs instanceof ofr) {
                        ((ofr) ofs).mo21076b(bivb);
                        return;
                    } else if (ofs != null) {
                        bnsi c = ojq.f37790a.mo68388c();
                        c.mo68432a("ojq", "a", 709, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68420a("Attempted to update a service that is not updatable: %s", bivb);
                        return;
                    } else {
                        throw new IllegalStateException("Service updated before service discovery is complete");
                    }
                }
            }
            throw new IllegalArgumentException("Updating a service that was not registered during service discovery");
        }
        throw new IllegalStateException("Service updated before service discovery");
    }
}
