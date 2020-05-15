package p000;

/* renamed from: bzgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzgo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bzgo f169960b;

    /* renamed from: c */
    public static final bxvj f169961c;

    /* renamed from: d */
    private static volatile bxxk f169962d;

    /* renamed from: a */
    public bxwc f169963a = bxxn.f165040b;

    static {
        bzgo bzgo = new bzgo();
        f169960b = bzgo;
        GeneratedMessageLite.m124024a(bzgo.class, bzgo);
        blcd blcd = blcd.f125907a;
        bzgo bzgo2 = f169960b;
        f169961c = GeneratedMessageLite.m124006a(blcd, bzgo2, bzgo2, 96705961, bxzf.MESSAGE);
    }

    private bzgo() {
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
            return GeneratedMessageLite.m124022a(f169960b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzft.class});
        } else if (i2 == 3) {
            return new bzgo();
        } else {
            if (i2 == 4) {
                return new bxvd(f169960b);
            }
            if (i2 == 5) {
                return f169960b;
            }
            bxxk bxxk = f169962d;
            if (bxxk == null) {
                synchronized (bzgo.class) {
                    bxxk = f169962d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169960b);
                        f169962d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
