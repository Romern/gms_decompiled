package p000;

/* renamed from: bwmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmj extends bxvg implements bxvh {

    /* renamed from: a */
    public static final bwmj f160280a;

    /* renamed from: c */
    private static volatile bxxk f160281c;

    /* renamed from: b */
    private byte f160282b = 2;

    static {
        bwmj bwmj = new bwmj();
        f160280a = bwmj;
        GeneratedMessageLite.m124024a(bwmj.class, bwmj);
    }

    private bwmj() {
        ByteString bxtx = bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f160282b);
        }
        byte b = 1;
        if (i2 == 1) {
            if (obj == null) {
                b = 0;
            }
            this.f160282b = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f160280a, "\u0001\u0000", (Object[]) null);
        } else {
            if (i2 == 3) {
                return new bwmj();
            }
            if (i2 == 4) {
                return new bxvf(f160280a);
            }
            if (i2 == 5) {
                return f160280a;
            }
            bxxk bxxk = f160281c;
            if (bxxk == null) {
                synchronized (bwmj.class) {
                    bxxk = f160281c;
                    if (bxxk == null) {
                        bxxk = new bxve(f160280a);
                        f160281c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
