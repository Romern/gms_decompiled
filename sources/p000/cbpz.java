package p000;

/* renamed from: cbpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbpz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbpz f177977e;

    /* renamed from: f */
    private static volatile bxxk f177978f;

    /* renamed from: a */
    public cbpp f177979a;

    /* renamed from: b */
    public cbrc f177980b;

    /* renamed from: c */
    public cbpf f177981c;

    /* renamed from: d */
    public bxwc f177982d = bxxn.f165040b;

    static {
        cbpz cbpz = new cbpz();
        f177977e = cbpz;
        GeneratedMessageLite.m124024a(cbpz.class, cbpz);
    }

    private cbpz() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f177977e, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0001\u0000\u0001\t\u0005\t\u0006\t\b\u001b", new Object[]{"a", "b", "c", "d", cbpc.class});
        } else if (i2 == 3) {
            return new cbpz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177977e);
            }
            if (i2 == 5) {
                return f177977e;
            }
            bxxk bxxk = f177978f;
            if (bxxk == null) {
                synchronized (cbpz.class) {
                    bxxk = f177978f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177977e);
                        f177978f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
