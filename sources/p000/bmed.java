package p000;

/* renamed from: bmed */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmed extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmed f128915f;

    /* renamed from: g */
    private static volatile bxxk f128916g;

    /* renamed from: a */
    public int f128917a;

    /* renamed from: b */
    public String f128918b = "";

    /* renamed from: c */
    public bxtx f128919c = bxtx.f164797b;

    /* renamed from: d */
    public bxwc f128920d = bxxn.f165040b;

    /* renamed from: e */
    public String f128921e = "";

    static {
        bmed bmed = new bmed();
        f128915f = bmed;
        bxvk.m124024a(bmed.class, bmed);
    }

    private bmed() {
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
            return bxvk.m124022a(f128915f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", bmec.class, "e"});
        } else if (i2 == 3) {
            return new bmed();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f128915f;
            }
            bxxk bxxk = f128916g;
            if (bxxk == null) {
                synchronized (bmed.class) {
                    bxxk = f128916g;
                    if (bxxk == null) {
                        bxxk = new bxve(f128915f);
                        f128916g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo66783a() {
        if (!this.f128920d.mo73666a()) {
            this.f128920d = bxvk.m124021a(this.f128920d);
        }
    }
}
