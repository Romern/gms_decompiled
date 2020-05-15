package p000;

/* renamed from: bvqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqc extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqc f157361a;

    /* renamed from: b */
    private static volatile bxxk f157362b;

    static {
        bvqc bvqc = new bvqc();
        f157361a = bvqc;
        GeneratedMessageLite.m124024a(bvqc.class, bvqc);
    }

    private bvqc() {
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
            return GeneratedMessageLite.m124022a(f157361a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqc();
        }
        if (i2 == 4) {
            return new bxvd(f157361a);
        }
        if (i2 == 5) {
            return f157361a;
        }
        bxxk bxxk = f157362b;
        if (bxxk == null) {
            synchronized (bvqc.class) {
                bxxk = f157362b;
                if (bxxk == null) {
                    bxxk = new bxve(f157361a);
                    f157362b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
