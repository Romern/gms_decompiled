package p000;

/* renamed from: atzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzm extends bxvk implements bxxd {

    /* renamed from: e */
    public static final atzm f91243e;

    /* renamed from: f */
    private static volatile bxxk f91244f;

    /* renamed from: a */
    public int f91245a;

    /* renamed from: b */
    public int f91246b;

    /* renamed from: c */
    public int f91247c;

    /* renamed from: d */
    public int f91248d;

    static {
        atzm atzm = new atzm();
        f91243e = atzm;
        bxvk.m124024a(atzm.class, atzm);
    }

    private atzm() {
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
            return bxvk.m124022a(f91243e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new atzm();
        } else {
            if (i2 == 4) {
                return new bxvd(f91243e);
            }
            if (i2 == 5) {
                return f91243e;
            }
            bxxk bxxk = f91244f;
            if (bxxk == null) {
                synchronized (atzm.class) {
                    bxxk = f91244f;
                    if (bxxk == null) {
                        bxxk = new bxve(f91243e);
                        f91244f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
