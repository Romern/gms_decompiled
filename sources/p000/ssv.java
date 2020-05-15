package p000;

/* renamed from: ssv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssv {
    /* renamed from: a */
    public static String m36267a(String str) {
        return String.format("com.google.android.gms.phenotype.%s.COMMITTED", str);
    }

    /* renamed from: b */
    public static String m36268b(String str) {
        return ((str.hashCode() == 325967270 && str.equals("com.google.android.gms")) ? (char) 0 : 65535) != 0 ? String.valueOf(str).concat("_ph_flags") : "direct_boot:gms_chimera_phenotype_flags";
    }
}
