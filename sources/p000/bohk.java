package p000;

/* renamed from: bohk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohk extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bohk f133097c;

    /* renamed from: d */
    private static volatile bxxk f133098d;

    /* renamed from: a */
    public int f133099a;

    /* renamed from: b */
    public int f133100b;

    static {
        bohk bohk = new bohk();
        f133097c = bohk;
        bxvk.m124024a(bohk.class, bohk);
    }

    private bohk() {
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
            return bxvk.m124022a(f133097c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bohj.f133096a});
        } else if (i2 == 3) {
            return new bohk();
        } else {
            if (i2 == 4) {
                return new bxvd(f133097c);
            }
            if (i2 == 5) {
                return f133097c;
            }
            bxxk bxxk = f133098d;
            if (bxxk == null) {
                synchronized (bohk.class) {
                    bxxk = f133098d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133097c);
                        f133098d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
