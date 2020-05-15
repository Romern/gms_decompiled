package p000;

/* renamed from: bsog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsog extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsog f146371f;

    /* renamed from: g */
    private static volatile bxxk f146372g;

    /* renamed from: a */
    public int f146373a;

    /* renamed from: b */
    public bsos f146374b;

    /* renamed from: c */
    public bsoz f146375c;

    /* renamed from: d */
    public bspa f146376d;

    /* renamed from: e */
    public bspg f146377e;

    static {
        bsog bsog = new bsog();
        f146371f = bsog;
        GeneratedMessageLite.m124024a(bsog.class, bsog);
    }

    private bsog() {
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
            return GeneratedMessageLite.m124022a(f146371f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsog();
        } else {
            if (i2 == 4) {
                return new bxvd(f146371f);
            }
            if (i2 == 5) {
                return f146371f;
            }
            bxxk bxxk = f146372g;
            if (bxxk == null) {
                synchronized (bsog.class) {
                    bxxk = f146372g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146371f);
                        f146372g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
