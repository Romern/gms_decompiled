package p000;

/* renamed from: cdnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdnm implements cdnl {

    /* renamed from: a */
    public static final bdyx f181323a;

    /* renamed from: b */
    public static final bdyx f181324b;

    /* renamed from: c */
    public static final bdyx f181325c;

    /* renamed from: d */
    public static final bdyx f181326d;

    /* renamed from: e */
    public static final bdyx f181327e;

    /* renamed from: f */
    public static final bdyx f181328f;

    /* renamed from: g */
    public static final bdyx f181329g;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms"));
        bdyx.m91610a(bdyw, "SchedulerClearcutLogging__enable_logging_wakeup_events", true);
        f181323a = bdyx.m91610a(bdyw, "SchedulerClearcutLogging__enable_logs", true);
        f181324b = bdyx.m91610a(bdyw, "SchedulerClearcutLogging__enable_unmetered_or_daily_for_logging", false);
        f181325c = bdyx.m91605a(bdyw, "SchedulerClearcutLogging__exec_finished_sample_rate", 1.0d);
        f181326d = bdyx.m91605a(bdyw, "SchedulerClearcutLogging__init_finished_sample_rate", 1.0d);
        f181327e = bdyx.m91605a(bdyw, "SchedulerClearcutLogging__sample_rate", 0.04d);
        f181328f = bdyx.m91610a(bdyw, "SchedulerClearcutLogging__use_checkbox_only_logger", false);
        f181329g = bdyx.m91605a(bdyw, "SchedulerClearcutLogging__wakeup_sample_rate", 1.0d);
    }

    /* renamed from: a */
    public final boolean mo77967a() {
        return ((Boolean) f181323a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77968b() {
        return ((Boolean) f181324b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final double mo77969c() {
        return ((Double) f181325c.mo58455c()).doubleValue();
    }

    /* renamed from: d */
    public final double mo77970d() {
        return ((Double) f181326d.mo58455c()).doubleValue();
    }

    /* renamed from: e */
    public final double mo77971e() {
        return ((Double) f181327e.mo58455c()).doubleValue();
    }

    /* renamed from: f */
    public final boolean mo77972f() {
        return ((Boolean) f181328f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final double mo77973g() {
        return ((Double) f181329g.mo58455c()).doubleValue();
    }
}
