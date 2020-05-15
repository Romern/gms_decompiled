package p000;

/* renamed from: eil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eil extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final eil f15050i;

    /* renamed from: j */
    private static volatile bxxk f15051j;

    /* renamed from: a */
    public int f15052a;

    /* renamed from: b */
    public String f15053b = "";

    /* renamed from: c */
    public String f15054c = "";

    /* renamed from: d */
    public String f15055d = "";

    /* renamed from: e */
    public String f15056e = "";

    /* renamed from: f */
    public String f15057f = "";

    /* renamed from: g */
    public String f15058g = "";

    /* renamed from: h */
    public String f15059h = "";

    static {
        eil eil = new eil();
        f15050i = eil;
        GeneratedMessageLite.m124024a(eil.class, eil);
    }

    private eil() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f15050i, "\u0000\b\u0000\u0000\u0003\u0011\b\u0000\u0000\u0000\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\bȈ\tȈ\rȈ\u0011Ȉ", new Object[]{"a", "b", "c", "f", "d", "e", "g", "h"});
        } else if (i2 == 3) {
            return new eil();
        } else {
            if (i2 == 4) {
                return new bxvd(f15050i);
            }
            if (i2 == 5) {
                return f15050i;
            }
            bxxk bxxk = f15051j;
            if (bxxk == null) {
                synchronized (eil.class) {
                    bxxk = f15051j;
                    if (bxxk == null) {
                        bxxk = new bxve(f15050i);
                        f15051j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
