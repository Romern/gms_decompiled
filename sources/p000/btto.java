package p000;

/* renamed from: btto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btto extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btto f150366f;

    /* renamed from: g */
    private static volatile bxxk f150367g;

    /* renamed from: a */
    public int f150368a;

    /* renamed from: b */
    public btse f150369b;

    /* renamed from: c */
    public bxwc f150370c = bxxn.f165040b;

    /* renamed from: d */
    public String f150371d = "";

    /* renamed from: e */
    public bxvt f150372e = bxvm.f164965b;

    static {
        btto btto = new btto();
        f150366f = btto;
        GeneratedMessageLite.m124024a(btto.class, btto);
    }

    private btto() {
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
            return GeneratedMessageLite.m124022a(f150366f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0004ဈ\u0002\u0005\u001e", new Object[]{"a", "b", "c", bttk.class, "d", "e", bttr.m117132b()});
        } else if (i2 == 3) {
            return new btto();
        } else {
            if (i2 == 4) {
                return new bttn();
            }
            if (i2 == 5) {
                return f150366f;
            }
            bxxk bxxk = f150367g;
            if (bxxk == null) {
                synchronized (btto.class) {
                    bxxk = f150367g;
                    if (bxxk == null) {
                        bxxk = new bxve(f150366f);
                        f150367g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
