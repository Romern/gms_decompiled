package p000;

/* renamed from: bvws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvws extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvws f158007d;

    /* renamed from: e */
    private static volatile bxxk f158008e;

    /* renamed from: a */
    public int f158009a;

    /* renamed from: b */
    public String f158010b = "";

    /* renamed from: c */
    public int f158011c;

    static {
        bvws bvws = new bvws();
        f158007d = bvws;
        bxvk.m124024a(bvws.class, bvws);
    }

    private bvws() {
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
            return bxvk.m124022a(f158007d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvws();
        } else {
            if (i2 == 4) {
                return new bxvd(f158007d);
            }
            if (i2 == 5) {
                return f158007d;
            }
            bxxk bxxk = f158008e;
            if (bxxk == null) {
                synchronized (bvws.class) {
                    bxxk = f158008e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158007d);
                        f158008e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
