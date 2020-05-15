package p000;

/* renamed from: bslw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bslw f144968e;

    /* renamed from: g */
    private static volatile bxxk f144969g;

    /* renamed from: a */
    public String f144970a = "";

    /* renamed from: b */
    public boolean f144971b;

    /* renamed from: c */
    public boolean f144972c;

    /* renamed from: d */
    public bslz f144973d;

    /* renamed from: f */
    private int f144974f;

    static {
        bslw bslw = new bslw();
        f144968e = bslw;
        GeneratedMessageLite.m124024a(bslw.class, bslw);
    }

    private bslw() {
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
            return GeneratedMessageLite.m124022a(f144968e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bslw();
        } else {
            if (i2 == 4) {
                return new bxvd(f144968e);
            }
            if (i2 == 5) {
                return f144968e;
            }
            bxxk bxxk = f144969g;
            if (bxxk == null) {
                synchronized (bslw.class) {
                    bxxk = f144969g;
                    if (bxxk == null) {
                        bxxk = new bxve(f144968e);
                        f144969g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
