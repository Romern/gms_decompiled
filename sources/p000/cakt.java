package p000;

/* renamed from: cakt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakt extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cakt f175050e;

    /* renamed from: f */
    private static volatile bxxk f175051f;

    /* renamed from: a */
    public int f175052a;

    /* renamed from: b */
    public caks f175053b;

    /* renamed from: c */
    public caks f175054c;

    /* renamed from: d */
    public caks f175055d;

    static {
        cakt cakt = new cakt();
        f175050e = cakt;
        GeneratedMessageLite.m124024a(cakt.class, cakt);
    }

    private cakt() {
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
            return GeneratedMessageLite.m124022a(f175050e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cakt();
        } else {
            if (i2 == 4) {
                return new bxvd(f175050e);
            }
            if (i2 == 5) {
                return f175050e;
            }
            bxxk bxxk = f175051f;
            if (bxxk == null) {
                synchronized (cakt.class) {
                    bxxk = f175051f;
                    if (bxxk == null) {
                        bxxk = new bxve(f175050e);
                        f175051f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
