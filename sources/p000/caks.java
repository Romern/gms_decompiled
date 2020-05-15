package p000;

/* renamed from: caks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caks extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final caks f175045d;

    /* renamed from: e */
    private static volatile bxxk f175046e;

    /* renamed from: a */
    public int f175047a;

    /* renamed from: b */
    public float f175048b;

    /* renamed from: c */
    public int f175049c;

    static {
        caks caks = new caks();
        f175045d = caks;
        GeneratedMessageLite.m124024a(caks.class, caks);
    }

    private caks() {
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
            return GeneratedMessageLite.m124022a(f175045d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new caks();
        } else {
            if (i2 == 4) {
                return new bxvd(f175045d);
            }
            if (i2 == 5) {
                return f175045d;
            }
            bxxk bxxk = f175046e;
            if (bxxk == null) {
                synchronized (caks.class) {
                    bxxk = f175046e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175045d);
                        f175046e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
