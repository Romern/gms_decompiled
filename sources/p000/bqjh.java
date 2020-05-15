package p000;

/* renamed from: bqjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqjh extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqjh f140947f;

    /* renamed from: g */
    private static volatile bxxk f140948g;

    /* renamed from: a */
    public int f140949a;

    /* renamed from: b */
    public String f140950b = "";

    /* renamed from: c */
    public String f140951c = "";

    /* renamed from: d */
    public bxwc f140952d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f140953e = bxxn.f165040b;

    static {
        bqjh bqjh = new bqjh();
        f140947f = bqjh;
        bxvk.m124024a(bqjh.class, bqjh);
    }

    private bqjh() {
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
            return bxvk.m124022a(f140947f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0002\u0000\u0002ဈ\u0000\u0003\u001b\u0004ဈ\u0001\u0005\u001a", new Object[]{"a", "b", "d", bqjf.class, "c", "e"});
        } else if (i2 == 3) {
            return new bqjh();
        } else {
            if (i2 == 4) {
                return new bqjg();
            }
            if (i2 == 5) {
                return f140947f;
            }
            bxxk bxxk = f140948g;
            if (bxxk == null) {
                synchronized (bqjh.class) {
                    bxxk = f140948g;
                    if (bxxk == null) {
                        bxxk = new bxve(f140947f);
                        f140948g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
