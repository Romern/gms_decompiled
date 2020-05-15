package p000;

/* renamed from: brak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brak extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brak f142152e;

    /* renamed from: f */
    private static volatile bxxk f142153f;

    /* renamed from: a */
    public int f142154a;

    /* renamed from: b */
    public String f142155b = "";

    /* renamed from: c */
    public brbe f142156c;

    /* renamed from: d */
    public bxwc f142157d = bxxn.f165040b;

    static {
        brak brak = new brak();
        f142152e = brak;
        GeneratedMessageLite.m124024a(brak.class, brak);
    }

    private brak() {
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
            return GeneratedMessageLite.m124022a(f142152e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004\u001a", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new brak();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f142152e;
            }
            bxxk bxxk = f142153f;
            if (bxxk == null) {
                synchronized (brak.class) {
                    bxxk = f142153f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142152e);
                        f142153f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
