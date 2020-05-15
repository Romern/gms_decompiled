package p000;

/* renamed from: bplz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplz extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bplz f138186f;

    /* renamed from: g */
    private static volatile bxxk f138187g;

    /* renamed from: a */
    public int f138188a;

    /* renamed from: b */
    public int f138189b;

    /* renamed from: c */
    public int f138190c;

    /* renamed from: d */
    public int f138191d;

    /* renamed from: e */
    public int f138192e;

    static {
        bplz bplz = new bplz();
        f138186f = bplz;
        GeneratedMessageLite.m124024a(bplz.class, bplz);
    }

    private bplz() {
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
            return GeneratedMessageLite.m124022a(f138186f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", bplx.f138185a, "c", bplw.f138184a, "d", "e"});
        } else if (i2 == 3) {
            return new bplz();
        } else {
            if (i2 == 4) {
                return new bxvd(f138186f);
            }
            if (i2 == 5) {
                return f138186f;
            }
            bxxk bxxk = f138187g;
            if (bxxk == null) {
                synchronized (bplz.class) {
                    bxxk = f138187g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138186f);
                        f138187g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
