package p000;

/* renamed from: bwql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwql extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwql f160677b;

    /* renamed from: c */
    private static volatile bxxk f160678c;

    /* renamed from: a */
    public bxwc f160679a = bxxn.f165040b;

    static {
        bwql bwql = new bwql();
        f160677b = bwql;
        bxvk.m124024a(bwql.class, bwql);
    }

    private bwql() {
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
            return bxvk.m124022a(f160677b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bwqk.class});
        } else if (i2 == 3) {
            return new bwql();
        } else {
            if (i2 == 4) {
                return new bxvd(f160677b);
            }
            if (i2 == 5) {
                return f160677b;
            }
            bxxk bxxk = f160678c;
            if (bxxk == null) {
                synchronized (bwql.class) {
                    bxxk = f160678c;
                    if (bxxk == null) {
                        bxxk = new bxve(f160677b);
                        f160678c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
