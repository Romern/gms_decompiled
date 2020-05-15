package p000;

/* renamed from: bydv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydv extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bydv f165861c;

    /* renamed from: d */
    private static volatile bxxk f165862d;

    /* renamed from: a */
    public bxwc f165863a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f165864b = bxxn.f165040b;

    static {
        bydv bydv = new bydv();
        f165861c = bydv;
        GeneratedMessageLite.m124024a(bydv.class, bydv);
    }

    private bydv() {
        bxxn bxxn = bxxn.f165040b;
        bxwq bxwq = bxwq.f165002b;
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
            return GeneratedMessageLite.m124022a(f165861c, "\u0000\u0002\u0000\u0000\u0007\b\u0002\u0000\u0002\u0000\u0007Ț\bȚ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bydv();
        } else {
            if (i2 == 4) {
                return new bxvd(f165861c);
            }
            if (i2 == 5) {
                return f165861c;
            }
            bxxk bxxk = f165862d;
            if (bxxk == null) {
                synchronized (bydv.class) {
                    bxxk = f165862d;
                    if (bxxk == null) {
                        bxxk = new bxve(f165861c);
                        f165862d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
