package p000;

/* renamed from: bqkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkv extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bqkv f141052a;

    /* renamed from: b */
    private static volatile bxxk f141053b;

    static {
        bqkv bqkv = new bqkv();
        f141052a = bqkv;
        GeneratedMessageLite.m124024a(bqkv.class, bqkv);
    }

    private bqkv() {
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
            return GeneratedMessageLite.m124022a(f141052a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bqkv();
        }
        if (i2 == 4) {
            return new bxvd(f141052a);
        }
        if (i2 == 5) {
            return f141052a;
        }
        bxxk bxxk = f141053b;
        if (bxxk == null) {
            synchronized (bqkv.class) {
                bxxk = f141053b;
                if (bxxk == null) {
                    bxxk = new bxve(f141052a);
                    f141053b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
