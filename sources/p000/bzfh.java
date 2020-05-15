package p000;

/* renamed from: bzfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfh extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final bzfh f169799l;

    /* renamed from: m */
    private static volatile bxxk f169800m;

    /* renamed from: a */
    public int f169801a;

    /* renamed from: b */
    public String f169802b = "";

    /* renamed from: c */
    public String f169803c = "";

    /* renamed from: d */
    public String f169804d = "";

    /* renamed from: e */
    public String f169805e = "";

    /* renamed from: f */
    public String f169806f = "";

    /* renamed from: g */
    public bzgt f169807g;

    /* renamed from: h */
    public String f169808h = "";

    /* renamed from: i */
    public String f169809i = "";

    /* renamed from: j */
    public String f169810j = "";

    /* renamed from: k */
    public String f169811k = "";

    static {
        bzfh bzfh = new bzfh();
        f169799l = bzfh;
        GeneratedMessageLite.m124024a(bzfh.class, bzfh);
    }

    private bzfh() {
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
            return GeneratedMessageLite.m124022a(f169799l, "\u0001\n\u0000\u0001\u0002\f\n\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0007ဈ\u0004\bဉ\u0005\tဈ\u0006\nဈ\u0007\u000bဈ\b\fဈ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new bzfh();
        } else {
            if (i2 == 4) {
                return new bxvd(f169799l);
            }
            if (i2 == 5) {
                return f169799l;
            }
            bxxk bxxk = f169800m;
            if (bxxk == null) {
                synchronized (bzfh.class) {
                    bxxk = f169800m;
                    if (bxxk == null) {
                        bxxk = new bxve(f169799l);
                        f169800m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
