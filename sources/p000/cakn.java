package p000;

/* renamed from: cakn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cakn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cakn f175021b;

    /* renamed from: d */
    private static volatile bxxk f175022d;

    /* renamed from: a */
    public cajv f175023a;

    /* renamed from: c */
    private int f175024c;

    static {
        cakn cakn = new cakn();
        f175021b = cakn;
        GeneratedMessageLite.m124024a(cakn.class, cakn);
    }

    private cakn() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f175021b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new cakn();
        } else {
            if (i2 == 4) {
                return new bxvd(f175021b);
            }
            if (i2 == 5) {
                return f175021b;
            }
            bxxk bxxk = f175022d;
            if (bxxk == null) {
                synchronized (cakn.class) {
                    bxxk = f175022d;
                    if (bxxk == null) {
                        bxxk = new bxve(f175021b);
                        f175022d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
