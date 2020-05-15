package p000;

/* renamed from: bvtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvtc f157556a;

    /* renamed from: b */
    private static volatile bxxk f157557b;

    static {
        bvtc bvtc = new bvtc();
        f157556a = bvtc;
        GeneratedMessageLite.m124024a(bvtc.class, bvtc);
    }

    private bvtc() {
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
            return GeneratedMessageLite.m124022a(f157556a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvtc();
        }
        if (i2 == 4) {
            return new bxvd(f157556a);
        }
        if (i2 == 5) {
            return f157556a;
        }
        bxxk bxxk = f157557b;
        if (bxxk == null) {
            synchronized (bvtc.class) {
                bxxk = f157557b;
                if (bxxk == null) {
                    bxxk = new bxve(f157556a);
                    f157557b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
