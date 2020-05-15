package p000;

/* renamed from: bpdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpdc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpdc f135904e;

    /* renamed from: f */
    private static volatile bxxk f135905f;

    /* renamed from: a */
    public int f135906a;

    /* renamed from: b */
    public int f135907b;

    /* renamed from: c */
    public int f135908c;

    /* renamed from: d */
    public int f135909d;

    static {
        bpdc bpdc = new bpdc();
        f135904e = bpdc;
        bxvk.m124024a(bpdc.class, bpdc);
    }

    private bpdc() {
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
            return bxvk.m124022a(f135904e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpdc();
        } else {
            if (i2 == 4) {
                return new bxvd(f135904e);
            }
            if (i2 == 5) {
                return f135904e;
            }
            bxxk bxxk = f135905f;
            if (bxxk == null) {
                synchronized (bpdc.class) {
                    bxxk = f135905f;
                    if (bxxk == null) {
                        bxxk = new bxve(f135904e);
                        f135905f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
