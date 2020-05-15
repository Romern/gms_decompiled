package p000;

/* renamed from: bloz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bloz extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final bloz f127169m;

    /* renamed from: o */
    private static volatile bxxk f127170o;

    /* renamed from: a */
    public int f127171a;

    /* renamed from: b */
    public blpd f127172b;

    /* renamed from: c */
    public blpf f127173c;

    /* renamed from: d */
    public blph f127174d;

    /* renamed from: e */
    public blpo f127175e;

    /* renamed from: f */
    public blpm f127176f;

    /* renamed from: g */
    public blpu f127177g;

    /* renamed from: h */
    public blps f127178h;

    /* renamed from: i */
    public blql f127179i;

    /* renamed from: j */
    public blqn f127180j;

    /* renamed from: k */
    public blru f127181k;

    /* renamed from: l */
    public blro f127182l;

    /* renamed from: n */
    private byte f127183n = 2;

    static {
        bloz bloz = new bloz();
        f127169m = bloz;
        GeneratedMessageLite.m124024a(bloz.class, bloz);
    }

    private bloz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127183n);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127183n = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127169m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\b\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bloz();
        } else {
            if (i2 == 4) {
                return new bxvd(f127169m);
            }
            if (i2 == 5) {
                return f127169m;
            }
            bxxk bxxk = f127170o;
            if (bxxk == null) {
                synchronized (bloz.class) {
                    bxxk = f127170o;
                    if (bxxk == null) {
                        bxxk = new bxve(f127169m);
                        f127170o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
