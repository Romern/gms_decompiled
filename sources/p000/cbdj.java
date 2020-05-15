package p000;

/* renamed from: cbdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbdj extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final cbdj f176740j;

    /* renamed from: k */
    private static volatile bxxk f176741k;

    /* renamed from: a */
    public int f176742a = 0;

    /* renamed from: b */
    public Object f176743b;

    /* renamed from: c */
    public int f176744c = 0;

    /* renamed from: d */
    public Object f176745d;

    /* renamed from: e */
    public String f176746e = "";

    /* renamed from: f */
    public cbds f176747f;

    /* renamed from: g */
    public long f176748g;

    /* renamed from: h */
    public int f176749h;

    /* renamed from: i */
    public int f176750i;

    static {
        cbdj cbdj = new cbdj();
        f176740j = cbdj;
        GeneratedMessageLite.m124024a(cbdj.class, cbdj);
    }

    private cbdj() {
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
            return GeneratedMessageLite.m124022a(f176740j, "\u0000\f\u0002\u0000\u0002É\f\u0000\u0000\u0000\u0002\f\u0003Ȉ\u0004\t\u0005\u0002\u0006\fe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000É<\u0001", new Object[]{"b", "a", "d", "c", "h", "e", "f", "g", "i", cbed.class, cbdg.class, cbeg.class, cbeb.class, cbdf.class, cbee.class, cbee.class});
        } else if (i2 == 3) {
            return new cbdj();
        } else {
            if (i2 == 4) {
                return new bxvd(f176740j);
            }
            if (i2 == 5) {
                return f176740j;
            }
            bxxk bxxk = f176741k;
            if (bxxk == null) {
                synchronized (cbdj.class) {
                    bxxk = f176741k;
                    if (bxxk == null) {
                        bxxk = new bxve(f176740j);
                        f176741k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
