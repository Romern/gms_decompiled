package p000;

/* renamed from: bysj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bysj f167574d;

    /* renamed from: e */
    private static volatile bxxk f167575e;

    /* renamed from: a */
    public int f167576a;

    /* renamed from: b */
    public int f167577b;

    /* renamed from: c */
    public ByteString f167578c = ByteString.f164797b;

    static {
        bysj bysj = new bysj();
        f167574d = bysj;
        GeneratedMessageLite.m124024a(bysj.class, bysj);
    }

    private bysj() {
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
            return GeneratedMessageLite.m124022a(f167574d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", bysl.f167586a, "c"});
        } else if (i2 == 3) {
            return new bysj();
        } else {
            if (i2 == 4) {
                return new bxvd(f167574d);
            }
            if (i2 == 5) {
                return f167574d;
            }
            bxxk bxxk = f167575e;
            if (bxxk == null) {
                synchronized (bysj.class) {
                    bxxk = f167575e;
                    if (bxxk == null) {
                        bxxk = new bxve(f167574d);
                        f167575e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
