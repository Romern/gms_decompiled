package p000;

/* renamed from: bylv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bylv f166947d;

    /* renamed from: e */
    private static volatile bxxk f166948e;

    /* renamed from: a */
    public int f166949a;

    /* renamed from: b */
    public bxwc f166950b = bxxn.f165040b;

    /* renamed from: c */
    public int f166951c;

    static {
        bylv bylv = new bylv();
        f166947d = bylv;
        GeneratedMessageLite.m124024a(bylv.class, bylv);
    }

    private bylv() {
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
            return GeneratedMessageLite.m124022a(f166947d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000", new Object[]{"a", "b", "c", bylt.f166946a});
        } else if (i2 == 3) {
            return new bylv();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f166947d;
            }
            bxxk bxxk = f166948e;
            if (bxxk == null) {
                synchronized (bylv.class) {
                    bxxk = f166948e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166947d);
                        f166948e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
