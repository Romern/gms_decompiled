package p000;

/* renamed from: caeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caeo extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final caeo f172841c;

    /* renamed from: e */
    private static volatile bxxk f172842e;

    /* renamed from: a */
    public bxwc f172843a = bxxn.f165040b;

    /* renamed from: b */
    public int f172844b;

    /* renamed from: d */
    private int f172845d;

    static {
        caeo caeo = new caeo();
        f172841c = caeo;
        GeneratedMessageLite.m124024a(caeo.class, caeo);
    }

    private caeo() {
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
            return GeneratedMessageLite.m124022a(f172841c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002င\u0000", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new caeo();
        } else {
            if (i2 == 4) {
                return new bxvd(f172841c);
            }
            if (i2 == 5) {
                return f172841c;
            }
            bxxk bxxk = f172842e;
            if (bxxk == null) {
                synchronized (caeo.class) {
                    bxxk = f172842e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172841c);
                        f172842e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
