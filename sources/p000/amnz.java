package p000;

/* renamed from: amnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amnz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final amnz f75573c;

    /* renamed from: d */
    private static volatile bxxk f75574d;

    /* renamed from: a */
    public int f75575a;

    /* renamed from: b */
    public int f75576b;

    static {
        amnz amnz = new amnz();
        f75573c = amnz;
        bxvk.m124024a(amnz.class, amnz);
    }

    private amnz() {
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
            return bxvk.m124022a(f75573c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", amny.f75572a});
        } else if (i2 == 3) {
            return new amnz();
        } else {
            if (i2 == 4) {
                return new bxvd(f75573c);
            }
            if (i2 == 5) {
                return f75573c;
            }
            bxxk bxxk = f75574d;
            if (bxxk == null) {
                synchronized (amnz.class) {
                    bxxk = f75574d;
                    if (bxxk == null) {
                        bxxk = new bxve(f75573c);
                        f75574d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
