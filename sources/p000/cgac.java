package p000;

/* renamed from: cgac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgac implements cgab {

    /* renamed from: a */
    public static final bdyx f186229a;

    /* renamed from: b */
    public static final bdyx f186230b;

    /* renamed from: c */
    public static final bdyx f186231c;

    /* renamed from: d */
    public static final bdyx f186232d;

    /* renamed from: e */
    public static final bdyx f186233e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186229a = bdyx.m91607a(bdyw, "MenagerieImagesApiFeature__base_load_remote_image_operation_disabled", 0L);
        f186230b = bdyx.m91607a(bdyw, "MenagerieImagesApiFeature__load_avatar_by_reference_operation_disabled", 0L);
        f186231c = bdyx.m91607a(bdyw, "MenagerieImagesApiFeature__load_avatar_by_url_operation_disabled", 0L);
        f186232d = bdyx.m91610a(bdyw, "MenagerieImagesApiFeature__load_by_reference_disabled_for_cp2_focus_alt", false);
        f186233e = bdyx.m91610a(bdyw, "MenagerieImagesApiFeature__load_by_reference_disabled_for_cp2_raw_contact_id", false);
        bdyx.m91610a(bdyw, "MenagerieImagesApiFeature__load_by_reference_disabled_for_plus_page_profile", false);
        bdyx.m91607a(bdyw, "MenagerieImagesApiFeature__load_contact_image_by_contact_id_operation_disabled", 2L);
        bdyx.m91610a(bdyw, "MenagerieImagesApiFeature__load_people_for_aggregation_operation_disabled", false);
    }

    /* renamed from: a */
    public final long mo83179a() {
        return ((Long) f186229a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo83180b() {
        return ((Long) f186230b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo83181c() {
        return ((Long) f186231c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo83182d() {
        return ((Boolean) f186232d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83183e() {
        return ((Boolean) f186233e.mo58455c()).booleanValue();
    }
}
