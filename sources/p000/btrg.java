package p000;

/* renamed from: btrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btrg extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final btrg f150089i;

    /* renamed from: j */
    private static volatile bxxk f150090j;

    /* renamed from: a */
    public String f150091a = "";

    /* renamed from: b */
    public bxyk f150092b;

    /* renamed from: c */
    public btnd f150093c;

    /* renamed from: d */
    public int f150094d;

    /* renamed from: e */
    public btrb f150095e;

    /* renamed from: f */
    public btqt f150096f;

    /* renamed from: g */
    public String f150097g = "";

    /* renamed from: h */
    public int f150098h;

    static {
        btrg btrg = new btrg();
        f150089i = btrg;
        GeneratedMessageLite.m124024a(btrg.class, btrg);
    }

    private btrg() {
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
            return GeneratedMessageLite.m124022a(f150089i, "\u0000\b\u0000\u0000\u0001\u0012\b\u0000\u0000\u0000\u0001Ȉ\u0003\t\u0004\t\u0005\f\t\t\f\t\u0011Ȉ\u0012\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new btrg();
        } else {
            if (i2 == 4) {
                return new bxvd(f150089i);
            }
            if (i2 == 5) {
                return f150089i;
            }
            bxxk bxxk = f150090j;
            if (bxxk == null) {
                synchronized (btrg.class) {
                    bxxk = f150090j;
                    if (bxxk == null) {
                        bxxk = new bxve(f150089i);
                        f150090j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
