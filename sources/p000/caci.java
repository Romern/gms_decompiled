package p000;

/* renamed from: caci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caci extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final caci f172554c;

    /* renamed from: e */
    private static volatile bxxk f172555e;

    /* renamed from: a */
    public bxwc f172556a = bxxn.f165040b;

    /* renamed from: b */
    public String f172557b = "";

    /* renamed from: d */
    private int f172558d;

    static {
        caci caci = new caci();
        f172554c = caci;
        GeneratedMessageLite.m124024a(caci.class, caci);
    }

    private caci() {
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
            return GeneratedMessageLite.m124022a(f172554c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"d", "a", cabn.class, "b"});
        } else if (i2 == 3) {
            return new caci();
        } else {
            if (i2 == 4) {
                return new bxvd(f172554c);
            }
            if (i2 == 5) {
                return f172554c;
            }
            bxxk bxxk = f172555e;
            if (bxxk == null) {
                synchronized (caci.class) {
                    bxxk = f172555e;
                    if (bxxk == null) {
                        bxxk = new bxve(f172554c);
                        f172555e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
