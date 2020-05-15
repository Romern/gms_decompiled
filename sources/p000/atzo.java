package p000;

/* renamed from: atzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzo extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final atzo f91267o;

    /* renamed from: p */
    private static volatile bxxk f91268p;

    /* renamed from: a */
    public int f91269a;

    /* renamed from: b */
    public boolean f91270b;

    /* renamed from: c */
    public int f91271c;

    /* renamed from: d */
    public long f91272d;

    /* renamed from: e */
    public String f91273e = "";

    /* renamed from: f */
    public ByteString f91274f = ByteString.f164797b;

    /* renamed from: g */
    public atyp f91275g;

    /* renamed from: h */
    public atyr f91276h;

    /* renamed from: i */
    public bxwc f91277i = bxxn.f165040b;

    /* renamed from: j */
    public atyq f91278j;

    /* renamed from: k */
    public atyk f91279k;

    /* renamed from: l */
    public atyl f91280l;

    /* renamed from: m */
    public atzl f91281m;

    /* renamed from: n */
    public bxwc f91282n = bxxn.f165040b;

    static {
        atzo atzo = new atzo();
        f91267o = atzo;
        GeneratedMessageLite.m124024a(atzo.class, atzo);
    }

    private atzo() {
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
            return GeneratedMessageLite.m124022a(f91267o, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0004\u0004\u0002\u0005Ȉ\u0006\t\u0007\u001b\b\n\t\t\n\t\u000b\t\f\t\r\t\u000e\u001c", new Object[]{"a", "b", "c", "d", "e", "h", "i", atyr.class, "f", "g", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new atzo();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f91267o;
            }
            bxxk bxxk = f91268p;
            if (bxxk == null) {
                synchronized (atzo.class) {
                    bxxk = f91268p;
                    if (bxxk == null) {
                        bxxk = new bxve(f91267o);
                        f91268p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
