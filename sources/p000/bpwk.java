package p000;

/* renamed from: bpwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bpwk f139513f;

    /* renamed from: h */
    private static volatile bxxk f139514h;

    /* renamed from: a */
    public int f139515a;

    /* renamed from: b */
    public String f139516b = "";

    /* renamed from: c */
    public String f139517c = "";

    /* renamed from: d */
    public String f139518d = "";

    /* renamed from: e */
    public int f139519e;

    /* renamed from: g */
    private byte f139520g = 2;

    static {
        bpwk bpwk = new bpwk();
        f139513f = bpwk;
        GeneratedMessageLite.m124024a(bpwk.class, bpwk);
    }

    private bpwk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f139520g);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f139520g = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f139513f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpwk();
        } else {
            if (i2 == 4) {
                return new bxvd(f139513f);
            }
            if (i2 == 5) {
                return f139513f;
            }
            bxxk bxxk = f139514h;
            if (bxxk == null) {
                synchronized (bpwk.class) {
                    bxxk = f139514h;
                    if (bxxk == null) {
                        bxxk = new bxve(f139513f);
                        f139514h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
