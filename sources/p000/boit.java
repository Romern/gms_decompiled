package p000;

/* renamed from: boit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boit extends bxvk implements bxxd {

    /* renamed from: c */
    public static final boit f133228c;

    /* renamed from: d */
    private static volatile bxxk f133229d;

    /* renamed from: a */
    public int f133230a;

    /* renamed from: b */
    public int f133231b;

    static {
        boit boit = new boit();
        f133228c = boit;
        bxvk.m124024a(boit.class, boit);
    }

    private boit() {
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
            return bxvk.m124022a(f133228c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bois.f133227a});
        } else if (i2 == 3) {
            return new boit();
        } else {
            if (i2 == 4) {
                return new bxvd(f133228c);
            }
            if (i2 == 5) {
                return f133228c;
            }
            bxxk bxxk = f133229d;
            if (bxxk == null) {
                synchronized (boit.class) {
                    bxxk = f133229d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133228c);
                        f133229d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
