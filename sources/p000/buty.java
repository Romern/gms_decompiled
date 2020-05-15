package p000;

/* renamed from: buty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buty extends bxvk implements bxxd {

    /* renamed from: e */
    public static final buty f154902e;

    /* renamed from: f */
    private static volatile bxxk f154903f;

    /* renamed from: a */
    public int f154904a;

    /* renamed from: b */
    public int f154905b;

    /* renamed from: c */
    public butx f154906c;

    /* renamed from: d */
    public butn f154907d;

    static {
        buty buty = new buty();
        f154902e = buty;
        bxvk.m124024a(buty.class, buty);
    }

    private buty() {
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
            return bxvk.m124022a(f154902e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", buto.f154861a, "c", "d"});
        } else if (i2 == 3) {
            return new buty();
        } else {
            if (i2 == 4) {
                return new bxvd(f154902e);
            }
            if (i2 == 5) {
                return f154902e;
            }
            bxxk bxxk = f154903f;
            if (bxxk == null) {
                synchronized (buty.class) {
                    bxxk = f154903f;
                    if (bxxk == null) {
                        bxxk = new bxve(f154902e);
                        f154903f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
