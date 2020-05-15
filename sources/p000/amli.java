package p000;

/* renamed from: amli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amli extends bxvk implements bxxd {

    /* renamed from: i */
    public static final amli f75179i;

    /* renamed from: j */
    private static volatile bxxk f75180j;

    /* renamed from: a */
    public int f75181a;

    /* renamed from: b */
    public amlf f75182b;

    /* renamed from: c */
    public int f75183c;

    /* renamed from: d */
    public int f75184d;

    /* renamed from: e */
    public int f75185e;

    /* renamed from: f */
    public int f75186f;

    /* renamed from: g */
    public int f75187g;

    /* renamed from: h */
    public int f75188h;

    static {
        amli amli = new amli();
        f75179i = amli;
        bxvk.m124024a(amli.class, amli);
    }

    private amli() {
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
            return bxvk.m124022a(f75179i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", amlg.f75177a, "h", amlh.f75178a});
        } else if (i2 == 3) {
            return new amli();
        } else {
            if (i2 == 4) {
                return new bxvd(f75179i);
            }
            if (i2 == 5) {
                return f75179i;
            }
            bxxk bxxk = f75180j;
            if (bxxk == null) {
                synchronized (amli.class) {
                    bxxk = f75180j;
                    if (bxxk == null) {
                        bxxk = new bxve(f75179i);
                        f75180j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
