package p000;

/* renamed from: ccje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccje implements ccjd {

    /* renamed from: a */
    public static final bdyx f179142a;

    /* renamed from: b */
    public static final bdyx f179143b;

    /* renamed from: c */
    public static final bdyx f179144c;

    /* renamed from: d */
    public static final bdyx f179145d;

    /* renamed from: e */
    public static final bdyx f179146e;

    /* renamed from: f */
    public static final bdyx f179147f;

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
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        bdyx.m91609a(bdyw, "CrowdsourcingPipeline__data_download_url", "http://clients1.google.com/tbproxy/af/csdata");
        f179142a = bdyx.m91610a(bdyw, "CrowdsourcingPipeline__detection_enabled", false);
        f179143b = bdyx.m91610a(bdyw, "CrowdsourcingPipeline__duplicate_values_for_different_fields_enabled", false);
        f179144c = bdyx.m91610a(bdyw, "CrowdsourcingPipeline__field_classification_apis_enabled", false);
        f179145d = bdyx.m91607a(bdyw, "CrowdsourcingPipeline__fingerprint_version", 3L);
        f179146e = bdyx.m91610a(bdyw, "CrowdsourcingPipeline__log_dataset_selection_status_votes_enabled", false);
        f179147f = bdyx.m91610a(bdyw, "CrowdsourcingPipeline__log_non_matched_as_unknown_votes_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76097a() {
        return ((Boolean) f179142a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76098b() {
        return ((Boolean) f179143b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76099c() {
        return ((Boolean) f179144c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo76100d() {
        return ((Long) f179145d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo76101e() {
        return ((Boolean) f179146e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76102f() {
        return ((Boolean) f179147f.mo58455c()).booleanValue();
    }
}
