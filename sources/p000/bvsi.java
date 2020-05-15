package p000;

/* renamed from: bvsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvsi extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bvsi f157492a;

    /* renamed from: b */
    private static volatile bxxk f157493b;

    static {
        bvsi bvsi = new bvsi();
        f157492a = bvsi;
        GeneratedMessageLite.m124024a(bvsi.class, bvsi);
    }

    private bvsi() {
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
            return GeneratedMessageLite.m124022a(f157492a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvsi();
        }
        if (i2 == 4) {
            return new bxvd(f157492a);
        }
        if (i2 == 5) {
            return f157492a;
        }
        bxxk bxxk = f157493b;
        if (bxxk == null) {
            synchronized (bvsi.class) {
                bxxk = f157493b;
                if (bxxk == null) {
                    bxxk = new bxve(f157492a);
                    f157493b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
