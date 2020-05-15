package p000;

/* renamed from: cahc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cahc f174527d;

    /* renamed from: e */
    private static volatile bxxk f174528e;

    /* renamed from: a */
    public int f174529a;

    /* renamed from: b */
    public long f174530b;

    /* renamed from: c */
    public long f174531c;

    static {
        cahc cahc = new cahc();
        f174527d = cahc;
        bxvk.m124024a(cahc.class, cahc);
    }

    private cahc() {
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
            return bxvk.m124022a(f174527d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cahc();
        } else {
            if (i2 == 4) {
                return new bxvd(f174527d);
            }
            if (i2 == 5) {
                return f174527d;
            }
            bxxk bxxk = f174528e;
            if (bxxk == null) {
                synchronized (cahc.class) {
                    bxxk = f174528e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174527d);
                        f174528e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
