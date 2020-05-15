package p000;

/* renamed from: cbod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbod extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbod f177801d;

    /* renamed from: e */
    private static volatile bxxk f177802e;

    /* renamed from: a */
    public bxvt f177803a = bxvm.f164965b;

    /* renamed from: b */
    public cbon f177804b;

    /* renamed from: c */
    public cboi f177805c;

    static {
        cbod cbod = new cbod();
        f177801d = cbod;
        GeneratedMessageLite.m124024a(cbod.class, cbod);
    }

    private cbod() {
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
            return GeneratedMessageLite.m124022a(f177801d, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0001\u0000\u0001,\u0002\t\b\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbod();
        } else {
            if (i2 == 4) {
                return new cboc();
            }
            if (i2 == 5) {
                return f177801d;
            }
            bxxk bxxk = f177802e;
            if (bxxk == null) {
                synchronized (cbod.class) {
                    bxxk = f177802e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177801d);
                        f177802e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
