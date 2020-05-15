package p000;

/* renamed from: bprw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bprw f138909d;

    /* renamed from: e */
    private static volatile bxxk f138910e;

    /* renamed from: a */
    public int f138911a;

    /* renamed from: b */
    public int f138912b;

    /* renamed from: c */
    public bprn f138913c;

    static {
        bprw bprw = new bprw();
        f138909d = bprw;
        GeneratedMessageLite.m124024a(bprw.class, bprw);
    }

    private bprw() {
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
            return GeneratedMessageLite.m124022a(f138909d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", bprv.f138908a, "c"});
        } else if (i2 == 3) {
            return new bprw();
        } else {
            if (i2 == 4) {
                return new bxvd(f138909d);
            }
            if (i2 == 5) {
                return f138909d;
            }
            bxxk bxxk = f138910e;
            if (bxxk == null) {
                synchronized (bprw.class) {
                    bxxk = f138910e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138909d);
                        f138910e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
