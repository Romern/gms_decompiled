package p000;

/* renamed from: cdkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdkh implements cdkg {

    /* renamed from: a */
    public static final bdyx f181110a;

    /* renamed from: b */
    public static final bdyx f181111b;

    /* renamed from: c */
    public static final bdyx f181112c;

    /* renamed from: d */
    public static final bdyx f181113d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms"));
        f181110a = bdyx.m91610a(bdyw, "CoreStats__enable_schedule_gcm_tasks_on_module_start", false);
        f181111b = bdyx.m91610a(bdyw, "CoreStats__enable_wakelock_gcore_prefix", true);
        f181112c = bdyx.m91610a(bdyw, "CoreStats__schedule_yesterday_task", false);
        f181113d = bdyx.m91610a(bdyw, "CoreStats__share_wireless_radio_activity_summary", false);
        bdyx.m91610a(bdyw, "CoreStats__trace_aggregate_upload", false);
        bdyx.m91607a(bdyw, "CoreStats__trace_upload_maximum_time_milliseconds", 172800000L);
        bdyx.m91607a(bdyw, "CoreStats__trace_upload_period_milliseconds", 86400000L);
    }

    /* renamed from: a */
    public final boolean mo77790a() {
        return ((Boolean) f181110a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77791b() {
        return ((Boolean) f181111b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77792c() {
        return ((Boolean) f181112c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77793d() {
        return ((Boolean) f181113d.mo58455c()).booleanValue();
    }
}
