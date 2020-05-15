package p000;

/* renamed from: abwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abwc implements abwk {

    /* renamed from: a */
    private final bngs f58606a = new bngs();

    /* renamed from: b */
    private int f58607b = 0;

    /* renamed from: c */
    private int f58608c = 0;

    /* renamed from: d */
    private final briw f58609d;

    public abwc(abwe abwe) {
        sdo.m34970a(briw.m114086a(abwe));
        this.f58609d = abwe.f58615b;
        m48378a(abwe);
    }

    /* renamed from: a */
    private final void m48378a(abwe abwe) {
        this.f58606a.mo67668c(abwe);
        this.f58607b++;
        this.f58608c += abwe.f58614a.mo32399a();
    }

    /* renamed from: a */
    public final abwl mo32378a() {
        briw briw = this.f58609d;
        briw.getClass();
        return new abwd(briw, this.f58606a.mo67664a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo32379a(abwl abwl) {
        abwe abwe = (abwe) abwl;
        if (!briw.m114086a(abwe) || this.f58607b >= ((Integer) abzt.f58970ce.mo58455c()).intValue() || abwe.f58615b != this.f58609d) {
            return false;
        }
        if (this.f58608c + abwe.f58614a.mo32399a() > ((Integer) abzt.f58971cf.mo58455c()).intValue()) {
            return false;
        }
        m48378a(abwe);
        return true;
    }
}
