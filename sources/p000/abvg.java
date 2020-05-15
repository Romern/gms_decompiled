package p000;

/* renamed from: abvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvg extends bxvk implements bxxd {

    /* renamed from: f */
    public static final abvg f58528f;

    /* renamed from: g */
    private static volatile bxxk f58529g;

    /* renamed from: a */
    public int f58530a;

    /* renamed from: b */
    public String f58531b = "";

    /* renamed from: c */
    public int f58532c = Integer.MAX_VALUE;

    /* renamed from: d */
    public bxwc f58533d = bxxn.f165040b;

    /* renamed from: e */
    public int f58534e;

    static {
        abvg abvg = new abvg();
        f58528f = abvg;
        bxvk.m124024a(abvg.class, abvg);
    }

    private abvg() {
    }

    /* renamed from: a */
    public static bxvd m48322a() {
        return f58528f.mo74144da();
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
            return bxvk.m124022a(f58528f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b\u0006ဋ\u0002", new Object[]{"a", "b", "c", "d", abvf.class, "e"});
        } else if (i2 == 3) {
            return new abvg();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f58528f;
            }
            bxxk bxxk = f58529g;
            if (bxxk == null) {
                synchronized (abvg.class) {
                    bxxk = f58529g;
                    if (bxxk == null) {
                        bxxk = new bxve(f58528f);
                        f58529g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
