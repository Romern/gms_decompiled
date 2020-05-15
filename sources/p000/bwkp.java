package p000;

/* renamed from: bwkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwkp f159995d;

    /* renamed from: e */
    private static volatile bxxk f159996e;

    /* renamed from: a */
    public int f159997a;

    /* renamed from: b */
    public bmaj f159998b;

    /* renamed from: c */
    public ByteString f159999c = ByteString.f164797b;

    static {
        bwkp bwkp = new bwkp();
        f159995d = bwkp;
        GeneratedMessageLite.m124024a(bwkp.class, bwkp);
    }

    private bwkp() {
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
            return GeneratedMessageLite.m124022a(f159995d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f159995d);
            }
            if (i2 == 5) {
                return f159995d;
            }
            bxxk bxxk = f159996e;
            if (bxxk == null) {
                synchronized (bwkp.class) {
                    bxxk = f159996e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159995d);
                        f159996e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
