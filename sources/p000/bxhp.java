package p000;

/* renamed from: bxhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxhp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bxhp f163445f;

    /* renamed from: g */
    private static volatile bxxk f163446g;

    /* renamed from: a */
    public int f163447a;

    /* renamed from: b */
    public bxhr f163448b;

    /* renamed from: c */
    public bxwc f163449c = bxxn.f165040b;

    /* renamed from: d */
    public bxjo f163450d;

    /* renamed from: e */
    public bxje f163451e;

    static {
        bxhp bxhp = new bxhp();
        f163445f = bxhp;
        bxvk.m124024a(bxhp.class, bxhp);
    }

    private bxhp() {
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
            return bxvk.m124022a(f163445f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", bxfy.class, "d", "e"});
        } else if (i2 == 3) {
            return new bxhp();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return f163445f;
            }
            bxxk bxxk = f163446g;
            if (bxxk == null) {
                synchronized (bxhp.class) {
                    bxxk = f163446g;
                    if (bxxk == null) {
                        bxxk = new bxve(f163445f);
                        f163446g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
