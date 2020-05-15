package p000;

/* renamed from: bpvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvq extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bpvq f139403h;

    /* renamed from: i */
    private static volatile bxxk f139404i;

    /* renamed from: a */
    public int f139405a;

    /* renamed from: b */
    public String f139406b = "";

    /* renamed from: c */
    public String f139407c = "";

    /* renamed from: d */
    public String f139408d = "";

    /* renamed from: e */
    public String f139409e = "";

    /* renamed from: f */
    public String f139410f = "";

    /* renamed from: g */
    public String f139411g = "";

    static {
        bpvq bpvq = new bpvq();
        f139403h = bpvq;
        bxvk.m124024a(bpvq.class, bpvq);
    }

    private bpvq() {
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
            return bxvk.m124022a(f139403h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bpvq();
        } else {
            if (i2 == 4) {
                return new bxvd(f139403h);
            }
            if (i2 == 5) {
                return f139403h;
            }
            bxxk bxxk = f139404i;
            if (bxxk == null) {
                synchronized (bpvq.class) {
                    bxxk = f139404i;
                    if (bxxk == null) {
                        bxxk = new bxve(f139403h);
                        f139404i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
