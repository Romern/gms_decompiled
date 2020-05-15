package p000;

/* renamed from: bvqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqd extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvqd f157363a;

    /* renamed from: b */
    private static volatile bxxk f157364b;

    static {
        bvqd bvqd = new bvqd();
        f157363a = bvqd;
        GeneratedMessageLite.m124024a(bvqd.class, bvqd);
    }

    private bvqd() {
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
            return GeneratedMessageLite.m124022a(f157363a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqd();
        }
        if (i2 == 4) {
            return new bxvd(f157363a);
        }
        if (i2 == 5) {
            return f157363a;
        }
        bxxk bxxk = f157364b;
        if (bxxk == null) {
            synchronized (bvqd.class) {
                bxxk = f157364b;
                if (bxxk == null) {
                    bxxk = new bxve(f157363a);
                    f157364b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
