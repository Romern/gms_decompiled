package p000;

/* renamed from: ayue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayue extends bxvk implements bxxd {

    /* renamed from: f */
    public static final ayue f98506f;

    /* renamed from: h */
    private static volatile bxxk f98507h;

    /* renamed from: a */
    public int f98508a;

    /* renamed from: b */
    public ayud f98509b;

    /* renamed from: c */
    public ayuc f98510c;

    /* renamed from: d */
    public ayub f98511d;

    /* renamed from: e */
    public ayua f98512e;

    /* renamed from: g */
    private byte f98513g = 2;

    static {
        ayue ayue = new ayue();
        f98506f = ayue;
        bxvk.m124024a(ayue.class, ayue);
    }

    private ayue() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f98513g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f98513g = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f98506f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ayue();
        } else {
            if (i2 == 4) {
                return new bxvd(f98506f);
            }
            if (i2 == 5) {
                return f98506f;
            }
            bxxk bxxk = f98507h;
            if (bxxk == null) {
                synchronized (ayue.class) {
                    bxxk = f98507h;
                    if (bxxk == null) {
                        bxxk = new bxve(f98506f);
                        f98507h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
