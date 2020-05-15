package p000;

/* renamed from: ygs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ygs implements ygd {

    /* renamed from: a */
    public final bnic f53768a;

    public ygs(bnic bnic) {
        this.f53768a = bnic;
    }

    /* renamed from: a */
    public final boolean mo30462a(yfr yfr) {
        bnrd a = this.f53768a.iterator();
        while (a.hasNext()) {
            if (!((ygd) a.next()).mo30462a(yfr)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ygv.m44047a(" AND ", this.f53768a);
    }
}
