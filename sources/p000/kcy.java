package p000;

/* renamed from: kcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kcy f23842c;

    /* renamed from: d */
    private static volatile bxxk f23843d;

    /* renamed from: a */
    public int f23844a;

    /* renamed from: b */
    public String f23845b = "";

    static {
        kcy kcy = new kcy();
        f23842c = kcy;
        bxvk.m124024a(kcy.class, kcy);
    }

    private kcy() {
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
            return bxvk.m124022a(f23842c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new kcy();
        } else {
            if (i2 == 4) {
                return new bxvd(f23842c);
            }
            if (i2 == 5) {
                return f23842c;
            }
            bxxk bxxk = f23843d;
            if (bxxk == null) {
                synchronized (kcy.class) {
                    bxxk = f23843d;
                    if (bxxk == null) {
                        bxxk = new bxve(f23842c);
                        f23843d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
