package p000;

/* renamed from: bztl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bztl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bztl f171342d;

    /* renamed from: e */
    private static volatile bxxk f171343e;

    /* renamed from: a */
    public int f171344a;

    /* renamed from: b */
    public int f171345b;

    /* renamed from: c */
    public float f171346c;

    static {
        bztl bztl = new bztl();
        f171342d = bztl;
        GeneratedMessageLite.m124024a(bztl.class, bztl);
    }

    private bztl() {
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
            return GeneratedMessageLite.m124022a(f171342d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bztl();
        } else {
            if (i2 == 4) {
                return new bxvd(f171342d);
            }
            if (i2 == 5) {
                return f171342d;
            }
            bxxk bxxk = f171343e;
            if (bxxk == null) {
                synchronized (bztl.class) {
                    bxxk = f171343e;
                    if (bxxk == null) {
                        bxxk = new bxve(f171342d);
                        f171343e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
