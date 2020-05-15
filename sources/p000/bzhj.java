package p000;

/* renamed from: bzhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhj extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bzhj f170054d;

    /* renamed from: e */
    private static volatile bxxk f170055e;

    /* renamed from: a */
    public int f170056a;

    /* renamed from: b */
    public int f170057b;

    /* renamed from: c */
    public int f170058c;

    static {
        bzhj bzhj = new bzhj();
        f170054d = bzhj;
        GeneratedMessageLite.m124024a(bzhj.class, bzhj);
    }

    private bzhj() {
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
            return GeneratedMessageLite.m124022a(f170054d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bzhi.m125795b(), "c", bzhg.f170045a});
        } else if (i2 == 3) {
            return new bzhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f170054d);
            }
            if (i2 == 5) {
                return f170054d;
            }
            bxxk bxxk = f170055e;
            if (bxxk == null) {
                synchronized (bzhj.class) {
                    bxxk = f170055e;
                    if (bxxk == null) {
                        bxxk = new bxve(f170054d);
                        f170055e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
