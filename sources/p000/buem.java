package p000;

/* renamed from: buem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buem extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final buem f153608f;

    /* renamed from: h */
    private static volatile bxxk f153609h;

    /* renamed from: a */
    public long f153610a;

    /* renamed from: b */
    public float f153611b;

    /* renamed from: c */
    public float f153612c;

    /* renamed from: d */
    public float f153613d;

    /* renamed from: e */
    public long f153614e;

    /* renamed from: g */
    private int f153615g;

    static {
        buem buem = new buem();
        f153608f = buem;
        GeneratedMessageLite.m124024a(buem.class, buem);
    }

    private buem() {
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
            return GeneratedMessageLite.m124022a(f153608f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဃ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new buem();
        } else {
            if (i2 == 4) {
                return new bxvd(f153608f);
            }
            if (i2 == 5) {
                return f153608f;
            }
            bxxk bxxk = f153609h;
            if (bxxk == null) {
                synchronized (buem.class) {
                    bxxk = f153609h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153608f);
                        f153609h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
