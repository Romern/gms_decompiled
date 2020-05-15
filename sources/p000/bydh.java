package p000;

/* renamed from: bydh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydh extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bydh f165789b;

    /* renamed from: c */
    private static volatile bxxk f165790c;

    /* renamed from: a */
    public bxvt f165791a = bxvm.f164965b;

    static {
        bydh bydh = new bydh();
        f165789b = bydh;
        GeneratedMessageLite.m124024a(bydh.class, bydh);
    }

    private bydh() {
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
            return GeneratedMessageLite.m124022a(f165789b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bydh();
        } else {
            if (i2 == 4) {
                return new bxvd(f165789b);
            }
            if (i2 == 5) {
                return f165789b;
            }
            bxxk bxxk = f165790c;
            if (bxxk == null) {
                synchronized (bydh.class) {
                    bxxk = f165790c;
                    if (bxxk == null) {
                        bxxk = new bxve(f165789b);
                        f165790c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
