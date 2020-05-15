package p000;

/* renamed from: cald */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cald extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cald f175112d;

    /* renamed from: e */
    private static volatile bxxk f175113e;

    /* renamed from: a */
    public int f175114a;

    /* renamed from: b */
    public bosx f175115b;

    /* renamed from: c */
    public boolean f175116c;

    static {
        cald cald = new cald();
        f175112d = cald;
        GeneratedMessageLite.m124024a(cald.class, cald);
    }

    private cald() {
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
            return GeneratedMessageLite.m124022a(f175112d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cald();
        } else {
            if (i2 == 4) {
                return new bxvd(f175112d);
            }
            if (i2 == 5) {
                return f175112d;
            }
            bxxk bxxk = f175113e;
            if (bxxk == null) {
                synchronized (cald.class) {
                    bxxk = f175113e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175112d);
                        f175113e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
