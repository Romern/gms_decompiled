package p000;

/* renamed from: kbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kbo extends bxvk implements bxxd {

    /* renamed from: d */
    public static final kbo f23701d;

    /* renamed from: e */
    private static volatile bxxk f23702e;

    /* renamed from: a */
    public String f23703a = "";

    /* renamed from: b */
    public int f23704b;

    /* renamed from: c */
    public bxwc f23705c = bxxn.f165040b;

    static {
        kbo kbo = new kbo();
        f23701d = kbo;
        bxvk.m124024a(kbo.class, kbo);
    }

    private kbo() {
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
            return bxvk.m124022a(f23701d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new kbo();
        } else {
            if (i2 == 4) {
                return new bxvd(f23701d);
            }
            if (i2 == 5) {
                return f23701d;
            }
            bxxk bxxk = f23702e;
            if (bxxk == null) {
                synchronized (kbo.class) {
                    bxxk = f23702e;
                    if (bxxk == null) {
                        bxxk = new bxve(f23701d);
                        f23702e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo14349a() {
        if (!this.f23705c.mo73666a()) {
            this.f23705c = bxvk.m124021a(this.f23705c);
        }
    }
}
