package p000;

/* renamed from: bvpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bvpl f157312d;

    /* renamed from: e */
    private static volatile bxxk f157313e;

    /* renamed from: a */
    public int f157314a;

    /* renamed from: b */
    public bvow f157315b;

    /* renamed from: c */
    public bvkx f157316c;

    static {
        bvpl bvpl = new bvpl();
        f157312d = bvpl;
        GeneratedMessageLite.m124024a(bvpl.class, bvpl);
    }

    private bvpl() {
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
            return GeneratedMessageLite.m124022a(f157312d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvpl();
        } else {
            if (i2 == 4) {
                return new bxvd(f157312d);
            }
            if (i2 == 5) {
                return f157312d;
            }
            bxxk bxxk = f157313e;
            if (bxxk == null) {
                synchronized (bvpl.class) {
                    bxxk = f157313e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157312d);
                        f157313e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
