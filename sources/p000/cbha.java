package p000;

/* renamed from: cbha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbha extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbha f177106b;

    /* renamed from: c */
    private static volatile bxxk f177107c;

    /* renamed from: a */
    public bxwc f177108a = bxxn.f165040b;

    static {
        cbha cbha = new cbha();
        f177106b = cbha;
        GeneratedMessageLite.m124024a(cbha.class, cbha);
    }

    private cbha() {
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
            return GeneratedMessageLite.m124022a(f177106b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbha();
        } else {
            if (i2 == 4) {
                return new bxvd(f177106b);
            }
            if (i2 == 5) {
                return f177106b;
            }
            bxxk bxxk = f177107c;
            if (bxxk == null) {
                synchronized (cbha.class) {
                    bxxk = f177107c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177106b);
                        f177107c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
