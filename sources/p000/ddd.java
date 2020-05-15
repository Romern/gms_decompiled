package p000;

/* renamed from: ddd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ddd f12919d;

    /* renamed from: e */
    private static volatile bxxk f12920e;

    /* renamed from: a */
    public int f12921a;

    /* renamed from: b */
    public int f12922b;

    /* renamed from: c */
    public dcw f12923c;

    static {
        ddd ddd = new ddd();
        f12919d = ddd;
        GeneratedMessageLite.m124024a(ddd.class, ddd);
    }

    private ddd() {
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
            return GeneratedMessageLite.m124022a(f12919d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဌ\u0000", new Object[]{"a", "c", "b", dda.f12910a});
        } else if (i2 == 3) {
            return new ddd();
        } else {
            if (i2 == 4) {
                return new bxvd(f12919d);
            }
            if (i2 == 5) {
                return f12919d;
            }
            bxxk bxxk = f12920e;
            if (bxxk == null) {
                synchronized (ddd.class) {
                    bxxk = f12920e;
                    if (bxxk == null) {
                        bxxk = new bxve(f12919d);
                        f12920e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
