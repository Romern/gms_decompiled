package p000;

/* renamed from: bvsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsa extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsa f157474a;

    /* renamed from: b */
    private static volatile bxxk f157475b;

    static {
        bvsa bvsa = new bvsa();
        f157474a = bvsa;
        GeneratedMessageLite.m124024a(bvsa.class, bvsa);
    }

    private bvsa() {
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
            return GeneratedMessageLite.m124022a(f157474a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsa();
        }
        if (i2 == 4) {
            return new bxvd(f157474a);
        }
        if (i2 == 5) {
            return f157474a;
        }
        bxxk bxxk = f157475b;
        if (bxxk == null) {
            synchronized (bvsa.class) {
                bxxk = f157475b;
                if (bxxk == null) {
                    bxxk = new bxve(f157474a);
                    f157475b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
