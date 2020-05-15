package p000;

/* renamed from: adhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhe extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final adhe f61675i;

    /* renamed from: j */
    private static volatile bxxk f61676j;

    /* renamed from: a */
    public boolean f61677a;

    /* renamed from: b */
    public int f61678b;

    /* renamed from: c */
    public int f61679c;

    /* renamed from: d */
    public String f61680d = "";

    /* renamed from: e */
    public String f61681e = "";

    /* renamed from: f */
    public String f61682f = "";

    /* renamed from: g */
    public bxwc f61683g = bxxn.f165040b;

    /* renamed from: h */
    public int f61684h;

    static {
        adhe adhe = new adhe();
        f61675i = adhe;
        GeneratedMessageLite.m124024a(adhe.class, adhe);
    }

    private adhe() {
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
            return GeneratedMessageLite.m124022a(f61675i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0001\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\u001b\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", adhf.class, "h"});
        } else if (i2 == 3) {
            return new adhe();
        } else {
            if (i2 == 4) {
                return new bxvd(f61675i);
            }
            if (i2 == 5) {
                return f61675i;
            }
            bxxk bxxk = f61676j;
            if (bxxk == null) {
                synchronized (adhe.class) {
                    bxxk = f61676j;
                    if (bxxk == null) {
                        bxxk = new bxve(f61675i);
                        f61676j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
