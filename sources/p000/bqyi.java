package p000;

/* renamed from: bqyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqyi extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqyi f141949e;

    /* renamed from: f */
    private static volatile bxxk f141950f;

    /* renamed from: a */
    public int f141951a;

    /* renamed from: b */
    public bqyh f141952b;

    /* renamed from: c */
    public String f141953c = "";

    /* renamed from: d */
    public bqyh f141954d;

    static {
        bqyi bqyi = new bqyi();
        f141949e = bqyi;
        GeneratedMessageLite.m124024a(bqyi.class, bqyi);
    }

    private bqyi() {
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
            return GeneratedMessageLite.m124022a(f141949e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0005ဉ\u0000\u0006ဉ\u0002", new Object[]{"a", "c", "b", "d"});
        } else if (i2 == 3) {
            return new bqyi();
        } else {
            if (i2 == 4) {
                return new bxvd(f141949e);
            }
            if (i2 == 5) {
                return f141949e;
            }
            bxxk bxxk = f141950f;
            if (bxxk == null) {
                synchronized (bqyi.class) {
                    bxxk = f141950f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141949e);
                        f141950f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
