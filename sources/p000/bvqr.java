package p000;

/* renamed from: bvqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqr f157404a;

    /* renamed from: b */
    private static volatile bxxk f157405b;

    static {
        bvqr bvqr = new bvqr();
        f157404a = bvqr;
        GeneratedMessageLite.m124024a(bvqr.class, bvqr);
    }

    private bvqr() {
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
            return GeneratedMessageLite.m124022a(f157404a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqr();
        }
        if (i2 == 4) {
            return new bxvd(f157404a);
        }
        if (i2 == 5) {
            return f157404a;
        }
        bxxk bxxk = f157405b;
        if (bxxk == null) {
            synchronized (bvqr.class) {
                bxxk = f157405b;
                if (bxxk == null) {
                    bxxk = new bxve(f157404a);
                    f157405b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
