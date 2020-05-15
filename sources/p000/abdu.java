package p000;

/* renamed from: abdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abdu extends bxvk implements bxxd {

    /* renamed from: g */
    public static final abdu f57135g;

    /* renamed from: h */
    private static volatile bxxk f57136h;

    /* renamed from: a */
    public int f57137a;

    /* renamed from: b */
    public int f57138b = 0;

    /* renamed from: c */
    public Object f57139c;

    /* renamed from: d */
    public String f57140d = "";

    /* renamed from: e */
    public bxyl f57141e;

    /* renamed from: f */
    public bxyl f57142f;

    static {
        abdu abdu = new abdu();
        f57135g = abdu;
        bxvk.m124024a(abdu.class, abdu);
    }

    private abdu() {
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
            return bxvk.m124022a(f57135g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ဉ\u0006\u0007ြ\u0000", new Object[]{"c", "b", "a", "d", "e", abdr.class, abdh.class, abdk.class, "f", abdt.class});
        } else if (i2 == 3) {
            return new abdu();
        } else {
            if (i2 == 4) {
                return new bxvd(f57135g);
            }
            if (i2 == 5) {
                return f57135g;
            }
            bxxk bxxk = f57136h;
            if (bxxk == null) {
                synchronized (abdu.class) {
                    bxxk = f57136h;
                    if (bxxk == null) {
                        bxxk = new bxve(f57135g);
                        f57136h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
