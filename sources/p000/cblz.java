package p000;

/* renamed from: cblz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cblz f177587c;

    /* renamed from: d */
    private static volatile bxxk f177588d;

    /* renamed from: a */
    public int f177589a;

    /* renamed from: b */
    public String f177590b = "";

    static {
        cblz cblz = new cblz();
        f177587c = cblz;
        bxvk.m124024a(cblz.class, cblz);
    }

    private cblz() {
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
            return bxvk.m124022a(f177587c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cblz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177587c);
            }
            if (i2 == 5) {
                return f177587c;
            }
            bxxk bxxk = f177588d;
            if (bxxk == null) {
                synchronized (cblz.class) {
                    bxxk = f177588d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177587c);
                        f177588d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
