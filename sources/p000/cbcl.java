package p000;

/* renamed from: cbcl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbcl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbcl f176665c;

    /* renamed from: d */
    private static volatile bxxk f176666d;

    /* renamed from: a */
    public bxwc f176667a = bxxn.f165040b;

    /* renamed from: b */
    public String f176668b = "";

    static {
        cbcl cbcl = new cbcl();
        f176665c = cbcl;
        GeneratedMessageLite.m124024a(cbcl.class, cbcl);
    }

    private cbcl() {
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
            return GeneratedMessageLite.m124022a(f176665c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"a", cbdl.class, "b"});
        } else if (i2 == 3) {
            return new cbcl();
        } else {
            if (i2 == 4) {
                return new bxvd(f176665c);
            }
            if (i2 == 5) {
                return f176665c;
            }
            bxxk bxxk = f176666d;
            if (bxxk == null) {
                synchronized (cbcl.class) {
                    bxxk = f176666d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176665c);
                        f176666d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
