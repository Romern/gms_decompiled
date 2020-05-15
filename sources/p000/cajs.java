package p000;

/* renamed from: cajs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajs extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final cajs f174855h;

    /* renamed from: i */
    private static volatile bxxk f174856i;

    /* renamed from: a */
    public int f174857a;

    /* renamed from: b */
    public boolean f174858b;

    /* renamed from: c */
    public int f174859c;

    /* renamed from: d */
    public int f174860d;

    /* renamed from: e */
    public int f174861e;

    /* renamed from: f */
    public int f174862f;

    /* renamed from: g */
    public int f174863g;

    static {
        cajs cajs = new cajs();
        f174855h = cajs;
        GeneratedMessageLite.m124024a(cajs.class, cajs);
    }

    private cajs() {
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
            return GeneratedMessageLite.m124022a(f174855h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", "c", "d", "e", cajr.f174854a, "f", cajp.f174852a, "g", cajq.f174853a});
        } else if (i2 == 3) {
            return new cajs();
        } else {
            if (i2 == 4) {
                return new bxvd(f174855h);
            }
            if (i2 == 5) {
                return f174855h;
            }
            bxxk bxxk = f174856i;
            if (bxxk == null) {
                synchronized (cajs.class) {
                    bxxk = f174856i;
                    if (bxxk == null) {
                        bxxk = new bxve(f174855h);
                        f174856i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
