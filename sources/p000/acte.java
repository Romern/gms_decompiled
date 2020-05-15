package p000;

/* renamed from: acte */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acte extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final acte f60730c;

    /* renamed from: d */
    private static volatile bxxk f60731d;

    /* renamed from: a */
    public int f60732a;

    /* renamed from: b */
    public ByteString f60733b = ByteString.f164797b;

    static {
        acte acte = new acte();
        f60730c = acte;
        GeneratedMessageLite.m124024a(acte.class, acte);
    }

    private acte() {
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
            return GeneratedMessageLite.m124022a(f60730c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new acte();
        } else {
            if (i2 == 4) {
                return new bxvd(f60730c);
            }
            if (i2 == 5) {
                return f60730c;
            }
            bxxk bxxk = f60731d;
            if (bxxk == null) {
                synchronized (acte.class) {
                    bxxk = f60731d;
                    if (bxxk == null) {
                        bxxk = new bxve(f60730c);
                        f60731d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
