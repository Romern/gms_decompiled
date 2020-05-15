package p000;

/* renamed from: cgcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgcu implements cgcs {

    /* renamed from: a */
    public static final bdyx f186576a;

    /* renamed from: b */
    public static final bdyx f186577b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    static {
        bdyw a = new bdyw("direct_boot:com.google.android.gms.phenotype").mo58445a("gms:phenotype:");
        try {
            f186576a = bdyx.m91608a(a, "DirectBoot__direct_boot_aware_packages", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 32, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 104, 101, 110, 111, 116, 121, 112, 101, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 103, 99, 109, 10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 115, 99, 111, 110, 101, 10, 38, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 99, 108, 101, 97, 114, 99, 117, 116, 46, 112, 117, 98, 108, 105, 99, 10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 108, 97, 121, 108, 111, 103, 46, 117, 112, 108, 111, 97, 100, 101, 114}), cgct.f186575a);
            f186577b = bdyx.m91610a(a, "DirectBoot__enable_direct_boot", true);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"DirectBoot__direct_boot_aware_packages\"");
        }
    }

    /* renamed from: a */
    public final bydj mo83499a() {
        return (bydj) f186576a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo83500b() {
        return ((Boolean) f186577b.mo58455c()).booleanValue();
    }
}
