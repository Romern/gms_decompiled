package p000;

/* renamed from: cajv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cajv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cajv f174878c;

    /* renamed from: e */
    private static volatile bxxk f174879e;

    /* renamed from: a */
    public String f174880a = "";

    /* renamed from: b */
    public String f174881b = "";

    /* renamed from: d */
    private int f174882d;

    static {
        cajv cajv = new cajv();
        f174878c = cajv;
        GeneratedMessageLite.m124024a(cajv.class, cajv);
    }

    private cajv() {
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
            return GeneratedMessageLite.m124022a(f174878c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new cajv();
        } else {
            if (i2 == 4) {
                return new bxvd(f174878c);
            }
            if (i2 == 5) {
                return f174878c;
            }
            bxxk bxxk = f174879e;
            if (bxxk == null) {
                synchronized (cajv.class) {
                    bxxk = f174879e;
                    if (bxxk == null) {
                        bxxk = new bxve(f174878c);
                        f174879e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
