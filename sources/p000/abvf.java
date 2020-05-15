package p000;

/* renamed from: abvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvf extends bxvk implements bxxd {

    /* renamed from: h */
    public static final abvf f58519h;

    /* renamed from: i */
    private static volatile bxxk f58520i;

    /* renamed from: a */
    public int f58521a;

    /* renamed from: b */
    public String f58522b = "";

    /* renamed from: c */
    public int f58523c;

    /* renamed from: d */
    public String f58524d = "plain";

    /* renamed from: e */
    public int f58525e = 1;

    /* renamed from: f */
    public bxwc f58526f = bxxn.f165040b;

    /* renamed from: g */
    public acld f58527g;

    static {
        abvf abvf = new abvf();
        f58519h = abvf;
        bxvk.m124024a(abvf.class, abvf);
    }

    private abvf() {
    }

    /* renamed from: a */
    public static bxvd m48320a() {
        return f58519h.mo74144da();
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
            return bxvk.m124022a(f58519h, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0004ဈ\u0002\u0005င\u0003\u0007\u001a\bဉ\u0004\fဌ\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "c", abvd.f58518a});
        } else if (i2 == 3) {
            return new abvf();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f58519h;
            }
            bxxk bxxk = f58520i;
            if (bxxk == null) {
                synchronized (abvf.class) {
                    bxxk = f58520i;
                    if (bxxk == null) {
                        bxxk = new bxve(f58519h);
                        f58520i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
