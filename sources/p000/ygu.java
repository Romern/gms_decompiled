package p000;

/* renamed from: ygu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ygu implements ygd {

    /* renamed from: a */
    public final bnic f53770a;

    public ygu(bnic bnic) {
        this.f53770a = bnic;
    }

    /* renamed from: a */
    public final boolean mo30462a(yfr yfr) {
        bnrd a = this.f53770a.iterator();
        while (a.hasNext()) {
            if (((ygd) a.next()).mo30462a(yfr)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return ygv.m44047a(" OR ", this.f53770a);
    }
}
