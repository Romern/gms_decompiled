package p000;

/* renamed from: bzmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmr extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bzmr f170637g;

    /* renamed from: h */
    private static volatile bxxk f170638h;

    /* renamed from: a */
    public int f170639a;

    /* renamed from: b */
    public bxwc f170640b = bxxn.f165040b;

    /* renamed from: c */
    public bzln f170641c;

    /* renamed from: d */
    public bzls f170642d;

    /* renamed from: e */
    public bzme f170643e;

    /* renamed from: f */
    public bzmf f170644f;

    static {
        bzmr bzmr = new bzmr();
        f170637g = bzmr;
        GeneratedMessageLite.m124024a(bzmr.class, bzmr);
    }

    private bzmr() {
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
            return GeneratedMessageLite.m124022a(f170637g, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0006\u0005\u001b\u0006ဉ\u0005", new Object[]{"a", "c", "d", "f", "b", bzlz.class, "e"});
        } else if (i2 == 3) {
            return new bzmr();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f170637g;
            }
            bxxk bxxk = f170638h;
            if (bxxk == null) {
                synchronized (bzmr.class) {
                    bxxk = f170638h;
                    if (bxxk == null) {
                        bxxk = new bxve(f170637g);
                        f170638h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
