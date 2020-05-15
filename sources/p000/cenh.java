package p000;

/* renamed from: cenh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cenh implements ceng {

    /* renamed from: a */
    public static final bdyx f183066a;

    /* renamed from: b */
    public static final bdyx f183067b;

    /* renamed from: c */
    public static final bdyx f183068c;

    /* renamed from: d */
    public static final bdyx f183069d;

    /* renamed from: e */
    public static final bdyx f183070e;

    /* renamed from: f */
    public static final bdyx f183071f;

    /* renamed from: g */
    public static final bdyx f183072g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.icing.mdd"));
        f183066a = bdyx.m91607a(bdyw, "abs_free_space_after_download", 524288000L);
        f183067b = bdyx.m91607a(bdyw, "abs_free_space_after_download_extremely_low_storage_allowed", 2097152L);
        f183068c = bdyx.m91607a(bdyw, "abs_free_space_after_download_low_storage_allowed", 104857600L);
        f183069d = bdyx.m91610a(bdyw, "downloader_enforce_https", true);
        f183070e = bdyx.m91607a(bdyw, "downloader_max_threads", 2L);
        f183071f = bdyx.m91610a(bdyw, "enforce_low_storage_behavior", true);
        f183072g = bdyx.m91605a(bdyw, "fraction_free_space_after_download", 0.1d);
        bdyx.m91607a(bdyw, "time_to_wait_for_downloader", 120000L);
    }

    /* renamed from: a */
    public final long mo79416a() {
        return ((Long) f183066a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo79417b() {
        return ((Long) f183067b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo79418c() {
        return ((Long) f183068c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final boolean mo79419d() {
        return ((Boolean) f183069d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final long mo79420e() {
        return ((Long) f183070e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo79421f() {
        return ((Boolean) f183071f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final double mo79422g() {
        return ((Double) f183072g.mo58455c()).doubleValue();
    }
}
