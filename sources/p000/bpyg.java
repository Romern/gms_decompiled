package p000;

/* renamed from: bpyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpyg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bpyg f139837g;

    /* renamed from: h */
    private static volatile bxxk f139838h;

    /* renamed from: a */
    public int f139839a;

    /* renamed from: b */
    public long f139840b;

    /* renamed from: c */
    public long f139841c;

    /* renamed from: d */
    public long f139842d;

    /* renamed from: e */
    public long f139843e;

    /* renamed from: f */
    public boolean f139844f;

    static {
        bpyg bpyg = new bpyg();
        f139837g = bpyg;
        bxvk.m124024a(bpyg.class, bpyg);
    }

    private bpyg() {
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
            return bxvk.m124022a(f139837g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0000\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\bဃ\u0006\tဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bpyg();
        } else {
            if (i2 == 4) {
                return new bxvd(f139837g);
            }
            if (i2 == 5) {
                return f139837g;
            }
            bxxk bxxk = f139838h;
            if (bxxk == null) {
                synchronized (bpyg.class) {
                    bxxk = f139838h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139837g);
                        f139838h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
