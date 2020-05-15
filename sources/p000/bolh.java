package p000;

/* renamed from: bolh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolh extends bxvk implements bxxd {

    /* renamed from: i */
    public static final bolh f133521i;

    /* renamed from: j */
    private static volatile bxxk f133522j;

    /* renamed from: a */
    public int f133523a;

    /* renamed from: b */
    public int f133524b;

    /* renamed from: c */
    public bokv f133525c;

    /* renamed from: d */
    public boolean f133526d;

    /* renamed from: e */
    public int f133527e;

    /* renamed from: f */
    public String f133528f = "";

    /* renamed from: g */
    public long f133529g;

    /* renamed from: h */
    public String f133530h = "";

    static {
        bolh bolh = new bolh();
        f133521i = bolh;
        bxvk.m124024a(bolh.class, bolh);
    }

    private bolh() {
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
            return bxvk.m124022a(f133521i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0006\u0002ဇ\u0002\u0003ဈ\u0004\u0004ဂ\u0005\u0006င\u0003\u0007ဌ\u0000\bဉ\u0001", new Object[]{"a", "h", "d", "f", "g", "e", "b", bolg.f133520a, "c"});
        } else if (i2 == 3) {
            return new bolh();
        } else {
            if (i2 == 4) {
                return new bxvd(f133521i);
            }
            if (i2 == 5) {
                return f133521i;
            }
            bxxk bxxk = f133522j;
            if (bxxk == null) {
                synchronized (bolh.class) {
                    bxxk = f133522j;
                    if (bxxk == null) {
                        bxxk = new bxve(f133521i);
                        f133522j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
