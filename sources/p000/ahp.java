package p000;

/* renamed from: ahp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahp {
    /* renamed from: a */
    public static final float m763a(aho aho) {
        return ((ahq) aho.f550a).f553b;
    }

    /* renamed from: b */
    public static final float m764b(aho aho) {
        return ((ahq) aho.f550a).f552a;
    }

    /* renamed from: c */
    public static final void m765c(aho aho) {
        if (!aho.mo710a()) {
            aho.mo709a(0, 0, 0, 0);
            return;
        }
        float a = m763a(aho);
        float b = m764b(aho);
        int ceil = (int) Math.ceil((double) ahr.m770b(a, b, aho.mo711b()));
        int ceil2 = (int) Math.ceil((double) ahr.m769a(a, b, aho.mo711b()));
        aho.mo709a(ceil, ceil2, ceil, ceil2);
    }
}
