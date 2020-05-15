package p000;

/* renamed from: brcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final brcq f142414f;

    /* renamed from: g */
    private static volatile bxxk f142415g;

    /* renamed from: a */
    public int f142416a;

    /* renamed from: b */
    public brak f142417b;

    /* renamed from: c */
    public boolean f142418c;

    /* renamed from: d */
    public boolean f142419d;

    /* renamed from: e */
    public boolean f142420e;

    static {
        brcq brcq = new brcq();
        f142414f = brcq;
        bxvk.m124024a(brcq.class, brcq);
    }

    private brcq() {
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
            return bxvk.m124022a(f142414f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new brcq();
        } else {
            if (i2 == 4) {
                return new bxvd(f142414f);
            }
            if (i2 == 5) {
                return f142414f;
            }
            bxxk bxxk = f142415g;
            if (bxxk == null) {
                synchronized (brcq.class) {
                    bxxk = f142415g;
                    if (bxxk == null) {
                        bxxk = new bxve(f142414f);
                        f142415g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
