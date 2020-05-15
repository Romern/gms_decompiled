package p000;

/* renamed from: ccqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccqn implements ccqm {

    /* renamed from: a */
    public static final bdyx f179758a;

    /* renamed from: b */
    public static final bdyx f179759b;

    /* renamed from: c */
    public static final bdyx f179760c;

    /* renamed from: d */
    public static final bdyx f179761d;

    /* renamed from: e */
    public static final bdyx f179762e;

    /* renamed from: f */
    public static final bdyx f179763f;

    /* renamed from: g */
    public static final bdyx f179764g;

    /* renamed from: h */
    public static final bdyx f179765h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        bdyx.m91610a(bdyw, "CarServiceTelemetry__android_system_info_enabled", true);
        f179758a = bdyx.m91610a(bdyw, "CarServiceTelemetry__broadcast_connectivity_stage_events", false);
        f179759b = bdyx.m91610a(bdyw, "CarServiceTelemetry__enabled", true);
        f179760c = bdyx.m91610a(bdyw, "CarServiceTelemetry__handle_first_activity_new_intent", false);
        f179761d = bdyx.m91610a(bdyw, "CarServiceTelemetry__is_wifi_kbps_logging_enabled", false);
        f179762e = bdyx.m91610a(bdyw, "CarServiceTelemetry__log_battery_temperature", true);
        f179763f = bdyx.m91610a(bdyw, "CarServiceTelemetry__log_extra_bootstrap_events", true);
        f179764g = bdyx.m91610a(bdyw, "CarServiceTelemetry__log_first_activity_new_intent", true);
        f179765h = bdyx.m91607a(bdyw, "CarServiceTelemetry__wifi_latency_log_frequency_ms", 4000L);
    }

    /* renamed from: a */
    public final boolean mo76644a() {
        return ((Boolean) f179758a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76645b() {
        return ((Boolean) f179759b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76646c() {
        return ((Boolean) f179760c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76647d() {
        return ((Boolean) f179761d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76648e() {
        return ((Boolean) f179762e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76649f() {
        return ((Boolean) f179763f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo76650g() {
        return ((Boolean) f179764g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final long mo76651h() {
        return ((Long) f179765h.mo58455c()).longValue();
    }
}
