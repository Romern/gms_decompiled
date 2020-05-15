package p000;

/* renamed from: bvpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpz extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvpz f157355a;

    /* renamed from: b */
    private static volatile bxxk f157356b;

    static {
        bvpz bvpz = new bvpz();
        f157355a = bvpz;
        GeneratedMessageLite.m124024a(bvpz.class, bvpz);
    }

    private bvpz() {
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
            return GeneratedMessageLite.m124022a(f157355a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvpz();
        }
        if (i2 == 4) {
            return new bxvd(f157355a);
        }
        if (i2 == 5) {
            return f157355a;
        }
        bxxk bxxk = f157356b;
        if (bxxk == null) {
            synchronized (bvpz.class) {
                bxxk = f157356b;
                if (bxxk == null) {
                    bxxk = new bxve(f157355a);
                    f157356b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
