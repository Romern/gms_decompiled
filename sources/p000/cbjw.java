package p000;

/* renamed from: cbjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjw extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cbjw f177373a;

    /* renamed from: b */
    private static volatile bxxk f177374b;

    static {
        cbjw cbjw = new cbjw();
        f177373a = cbjw;
        GeneratedMessageLite.m124024a(cbjw.class, cbjw);
    }

    private cbjw() {
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
            return GeneratedMessageLite.m124022a(f177373a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cbjw();
        }
        if (i2 == 4) {
            return new bxvd(f177373a);
        }
        if (i2 == 5) {
            return f177373a;
        }
        bxxk bxxk = f177374b;
        if (bxxk == null) {
            synchronized (cbjw.class) {
                bxxk = f177374b;
                if (bxxk == null) {
                    bxxk = new bxve(f177373a);
                    f177374b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
