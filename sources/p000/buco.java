package p000;

/* renamed from: buco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buco extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buco f153389d;

    /* renamed from: e */
    private static volatile bxxk f153390e;

    /* renamed from: a */
    public int f153391a;

    /* renamed from: b */
    public boolean f153392b;

    /* renamed from: c */
    public boolean f153393c;

    static {
        buco buco = new buco();
        f153389d = buco;
        bxvk.m124024a(buco.class, buco);
    }

    private buco() {
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
            return bxvk.m124022a(f153389d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buco();
        } else {
            if (i2 == 4) {
                return new bxvd(f153389d);
            }
            if (i2 == 5) {
                return f153389d;
            }
            bxxk bxxk = f153390e;
            if (bxxk == null) {
                synchronized (buco.class) {
                    bxxk = f153390e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153389d);
                        f153390e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
