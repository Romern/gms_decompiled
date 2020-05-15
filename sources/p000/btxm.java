package p000;

/* renamed from: btxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btxm extends GeneratedMessageLite implements bxxd {

    /* renamed from: q */
    public static final btxm f152814q;

    /* renamed from: r */
    private static volatile bxxk f152815r;

    /* renamed from: a */
    public int f152816a;

    /* renamed from: b */
    public btxs f152817b;

    /* renamed from: c */
    public btxt f152818c;

    /* renamed from: d */
    public btys f152819d;

    /* renamed from: e */
    public btxu f152820e;

    /* renamed from: f */
    public btyu f152821f;

    /* renamed from: g */
    public btxr f152822g;

    /* renamed from: h */
    public btyn f152823h;

    /* renamed from: i */
    public btyh f152824i;

    /* renamed from: j */
    public btxo f152825j;

    /* renamed from: k */
    public btxv f152826k;

    /* renamed from: l */
    public btxl f152827l;

    /* renamed from: m */
    public btyk f152828m;

    /* renamed from: n */
    public btzg f152829n;

    /* renamed from: o */
    public btyw f152830o;

    /* renamed from: p */
    public btyv f152831p;

    static {
        btxm btxm = new btxm();
        f152814q = btxm;
        GeneratedMessageLite.m124024a(btxm.class, btxm);
    }

    private btxm() {
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
            return GeneratedMessageLite.m124022a(f152814q, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        } else if (i2 == 3) {
            return new btxm();
        } else {
            if (i2 == 4) {
                return new bxvd(f152814q);
            }
            if (i2 == 5) {
                return f152814q;
            }
            bxxk bxxk = f152815r;
            if (bxxk == null) {
                synchronized (btxm.class) {
                    bxxk = f152815r;
                    if (bxxk == null) {
                        bxxk = new bxve(f152814q);
                        f152815r = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
