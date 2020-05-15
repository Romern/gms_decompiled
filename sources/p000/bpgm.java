package p000;

/* renamed from: bpgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpgm f137512c;

    /* renamed from: d */
    private static volatile bxxk f137513d;

    /* renamed from: a */
    public int f137514a;

    /* renamed from: b */
    public int f137515b;

    static {
        bpgm bpgm = new bpgm();
        f137512c = bpgm;
        bxvk.m124024a(bpgm.class, bpgm);
    }

    private bpgm() {
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
            return bxvk.m124022a(f137512c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpgm();
        } else {
            if (i2 == 4) {
                return new bxvd(f137512c);
            }
            if (i2 == 5) {
                return f137512c;
            }
            bxxk bxxk = f137513d;
            if (bxxk == null) {
                synchronized (bpgm.class) {
                    bxxk = f137513d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137512c);
                        f137513d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
