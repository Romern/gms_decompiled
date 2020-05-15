package p000;

/* renamed from: bqqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bqqx f141398d;

    /* renamed from: e */
    private static volatile bxxk f141399e;

    /* renamed from: a */
    public int f141400a;

    /* renamed from: b */
    public bqqz f141401b;

    /* renamed from: c */
    public ByteString f141402c = ByteString.f164797b;

    static {
        bqqx bqqx = new bqqx();
        f141398d = bqqx;
        GeneratedMessageLite.m124024a(bqqx.class, bqqx);
    }

    private bqqx() {
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
            return GeneratedMessageLite.m124022a(f141398d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bqqx();
        } else {
            if (i2 == 4) {
                return new bxvd(f141398d);
            }
            if (i2 == 5) {
                return f141398d;
            }
            bxxk bxxk = f141399e;
            if (bxxk == null) {
                synchronized (bqqx.class) {
                    bxxk = f141399e;
                    if (bxxk == null) {
                        bxxk = new bxve(f141398d);
                        f141399e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
