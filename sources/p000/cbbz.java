package p000;

/* renamed from: cbbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbbz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbbz f176630a;

    /* renamed from: b */
    private static volatile bxxk f176631b;

    static {
        cbbz cbbz = new cbbz();
        f176630a = cbbz;
        GeneratedMessageLite.m124024a(cbbz.class, cbbz);
    }

    private cbbz() {
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
            return GeneratedMessageLite.m124022a(f176630a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbbz();
        }
        if (i2 == 4) {
            return new bxvd(f176630a);
        }
        if (i2 == 5) {
            return f176630a;
        }
        bxxk bxxk = f176631b;
        if (bxxk == null) {
            synchronized (cbbz.class) {
                bxxk = f176631b;
                if (bxxk == null) {
                    bxxk = new bxve(f176630a);
                    f176631b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
