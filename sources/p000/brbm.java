package p000;

/* renamed from: brbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brbm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final brbm f142286c;

    /* renamed from: d */
    private static volatile bxxk f142287d;

    /* renamed from: a */
    public int f142288a;

    /* renamed from: b */
    public brak f142289b;

    static {
        brbm brbm = new brbm();
        f142286c = brbm;
        bxvk.m124024a(brbm.class, brbm);
    }

    private brbm() {
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
            return bxvk.m124022a(f142286c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new brbm();
        } else {
            if (i2 == 4) {
                return new bxvd(f142286c);
            }
            if (i2 == 5) {
                return f142286c;
            }
            bxxk bxxk = f142287d;
            if (bxxk == null) {
                synchronized (brbm.class) {
                    bxxk = f142287d;
                    if (bxxk == null) {
                        bxxk = new bxve(f142286c);
                        f142287d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
