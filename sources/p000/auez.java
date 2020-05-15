package p000;

/* renamed from: auez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auez extends bxvk implements bxxd {

    /* renamed from: d */
    public static final auez f91620d;

    /* renamed from: e */
    private static volatile bxxk f91621e;

    /* renamed from: a */
    public int f91622a;

    /* renamed from: b */
    public aufa f91623b;

    /* renamed from: c */
    public aufb f91624c;

    static {
        auez auez = new auez();
        f91620d = auez;
        bxvk.m124024a(auez.class, auez);
    }

    private auez() {
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
            return bxvk.m124022a(f91620d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new auez();
        } else {
            if (i2 == 4) {
                return new bxvd(f91620d);
            }
            if (i2 == 5) {
                return f91620d;
            }
            bxxk bxxk = f91621e;
            if (bxxk == null) {
                synchronized (auez.class) {
                    bxxk = f91621e;
                    if (bxxk == null) {
                        bxxk = new bxve(f91620d);
                        f91621e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
