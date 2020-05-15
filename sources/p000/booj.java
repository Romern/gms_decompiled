package p000;

/* renamed from: booj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class booj extends bxvk implements bxxd {

    /* renamed from: p */
    public static final booj f133916p;

    /* renamed from: q */
    private static volatile bxxk f133917q;

    /* renamed from: a */
    public String f133918a = "";

    /* renamed from: b */
    public String f133919b = "";

    /* renamed from: c */
    public int f133920c;

    /* renamed from: d */
    public long f133921d;

    /* renamed from: e */
    public String f133922e = "";

    /* renamed from: f */
    public int f133923f;

    /* renamed from: g */
    public String f133924g = "";

    /* renamed from: h */
    public int f133925h;

    /* renamed from: i */
    public long f133926i;

    /* renamed from: j */
    public bxwc f133927j = bxxn.f165040b;

    /* renamed from: k */
    public boolean f133928k;

    /* renamed from: l */
    public boolean f133929l;

    /* renamed from: m */
    public boolean f133930m;

    /* renamed from: n */
    public boolean f133931n;

    /* renamed from: o */
    public bxwc f133932o = bxxn.f165040b;

    static {
        booj booj = new booj();
        f133916p = booj;
        bxvk.m124024a(booj.class, booj);
    }

    private booj() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f133916p, "\u0000\u000f\u0000\u0000\u00012\u000f\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0002\u0005Ȉ\u0006\f\u0007Ȉ\b\f\t\u0002\n\u001b\u0014\u0007\u001e\u0007\u001f\u0007 \u00072\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", boow.class, "k", "l", "m", "n", "o", bopd.class});
        } else if (i2 == 3) {
            return new booj();
        } else {
            if (i2 == 4) {
                return new booh();
            }
            if (i2 == 5) {
                return f133916p;
            }
            bxxk bxxk = f133917q;
            if (bxxk == null) {
                synchronized (booj.class) {
                    bxxk = f133917q;
                    if (bxxk == null) {
                        bxxk = new bxve(f133916p);
                        f133917q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68923a() {
        if (!this.f133932o.mo73666a()) {
            this.f133932o = bxvk.m124021a(this.f133932o);
        }
    }
}
