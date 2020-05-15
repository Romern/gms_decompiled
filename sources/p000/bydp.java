package p000;

/* renamed from: bydp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydp extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bydp f165823a;

    /* renamed from: f */
    private static volatile bxxk f165824f;

    /* renamed from: b */
    private int f165825b;

    /* renamed from: c */
    private bydm f165826c;

    /* renamed from: d */
    private bydm f165827d;

    /* renamed from: e */
    private byte f165828e = 2;

    static {
        bydp bydp = new bydp();
        f165823a = bydp;
        bxvk.m124024a(bydp.class, bydp);
    }

    private bydp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165828e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165828e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f165823a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bydp();
        } else {
            if (i2 == 4) {
                return new bxvd(f165823a);
            }
            if (i2 == 5) {
                return f165823a;
            }
            bxxk bxxk = f165824f;
            if (bxxk == null) {
                synchronized (bydp.class) {
                    bxxk = f165824f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165823a);
                        f165824f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
