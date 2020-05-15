package p000;

/* renamed from: bmrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmrb f130459e;

    /* renamed from: f */
    private static volatile bxxk f130460f;

    /* renamed from: a */
    public int f130461a;

    /* renamed from: b */
    public int f130462b = 0;

    /* renamed from: c */
    public Object f130463c;

    /* renamed from: d */
    public bmaj f130464d;

    static {
        bmrb bmrb = new bmrb();
        f130459e = bmrb;
        bxvk.m124024a(bmrb.class, bmrb);
    }

    private bmrb() {
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
            return bxvk.m124022a(f130459e, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ွ\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new bmrb();
        } else {
            if (i2 == 4) {
                return new bxvd(f130459e);
            }
            if (i2 == 5) {
                return f130459e;
            }
            bxxk bxxk = f130460f;
            if (bxxk == null) {
                synchronized (bmrb.class) {
                    bxxk = f130460f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130459e);
                        f130460f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
