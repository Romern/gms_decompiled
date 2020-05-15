package p000;

/* renamed from: cblp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblp extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cblp f177545f;

    /* renamed from: g */
    private static volatile bxxk f177546g;

    /* renamed from: a */
    public cbmo f177547a;

    /* renamed from: b */
    public bxwc f177548b = bxxn.f165040b;

    /* renamed from: c */
    public String f177549c = "";

    /* renamed from: d */
    public cbld f177550d;

    /* renamed from: e */
    public boolean f177551e;

    static {
        cblp cblp = new cblp();
        f177545f = cblp;
        GeneratedMessageLite.m124024a(cblp.class, cblp);
    }

    private cblp() {
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
            return GeneratedMessageLite.m124022a(f177545f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003Ȉ\u0004\t\u0006\u0007", new Object[]{"a", "b", cbmr.class, "c", "d", "e"});
        } else if (i2 == 3) {
            return new cblp();
        } else {
            if (i2 == 4) {
                return new bxvd((char[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f177545f;
            }
            bxxk bxxk = f177546g;
            if (bxxk == null) {
                synchronized (cblp.class) {
                    bxxk = f177546g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177545f);
                        f177546g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
