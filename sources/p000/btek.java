package p000;

/* renamed from: btek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btek extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btek f148526d;

    /* renamed from: f */
    private static volatile bxxk f148527f;

    /* renamed from: a */
    public btcs f148528a;

    /* renamed from: b */
    public bxwc f148529b = bxxn.f165040b;

    /* renamed from: c */
    public String f148530c = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f148531e;

    static {
        btek btek = new btek();
        f148526d = btek;
        GeneratedMessageLite.m124024a(btek.class, btek);
    }

    private btek() {
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
            return GeneratedMessageLite.m124022a(f148526d, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002Ț\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", "e", "c"});
        } else if (i2 == 3) {
            return new btek();
        } else {
            if (i2 == 4) {
                return new btej();
            }
            if (i2 == 5) {
                return f148526d;
            }
            bxxk bxxk = f148527f;
            if (bxxk == null) {
                synchronized (btek.class) {
                    bxxk = f148527f;
                    if (bxxk == null) {
                        bxxk = new bxve(f148526d);
                        f148527f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
