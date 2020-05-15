package p000;

/* renamed from: ciwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciwv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final ciwv f191616d;

    /* renamed from: e */
    private static volatile bxxk f191617e;

    /* renamed from: a */
    public int f191618a;

    /* renamed from: b */
    public cixb f191619b;

    /* renamed from: c */
    public bxwc f191620c = bxxn.f165040b;

    static {
        ciwv ciwv = new ciwv();
        f191616d = ciwv;
        bxvk.m124024a(ciwv.class, ciwv);
    }

    private ciwv() {
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
            return bxvk.m124022a(f191616d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", cixb.class});
        } else if (i2 == 3) {
            return new ciwv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f191616d;
            }
            bxxk bxxk = f191617e;
            if (bxxk == null) {
                synchronized (ciwv.class) {
                    bxxk = f191617e;
                    if (bxxk == null) {
                        bxxk = new bxve(f191616d);
                        f191617e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
