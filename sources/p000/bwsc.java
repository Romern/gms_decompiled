package p000;

/* renamed from: bwsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwsc f160834e;

    /* renamed from: f */
    private static volatile bxxk f160835f;

    /* renamed from: a */
    public int f160836a;

    /* renamed from: b */
    public int f160837b = -1;

    /* renamed from: c */
    public String f160838c = "";

    /* renamed from: d */
    public String f160839d = "";

    static {
        bwsc bwsc = new bwsc();
        f160834e = bwsc;
        GeneratedMessageLite.m124024a(bwsc.class, bwsc);
    }

    private bwsc() {
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
            return GeneratedMessageLite.m124022a(f160834e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bwsc();
        } else {
            if (i2 == 4) {
                return new bxvd(f160834e);
            }
            if (i2 == 5) {
                return f160834e;
            }
            bxxk bxxk = f160835f;
            if (bxxk == null) {
                synchronized (bwsc.class) {
                    bxxk = f160835f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160834e);
                        f160835f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
