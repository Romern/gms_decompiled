package p000;

/* renamed from: btcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btcu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final btcu f148353b;

    /* renamed from: c */
    private static volatile bxxk f148354c;

    /* renamed from: a */
    public bxvt f148355a = bxvm.f164965b;

    static {
        btcu btcu = new btcu();
        f148353b = btcu;
        GeneratedMessageLite.m124024a(btcu.class, btcu);
    }

    private btcu() {
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
            return GeneratedMessageLite.m124022a(f148353b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
        } else if (i2 == 3) {
            return new btcu();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148353b;
            }
            bxxk bxxk = f148354c;
            if (bxxk == null) {
                synchronized (btcu.class) {
                    bxxk = f148354c;
                    if (bxxk == null) {
                        bxxk = new bxve(f148353b);
                        f148354c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
