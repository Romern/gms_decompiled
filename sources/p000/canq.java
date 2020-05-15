package p000;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: canq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canq extends Enum {

    /* renamed from: a */
    public static final canq f175393a = new canq("L", 0, 1);

    /* renamed from: b */
    public static final canq f175394b = new canq("M", 1, 0);

    /* renamed from: c */
    public static final canq f175395c = new canq("Q", 2, 3);

    /* renamed from: d */
    public static final canq f175396d;

    /* renamed from: f */
    private static final /* synthetic */ canq[] f175397f;

    /* renamed from: e */
    public final int f175398e;

    static {
        canq canq = new canq("H", 3, 2);
        f175396d = canq;
        canq canq2 = f175393a;
        canq canq3 = f175394b;
        canq canq4 = f175395c;
        f175397f = new canq[]{canq2, canq3, canq4, canq};
        canq[] canqArr = {canq3, canq2, canq, canq4};
    }

    private canq(String str, int i, int i2) {
        this.f175398e = i2;
    }

    public static canq[] values() {
        return (canq[]) f175397f.clone();
    }
}
