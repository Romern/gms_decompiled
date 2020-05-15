package p000;

/* renamed from: bwje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwje extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwje f159748d;

    /* renamed from: e */
    private static volatile bxxk f159749e;

    /* renamed from: a */
    public int f159750a;

    /* renamed from: b */
    public bmaj f159751b;

    /* renamed from: c */
    public ByteString f159752c = ByteString.f164797b;

    static {
        bwje bwje = new bwje();
        f159748d = bwje;
        GeneratedMessageLite.m124024a(bwje.class, bwje);
    }

    private bwje() {
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
            return GeneratedMessageLite.m124022a(f159748d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwje();
        } else {
            if (i2 == 4) {
                return new bxvd(f159748d);
            }
            if (i2 == 5) {
                return f159748d;
            }
            bxxk bxxk = f159749e;
            if (bxxk == null) {
                synchronized (bwje.class) {
                    bxxk = f159749e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159748d);
                        f159749e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
