package p000;

/* renamed from: borf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borf extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final borf f134398h;

    /* renamed from: i */
    private static volatile bxxk f134399i;

    /* renamed from: a */
    public int f134400a;

    /* renamed from: b */
    public bxwc f134401b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f134402c = bxxn.f165040b;

    /* renamed from: d */
    public String f134403d = "";

    /* renamed from: e */
    public int f134404e;

    /* renamed from: f */
    public long f134405f;

    /* renamed from: g */
    public long f134406g;

    static {
        borf borf = new borf();
        f134398h = borf;
        GeneratedMessageLite.m124024a(borf.class, borf);
    }

    private borf() {
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
            return GeneratedMessageLite.m124022a(f134398h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u001b\u0003\u001b\u0004ဈ\u0000\u0005ဌ\u0001\u0006ဂ\u0002\u0007ဂ\u0003", new Object[]{"a", "b", bori.class, "c", bore.class, "d", "e", borh.f134412a, "f", "g"});
        } else if (i2 == 3) {
            return new borf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f134398h;
            }
            bxxk bxxk = f134399i;
            if (bxxk == null) {
                synchronized (borf.class) {
                    bxxk = f134399i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134398h);
                        f134399i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
