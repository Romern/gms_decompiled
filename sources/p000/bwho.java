package p000;

/* renamed from: bwho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwho extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwho f159539d;

    /* renamed from: e */
    private static volatile bxxk f159540e;

    /* renamed from: a */
    public int f159541a;

    /* renamed from: b */
    public long f159542b;

    /* renamed from: c */
    public ByteString f159543c = ByteString.f164797b;

    static {
        bwho bwho = new bwho();
        f159539d = bwho;
        GeneratedMessageLite.m124024a(bwho.class, bwho);
    }

    private bwho() {
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
            return GeneratedMessageLite.m124022a(f159539d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwho();
        } else {
            if (i2 == 4) {
                return new bxvd(f159539d);
            }
            if (i2 == 5) {
                return f159539d;
            }
            bxxk bxxk = f159540e;
            if (bxxk == null) {
                synchronized (bwho.class) {
                    bxxk = f159540e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159539d);
                        f159540e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
