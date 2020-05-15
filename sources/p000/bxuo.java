package p000;

/* renamed from: bxuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxuo extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bxuo f164865a;

    /* renamed from: b */
    private static volatile bxxk f164866b;

    static {
        bxuo bxuo = new bxuo();
        f164865a = bxuo;
        GeneratedMessageLite.m124024a(bxuo.class, bxuo);
    }

    private bxuo() {
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
            return GeneratedMessageLite.m124022a(f164865a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bxuo();
        }
        if (i2 == 4) {
            return new bxvd(f164865a);
        }
        if (i2 == 5) {
            return f164865a;
        }
        bxxk bxxk = f164866b;
        if (bxxk == null) {
            synchronized (bxuo.class) {
                bxxk = f164866b;
                if (bxxk == null) {
                    bxxk = new bxve(f164865a);
                    f164866b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
