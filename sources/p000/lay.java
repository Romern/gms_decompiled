package p000;

/* renamed from: lay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lay extends bxvk implements bxxd {

    /* renamed from: r */
    public static final lay f25638r;

    /* renamed from: s */
    private static volatile bxxk f25639s;

    /* renamed from: a */
    public lap f25640a;

    /* renamed from: b */
    public lag f25641b;

    /* renamed from: c */
    public lav f25642c;

    /* renamed from: d */
    public lau f25643d;

    /* renamed from: e */
    public kzy f25644e;

    /* renamed from: f */
    public lad f25645f;

    /* renamed from: g */
    public lar f25646g;

    /* renamed from: h */
    public laq f25647h;

    /* renamed from: i */
    public lan f25648i;

    /* renamed from: j */
    public lai f25649j;

    /* renamed from: k */
    public laj f25650k;

    /* renamed from: l */
    public lah f25651l;

    /* renamed from: m */
    public lak f25652m;

    /* renamed from: n */
    public las f25653n;

    /* renamed from: o */
    public lax f25654o;

    /* renamed from: p */
    public law f25655p;

    /* renamed from: q */
    public lab f25656q;

    static {
        lay lay = new lay();
        f25638r = lay;
        bxvk.m124024a(lay.class, lay);
    }

    private lay() {
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
            return bxvk.m124022a(f25638r, "\u0000\u0011\u0000\u0000\u0001\u0015\u0011\u0000\u0000\u0000\u0001\t\u0002\t\u0005\t\u0006\t\u0007\t\b\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0011\t\u0013\t\u0014\t\u0015\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i2 == 3) {
            return new lay();
        } else {
            if (i2 == 4) {
                return new bxvd(f25638r);
            }
            if (i2 == 5) {
                return f25638r;
            }
            bxxk bxxk = f25639s;
            if (bxxk == null) {
                synchronized (lay.class) {
                    bxxk = f25639s;
                    if (bxxk == null) {
                        bxxk = new bxve(f25638r);
                        f25639s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
