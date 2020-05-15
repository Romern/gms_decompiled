package p000;

/* renamed from: bzyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyb extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bzyb f171838e;

    /* renamed from: f */
    private static volatile bxxk f171839f;

    /* renamed from: a */
    public long f171840a;

    /* renamed from: b */
    public String f171841b = "";

    /* renamed from: c */
    public bxwc f171842c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f171843d = bxxn.f165040b;

    static {
        bzyb bzyb = new bzyb();
        f171838e = bzyb;
        GeneratedMessageLite.m124024a(bzyb.class, bzyb);
    }

    private bzyb() {
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
            return GeneratedMessageLite.m124022a(f171838e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0002\u0002Ȉ\u0003Ț\u0004Ț", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bzyb();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return f171838e;
            }
            bxxk bxxk = f171839f;
            if (bxxk == null) {
                synchronized (bzyb.class) {
                    bxxk = f171839f;
                    if (bxxk == null) {
                        bxxk = new bxve(f171838e);
                        f171839f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
