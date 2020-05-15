package p000;

/* renamed from: byem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byem extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byem f165919e;

    /* renamed from: f */
    private static volatile bxxk f165920f;

    /* renamed from: a */
    public int f165921a;

    /* renamed from: b */
    public float f165922b;

    /* renamed from: c */
    public float f165923c;

    /* renamed from: d */
    public int f165924d;

    static {
        byem byem = new byem();
        f165919e = byem;
        GeneratedMessageLite.m124024a(byem.class, byem);
    }

    private byem() {
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
            return GeneratedMessageLite.m124022a(f165919e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byem();
        } else {
            if (i2 == 4) {
                return new bxvd(f165919e);
            }
            if (i2 == 5) {
                return f165919e;
            }
            bxxk bxxk = f165920f;
            if (bxxk == null) {
                synchronized (byem.class) {
                    bxxk = f165920f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165919e);
                        f165920f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
