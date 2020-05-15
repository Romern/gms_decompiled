package p000;

/* renamed from: cded */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cded implements cdec {

    /* renamed from: a */
    public static final bdyx f180574a;

    /* renamed from: b */
    public static final bdyx f180575b;

    /* renamed from: c */
    public static final bdyx f180576c;

    /* renamed from: d */
    public static final bdyx f180577d;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:metalogger:");
        bdyx.m91610a(a, "ClearcutMetalog__get_storage_by_log_source", true);
        f180574a = bdyx.m91610a(a, "kill_switch", false);
        f180575b = bdyx.m91610a(a, "ClearcutMetalog__log_auth_token_status_by_log_source", true);
        f180576c = bdyx.m91610a(a, "ClearcutMetalog__log_corrupted_log_drop_reason", true);
        bdyx.m91610a(a, "ClearcutMetalog__report_aggregated_storage", false);
        f180577d = bdyx.m91607a(a, "samples_per_counter", 200L);
    }

    /* renamed from: a */
    public final boolean mo77324a() {
        return ((Boolean) f180574a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77325b() {
        return ((Boolean) f180575b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77326c() {
        return ((Boolean) f180576c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77327d() {
        return ((Long) f180577d.mo58455c()).longValue();
    }
}
