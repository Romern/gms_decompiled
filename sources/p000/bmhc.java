package p000;

/* renamed from: bmhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmhc extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bmhc f129396d;

    /* renamed from: f */
    private static volatile bxxk f129397f;

    /* renamed from: a */
    public int f129398a = 0;

    /* renamed from: b */
    public Object f129399b;

    /* renamed from: c */
    public boolean f129400c;

    /* renamed from: e */
    private int f129401e;

    static {
        bmhc bmhc = new bmhc();
        f129396d = bmhc;
        bxvk.m124024a(bmhc.class, bmhc);
    }

    private bmhc() {
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
            return bxvk.m124022a(f129396d, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004ြ\u0000\u0006ဇ\u0003", new Object[]{"b", "a", "e", bmqf.class, bmbr.class, bmds.class, "c"});
        } else if (i2 == 3) {
            return new bmhc();
        } else {
            if (i2 == 4) {
                return new bxvd(f129396d);
            }
            if (i2 == 5) {
                return f129396d;
            }
            bxxk bxxk = f129397f;
            if (bxxk == null) {
                synchronized (bmhc.class) {
                    bxxk = f129397f;
                    if (bxxk == null) {
                        bxxk = new bxve(f129396d);
                        f129397f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
