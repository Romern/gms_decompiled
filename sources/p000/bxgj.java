package p000;

/* renamed from: bxgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxgj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxgj f163259d;

    /* renamed from: e */
    private static volatile bxxk f163260e;

    /* renamed from: a */
    public int f163261a;

    /* renamed from: b */
    public bxge f163262b;

    /* renamed from: c */
    public int f163263c;

    static {
        bxgj bxgj = new bxgj();
        f163259d = bxgj;
        bxvk.m124024a(bxgj.class, bxgj);
    }

    private bxgj() {
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
            return bxvk.m124022a(f163259d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bxgj();
        } else {
            if (i2 == 4) {
                return new bxvd(f163259d);
            }
            if (i2 == 5) {
                return f163259d;
            }
            bxxk bxxk = f163260e;
            if (bxxk == null) {
                synchronized (bxgj.class) {
                    bxxk = f163260e;
                    if (bxxk == null) {
                        bxxk = new bxve(f163259d);
                        f163260e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
