package p000;

/* renamed from: bzvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzvt f171547c;

    /* renamed from: e */
    private static volatile bxxk f171548e;

    /* renamed from: a */
    public String f171549a = "";

    /* renamed from: b */
    public String f171550b = "";

    /* renamed from: d */
    private int f171551d;

    static {
        bzvt bzvt = new bzvt();
        f171547c = bzvt;
        bxvk.m124024a(bzvt.class, bzvt);
    }

    private bzvt() {
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
            return bxvk.m124022a(f171547c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzvt();
        } else {
            if (i2 == 4) {
                return new bxvd(f171547c);
            }
            if (i2 == 5) {
                return f171547c;
            }
            bxxk bxxk = f171548e;
            if (bxxk == null) {
                synchronized (bzvt.class) {
                    bxxk = f171548e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171547c);
                        f171548e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
