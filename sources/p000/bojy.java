package p000;

/* renamed from: bojy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojy extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bojy f133367g;

    /* renamed from: h */
    private static volatile bxxk f133368h;

    /* renamed from: a */
    public int f133369a;

    /* renamed from: b */
    public String f133370b = "";

    /* renamed from: c */
    public int f133371c;

    /* renamed from: d */
    public int f133372d;

    /* renamed from: e */
    public long f133373e;

    /* renamed from: f */
    public bxwc f133374f = bxxn.f165040b;

    static {
        bojy bojy = new bojy();
        f133367g = bojy;
        bxvk.m124024a(bojy.class, bojy);
    }

    private bojy() {
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
            return bxvk.m124022a(f133367g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဋ\u0002\u0004ဂ\u0003\u0005\u001a", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bojy();
        } else {
            if (i2 == 4) {
                return new bojx();
            }
            if (i2 == 5) {
                return f133367g;
            }
            bxxk bxxk = f133368h;
            if (bxxk == null) {
                synchronized (bojy.class) {
                    bxxk = f133368h;
                    if (bxxk == null) {
                        bxxk = new bxve(f133367g);
                        f133368h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo68915a() {
        if (!this.f133374f.mo73666a()) {
            this.f133374f = bxvk.m124021a(this.f133374f);
        }
    }
}
