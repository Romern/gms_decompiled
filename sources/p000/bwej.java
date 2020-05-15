package p000;

/* renamed from: bwej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwej extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bwej f158992b;

    /* renamed from: c */
    private static volatile bxxk f158993c;

    /* renamed from: a */
    public bxvt f158994a = bxvm.f164965b;

    static {
        bwej bwej = new bwej();
        f158992b = bwej;
        GeneratedMessageLite.m124024a(bwej.class, bwej);
    }

    private bwej() {
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
            return GeneratedMessageLite.m124022a(f158992b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bwej();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f158992b;
            }
            bxxk bxxk = f158993c;
            if (bxxk == null) {
                synchronized (bwej.class) {
                    bxxk = f158993c;
                    if (bxxk == null) {
                        bxxk = new bxve(f158992b);
                        f158993c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
