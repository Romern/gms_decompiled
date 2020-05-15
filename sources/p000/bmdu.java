package p000;

/* renamed from: bmdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmdu extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmdu f128866i;

    /* renamed from: j */
    private static volatile bxxk f128867j;

    /* renamed from: a */
    public int f128868a;

    /* renamed from: b */
    public bmdn f128869b;

    /* renamed from: c */
    public String f128870c = "";

    /* renamed from: d */
    public bmdw f128871d;

    /* renamed from: e */
    public bxwc f128872e = bxxn.f165040b;

    /* renamed from: f */
    public bxwc f128873f = bxxn.f165040b;

    /* renamed from: g */
    public String f128874g = "";

    /* renamed from: h */
    public boolean f128875h;

    static {
        bmdu bmdu = new bmdu();
        f128866i = bmdu;
        GeneratedMessageLite.m124024a(bmdu.class, bmdu);
    }

    private bmdu() {
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
            return GeneratedMessageLite.m124022a(f128866i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003\u001a\u0004ဈ\u0001\u0005ဈ\u0003\u0006ဇ\u0004\t\u001a", new Object[]{"a", "b", "d", "e", "c", "g", "h", "f"});
        } else if (i2 == 3) {
            return new bmdu();
        } else {
            if (i2 == 4) {
                return new bxvd(f128866i);
            }
            if (i2 == 5) {
                return f128866i;
            }
            bxxk bxxk = f128867j;
            if (bxxk == null) {
                synchronized (bmdu.class) {
                    bxxk = f128867j;
                    if (bxxk == null) {
                        bxxk = new bxve(f128866i);
                        f128867j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
