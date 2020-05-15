package p000;

/* renamed from: bvtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvtn extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvtn f157585e;

    /* renamed from: f */
    private static volatile bxxk f157586f;

    /* renamed from: a */
    public int f157587a;

    /* renamed from: b */
    public bxwc f157588b = bxxn.f165040b;

    /* renamed from: c */
    public bvtx f157589c;

    /* renamed from: d */
    public int f157590d;

    static {
        bvtn bvtn = new bvtn();
        f157585e = bvtn;
        GeneratedMessageLite.m124024a(bvtn.class, bvtn);
    }

    private bvtn() {
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
            return GeneratedMessageLite.m124022a(f157585e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001a\u0003ဉ\u0000\u0004င\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvtn();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157585e;
            }
            bxxk bxxk = f157586f;
            if (bxxk == null) {
                synchronized (bvtn.class) {
                    bxxk = f157586f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157585e);
                        f157586f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
