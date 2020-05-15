package p000;

/* renamed from: cdod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdod implements cdoc {

    /* renamed from: a */
    public static final bdyx f181418a;

    /* renamed from: b */
    public static final bdyx f181419b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms"));
        f181418a = bdyx.m91610a(bdyw, "SchedulerTracing__avoid_begin_span_without_trace", false);
        bdyx.m91610a(bdyw, "SchedulerTracing__enable_scheduler_tracing", true);
        f181419b = bdyx.m91610a(bdyw, "SchedulerTracing__explicitly_set_component_name_when_initalizing_tracer", false);
    }

    /* renamed from: a */
    public final boolean mo78057a() {
        return ((Boolean) f181418a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78058b() {
        return ((Boolean) f181419b.mo58455c()).booleanValue();
    }
}
