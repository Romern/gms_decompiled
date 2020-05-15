package p000;

/* renamed from: bwym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwym extends GeneratedMessageLite implements bxxd {

    /* renamed from: n */
    public static final bwym f161484n;

    /* renamed from: o */
    private static volatile bxxk f161485o;

    /* renamed from: a */
    public int f161486a;

    /* renamed from: b */
    public int f161487b;

    /* renamed from: c */
    public bwya f161488c;

    /* renamed from: d */
    public int f161489d;

    /* renamed from: e */
    public int f161490e;

    /* renamed from: f */
    public bwya f161491f;

    /* renamed from: g */
    public float f161492g;

    /* renamed from: h */
    public bwyj f161493h;

    /* renamed from: i */
    public bwyj f161494i;

    /* renamed from: j */
    public bwyj f161495j;

    /* renamed from: k */
    public bwyj f161496k;

    /* renamed from: l */
    public int f161497l;

    /* renamed from: m */
    public int f161498m;

    static {
        bwym bwym = new bwym();
        f161484n = bwym;
        GeneratedMessageLite.m124024a(bwym.class, bwym);
    }

    private bwym() {
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
            return GeneratedMessageLite.m124022a(f161484n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0002\u0003ဋ\u0003\u0004ဌ\u0004\u0005ဉ\u0005\u0006ခ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဋ\u000b\rဌ\f", new Object[]{"a", "b", "c", "d", "e", bwyc.m122424b(), "f", "g", "h", "i", "j", "k", "l", "m", bwyl.m122441b()});
        } else if (i2 == 3) {
            return new bwym();
        } else {
            if (i2 == 4) {
                return new bxvd(f161484n);
            }
            if (i2 == 5) {
                return f161484n;
            }
            bxxk bxxk = f161485o;
            if (bxxk == null) {
                synchronized (bwym.class) {
                    bxxk = f161485o;
                    if (bxxk == null) {
                        bxxk = new bxve(f161484n);
                        f161485o = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
