package p000;

/* renamed from: bwso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwso extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bwso f160893d;

    /* renamed from: e */
    public static final bxvj f160894e;

    /* renamed from: f */
    private static volatile bxxk f160895f;

    /* renamed from: a */
    public int f160896a;

    /* renamed from: b */
    public String f160897b = "";

    /* renamed from: c */
    public String f160898c = "";

    static {
        bwso bwso = new bwso();
        f160893d = bwso;
        GeneratedMessageLite.m124024a(bwso.class, bwso);
        bwny bwny = bwny.f160414k;
        bwso bwso2 = f160893d;
        f160894e = GeneratedMessageLite.m124006a(bwny, bwso2, bwso2, 232946268, bxzf.MESSAGE);
    }

    private bwso() {
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
            return GeneratedMessageLite.m124022a(f160893d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwso();
        } else {
            if (i2 == 4) {
                return new bxvd(f160893d);
            }
            if (i2 == 5) {
                return f160893d;
            }
            bxxk bxxk = f160895f;
            if (bxxk == null) {
                synchronized (bwso.class) {
                    bxxk = f160895f;
                    if (bxxk == null) {
                        bxxk = new bxve(f160893d);
                        f160895f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
