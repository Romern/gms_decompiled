package p000;

/* renamed from: bvwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwd extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvwd f157910e;

    /* renamed from: f */
    private static volatile bxxk f157911f;

    /* renamed from: a */
    public int f157912a;

    /* renamed from: b */
    public boolean f157913b;

    /* renamed from: c */
    public boolean f157914c;

    /* renamed from: d */
    public boolean f157915d;

    static {
        bvwd bvwd = new bvwd();
        f157910e = bvwd;
        GeneratedMessageLite.m124024a(bvwd.class, bvwd);
    }

    private bvwd() {
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
            return GeneratedMessageLite.m124022a(f157910e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvwd();
        } else {
            if (i2 == 4) {
                return new bxvd(f157910e);
            }
            if (i2 == 5) {
                return f157910e;
            }
            bxxk bxxk = f157911f;
            if (bxxk == null) {
                synchronized (bvwd.class) {
                    bxxk = f157911f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157910e);
                        f157911f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
