package p000;

/* renamed from: bzvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzvb extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzvb f171500f;

    /* renamed from: g */
    private static volatile bxxk f171501g;

    /* renamed from: a */
    public int f171502a = 0;

    /* renamed from: b */
    public Object f171503b;

    /* renamed from: c */
    public bxyk f171504c;

    /* renamed from: d */
    public bztr f171505d;

    /* renamed from: e */
    public String f171506e = "";

    static {
        bzvb bzvb = new bzvb();
        f171500f = bzvb;
        bxvk.m124024a(bzvb.class, bzvb);
    }

    private bzvb() {
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
            return bxvk.m124022a(f171500f, "\u0000\u0005\u0001\u0000\u0001\t\u0005\u0000\u0000\u0000\u0001\t\u0003\t\u0005Ȉ\u0006<\u0000\t<\u0000", new Object[]{"b", "a", "c", "d", "e", bztj.class, bztj.class});
        } else if (i2 == 3) {
            return new bzvb();
        } else {
            if (i2 == 4) {
                return new bxvd(f171500f);
            }
            if (i2 == 5) {
                return f171500f;
            }
            bxxk bxxk = f171501g;
            if (bxxk == null) {
                synchronized (bzvb.class) {
                    bxxk = f171501g;
                    if (bxxk == null) {
                        bxxk = new bxve(f171500f);
                        f171501g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
