package p000;

/* renamed from: bsmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsmd f145000b;

    /* renamed from: d */
    private static volatile bxxk f145001d;

    /* renamed from: a */
    public bslz f145002a;

    /* renamed from: c */
    private int f145003c;

    static {
        bsmd bsmd = new bsmd();
        f145000b = bsmd;
        GeneratedMessageLite.m124024a(bsmd.class, bsmd);
    }

    private bsmd() {
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
            return GeneratedMessageLite.m124022a(f145000b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsmd();
        } else {
            if (i2 == 4) {
                return new bxvd(f145000b);
            }
            if (i2 == 5) {
                return f145000b;
            }
            bxxk bxxk = f145001d;
            if (bxxk == null) {
                synchronized (bsmd.class) {
                    bxxk = f145001d;
                    if (bxxk == null) {
                        bxxk = new bxve(f145000b);
                        f145001d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
