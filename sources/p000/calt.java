package p000;

/* renamed from: calt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calt extends bxvk implements bxxd {

    /* renamed from: c */
    public static final calt f175176c;

    /* renamed from: d */
    private static volatile bxxk f175177d;

    /* renamed from: a */
    public int f175178a;

    /* renamed from: b */
    public long f175179b;

    static {
        calt calt = new calt();
        f175176c = calt;
        bxvk.m124024a(calt.class, calt);
    }

    private calt() {
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
            return bxvk.m124022a(f175176c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဂ\u0002", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new calt();
        } else {
            if (i2 == 4) {
                return new bxvd(f175176c);
            }
            if (i2 == 5) {
                return f175176c;
            }
            bxxk bxxk = f175177d;
            if (bxxk == null) {
                synchronized (calt.class) {
                    bxxk = f175177d;
                    if (bxxk == null) {
                        bxxk = new bxve(f175176c);
                        f175177d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
