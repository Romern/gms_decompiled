package p000;

/* renamed from: lai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lai extends bxvk implements bxxd {

    /* renamed from: e */
    public static final lai f25545e;

    /* renamed from: f */
    private static volatile bxxk f25546f;

    /* renamed from: a */
    public kzz f25547a;

    /* renamed from: b */
    public lbf f25548b;

    /* renamed from: c */
    public bxwc f25549c = bxxn.f165040b;

    /* renamed from: d */
    public bxvt f25550d = bxvm.f164965b;

    static {
        lai lai = new lai();
        f25545e = lai;
        bxvk.m124024a(lai.class, lai);
    }

    private lai() {
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
            return bxvk.m124022a(f25545e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\t\u0002\t\u0003\u001b\u0004,", new Object[]{"a", "b", "c", lba.class, "d"});
        } else if (i2 == 3) {
            return new lai();
        } else {
            if (i2 == 4) {
                return new bxvd(f25545e);
            }
            if (i2 == 5) {
                return f25545e;
            }
            bxxk bxxk = f25546f;
            if (bxxk == null) {
                synchronized (lai.class) {
                    bxxk = f25546f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25545e);
                        f25546f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
