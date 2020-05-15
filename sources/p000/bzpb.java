package p000;

/* renamed from: bzpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzpb f170891d;

    /* renamed from: e */
    private static volatile bxxk f170892e;

    /* renamed from: a */
    public int f170893a;

    /* renamed from: b */
    public int f170894b;

    /* renamed from: c */
    public String f170895c = "";

    static {
        bzpb bzpb = new bzpb();
        f170891d = bzpb;
        bxvk.m124024a(bzpb.class, bzpb);
    }

    private bzpb() {
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
            return bxvk.m124022a(f170891d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", bzoz.f170890a, "c"});
        } else if (i2 == 3) {
            return new bzpb();
        } else {
            if (i2 == 4) {
                return new bxvd(f170891d);
            }
            if (i2 == 5) {
                return f170891d;
            }
            bxxk bxxk = f170892e;
            if (bxxk == null) {
                synchronized (bzpb.class) {
                    bxxk = f170892e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170891d);
                        f170892e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
