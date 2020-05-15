package p000;

/* renamed from: bpwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpwn f139533d;

    /* renamed from: e */
    private static volatile bxxk f139534e;

    /* renamed from: a */
    public int f139535a;

    /* renamed from: b */
    public int f139536b = -1;

    /* renamed from: c */
    public String f139537c = "";

    static {
        bpwn bpwn = new bpwn();
        f139533d = bpwn;
        bxvk.m124024a(bpwn.class, bpwn);
    }

    private bpwn() {
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
            return bxvk.m124022a(f139533d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpwn();
        } else {
            if (i2 == 4) {
                return new bxvd(f139533d);
            }
            if (i2 == 5) {
                return f139533d;
            }
            bxxk bxxk = f139534e;
            if (bxxk == null) {
                synchronized (bpwn.class) {
                    bxxk = f139534e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139533d);
                        f139534e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
