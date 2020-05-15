package p000;

/* renamed from: aail */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aail extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final aail f28193f;

    /* renamed from: g */
    private static volatile bxxk f28194g;

    /* renamed from: a */
    public int f28195a;

    /* renamed from: b */
    public long f28196b;

    /* renamed from: c */
    public int f28197c;

    /* renamed from: d */
    public String f28198d = "";

    /* renamed from: e */
    public ByteString f28199e = ByteString.f164797b;

    static {
        aail aail = new aail();
        f28193f = aail;
        GeneratedMessageLite.m124024a(aail.class, aail);
    }

    private aail() {
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
            return GeneratedMessageLite.m124022a(f28193f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", aair.f28218a, "d", "e"});
        } else if (i2 == 3) {
            return new aail();
        } else {
            if (i2 == 4) {
                return new bxvd(f28193f);
            }
            if (i2 == 5) {
                return f28193f;
            }
            bxxk bxxk = f28194g;
            if (bxxk == null) {
                synchronized (aail.class) {
                    bxxk = f28194g;
                    if (bxxk == null) {
                        bxxk = new bxve(f28193f);
                        f28194g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
