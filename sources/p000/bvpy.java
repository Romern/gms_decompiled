package p000;

/* renamed from: bvpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpy extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvpy f157353a;

    /* renamed from: b */
    private static volatile bxxk f157354b;

    static {
        bvpy bvpy = new bvpy();
        f157353a = bvpy;
        GeneratedMessageLite.m124024a(bvpy.class, bvpy);
    }

    private bvpy() {
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
            return GeneratedMessageLite.m124022a(f157353a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpy();
        }
        if (i2 == 4) {
            return new bxvd(f157353a);
        }
        if (i2 == 5) {
            return f157353a;
        }
        bxxk bxxk = f157354b;
        if (bxxk == null) {
            synchronized (bvpy.class) {
                bxxk = f157354b;
                if (bxxk == null) {
                    bxxk = new bxve(f157353a);
                    f157354b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
