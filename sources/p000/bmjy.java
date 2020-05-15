package p000;

/* renamed from: bmjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmjy extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmjy f129758i;

    /* renamed from: j */
    private static volatile bxxk f129759j;

    /* renamed from: a */
    public int f129760a;

    /* renamed from: b */
    public String f129761b = "";

    /* renamed from: c */
    public String f129762c = "";

    /* renamed from: d */
    public bxwc f129763d = bxxn.f165040b;

    /* renamed from: e */
    public bxwc f129764e = bxxn.f165040b;

    /* renamed from: f */
    public int f129765f;

    /* renamed from: g */
    public bmno f129766g;

    /* renamed from: h */
    public boolean f129767h;

    static {
        bmjy bmjy = new bmjy();
        f129758i = bmjy;
        GeneratedMessageLite.m124024a(bmjy.class, bmjy);
    }

    private bmjy() {
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
            return GeneratedMessageLite.m124022a(f129758i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b\u0005ဌ\u0002\u0006ဉ\u0003\u0007ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", bmnr.class, "f", bmjw.f129757a, "g", "h"});
        } else if (i2 == 3) {
            return new bmjy();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f129758i;
            }
            bxxk bxxk = f129759j;
            if (bxxk == null) {
                synchronized (bmjy.class) {
                    bxxk = f129759j;
                    if (bxxk == null) {
                        bxxk = new bxve(f129758i);
                        f129759j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
