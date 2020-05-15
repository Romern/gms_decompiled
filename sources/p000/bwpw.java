package p000;

/* renamed from: bwpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwpw extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwpw f160609c;

    /* renamed from: e */
    private static volatile bxxk f160610e;

    /* renamed from: a */
    public String f160611a = "";

    /* renamed from: b */
    public String f160612b = "";

    /* renamed from: d */
    private int f160613d;

    static {
        bwpw bwpw = new bwpw();
        f160609c = bwpw;
        GeneratedMessageLite.m124024a(bwpw.class, bwpw);
    }

    private bwpw() {
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
            return GeneratedMessageLite.m124022a(f160609c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwpw();
        } else {
            if (i2 == 4) {
                return new bxvd(f160609c);
            }
            if (i2 == 5) {
                return f160609c;
            }
            bxxk bxxk = f160610e;
            if (bxxk == null) {
                synchronized (bwpw.class) {
                    bxxk = f160610e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160609c);
                        f160610e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
