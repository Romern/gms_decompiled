package p000;

/* renamed from: bjba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjba {
    /* renamed from: a */
    public static boolean m103134a(String str) {
        if ("holo_light".equals(str) || "material_light".equals(str) || "glif_light".equals(str) || "glif_v2_light".equals(str) || "glif_v3_light".equals(str)) {
            return true;
        }
        if ("holo".equals(str) || "material".equals(str) || "glif".equals(str) || "glif_v2".equals(str) || "glif_v3".equals(str)) {
            return false;
        }
        return true;
    }
}
