package p000;

/* renamed from: cakw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cakw f175072d;

    /* renamed from: e */
    private static volatile bxxk f175073e;

    /* renamed from: a */
    public int f175074a;

    /* renamed from: b */
    public int f175075b;

    /* renamed from: c */
    public int f175076c;

    static {
        cakw cakw = new cakw();
        f175072d = cakw;
        GeneratedMessageLite.m124024a(cakw.class, cakw);
    }

    private cakw() {
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
            return GeneratedMessageLite.m124022a(f175072d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", calc.m126746b(), "c"});
        } else if (i2 == 3) {
            return new cakw();
        } else {
            if (i2 == 4) {
                return new bxvd(f175072d);
            }
            if (i2 == 5) {
                return f175072d;
            }
            bxxk bxxk = f175073e;
            if (bxxk == null) {
                synchronized (cakw.class) {
                    bxxk = f175073e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175072d);
                        f175073e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
