package p000;

/* renamed from: bybb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bybb f165373d;

    /* renamed from: e */
    private static volatile bxxk f165374e;

    /* renamed from: a */
    public int f165375a;

    /* renamed from: b */
    public long f165376b;

    /* renamed from: c */
    public bybe f165377c;

    static {
        bybb bybb = new bybb();
        f165373d = bybb;
        GeneratedMessageLite.m124024a(bybb.class, bybb);
    }

    private bybb() {
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
            return GeneratedMessageLite.m124022a(f165373d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bybb();
        } else {
            if (i2 == 4) {
                return new bxvd(f165373d);
            }
            if (i2 == 5) {
                return f165373d;
            }
            bxxk bxxk = f165374e;
            if (bxxk == null) {
                synchronized (bybb.class) {
                    bxxk = f165374e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165373d);
                        f165374e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
