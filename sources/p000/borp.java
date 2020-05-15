package p000;

/* renamed from: borp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class borp extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final borp f134471i;

    /* renamed from: j */
    private static volatile bxxk f134472j;

    /* renamed from: a */
    public int f134473a;

    /* renamed from: b */
    public String f134474b = "";

    /* renamed from: c */
    public String f134475c = "";

    /* renamed from: d */
    public int f134476d;

    /* renamed from: e */
    public int f134477e;

    /* renamed from: f */
    public int f134478f;

    /* renamed from: g */
    public int f134479g;

    /* renamed from: h */
    public int f134480h;

    static {
        borp borp = new borp();
        f134471i = borp;
        GeneratedMessageLite.m124024a(borp.class, borp);
    }

    private borp() {
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
            return GeneratedMessageLite.m124022a(f134471i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new borp();
        } else {
            if (i2 == 4) {
                return new bxvd(f134471i);
            }
            if (i2 == 5) {
                return f134471i;
            }
            bxxk bxxk = f134472j;
            if (bxxk == null) {
                synchronized (borp.class) {
                    bxxk = f134472j;
                    if (bxxk == null) {
                        bxxk = new bxve(f134471i);
                        f134472j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
