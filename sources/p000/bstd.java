package p000;

/* renamed from: bstd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bstd f146991d;

    /* renamed from: e */
    private static volatile bxxk f146992e;

    /* renamed from: a */
    public String f146993a = "";

    /* renamed from: b */
    public int f146994b;

    /* renamed from: c */
    public String f146995c = "";

    static {
        bstd bstd = new bstd();
        f146991d = bstd;
        GeneratedMessageLite.m124024a(bstd.class, bstd);
    }

    private bstd() {
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
            return GeneratedMessageLite.m124022a(f146991d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstd();
        } else {
            if (i2 == 4) {
                return new bxvd(f146991d);
            }
            if (i2 == 5) {
                return f146991d;
            }
            bxxk bxxk = f146992e;
            if (bxxk == null) {
                synchronized (bstd.class) {
                    bxxk = f146992e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146991d);
                        f146992e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
