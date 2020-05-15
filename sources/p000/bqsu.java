package p000;

/* renamed from: bqsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsu extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bqsu f141571i;

    /* renamed from: j */
    private static volatile bxxk f141572j;

    /* renamed from: a */
    public int f141573a;

    /* renamed from: b */
    public bqsv f141574b;

    /* renamed from: c */
    public ByteString f141575c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f141576d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f141577e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f141578f = ByteString.f164797b;

    /* renamed from: g */
    public ByteString f141579g = ByteString.f164797b;

    /* renamed from: h */
    public ByteString f141580h = ByteString.f164797b;

    static {
        bqsu bqsu = new bqsu();
        f141571i = bqsu;
        GeneratedMessageLite.m124024a(bqsu.class, bqsu);
    }

    private bqsu() {
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
            return GeneratedMessageLite.m124022a(f141571i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bqsu();
        } else {
            if (i2 == 4) {
                return new bxvd(f141571i);
            }
            if (i2 == 5) {
                return f141571i;
            }
            bxxk bxxk = f141572j;
            if (bxxk == null) {
                synchronized (bqsu.class) {
                    bxxk = f141572j;
                    if (bxxk == null) {
                        bxxk = new bxve(f141571i);
                        f141572j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
