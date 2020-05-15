package p000;

/* renamed from: cakr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cakr f175042b;

    /* renamed from: c */
    private static volatile bxxk f175043c;

    /* renamed from: a */
    public int f175044a;

    static {
        cakr cakr = new cakr();
        f175042b = cakr;
        GeneratedMessageLite.m124024a(cakr.class, cakr);
    }

    private cakr() {
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
            return GeneratedMessageLite.m124022a(f175042b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cakr();
        } else {
            if (i2 == 4) {
                return new bxvd(f175042b);
            }
            if (i2 == 5) {
                return f175042b;
            }
            bxxk bxxk = f175043c;
            if (bxxk == null) {
                synchronized (cakr.class) {
                    bxxk = f175043c;
                    if (bxxk == null) {
                        bxxk = new bxve(f175042b);
                        f175043c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
