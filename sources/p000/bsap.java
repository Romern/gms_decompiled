package p000;

/* renamed from: bsap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsap extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsap f143888b;

    /* renamed from: c */
    private static volatile bxxk f143889c;

    /* renamed from: a */
    public bxvt f143890a = bxvm.f164965b;

    static {
        bsap bsap = new bsap();
        f143888b = bsap;
        GeneratedMessageLite.m124024a(bsap.class, bsap);
    }

    private bsap() {
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
            return GeneratedMessageLite.m124022a(f143888b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsap();
        } else {
            if (i2 == 4) {
                return new bxvd(f143888b);
            }
            if (i2 == 5) {
                return f143888b;
            }
            bxxk bxxk = f143889c;
            if (bxxk == null) {
                synchronized (bsap.class) {
                    bxxk = f143889c;
                    if (bxxk == null) {
                        bxxk = new bxve(f143888b);
                        f143889c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
