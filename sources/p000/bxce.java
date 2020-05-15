package p000;

/* renamed from: bxce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxce extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bxce f162766k;

    /* renamed from: m */
    private static volatile bxxk f162767m;

    /* renamed from: a */
    public int f162768a;

    /* renamed from: b */
    public String f162769b = "";

    /* renamed from: c */
    public bxcp f162770c;

    /* renamed from: d */
    public int f162771d;

    /* renamed from: e */
    public int f162772e;

    /* renamed from: f */
    public int f162773f;

    /* renamed from: g */
    public bxeu f162774g;

    /* renamed from: h */
    public bxcf f162775h;

    /* renamed from: i */
    public bxwc f162776i = bxxn.f165040b;

    /* renamed from: j */
    public bxdj f162777j;

    /* renamed from: l */
    private byte f162778l = 2;

    static {
        bxce bxce = new bxce();
        f162766k = bxce;
        GeneratedMessageLite.m124024a(bxce.class, bxce);
    }

    private bxce() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f162778l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f162778l = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f162766k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bᐉ\u0006\t\u001a\nဉ\u0007", new Object[]{"a", "b", "c", "d", bxcg.f162782a, "e", bxco.m122578b(), "f", bxcc.f162765a, "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bxce();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f162766k;
            }
            bxxk bxxk = f162767m;
            if (bxxk == null) {
                synchronized (bxce.class) {
                    bxxk = f162767m;
                    if (bxxk == null) {
                        bxxk = new bxve(f162766k);
                        f162767m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
