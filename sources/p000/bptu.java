package p000;

/* renamed from: bptu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bptu f139179e;

    /* renamed from: g */
    private static volatile bxxk f139180g;

    /* renamed from: a */
    public int f139181a;

    /* renamed from: b */
    public int f139182b = -1;

    /* renamed from: c */
    public int f139183c;

    /* renamed from: d */
    public bptv f139184d;

    /* renamed from: f */
    private byte f139185f = 2;

    static {
        bptu bptu = new bptu();
        f139179e = bptu;
        bxvk.m124024a(bptu.class, bptu);
    }

    private bptu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139185f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139185f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139179e, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bptu();
        } else {
            if (i2 == 4) {
                return new bxvd(f139179e);
            }
            if (i2 == 5) {
                return f139179e;
            }
            bxxk bxxk = f139180g;
            if (bxxk == null) {
                synchronized (bptu.class) {
                    bxxk = f139180g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139179e);
                        f139180g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
