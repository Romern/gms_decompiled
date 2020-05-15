package p000;

/* renamed from: cemv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cemv implements cemu {

    /* renamed from: a */
    public static final bdyx f183013a;

    /* renamed from: b */
    public static final bdyx f183014b;

    /* renamed from: c */
    public static final bdyx f183015c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing"));
        f183013a = bdyx.m91609a(bdyw, "PriorityUpload__action_type_whitelist", "");
        f183014b = bdyx.m91610a(bdyw, "gms_icing_enable_priority_upload_feature", false);
        f183015c = bdyx.m91607a(bdyw, "PriorityUpload__priority_upload_sample_interval", 1L);
    }

    /* renamed from: a */
    public final String mo79367a() {
        return (String) f183013a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo79368b() {
        return ((Boolean) f183014b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo79369c() {
        return ((Long) f183015c.mo58455c()).longValue();
    }
}
