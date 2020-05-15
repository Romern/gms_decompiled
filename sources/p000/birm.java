package p000;

/* renamed from: birm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final birm f121425b;

    /* renamed from: c */
    private static volatile bxxk f121426c;

    /* renamed from: a */
    public bxvt f121427a = bxvm.f164965b;

    static {
        birm birm = new birm();
        f121425b = birm;
        GeneratedMessageLite.m124024a(birm.class, birm);
    }

    private birm() {
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
            return GeneratedMessageLite.m124022a(f121425b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new birm();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null);
            }
            if (i2 == 5) {
                return f121425b;
            }
            bxxk bxxk = f121426c;
            if (bxxk == null) {
                synchronized (birm.class) {
                    bxxk = f121426c;
                    if (bxxk == null) {
                        bxxk = new bxve(f121425b);
                        f121426c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
