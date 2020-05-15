package p000;

/* renamed from: brbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final brbp f142300b;

    /* renamed from: d */
    private static volatile bxxk f142301d;

    /* renamed from: a */
    public bral f142302a;

    /* renamed from: c */
    private int f142303c;

    static {
        brbp brbp = new brbp();
        f142300b = brbp;
        bxvk.m124024a(brbp.class, brbp);
    }

    private brbp() {
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
            return bxvk.m124022a(f142300b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new brbp();
        } else {
            if (i2 == 4) {
                return new bxvd(f142300b);
            }
            if (i2 == 5) {
                return f142300b;
            }
            bxxk bxxk = f142301d;
            if (bxxk == null) {
                synchronized (brbp.class) {
                    bxxk = f142301d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142300b);
                        f142301d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
