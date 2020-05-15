package p000;

/* renamed from: wzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzx extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final wzx f51658f;

    /* renamed from: g */
    private static volatile bxxk f51659g;

    /* renamed from: a */
    public int f51660a;

    /* renamed from: b */
    public String f51661b = "";

    /* renamed from: c */
    public bxwc f51662c = bxxn.f165040b;

    /* renamed from: d */
    public int f51663d;

    /* renamed from: e */
    public String f51664e = "";

    static {
        wzx wzx = new wzx();
        f51658f = wzx;
        GeneratedMessageLite.m124024a(wzx.class, wzx);
    }

    private wzx() {
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
            return GeneratedMessageLite.m124022a(f51658f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003င\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", wzw.class, "d", "e"});
        } else if (i2 == 3) {
            return new wzx();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f51658f;
            }
            bxxk bxxk = f51659g;
            if (bxxk == null) {
                synchronized (wzx.class) {
                    bxxk = f51659g;
                    if (bxxk == null) {
                        bxxk = new bxve(f51658f);
                        f51659g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
