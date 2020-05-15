package p000;

/* renamed from: bzez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzez extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzez f169752c;

    /* renamed from: d */
    public static final bxvj f169753d;

    /* renamed from: e */
    private static volatile bxxk f169754e;

    /* renamed from: a */
    public int f169755a;

    /* renamed from: b */
    public bzft f169756b;

    static {
        bzez bzez = new bzez();
        f169752c = bzez;
        GeneratedMessageLite.m124024a(bzez.class, bzez);
        blcd blcd = blcd.f125907a;
        bzez bzez2 = f169752c;
        f169753d = GeneratedMessageLite.m124006a(blcd, bzez2, bzez2, 90015708, bxzf.MESSAGE);
    }

    private bzez() {
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
            return GeneratedMessageLite.m124022a(f169752c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzez();
        } else {
            if (i2 == 4) {
                return new bxvd(f169752c);
            }
            if (i2 == 5) {
                return f169752c;
            }
            bxxk bxxk = f169754e;
            if (bxxk == null) {
                synchronized (bzez.class) {
                    bxxk = f169754e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169752c);
                        f169754e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
