package p000;

/* renamed from: bvug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvug extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvug f157682e;

    /* renamed from: f */
    private static volatile bxxk f157683f;

    /* renamed from: a */
    public int f157684a;

    /* renamed from: b */
    public int f157685b;

    /* renamed from: c */
    public int f157686c;

    /* renamed from: d */
    public bxwc f157687d = bxxn.f165040b;

    static {
        bvug bvug = new bvug();
        f157682e = bvug;
        GeneratedMessageLite.m124024a(bvug.class, bvug);
    }

    private bvug() {
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
            return GeneratedMessageLite.m124022a(f157682e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", bvmo.class});
        } else if (i2 == 3) {
            return new bvug();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f157682e;
            }
            bxxk bxxk = f157683f;
            if (bxxk == null) {
                synchronized (bvug.class) {
                    bxxk = f157683f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157682e);
                        f157683f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
