package p000;

/* renamed from: bqhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqhu extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bqhu f140722e;

    /* renamed from: f */
    private static volatile bxxk f140723f;

    /* renamed from: a */
    public int f140724a;

    /* renamed from: b */
    public String f140725b = "";

    /* renamed from: c */
    public String f140726c = "";

    /* renamed from: d */
    public String f140727d = "";

    static {
        bqhu bqhu = new bqhu();
        f140722e = bqhu;
        bxvk.m124024a(bqhu.class, bqhu);
    }

    private bqhu() {
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
            return bxvk.m124022a(f140722e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqhu();
        } else {
            if (i2 == 4) {
                return new bxvd(f140722e);
            }
            if (i2 == 5) {
                return f140722e;
            }
            bxxk bxxk = f140723f;
            if (bxxk == null) {
                synchronized (bqhu.class) {
                    bxxk = f140723f;
                    if (bxxk == null) {
                        bxxk = new bxve(f140722e);
                        f140723f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
