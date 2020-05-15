package p000;

/* renamed from: bsnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnn extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsnn f146304c;

    /* renamed from: d */
    private static volatile bxxk f146305d;

    /* renamed from: a */
    public int f146306a;

    /* renamed from: b */
    public ByteString f146307b = ByteString.f164797b;

    static {
        bsnn bsnn = new bsnn();
        f146304c = bsnn;
        GeneratedMessageLite.m124024a(bsnn.class, bsnn);
    }

    private bsnn() {
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
            return GeneratedMessageLite.m124022a(f146304c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsnn();
        } else {
            if (i2 == 4) {
                return new bxvd(f146304c);
            }
            if (i2 == 5) {
                return f146304c;
            }
            bxxk bxxk = f146305d;
            if (bxxk == null) {
                synchronized (bsnn.class) {
                    bxxk = f146305d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146304c);
                        f146305d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
