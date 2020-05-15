package p000;

/* renamed from: qhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhf extends GeneratedMessageLite implements bxxd {

    /* renamed from: r */
    public static final qhf f41317r;

    /* renamed from: s */
    private static volatile bxxk f41318s;

    /* renamed from: a */
    public int f41319a;

    /* renamed from: b */
    public String f41320b = "";

    /* renamed from: c */
    public String f41321c = "";

    /* renamed from: d */
    public String f41322d = "";

    /* renamed from: e */
    public String f41323e = "";

    /* renamed from: f */
    public String f41324f = "";

    /* renamed from: g */
    public String f41325g = "";

    /* renamed from: h */
    public long f41326h;

    /* renamed from: i */
    public int f41327i;

    /* renamed from: j */
    public int f41328j;

    /* renamed from: k */
    public String f41329k = "";

    /* renamed from: l */
    public String f41330l = "";

    /* renamed from: m */
    public String f41331m = "";

    /* renamed from: n */
    public String f41332n = "";

    /* renamed from: o */
    public boolean f41333o;

    /* renamed from: p */
    public bxwc f41334p = bxxn.f165040b;

    /* renamed from: q */
    public String f41335q;

    static {
        qhf qhf = new qhf();
        f41317r = qhf;
        GeneratedMessageLite.m124024a(qhf.class, qhf);
    }

    private qhf() {
        ByteString bxtx = bxtx.f164797b;
        this.f41335q = "";
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
            return GeneratedMessageLite.m124022a(f41317r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဈ\u0005\u0007ဂ\u0006\bင\u0007\tဈ\t\nင\b\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဇ\r\u000f\u001b\u0013ဈ\u0010", new Object[]{"a", "b", "e", "f", "c", "d", "g", "h", "i", "k", "j", "l", "m", "n", "o", "p", qhr.class, "q"});
        } else if (i2 == 3) {
            return new qhf();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f41317r;
            }
            bxxk bxxk = f41318s;
            if (bxxk == null) {
                synchronized (qhf.class) {
                    bxxk = f41318s;
                    if (bxxk == null) {
                        bxxk = new bxve(f41317r);
                        f41318s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
