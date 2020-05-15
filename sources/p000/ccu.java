package p000;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: ccu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccu extends Enum {

    /* renamed from: a */
    public static final ccu f6556a = new ccu("PREFER_ARGB_8888", 0);

    /* renamed from: b */
    public static final ccu f6557b;

    /* renamed from: c */
    public static final ccu f6558c;

    /* renamed from: d */
    private static final /* synthetic */ ccu[] f6559d;

    static {
        ccu ccu = new ccu("PREFER_RGB_565", 1);
        f6557b = ccu;
        ccu ccu2 = f6556a;
        f6559d = new ccu[]{ccu2, ccu};
        f6558c = ccu2;
    }

    private ccu(String str, int i) {
    }

    public static ccu[] values() {
        return (ccu[]) f6559d.clone();
    }
}
