package p000;

/* renamed from: bqzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzm extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqzm f142060d;

    /* renamed from: e */
    private static volatile bxxk f142061e;

    /* renamed from: a */
    public int f142062a;

    /* renamed from: b */
    public long f142063b;

    /* renamed from: c */
    public ByteString f142064c = ByteString.f164797b;

    static {
        bqzm bqzm = new bqzm();
        f142060d = bqzm;
        GeneratedMessageLite.m124024a(bqzm.class, bqzm);
    }

    private bqzm() {
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
            return GeneratedMessageLite.m124022a(f142060d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqzm();
        } else {
            if (i2 == 4) {
                return new bxvd(f142060d);
            }
            if (i2 == 5) {
                return f142060d;
            }
            bxxk bxxk = f142061e;
            if (bxxk == null) {
                synchronized (bqzm.class) {
                    bxxk = f142061e;
                    if (bxxk == null) {
                        bxxk = new bxve(f142060d);
                        f142061e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
