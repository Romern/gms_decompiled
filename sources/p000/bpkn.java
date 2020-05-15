package p000;

/* renamed from: bpkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpkn f137992c;

    /* renamed from: d */
    private static volatile bxxk f137993d;

    /* renamed from: a */
    public int f137994a;

    /* renamed from: b */
    public String f137995b = "";

    static {
        bpkn bpkn = new bpkn();
        f137992c = bpkn;
        bxvk.m124024a(bpkn.class, bpkn);
    }

    private bpkn() {
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
            return bxvk.m124022a(f137992c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpkn();
        } else {
            if (i2 == 4) {
                return new bxvd(f137992c);
            }
            if (i2 == 5) {
                return f137992c;
            }
            bxxk bxxk = f137993d;
            if (bxxk == null) {
                synchronized (bpkn.class) {
                    bxxk = f137993d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137992c);
                        f137993d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
