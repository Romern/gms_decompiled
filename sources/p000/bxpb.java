package p000;

/* renamed from: bxpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bxpb f164228c;

    /* renamed from: d */
    private static volatile bxxk f164229d;

    /* renamed from: a */
    public int f164230a = 0;

    /* renamed from: b */
    public Object f164231b;

    static {
        bxpb bxpb = new bxpb();
        f164228c = bxpb;
        GeneratedMessageLite.m124024a(bxpb.class, bxpb);
    }

    private bxpb() {
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
            return GeneratedMessageLite.m124022a(f164228c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bxpb();
        } else {
            if (i2 == 4) {
                return new bxvd(f164228c);
            }
            if (i2 == 5) {
                return f164228c;
            }
            bxxk bxxk = f164229d;
            if (bxxk == null) {
                synchronized (bxpb.class) {
                    bxxk = f164229d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164228c);
                        f164229d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
