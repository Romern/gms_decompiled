package p000;

/* renamed from: cgax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgax implements cgaw {

    /* renamed from: a */
    public static final bdyx f186254a;

    /* renamed from: b */
    public static final bdyx f186255b;

    /* renamed from: c */
    public static final bdyx f186256c;

    /* renamed from: d */
    public static final bdyx f186257d;

    /* renamed from: e */
    public static final bdyx f186258e;

    /* renamed from: f */
    public static final bdyx f186259f;

    /* renamed from: g */
    public static final bdyx f186260g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f186254a = bdyx.m91610a(bdyw, "MenagerieSyncFeature__deregister_gsync_subscription_for_chime", true);
        f186255b = bdyx.m91610a(bdyw, "MenagerieSyncFeature__enable_chime_for_tickle_sync", false);
        f186256c = bdyx.m91610a(bdyw, "MenagerieSyncFeature__enable_tickle_sync_for_non_dasher", false);
        f186257d = bdyx.m91610a(bdyw, "MenagerieSyncFeature__owner_cover_photo_sync_disabled", false);
        f186258e = bdyx.m91610a(bdyw, "MenagerieSyncFeature__periodic_sync_gcm_fix_enabled", false);
        f186259f = bdyx.m91607a(bdyw, "MenagerieSyncFeature__request_sync_operation_disabled", 0L);
        f186260g = bdyx.m91610a(bdyw, "MenagerieSyncFeature__update_sync_time_on_skipped_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo83197a() {
        return ((Boolean) f186254a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83198b() {
        return ((Boolean) f186255b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83199c() {
        return ((Boolean) f186256c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo83200d() {
        return ((Boolean) f186257d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83201e() {
        return ((Boolean) f186258e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final long mo83202f() {
        return ((Long) f186259f.mo58455c()).longValue();
    }

    /* renamed from: g */
    public final boolean mo83203g() {
        return ((Boolean) f186260g.mo58455c()).booleanValue();
    }
}
