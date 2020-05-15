package p000;

/* renamed from: bwdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwdt f158931d;

    /* renamed from: f */
    private static volatile bxxk f158932f;

    /* renamed from: a */
    public String f158933a = "";

    /* renamed from: b */
    public int f158934b;

    /* renamed from: c */
    public int f158935c;

    /* renamed from: e */
    private int f158936e;

    static {
        bwdt bwdt = new bwdt();
        f158931d = bwdt;
        GeneratedMessageLite.m124024a(bwdt.class, bwdt);
    }

    private bwdt() {
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
            return GeneratedMessageLite.m124022a(f158931d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new bwdt();
        } else {
            if (i2 == 4) {
                return new bxvd(f158931d);
            }
            if (i2 == 5) {
                return f158931d;
            }
            bxxk bxxk = f158932f;
            if (bxxk == null) {
                synchronized (bwdt.class) {
                    bxxk = f158932f;
                    if (bxxk == null) {
                        bxxk = new bxve(f158931d);
                        f158932f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
