package p000;

/* renamed from: bywy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywy extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bywy f168684d;

    /* renamed from: e */
    private static volatile bxxk f168685e;

    /* renamed from: a */
    public int f168686a;

    /* renamed from: b */
    public int f168687b;

    /* renamed from: c */
    public bxwc f168688c = bxxn.f165040b;

    static {
        bywy bywy = new bywy();
        f168684d = bywy;
        GeneratedMessageLite.m124024a(bywy.class, bywy);
    }

    private bywy() {
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
            return GeneratedMessageLite.m124022a(f168684d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001b", new Object[]{"a", "b", "c", byxm.class});
        } else if (i2 == 3) {
            return new bywy();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168684d;
            }
            bxxk bxxk = f168685e;
            if (bxxk == null) {
                synchronized (bywy.class) {
                    bxxk = f168685e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168684d);
                        f168685e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
