package p000;

/* renamed from: aapk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aapk extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final aapk f28782g;

    /* renamed from: h */
    private static volatile bxxk f28783h;

    /* renamed from: a */
    public int f28784a;

    /* renamed from: b */
    public bxun f28785b;

    /* renamed from: c */
    public long f28786c;

    /* renamed from: d */
    public aapn f28787d;

    /* renamed from: e */
    public bxwc f28788e = bxxn.f165040b;

    /* renamed from: f */
    public aape f28789f;

    static {
        aapk aapk = new aapk();
        f28782g = aapk;
        GeneratedMessageLite.m124024a(aapk.class, aapk);
    }

    private aapk() {
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
            return GeneratedMessageLite.m124022a(f28782g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e", aapv.class, "f"});
        } else if (i2 == 3) {
            return new aapk();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f28782g;
            }
            bxxk bxxk = f28783h;
            if (bxxk == null) {
                synchronized (aapk.class) {
                    bxxk = f28783h;
                    if (bxxk == null) {
                        bxxk = new bxve(f28782g);
                        f28783h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
