package p000;

/* renamed from: bplv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bplv extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bplv f138175h;

    /* renamed from: i */
    private static volatile bxxk f138176i;

    /* renamed from: a */
    public int f138177a;

    /* renamed from: b */
    public long f138178b;

    /* renamed from: c */
    public int f138179c;

    /* renamed from: d */
    public float f138180d;

    /* renamed from: e */
    public int f138181e;

    /* renamed from: f */
    public float f138182f;

    /* renamed from: g */
    public float f138183g;

    static {
        bplv bplv = new bplv();
        f138175h = bplv;
        GeneratedMessageLite.m124024a(bplv.class, bplv);
    }

    private bplv() {
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
            return GeneratedMessageLite.m124022a(f138175h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bplv();
        } else {
            if (i2 == 4) {
                return new bxvd(f138175h);
            }
            if (i2 == 5) {
                return f138175h;
            }
            bxxk bxxk = f138176i;
            if (bxxk == null) {
                synchronized (bplv.class) {
                    bxxk = f138176i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138175h);
                        f138176i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
