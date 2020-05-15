package p000;

/* renamed from: cym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class cym implements cyn {

    /* renamed from: a */
    private final String f12395a;

    public cym(String str) {
        this.f12395a = str;
    }

    /* renamed from: a */
    public final cut mo8390a(cuo cuo, cyp cyp) {
        if (!this.f12395a.equalsIgnoreCase(cuo.mo8307g())) {
            return null;
        }
        byte[] a = mo8392a(cyp);
        cuo.mo8306b(a);
        return cut.m7621a(cuo.mo8309i().mo8318a(a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo8392a(cyp cyp);
}
