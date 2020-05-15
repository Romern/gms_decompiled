package p000;

/* renamed from: bzqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzqu f171072b;

    /* renamed from: c */
    private static volatile bxxk f171073c;

    /* renamed from: a */
    public bxwc f171074a = bxxn.f165040b;

    static {
        bzqu bzqu = new bzqu();
        f171072b = bzqu;
        GeneratedMessageLite.m124024a(bzqu.class, bzqu);
    }

    private bzqu() {
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
            return GeneratedMessageLite.m124022a(f171072b, "\u0001\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0001\u0000\u0005\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bzqu();
        } else {
            if (i2 == 4) {
                return new bxvd(f171072b);
            }
            if (i2 == 5) {
                return f171072b;
            }
            bxxk bxxk = f171073c;
            if (bxxk == null) {
                synchronized (bzqu.class) {
                    bxxk = f171073c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171072b);
                        f171073c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
