package p000;

/* renamed from: bldq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bldq f126112c;

    /* renamed from: d */
    private static volatile bxxk f126113d;

    /* renamed from: a */
    public bxvt f126114a = bxvm.f164965b;

    /* renamed from: b */
    public bxwc f126115b = bxxn.f165040b;

    static {
        bldq bldq = new bldq();
        f126112c = bldq;
        GeneratedMessageLite.m124024a(bldq.class, bldq);
    }

    private bldq() {
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
            return GeneratedMessageLite.m124022a(f126112c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", bldp.m107050b(), "b", bzkf.class});
        } else if (i2 == 3) {
            return new bldq();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f126112c;
            }
            bxxk bxxk = f126113d;
            if (bxxk == null) {
                synchronized (bldq.class) {
                    bxxk = f126113d;
                    if (bxxk == null) {
                        bxxk = new bxve(f126112c);
                        f126113d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
