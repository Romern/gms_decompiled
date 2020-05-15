package p000;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: binq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class binq extends Enum {

    /* renamed from: a */
    public static final binq f121026a = new binq("HIDDEN", 0, 0.0f);

    /* renamed from: b */
    public static final binq f121027b = new binq("COLLAPSED", 1, 25.0f);

    /* renamed from: c */
    public static final binq f121028c = new binq("EXPANDED", 2, 75.0f);

    /* renamed from: d */
    public static final binq f121029d;

    /* renamed from: h */
    private static final /* synthetic */ binq[] f121030h;

    /* renamed from: e */
    binq f121031e;

    /* renamed from: f */
    public binq f121032f;

    /* renamed from: g */
    public final float f121033g;

    static {
        binq binq = new binq("FULLY_EXPANDED", 3, 100.0f);
        f121029d = binq;
        binq binq2 = f121026a;
        binq binq3 = f121027b;
        binq binq4 = f121028c;
        f121030h = new binq[]{binq2, binq3, binq4, binq};
        binq2.f121031e = binq2;
        binq2.f121032f = binq2;
        binq3.f121031e = binq3;
        binq3.f121032f = binq4;
        binq4.f121031e = binq3;
        binq4.f121032f = binq;
        binq.f121031e = binq4;
        binq.f121032f = binq;
    }

    private binq(String str, int i, float f) {
        this.f121033g = f;
    }

    /* renamed from: a */
    public static binq m102623a(String str) {
        return (binq) Enum.valueOf(binq.class, str);
    }

    public static binq[] values() {
        return (binq[]) f121030h.clone();
    }
}
