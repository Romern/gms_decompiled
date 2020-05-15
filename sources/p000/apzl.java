package p000;

/* renamed from: apzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final apzl f85267c;

    /* renamed from: d */
    private static volatile bxxk f85268d;

    /* renamed from: a */
    public bxwc f85269a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f85270b = bxxn.f165040b;

    static {
        apzl apzl = new apzl();
        f85267c = apzl;
        bxvk.m124024a(apzl.class, apzl);
    }

    private apzl() {
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
            return bxvk.m124022a(f85267c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", apzg.class, "b", apzk.class});
        } else if (i2 == 3) {
            return new apzl();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f85267c;
            }
            bxxk bxxk = f85268d;
            if (bxxk == null) {
                synchronized (apzl.class) {
                    bxxk = f85268d;
                    if (bxxk == null) {
                        bxxk = new bxve(f85267c);
                        f85268d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
