package p000;

/* renamed from: buca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buca extends bxvk implements bxxd {

    /* renamed from: d */
    public static final buca f153311d;

    /* renamed from: e */
    private static volatile bxxk f153312e;

    /* renamed from: a */
    public int f153313a;

    /* renamed from: b */
    public int f153314b;

    /* renamed from: c */
    public bxtx f153315c = bxtx.f164797b;

    static {
        buca buca = new buca();
        f153311d = buca;
        bxvk.m124024a(buca.class, buca);
    }

    private buca() {
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
            return bxvk.m124022a(f153311d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new buca();
        } else {
            if (i2 == 4) {
                return new bxvd(f153311d);
            }
            if (i2 == 5) {
                return f153311d;
            }
            bxxk bxxk = f153312e;
            if (bxxk == null) {
                synchronized (buca.class) {
                    bxxk = f153312e;
                    if (bxxk == null) {
                        bxxk = new bxve(f153311d);
                        f153312e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
