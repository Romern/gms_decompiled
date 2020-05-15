package p000;

/* renamed from: ccnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccnn implements ccnm {

    /* renamed from: a */
    public static final bdyx f179544a;

    /* renamed from: b */
    public static final bdyx f179545b;

    /* renamed from: c */
    public static final bdyx f179546c;

    /* renamed from: d */
    public static final bdyx f179547d;

    /* renamed from: e */
    public static final bdyx f179548e;

    /* renamed from: f */
    public static final bdyx f179549f;

    /* renamed from: g */
    public static final bdyx f179550g;

    /* renamed from: h */
    public static final bdyx f179551h;

    /* renamed from: i */
    public static final bdyx f179552i;

    /* renamed from: j */
    public static final bdyx f179553j;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179544a = bdyx.m91610a(bdyw, "backup_always_show_photos_for_pixel_p_and_above", false);
        bdyx.m91610a(bdyw, "backup_always_show_photos_for_pixel_pre_p", true);
        f179545b = bdyx.m91607a(bdyw, "backup_back_up_now_notification_timeout_ms", 1200000L);
        f179546c = bdyx.m91607a(bdyw, "backup_delay_between_retries_for_waiting_for_stub_launcher_millis", 100L);
        f179547d = bdyx.m91609a(bdyw, "backup_launcher_packages", "com.google.android.apps.nexuslauncher");
        f179548e = bdyx.m91610a(bdyw, "backup_run_transport_methods_on_separate_thread", false);
        f179549f = bdyx.m91610a(bdyw, "backup_should_query_launcher_packages", true);
        f179550g = bdyx.m91607a(bdyw, "backup_timeout_for_waiting_for_stub_launcher_millis", 2000L);
        f179551h = bdyx.m91607a(bdyw, "backup_transport_methods_timeout_millis", 600000L);
        f179552i = bdyx.m91610a(bdyw, "backup_use_stub_launcher_during_restore", true);
        f179553j = bdyx.m91610a(bdyw, "backup_use_stub_launcher_during_restore_for_pixels", true);
    }

    /* renamed from: a */
    public final boolean mo76458a() {
        return ((Boolean) f179544a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76459b() {
        return ((Long) f179545b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo76460c() {
        return ((Long) f179546c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final String mo76461d() {
        return (String) f179547d.mo58455c();
    }

    /* renamed from: e */
    public final boolean mo76462e() {
        return ((Boolean) f179548e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76463f() {
        return ((Boolean) f179549f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo76464g() {
        return ((Long) f179550g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo76465h() {
        return ((Long) f179551h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final boolean mo76466i() {
        return ((Boolean) f179552i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo76467j() {
        return ((Boolean) f179553j.mo58455c()).booleanValue();
    }
}
