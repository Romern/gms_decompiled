package p000;

/* renamed from: byad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byad extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byad f165238d;

    /* renamed from: e */
    private static volatile bxxk f165239e;

    /* renamed from: a */
    public int f165240a;

    /* renamed from: b */
    public long f165241b;

    /* renamed from: c */
    public bwky f165242c;

    static {
        byad byad = new byad();
        f165238d = byad;
        GeneratedMessageLite.m124024a(byad.class, byad);
    }

    private byad() {
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
            return GeneratedMessageLite.m124022a(f165238d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byad();
        } else {
            if (i2 == 4) {
                return new bxvd(f165238d);
            }
            if (i2 == 5) {
                return f165238d;
            }
            bxxk bxxk = f165239e;
            if (bxxk == null) {
                synchronized (byad.class) {
                    bxxk = f165239e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165238d);
                        f165239e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
