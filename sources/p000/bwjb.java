package p000;

/* renamed from: bwjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwjb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwjb f159729d;

    /* renamed from: e */
    private static volatile bxxk f159730e;

    /* renamed from: a */
    public int f159731a;

    /* renamed from: b */
    public ByteString f159732b = ByteString.f164797b;

    /* renamed from: c */
    public bwho f159733c;

    static {
        bwjb bwjb = new bwjb();
        f159729d = bwjb;
        GeneratedMessageLite.m124024a(bwjb.class, bwjb);
    }

    private bwjb() {
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
            return GeneratedMessageLite.m124022a(f159729d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwjb();
        } else {
            if (i2 == 4) {
                return new bxvd(f159729d);
            }
            if (i2 == 5) {
                return f159729d;
            }
            bxxk bxxk = f159730e;
            if (bxxk == null) {
                synchronized (bwjb.class) {
                    bxxk = f159730e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159729d);
                        f159730e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
