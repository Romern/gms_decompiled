package p000;

/* renamed from: bssy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bssy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bssy f146939d;

    /* renamed from: e */
    private static volatile bxxk f146940e;

    /* renamed from: a */
    public String f146941a = "";

    /* renamed from: b */
    public String f146942b = "";

    /* renamed from: c */
    public int f146943c;

    static {
        bssy bssy = new bssy();
        f146939d = bssy;
        GeneratedMessageLite.m124024a(bssy.class, bssy);
    }

    private bssy() {
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
            return GeneratedMessageLite.m124022a(f146939d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bssy();
        } else {
            if (i2 == 4) {
                return new bxvd(f146939d);
            }
            if (i2 == 5) {
                return f146939d;
            }
            bxxk bxxk = f146940e;
            if (bxxk == null) {
                synchronized (bssy.class) {
                    bxxk = f146940e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146939d);
                        f146940e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
