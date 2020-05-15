package p000;

/* renamed from: bplc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bplc f138062d;

    /* renamed from: e */
    private static volatile bxxk f138063e;

    /* renamed from: a */
    public int f138064a;

    /* renamed from: b */
    public bplb f138065b;

    /* renamed from: c */
    public bxwc f138066c = bxxn.f165040b;

    static {
        bplc bplc = new bplc();
        f138062d = bplc;
        bxvk.m124024a(bplc.class, bplc);
    }

    private bplc() {
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
            return bxvk.m124022a(f138062d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bpla.class});
        } else if (i2 == 3) {
            return new bplc();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f138062d;
            }
            bxxk bxxk = f138063e;
            if (bxxk == null) {
                synchronized (bplc.class) {
                    bxxk = f138063e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138062d);
                        f138063e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
