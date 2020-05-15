package p000;

/* renamed from: byzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byzp f169141c;

    /* renamed from: e */
    private static volatile bxxk f169142e;

    /* renamed from: a */
    public int f169143a;

    /* renamed from: b */
    public bxwc f169144b = bxxn.f165040b;

    /* renamed from: d */
    private int f169145d;

    static {
        byzp byzp = new byzp();
        f169141c = byzp;
        bxvk.m124024a(byzp.class, byzp);
    }

    private byzp() {
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
            return bxvk.m124022a(f169141c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"d", "a", bzbu.m125628b(), "b", byzn.class});
        } else if (i2 == 3) {
            return new byzp();
        } else {
            if (i2 == 4) {
                return new bxvd(f169141c);
            }
            if (i2 == 5) {
                return f169141c;
            }
            bxxk bxxk = f169142e;
            if (bxxk == null) {
                synchronized (byzp.class) {
                    bxxk = f169142e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169141c);
                        f169142e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
