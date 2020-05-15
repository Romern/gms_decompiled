package p000;

/* renamed from: bdvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdvw {
    /* renamed from: a */
    public static boolean m91500a(chus chus) {
        int ordinal = chus.ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 14 || ordinal == 16;
    }

    /* renamed from: a */
    public static boolean m91501a(Exception exc) {
        chuv chuv;
        chus chus;
        chus chus2;
        if (exc instanceof chuw) {
            chuv chuv2 = ((chuw) exc).f189236a;
            if (chuv2 == null || (chus2 = chuv2.f189233s) == null) {
                return false;
            }
            return m91500a(chus2);
        } else if (!(exc instanceof chux) || (chuv = ((chux) exc).f189238a) == null || (chus = chuv.f189233s) == null) {
            return false;
        } else {
            return m91500a(chus);
        }
    }
}
