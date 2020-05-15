package p000;

/* renamed from: brzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzy extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final brzy f143803j;

    /* renamed from: l */
    private static volatile bxxk f143804l;

    /* renamed from: a */
    public int f143805a;

    /* renamed from: b */
    public bxwc f143806b = bxxn.f165040b;

    /* renamed from: c */
    public int f143807c = 1;

    /* renamed from: d */
    public bsaf f143808d;

    /* renamed from: e */
    public brzw f143809e;

    /* renamed from: f */
    public int f143810f = 1;

    /* renamed from: g */
    public String f143811g = "";

    /* renamed from: h */
    public boolean f143812h;

    /* renamed from: i */
    public String f143813i = "";

    /* renamed from: k */
    private byte f143814k = 2;

    static {
        brzy brzy = new brzy();
        f143803j = brzy;
        GeneratedMessageLite.m124024a(brzy.class, brzy);
    }

    private brzy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f143814k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f143814k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f143803j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0007\tဇ\u0006", new Object[]{"a", "b", brzo.class, "c", brzr.f143778a, "d", "e", "f", brzu.f143792a, "g", "i", "h"});
        } else if (i2 == 3) {
            return new brzy();
        } else {
            if (i2 == 4) {
                return new brzx();
            }
            if (i2 == 5) {
                return f143803j;
            }
            bxxk bxxk = f143804l;
            if (bxxk == null) {
                synchronized (brzy.class) {
                    bxxk = f143804l;
                    if (bxxk == null) {
                        bxxk = new bxve(f143803j);
                        f143804l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
