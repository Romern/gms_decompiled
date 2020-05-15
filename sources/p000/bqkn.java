package p000;

/* renamed from: bqkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqkn extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqkn f141015d;

    /* renamed from: e */
    private static volatile bxxk f141016e;

    /* renamed from: a */
    public int f141017a;

    /* renamed from: b */
    public ByteString f141018b = ByteString.f164797b;

    /* renamed from: c */
    public bqkp f141019c;

    static {
        bqkn bqkn = new bqkn();
        f141015d = bqkn;
        GeneratedMessageLite.m124024a(bqkn.class, bqkn);
    }

    private bqkn() {
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
            return GeneratedMessageLite.m124022a(f141015d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ည\u0000\u0007ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f141015d);
            }
            if (i2 == 5) {
                return f141015d;
            }
            bxxk bxxk = f141016e;
            if (bxxk == null) {
                synchronized (bqkn.class) {
                    bxxk = f141016e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141015d);
                        f141016e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
