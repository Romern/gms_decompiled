package p000;

/* renamed from: bwze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwze extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bwze f161579i;

    /* renamed from: l */
    private static volatile bxxk f161580l;

    /* renamed from: a */
    public bxwc f161581a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f161582b = bxxn.f165040b;

    /* renamed from: c */
    public bxvw f161583c = bxwq.f165002b;

    /* renamed from: d */
    public bxvw f161584d = bxwq.f165002b;

    /* renamed from: e */
    public bxwc f161585e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f161586f = bxxn.f165040b;

    /* renamed from: g */
    public bwzd f161587g;

    /* renamed from: h */
    public bxwc f161588h = bxxn.f165040b;

    /* renamed from: j */
    private int f161589j;

    /* renamed from: k */
    private byte f161590k = 2;

    static {
        bwze bwze = new bwze();
        f161579i = bwze;
        bxvk.m124024a(bwze.class, bwze);
    }

    private bwze() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f161590k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f161590k = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f161579i, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0007\u0004\u0001Л\u0002Л\u0003\u0014\u0004\u0014\u0005Л\u0006Л\u0007ဉ\u0000\t\u001b", new Object[]{"j", "a", bwxl.class, "b", bwxl.class, "c", "d", "e", bwny.class, "f", bwog.class, "g", "h", bxaz.class});
        } else if (i2 == 3) {
            return new bwze();
        } else {
            if (i2 == 4) {
                return new bxvd(f161579i);
            }
            if (i2 == 5) {
                return f161579i;
            }
            bxxk bxxk = f161580l;
            if (bxxk == null) {
                synchronized (bwze.class) {
                    bxxk = f161580l;
                    if (bxxk == null) {
                        bxxk = new bxve(f161579i);
                        f161580l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
