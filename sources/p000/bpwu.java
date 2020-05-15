package p000;

/* renamed from: bpwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bpwu f139575d;

    /* renamed from: e */
    private static volatile bxxk f139576e;

    /* renamed from: a */
    public int f139577a;

    /* renamed from: b */
    public String f139578b = "";

    /* renamed from: c */
    public String f139579c = "";

    static {
        bpwu bpwu = new bpwu();
        f139575d = bpwu;
        bxvk.m124024a(bpwu.class, bpwu);
    }

    private bpwu() {
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
            return bxvk.m124022a(f139575d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpwu();
        } else {
            if (i2 == 4) {
                return new bxvd(f139575d);
            }
            if (i2 == 5) {
                return f139575d;
            }
            bxxk bxxk = f139576e;
            if (bxxk == null) {
                synchronized (bpwu.class) {
                    bxxk = f139576e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139575d);
                        f139576e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
