package p000;

/* renamed from: bvqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqi extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqi f157373a;

    /* renamed from: b */
    private static volatile bxxk f157374b;

    static {
        bvqi bvqi = new bvqi();
        f157373a = bvqi;
        GeneratedMessageLite.m124024a(bvqi.class, bvqi);
    }

    private bvqi() {
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
            return GeneratedMessageLite.m124022a(f157373a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqi();
        }
        if (i2 == 4) {
            return new bxvd(f157373a);
        }
        if (i2 == 5) {
            return f157373a;
        }
        bxxk bxxk = f157374b;
        if (bxxk == null) {
            synchronized (bvqi.class) {
                bxxk = f157374b;
                if (bxxk == null) {
                    bxxk = new bxve(f157373a);
                    f157374b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
