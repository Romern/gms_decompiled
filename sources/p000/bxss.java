package p000;

/* renamed from: bxss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxss extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bxss f164728i;

    /* renamed from: j */
    private static volatile bxxk f164729j;

    /* renamed from: a */
    public int f164730a;

    /* renamed from: b */
    public String f164731b = "";

    /* renamed from: c */
    public int f164732c;

    /* renamed from: d */
    public String f164733d = "";

    /* renamed from: e */
    public String f164734e = "";

    /* renamed from: f */
    public bxsq f164735f;

    /* renamed from: g */
    public bxsp f164736g;

    /* renamed from: h */
    public bxsr f164737h;

    static {
        bxss bxss = new bxss();
        f164728i = bxss;
        GeneratedMessageLite.m124024a(bxss.class, bxss);
    }

    private bxss() {
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
            return GeneratedMessageLite.m124022a(f164728i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bxss();
        } else {
            if (i2 == 4) {
                return new bxvd(f164728i);
            }
            if (i2 == 5) {
                return f164728i;
            }
            bxxk bxxk = f164729j;
            if (bxxk == null) {
                synchronized (bxss.class) {
                    bxxk = f164729j;
                    if (bxxk == null) {
                        bxxk = new bxve(f164728i);
                        f164729j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
