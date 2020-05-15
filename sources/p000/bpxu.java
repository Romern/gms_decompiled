package p000;

/* renamed from: bpxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpxu f139783c;

    /* renamed from: d */
    private static volatile bxxk f139784d;

    /* renamed from: a */
    public int f139785a;

    /* renamed from: b */
    public bpwz f139786b;

    static {
        bpxu bpxu = new bpxu();
        f139783c = bpxu;
        bxvk.m124024a(bpxu.class, bpxu);
    }

    private bpxu() {
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
            return bxvk.m124022a(f139783c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f139783c);
            }
            if (i2 == 5) {
                return f139783c;
            }
            bxxk bxxk = f139784d;
            if (bxxk == null) {
                synchronized (bpxu.class) {
                    bxxk = f139784d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139783c);
                        f139784d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
