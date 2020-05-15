package p000;

/* renamed from: bqmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmk extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f141215b = new bqmg();

    /* renamed from: j */
    public static final bqmk f141216j;

    /* renamed from: k */
    private static volatile bxxk f141217k;

    /* renamed from: a */
    public bxvt f141218a = bxvm.f164965b;

    /* renamed from: c */
    public int f141219c;

    /* renamed from: d */
    public int f141220d;

    /* renamed from: e */
    public ByteString f141221e = ByteString.f164797b;

    /* renamed from: f */
    public int f141222f;

    /* renamed from: g */
    public boolean f141223g;

    /* renamed from: h */
    public boolean f141224h;

    /* renamed from: i */
    public int f141225i;

    static {
        bqmk bqmk = new bqmk();
        f141216j = bqmk;
        GeneratedMessageLite.m124024a(bqmk.class, bqmk);
    }

    private bqmk() {
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
            return GeneratedMessageLite.m124022a(f141216j, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0001\u0000\u0001,\u0002\f\u0003\f\u0005\n\u0006\f\u0007\u0007\b\u0007\t\u0004", new Object[]{"a", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bqmk();
        } else {
            if (i2 == 4) {
                return new bxvd(f141216j);
            }
            if (i2 == 5) {
                return f141216j;
            }
            bxxk bxxk = f141217k;
            if (bxxk == null) {
                synchronized (bqmk.class) {
                    bxxk = f141217k;
                    if (bxxk == null) {
                        bxxk = new bxve(f141216j);
                        f141217k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
