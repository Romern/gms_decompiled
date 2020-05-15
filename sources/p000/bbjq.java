package p000;

/* renamed from: bbjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbjq {

    /* renamed from: a */
    public final Object f102773a;

    /* renamed from: b */
    public final boolean f102774b;

    /* renamed from: c */
    public final boolean f102775c;

    public bbjq(Object obj, boolean z, boolean z2) {
        boolean z3 = true;
        if (z && z2) {
            z3 = false;
        }
        bmxy.m108589a(z3, "Skipped sync can have only a result!");
        this.f102773a = obj;
        this.f102774b = z;
        this.f102775c = z2;
    }

    /* renamed from: a */
    public static bbjq m88103a() {
        bbjp bbjp = new bbjp();
        bbjp.f102770a = null;
        bbjp.f102771b = true;
        bbjp.f102772c = false;
        return bbjp.mo56173a();
    }

    /* renamed from: b */
    public static bbjp m88104b(Object obj) {
        bbjp bbjp = new bbjp();
        bbjp.f102770a = obj;
        bbjp.f102771b = false;
        bbjp.f102772c = false;
        return bbjp;
    }

    /* renamed from: a */
    public final bbjp mo56174a(Object obj) {
        bbjp bbjp = new bbjp();
        bbjp.f102770a = obj;
        bbjp.f102771b = this.f102774b;
        bbjp.f102772c = this.f102775c;
        return bbjp;
    }
}
