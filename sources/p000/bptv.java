package p000;

/* renamed from: bptv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bptv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bptv f139186d;

    /* renamed from: f */
    private static volatile bxxk f139187f;

    /* renamed from: a */
    public int f139188a;

    /* renamed from: b */
    public bptw f139189b;

    /* renamed from: c */
    public long f139190c;

    /* renamed from: e */
    private byte f139191e = 2;

    static {
        bptv bptv = new bptv();
        f139186d = bptv;
        bxvk.m124024a(bptv.class, bptv);
    }

    private bptv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139191e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139191e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f139186d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bptv();
        } else {
            if (i2 == 4) {
                return new bxvd(f139186d);
            }
            if (i2 == 5) {
                return f139186d;
            }
            bxxk bxxk = f139187f;
            if (bxxk == null) {
                synchronized (bptv.class) {
                    bxxk = f139187f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139186d);
                        f139187f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
