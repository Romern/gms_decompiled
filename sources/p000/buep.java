package p000;

/* renamed from: buep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buep extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final buep f153617f;

    /* renamed from: h */
    private static volatile bxxk f153618h;

    /* renamed from: a */
    public int f153619a;

    /* renamed from: b */
    public float f153620b;

    /* renamed from: c */
    public float f153621c;

    /* renamed from: d */
    public int f153622d;

    /* renamed from: e */
    public int f153623e;

    /* renamed from: g */
    private int f153624g;

    static {
        buep buep = new buep();
        f153617f = buep;
        GeneratedMessageLite.m124024a(buep.class, buep);
    }

    private buep() {
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
            return GeneratedMessageLite.m124022a(f153617f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"g", "a", buen.f153616a, "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new buep();
        } else {
            if (i2 == 4) {
                return new bxvd(f153617f);
            }
            if (i2 == 5) {
                return f153617f;
            }
            bxxk bxxk = f153618h;
            if (bxxk == null) {
                synchronized (buep.class) {
                    bxxk = f153618h;
                    if (bxxk == null) {
                        bxxk = new bxve(f153617f);
                        f153618h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
