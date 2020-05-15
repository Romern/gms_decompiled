package p000;

/* renamed from: bpow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpow extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpow f138581c;

    /* renamed from: d */
    private static volatile bxxk f138582d;

    /* renamed from: a */
    public int f138583a;

    /* renamed from: b */
    public int f138584b;

    static {
        bpow bpow = new bpow();
        f138581c = bpow;
        GeneratedMessageLite.m124024a(bpow.class, bpow);
    }

    private bpow() {
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
            return GeneratedMessageLite.m124022a(f138581c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpow();
        } else {
            if (i2 == 4) {
                return new bxvd(f138581c);
            }
            if (i2 == 5) {
                return f138581c;
            }
            bxxk bxxk = f138582d;
            if (bxxk == null) {
                synchronized (bpow.class) {
                    bxxk = f138582d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138581c);
                        f138582d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
