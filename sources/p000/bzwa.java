package p000;

/* renamed from: bzwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwa extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzwa f171589d;

    /* renamed from: e */
    private static volatile bxxk f171590e;

    /* renamed from: a */
    public int f171591a;

    /* renamed from: b */
    public btsi f171592b;

    /* renamed from: c */
    public int f171593c;

    static {
        bzwa bzwa = new bzwa();
        f171589d = bzwa;
        GeneratedMessageLite.m124024a(bzwa.class, bzwa);
    }

    private bzwa() {
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
            return GeneratedMessageLite.m124022a(f171589d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bzvz.f171588a});
        } else if (i2 == 3) {
            return new bzwa();
        } else {
            if (i2 == 4) {
                return new bxvd(f171589d);
            }
            if (i2 == 5) {
                return f171589d;
            }
            bxxk bxxk = f171590e;
            if (bxxk == null) {
                synchronized (bzwa.class) {
                    bxxk = f171590e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171589d);
                        f171590e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
