package p000;

/* renamed from: bodm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodm extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bodm f132712c;

    /* renamed from: d */
    private static volatile bxxk f132713d;

    /* renamed from: a */
    public int f132714a;

    /* renamed from: b */
    public int f132715b;

    static {
        bodm bodm = new bodm();
        f132712c = bodm;
        GeneratedMessageLite.m124024a(bodm.class, bodm);
    }

    private bodm() {
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
            return GeneratedMessageLite.m124022a(f132712c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bodl.f132711a});
        } else if (i2 == 3) {
            return new bodm();
        } else {
            if (i2 == 4) {
                return new bxvd(f132712c);
            }
            if (i2 == 5) {
                return f132712c;
            }
            bxxk bxxk = f132713d;
            if (bxxk == null) {
                synchronized (bodm.class) {
                    bxxk = f132713d;
                    if (bxxk == null) {
                        bxxk = new bxve(f132712c);
                        f132713d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
