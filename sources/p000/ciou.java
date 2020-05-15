package p000;

/* renamed from: ciou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciou extends bxvk implements bxxd {

    /* renamed from: c */
    public static final ciou f191140c;

    /* renamed from: d */
    private static volatile bxxk f191141d;

    /* renamed from: a */
    public String f191142a = "";

    /* renamed from: b */
    public String f191143b = "";

    static {
        ciou ciou = new ciou();
        f191140c = ciou;
        bxvk.m124024a(ciou.class, ciou);
    }

    private ciou() {
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
            return bxvk.m124022a(f191140c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new ciou();
        } else {
            if (i2 == 4) {
                return new bxvd(f191140c);
            }
            if (i2 == 5) {
                return f191140c;
            }
            bxxk bxxk = f191141d;
            if (bxxk == null) {
                synchronized (ciou.class) {
                    bxxk = f191141d;
                    if (bxxk == null) {
                        bxxk = new bxve(f191140c);
                        f191141d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
