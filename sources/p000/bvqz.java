package p000;

/* renamed from: bvqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqz f157420a;

    /* renamed from: b */
    private static volatile bxxk f157421b;

    static {
        bvqz bvqz = new bvqz();
        f157420a = bvqz;
        GeneratedMessageLite.m124024a(bvqz.class, bvqz);
    }

    private bvqz() {
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
            return GeneratedMessageLite.m124022a(f157420a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqz();
        }
        if (i2 == 4) {
            return new bxvd(f157420a);
        }
        if (i2 == 5) {
            return f157420a;
        }
        bxxk bxxk = f157421b;
        if (bxxk == null) {
            synchronized (bvqz.class) {
                bxxk = f157421b;
                if (bxxk == null) {
                    bxxk = new bxve(f157420a);
                    f157421b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
