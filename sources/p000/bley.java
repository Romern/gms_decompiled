package p000;

/* renamed from: bley */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bley extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bley f126303f;

    /* renamed from: g */
    private static volatile bxxk f126304g;

    /* renamed from: a */
    public int f126305a;

    /* renamed from: b */
    public bleu f126306b;

    /* renamed from: c */
    public String f126307c = "";

    /* renamed from: d */
    public boolean f126308d;

    /* renamed from: e */
    public String f126309e = "";

    static {
        bley bley = new bley();
        f126303f = bley;
        GeneratedMessageLite.m124024a(bley.class, bley);
    }

    private bley() {
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
            return GeneratedMessageLite.m124022a(f126303f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bley();
        } else {
            if (i2 == 4) {
                return new bxvd(f126303f);
            }
            if (i2 == 5) {
                return f126303f;
            }
            bxxk bxxk = f126304g;
            if (bxxk == null) {
                synchronized (bley.class) {
                    bxxk = f126304g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126303f);
                        f126304g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
