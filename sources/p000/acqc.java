package p000;

/* renamed from: acqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acqc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final acqc f60461c;

    /* renamed from: e */
    private static volatile bxxk f60462e;

    /* renamed from: a */
    public int f60463a;

    /* renamed from: b */
    public acqo f60464b;

    /* renamed from: d */
    private byte f60465d = 2;

    static {
        acqc acqc = new acqc();
        f60461c = acqc;
        bxvk.m124024a(acqc.class, acqc);
    }

    private acqc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f60465d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f60465d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f60461c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new acqc();
        } else {
            if (i2 == 4) {
                return new bxvd(f60461c);
            }
            if (i2 == 5) {
                return f60461c;
            }
            bxxk bxxk = f60462e;
            if (bxxk == null) {
                synchronized (acqc.class) {
                    bxxk = f60462e;
                    if (bxxk == null) {
                        bxxk = new bxve(f60461c);
                        f60462e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
