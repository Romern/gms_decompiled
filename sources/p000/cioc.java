package p000;

/* renamed from: cioc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cioc f191040c;

    /* renamed from: d */
    private static volatile bxxk f191041d;

    /* renamed from: a */
    public int f191042a;

    /* renamed from: b */
    public String f191043b = "";

    static {
        cioc cioc = new cioc();
        f191040c = cioc;
        bxvk.m124024a(cioc.class, cioc);
    }

    private cioc() {
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
            return bxvk.m124022a(f191040c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cioc();
        } else {
            if (i2 == 4) {
                return new bxvd(f191040c);
            }
            if (i2 == 5) {
                return f191040c;
            }
            bxxk bxxk = f191041d;
            if (bxxk == null) {
                synchronized (cioc.class) {
                    bxxk = f191041d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191040c);
                        f191041d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
