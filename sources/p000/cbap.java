package p000;

/* renamed from: cbap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cbap extends cbaj {

    /* renamed from: b */
    private final cbaj f176481b;

    public cbap(cbaj cbaj) {
        this.f176481b = cbaj;
    }

    /* renamed from: a */
    public final cbak mo75223a(Object obj) {
        try {
            cbak a = this.f176481b.mo75223a(obj);
            return a != null ? new cbaq(a) : cbak.f176476a;
        } catch (RuntimeException e) {
            cbar.m127681a(e, this.f176481b, obj);
            return cbak.f176476a;
        }
    }
}
