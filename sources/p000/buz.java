package p000;

/* renamed from: buz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buz extends bwz {

    /* renamed from: a */
    public static final byte[] f5761a = {-33, 26};

    /* renamed from: b */
    public static final byte[] f5762b = {0, 0, 0, 0, 0, 0};

    /* renamed from: c */
    public static final bzx f5763c = bzx.BOTH;

    /* renamed from: d */
    public static final bzu f5764d;

    /* renamed from: e */
    public static final int f5765e = 1;

    /* renamed from: f */
    public static final int f5766f = 1;

    /* renamed from: g */
    public static final int f5767g = 3;

    /* renamed from: h */
    public static final int f5768h = 3;

    /* renamed from: i */
    public static final int f5769i = 5;

    /* renamed from: j */
    public static final int f5770j = 1;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "Total Unauthenticated Spend Amount";
        bzv.f6287b = "Tracks total spend since last successful Passcode check.  Amount stored incard's riscManagement and reset after successful passcode validation";
        bzv.f6293h = f5765e;
        bzv.f6294i = f5766f;
        bzv.f6290e = f5763c;
        bzv.f6289d = 6;
        bzv.f6288c = f5761a;
        bzv.f6295j = f5767g;
        bzv.f6296k = f5768h;
        bzv.f6297l = f5770j;
        bzv.f6298m = f5769i;
        f5764d = bzv.mo3629a();
    }

    public buz(byte[] bArr) {
        super(bArr, f5764d);
    }

    /* renamed from: a */
    public final long mo3532a() {
        try {
            return Long.parseLong(cbm.m3893a(mo3563i()));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
