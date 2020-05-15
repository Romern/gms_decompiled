package p000;

/* renamed from: bzwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzwe extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzwe f171608c;

    /* renamed from: e */
    private static volatile bxxk f171609e;

    /* renamed from: a */
    public boolean f171610a;

    /* renamed from: b */
    public String f171611b = "";

    /* renamed from: d */
    private int f171612d;

    static {
        bzwe bzwe = new bzwe();
        f171608c = bzwe;
        GeneratedMessageLite.m124024a(bzwe.class, bzwe);
    }

    private bzwe() {
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
            return GeneratedMessageLite.m124022a(f171608c, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0000\u0004ဇ\u0003\u0006ဈ\u0005", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bzwe();
        } else {
            if (i2 == 4) {
                return new bxvd(f171608c);
            }
            if (i2 == 5) {
                return f171608c;
            }
            bxxk bxxk = f171609e;
            if (bxxk == null) {
                synchronized (bzwe.class) {
                    bxxk = f171609e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171608c);
                        f171609e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
