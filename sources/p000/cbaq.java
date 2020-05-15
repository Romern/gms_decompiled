package p000;

/* renamed from: cbaq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cbaq extends cbak {

    /* renamed from: b */
    private final cbak f176482b;

    public cbaq(cbak cbak) {
        this.f176482b = cbak;
    }

    /* renamed from: a */
    public final cbaf mo75222a(cbag cbag) {
        try {
            cbaf a = this.f176482b.mo75222a(cbag);
            return a != null ? new cbao(a) : cbaf.f176472a;
        } catch (RuntimeException e) {
            cbar.m127682a(e, this.f176482b, cbag);
            return cbaf.f176472a;
        }
    }
}
