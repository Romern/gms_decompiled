package p000;

/* renamed from: bwht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwht extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwht f159561d;

    /* renamed from: f */
    private static volatile bxxk f159562f;

    /* renamed from: a */
    public int f159563a = 0;

    /* renamed from: b */
    public Object f159564b;

    /* renamed from: c */
    public String f159565c = "";

    /* renamed from: e */
    private int f159566e;

    static {
        bwht bwht = new bwht();
        f159561d = bwht;
        GeneratedMessageLite.m124024a(bwht.class, bwht);
    }

    private bwht() {
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
            return GeneratedMessageLite.m124022a(f159561d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ွ\u0000\u0003ျ\u0000", new Object[]{"b", "a", "e", "c"});
        } else if (i2 == 3) {
            return new bwht();
        } else {
            if (i2 == 4) {
                return new bxvd(f159561d);
            }
            if (i2 == 5) {
                return f159561d;
            }
            bxxk bxxk = f159562f;
            if (bxxk == null) {
                synchronized (bwht.class) {
                    bxxk = f159562f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159561d);
                        f159562f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
