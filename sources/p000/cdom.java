package p000;

/* renamed from: cdom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdom implements cdol {

    /* renamed from: a */
    public static final bdyx f181432a;

    /* renamed from: b */
    public static final bdyx f181433b;

    /* renamed from: c */
    public static final bdyx f181434c;

    /* renamed from: d */
    public static final bdyx f181435d;

    /* renamed from: e */
    public static final bdyx f181436e;

    /* renamed from: f */
    public static final bdyx f181437f;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
    static {
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58443a();
        f181432a = bdyx.m91610a(a, "ServiceVisibility__checkbox_only", false);
        f181433b = bdyx.m91610a(a, "ServiceVisibility__enable_dark_launch", false);
        f181434c = bdyx.m91610a(a, "ServiceVisibility__enable_full_launch", true);
        f181435d = bdyx.m91609a(a, "ServiceVisibility__packages_common_dark_launch", "");
        f181436e = bdyx.m91605a(a, "ServiceVisibility__sample_rate", 0.0d);
        f181437f = bdyx.m91609a(a, "ServiceVisibility__service_ids_common_full_launch", "124,29,130,167,38,139,28,50,25,43");
    }

    /* renamed from: a */
    public final boolean mo78068a() {
        return ((Boolean) f181432a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78069b() {
        return ((Boolean) f181433b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo78070c() {
        return ((Boolean) f181434c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo78071d() {
        return (String) f181435d.mo58455c();
    }

    /* renamed from: e */
    public final double mo78072e() {
        return ((Double) f181436e.mo58455c()).doubleValue();
    }

    /* renamed from: f */
    public final String mo78073f() {
        return (String) f181437f.mo58455c();
    }
}
