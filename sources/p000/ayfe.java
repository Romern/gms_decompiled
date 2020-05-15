package p000;

/* renamed from: ayfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayfe extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final ayfe f97466e;

    /* renamed from: f */
    private static volatile bxxk f97467f;

    /* renamed from: a */
    public int f97468a;

    /* renamed from: b */
    public long f97469b;

    /* renamed from: c */
    public bxwc f97470c = bxxn.f165040b;

    /* renamed from: d */
    public int f97471d;

    static {
        ayfe ayfe = new ayfe();
        f97466e = ayfe;
        GeneratedMessageLite.m124024a(ayfe.class, ayfe);
    }

    private ayfe() {
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
            return GeneratedMessageLite.m124022a(f97466e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"a", "b", "c", ayfd.class, "d"});
        } else if (i2 == 3) {
            return new ayfe();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return f97466e;
            }
            bxxk bxxk = f97467f;
            if (bxxk == null) {
                synchronized (ayfe.class) {
                    bxxk = f97467f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97466e);
                        f97467f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
