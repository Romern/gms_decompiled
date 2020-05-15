package p000;

/* renamed from: bmgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmgt extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmgt f129323i;

    /* renamed from: j */
    private static volatile bxxk f129324j;

    /* renamed from: a */
    public int f129325a;

    /* renamed from: b */
    public bmdn f129326b;

    /* renamed from: c */
    public bmnr f129327c;

    /* renamed from: d */
    public bmno f129328d;

    /* renamed from: e */
    public bmqf f129329e;

    /* renamed from: f */
    public bxwc f129330f = bxxn.f165040b;

    /* renamed from: g */
    public bmnr f129331g;

    /* renamed from: h */
    public bxwc f129332h = bxxn.f165040b;

    static {
        bmgt bmgt = new bmgt();
        f129323i = bmgt;
        GeneratedMessageLite.m124024a(bmgt.class, bmgt);
    }

    private bmgt() {
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
            return GeneratedMessageLite.m124022a(f129323i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0003\u0006\u001b\u0007ဉ\u0004\b\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bmnr.class, "g", "h", bmdb.class});
        } else if (i2 == 3) {
            return new bmgt();
        } else {
            if (i2 == 4) {
                return new bxvd(f129323i);
            }
            if (i2 == 5) {
                return f129323i;
            }
            bxxk bxxk = f129324j;
            if (bxxk == null) {
                synchronized (bmgt.class) {
                    bxxk = f129324j;
                    if (bxxk == null) {
                        bxxk = new bxve(f129323i);
                        f129324j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
