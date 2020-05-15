package p000;

/* renamed from: brch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brch extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bxvu f142365g = new brcg();

    /* renamed from: k */
    public static final brch f142366k;

    /* renamed from: m */
    private static volatile bxxk f142367m;

    /* renamed from: a */
    public int f142368a;

    /* renamed from: b */
    public String f142369b = "";

    /* renamed from: c */
    public int f142370c;

    /* renamed from: d */
    public brci f142371d;

    /* renamed from: e */
    public String f142372e = "";

    /* renamed from: f */
    public bxvt f142373f = bxvm.f164965b;

    /* renamed from: h */
    public brdw f142374h;

    /* renamed from: i */
    public breh f142375i;

    /* renamed from: j */
    public brdv f142376j;

    /* renamed from: l */
    private byte f142377l = 2;

    static {
        brch brch = new brch();
        f142366k = brch;
        bxvk.m124024a(brch.class, brch);
    }

    private brch() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f142377l);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f142377l = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f142366k, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဌ\u0002\u0004ဉ\u0003\u0006ဈ\u0005\u0007\u001e\bဉ\u0006\nဉ\b\u000bဉ\t", new Object[]{"a", "b", "c", brcm.m113876b(), "d", "e", "f", brcm.m113876b(), "h", "i", "j"});
        } else if (i2 == 3) {
            return new brch();
        } else {
            if (i2 == 4) {
                return new bxvd(f142366k);
            }
            if (i2 == 5) {
                return f142366k;
            }
            bxxk bxxk = f142367m;
            if (bxxk == null) {
                synchronized (brch.class) {
                    bxxk = f142367m;
                    if (bxxk == null) {
                        bxxk = new bxve(f142366k);
                        f142367m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
