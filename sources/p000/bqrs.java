package p000;

/* renamed from: bqrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrs extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqrs f141476d;

    /* renamed from: e */
    private static volatile bxxk f141477e;

    /* renamed from: a */
    public int f141478a;

    /* renamed from: b */
    public int f141479b;

    /* renamed from: c */
    public ByteString f141480c = ByteString.f164797b;

    static {
        bqrs bqrs = new bqrs();
        f141476d = bqrs;
        GeneratedMessageLite.m124024a(bqrs.class, bqrs);
    }

    private bqrs() {
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
            return GeneratedMessageLite.m124022a(f141476d, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqrs();
        } else {
            if (i2 == 4) {
                return new bxvd(f141476d);
            }
            if (i2 == 5) {
                return f141476d;
            }
            bxxk bxxk = f141477e;
            if (bxxk == null) {
                synchronized (bqrs.class) {
                    bxxk = f141477e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141476d);
                        f141477e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
