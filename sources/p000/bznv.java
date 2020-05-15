package p000;

/* renamed from: bznv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bznv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bznv f170765c;

    /* renamed from: d */
    private static volatile bxxk f170766d;

    /* renamed from: a */
    public int f170767a = 0;

    /* renamed from: b */
    public Object f170768b;

    static {
        bznv bznv = new bznv();
        f170765c = bznv;
        GeneratedMessageLite.m124024a(bznv.class, bznv);
    }

    private bznv() {
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
            return GeneratedMessageLite.m124022a(f170765c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ျ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bznv();
        } else {
            if (i2 == 4) {
                return new bxvd(f170765c);
            }
            if (i2 == 5) {
                return f170765c;
            }
            bxxk bxxk = f170766d;
            if (bxxk == null) {
                synchronized (bznv.class) {
                    bxxk = f170766d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170765c);
                        f170766d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
