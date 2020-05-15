package p000;

/* renamed from: blox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blox extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final blox f127160d;

    /* renamed from: e */
    private static volatile bxxk f127161e;

    /* renamed from: a */
    public int f127162a;

    /* renamed from: b */
    public String f127163b = "";

    /* renamed from: c */
    public String f127164c = "";

    static {
        blox blox = new blox();
        f127160d = blox;
        GeneratedMessageLite.m124024a(blox.class, blox);
    }

    private blox() {
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
            return GeneratedMessageLite.m124022a(f127160d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new blox();
        } else {
            if (i2 == 4) {
                return new bxvd(f127160d);
            }
            if (i2 == 5) {
                return f127160d;
            }
            bxxk bxxk = f127161e;
            if (bxxk == null) {
                synchronized (blox.class) {
                    bxxk = f127161e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127160d);
                        f127161e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
