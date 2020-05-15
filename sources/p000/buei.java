package p000;

/* renamed from: buei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buei extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buei f153588c;

    /* renamed from: d */
    private static volatile bxxk f153589d;

    /* renamed from: a */
    public int f153590a = 0;

    /* renamed from: b */
    public Object f153591b;

    static {
        buei buei = new buei();
        f153588c = buei;
        bxvk.m124024a(buei.class, buei);
    }

    private buei() {
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
            return bxvk.m124022a(f153588c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bueh.class, bueg.class});
        } else if (i2 == 3) {
            return new buei();
        } else {
            if (i2 == 4) {
                return new bxvd(f153588c);
            }
            if (i2 == 5) {
                return f153588c;
            }
            bxxk bxxk = f153589d;
            if (bxxk == null) {
                synchronized (buei.class) {
                    bxxk = f153589d;
                    if (bxxk == null) {
                        bxxk = new bxve(f153588c);
                        f153589d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
