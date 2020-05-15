package p000;

/* renamed from: buel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buel extends bxvk implements bxxd {

    /* renamed from: c */
    public static final buel f153603c;

    /* renamed from: e */
    private static volatile bxxk f153604e;

    /* renamed from: a */
    public int f153605a;

    /* renamed from: b */
    public bxwc f153606b = bxxn.f165040b;

    /* renamed from: d */
    private int f153607d;

    static {
        buel buel = new buel();
        f153603c = buel;
        bxvk.m124024a(buel.class, buel);
    }

    private buel() {
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
            return bxvk.m124022a(f153603c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b", new Object[]{"d", "a", "b", buem.class});
        } else if (i2 == 3) {
            return new buel();
        } else {
            if (i2 == 4) {
                return new bxvd(f153603c);
            }
            if (i2 == 5) {
                return f153603c;
            }
            bxxk bxxk = f153604e;
            if (bxxk == null) {
                synchronized (buel.class) {
                    bxxk = f153604e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153603c);
                        f153604e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
