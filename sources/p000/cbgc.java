package p000;

/* renamed from: cbgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final cbgc f177010e;

    /* renamed from: f */
    private static volatile bxxk f177011f;

    /* renamed from: a */
    public String f177012a = "";

    /* renamed from: b */
    public cbgh f177013b;

    /* renamed from: c */
    public bxwc f177014c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f177015d = bxxn.f165040b;

    static {
        cbgc cbgc = new cbgc();
        f177010e = cbgc;
        GeneratedMessageLite.m124024a(cbgc.class, cbgc);
    }

    private cbgc() {
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
            return GeneratedMessageLite.m124022a(f177010e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002\t\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", cbgg.class, "d", cbgd.class});
        } else if (i2 == 3) {
            return new cbgc();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177010e;
            }
            bxxk bxxk = f177011f;
            if (bxxk == null) {
                synchronized (cbgc.class) {
                    bxxk = f177011f;
                    if (bxxk == null) {
                        bxxk = new bxve(f177010e);
                        f177011f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
