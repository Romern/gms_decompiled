package p000;

/* renamed from: bsmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsmu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsmu f145306c;

    /* renamed from: d */
    private static volatile bxxk f145307d;

    /* renamed from: a */
    public int f145308a;

    /* renamed from: b */
    public bsna f145309b;

    static {
        bsmu bsmu = new bsmu();
        f145306c = bsmu;
        bxvk.m124024a(bsmu.class, bsmu);
    }

    private bsmu() {
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
            return bxvk.m124022a(f145306c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f145306c);
            }
            if (i2 == 5) {
                return f145306c;
            }
            bxxk bxxk = f145307d;
            if (bxxk == null) {
                synchronized (bsmu.class) {
                    bxxk = f145307d;
                    if (bxxk == null) {
                        bxxk = new bxve(f145306c);
                        f145307d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
