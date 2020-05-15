package p000;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: bctk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bctk extends Enum {

    /* renamed from: a */
    public static final bctk f104858a = new bctk("INVALID", 0, 0);

    /* renamed from: b */
    public static final bctk f104859b = new bctk("INCOMING_RECEIVED", 1, 1);

    /* renamed from: c */
    public static final bctk f104860c = new bctk("INCOMING_READ", 2, 2);

    /* renamed from: d */
    public static final bctk f104861d = new bctk("INCOMING_READ_RECEIPT_SENT", 3, 3);

    /* renamed from: e */
    public static final bctk f104862e = new bctk("OUTGOING_PENDING_SEND", 4, 4);

    /* renamed from: f */
    public static final bctk f104863f = new bctk("OUTGOING_SENDING", 5, 5);

    /* renamed from: g */
    public static final bctk f104864g = new bctk("OUTGOING_FAILED_SEND", 6, 6);

    /* renamed from: h */
    public static final bctk f104865h = new bctk("OUTGOING_SENT", 7, 7);

    /* renamed from: i */
    public static final bctk f104866i = new bctk("OUTGOING_DELIVERED", 8, 8);

    /* renamed from: j */
    public static final bctk f104867j = new bctk("OUTGOING_READ", 9, 9);

    /* renamed from: k */
    public static final bctk f104868k = new bctk("OUTGOING_FAILED_TO_DELIVER", 10, 10);

    /* renamed from: l */
    public static final bctk f104869l;

    /* renamed from: n */
    private static final /* synthetic */ bctk[] f104870n;

    /* renamed from: m */
    public final int f104871m;

    static {
        bctk bctk = new bctk("LOCAL", 11, 11);
        f104869l = bctk;
        bctk bctk2 = f104862e;
        f104870n = new bctk[]{f104858a, f104859b, f104860c, f104861d, bctk2, f104863f, f104864g, f104865h, f104866i, f104867j, f104868k, bctk};
        Integer[] numArr = {Integer.valueOf(bctk2.f104871m), Integer.valueOf(f104863f.f104871m), Integer.valueOf(f104864g.f104871m), Integer.valueOf(f104869l.f104871m)};
    }

    private bctk(String str, int i, int i2) {
        this.f104871m = i2;
    }

    /* renamed from: a */
    public static bctk m89929a(int i) {
        return (bctk) bnfi.m109237a(values()).mo67507c(new bctj(i)).mo66812a(f104858a);
    }

    public static bctk[] values() {
        return (bctk[]) f104870n.clone();
    }
}
