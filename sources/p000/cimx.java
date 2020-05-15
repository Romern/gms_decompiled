package p000;

/* renamed from: cimx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cimx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cimx f190865e;

    /* renamed from: f */
    private static volatile bxxk f190866f;

    /* renamed from: a */
    public int f190867a;

    /* renamed from: b */
    public cimy f190868b;

    /* renamed from: c */
    public cimy f190869c;

    /* renamed from: d */
    public float f190870d;

    static {
        cimx cimx = new cimx();
        f190865e = cimx;
        GeneratedMessageLite.m124024a(cimx.class, cimx);
    }

    private cimx() {
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
            return GeneratedMessageLite.m124022a(f190865e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cimx();
        } else {
            if (i2 == 4) {
                return new bxvd(f190865e);
            }
            if (i2 == 5) {
                return f190865e;
            }
            bxxk bxxk = f190866f;
            if (bxxk == null) {
                synchronized (cimx.class) {
                    bxxk = f190866f;
                    if (bxxk == null) {
                        bxxk = new bxve(f190865e);
                        f190866f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
