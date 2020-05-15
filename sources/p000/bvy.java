package p000;

/* renamed from: bvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvy extends bwz {

    /* renamed from: a */
    public static final byte[] f5830a = {-123};

    /* renamed from: b */
    public static final byte[] f5831b = new byte[1];

    /* renamed from: c */
    public static final bzu f5832c;

    /* renamed from: d */
    public static final int f5833d = 3;

    static {
        bzv bzv = new bzv();
        bzv.f6286a = "DR (Derivation Random)";
        bzv.f6287b = "Conditional, used only if ePK/eSK are not generated per transaction but generated once.";
        bzv.f6293h = f5833d;
        bzv.f6288c = f5830a;
        f5832c = bzv.mo3629a();
    }

    protected bvy(byte[] bArr) {
        super(bArr, f5832c);
    }
}
