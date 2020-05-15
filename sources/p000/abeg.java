package p000;

/* renamed from: abeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abeg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final abeg f57189e;

    /* renamed from: g */
    private static volatile bxxk f57190g;

    /* renamed from: a */
    public int f57191a;

    /* renamed from: b */
    public bxwc f57192b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f57193c = bxxn.f165040b;

    /* renamed from: d */
    public String f57194d = "";

    /* renamed from: f */
    private int f57195f;

    static {
        abeg abeg = new abeg();
        f57189e = abeg;
        GeneratedMessageLite.m124024a(abeg.class, abeg);
    }

    private abeg() {
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
            return GeneratedMessageLite.m124022a(f57189e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0001", new Object[]{"f", "a", "b", abed.class, "c", abed.class, "d"});
        } else if (i2 == 3) {
            return new abeg();
        } else {
            if (i2 == 4) {
                return new bxvd(f57189e);
            }
            if (i2 == 5) {
                return f57189e;
            }
            bxxk bxxk = f57190g;
            if (bxxk == null) {
                synchronized (abeg.class) {
                    bxxk = f57190g;
                    if (bxxk == null) {
                        bxxk = new bxve(f57189e);
                        f57190g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
