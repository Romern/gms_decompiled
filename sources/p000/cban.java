package p000;

/* renamed from: cban */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cban extends cbak {

    /* renamed from: b */
    private final bngx f176479b;

    public cban(bngx bngx) {
        this.f176479b = bngx;
    }

    /* renamed from: a */
    public final cbaf mo75222a(cbag cbag) {
        bngs j = bngx.m109377j();
        bnre i = this.f176479b.listIterator();
        while (i.hasNext()) {
            cbak cbak = (cbak) i.next();
            try {
                cbaf a = cbak.mo75222a(cbag);
                if (a != null) {
                    j.mo67668c(a);
                }
            } catch (RuntimeException e) {
                cbar.m127682a(e, cbak, cbag);
            }
        }
        bngx a2 = j.mo67664a();
        if (a2.isEmpty()) {
            return cbaf.f176472a;
        }
        if (a2.size() == 1) {
            return new cbao((cbaf) bnjd.m109587b(a2));
        }
        return new cbal(a2);
    }
}
