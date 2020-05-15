package p000;

/* renamed from: brzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brzw extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final brzw f143793i;

    /* renamed from: j */
    private static volatile bxxk f143794j;

    /* renamed from: a */
    public int f143795a;

    /* renamed from: b */
    public String f143796b = "";

    /* renamed from: c */
    public String f143797c = "";

    /* renamed from: d */
    public String f143798d = "";

    /* renamed from: e */
    public String f143799e = "";

    /* renamed from: f */
    public String f143800f = "";

    /* renamed from: g */
    public String f143801g = "";

    /* renamed from: h */
    public bsaj f143802h;

    static {
        brzw brzw = new brzw();
        f143793i = brzw;
        GeneratedMessageLite.m124024a(brzw.class, brzw);
    }

    private brzw() {
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
            return GeneratedMessageLite.m124022a(f143793i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new brzw();
        } else {
            if (i2 == 4) {
                return new bxvd(f143793i);
            }
            if (i2 == 5) {
                return f143793i;
            }
            bxxk bxxk = f143794j;
            if (bxxk == null) {
                synchronized (brzw.class) {
                    bxxk = f143794j;
                    if (bxxk == null) {
                        bxxk = new bxve(f143793i);
                        f143794j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
