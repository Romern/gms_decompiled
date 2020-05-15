package p000;

/* renamed from: ccvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccvb implements ccva {

    /* renamed from: a */
    public static final bdyx f180016a;

    /* renamed from: b */
    public static final bdyx f180017b;

    /* renamed from: c */
    public static final bdyx f180018c;

    /* renamed from: d */
    public static final bdyx f180019d;

    /* renamed from: e */
    public static final bdyx f180020e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f180016a = bdyx.m91610a(bdyw, "ProjectionLifecycleBugs__always_use_lifecycle_exceptions", true);
        f180017b = bdyx.m91610a(bdyw, "ProjectionLifecycleBugs__crash_on_unexpected_service_descriptor", false);
        f180018c = bdyx.m91610a(bdyw, "ProjectionLifecycleBugs__invalid_connection_state_telemetry_enabled", false);
        f180019d = bdyx.m91610a(bdyw, "ProjectionLifecycleBugs__log_missing_disconnected_state_enabled", false);
        f180020e = bdyx.m91610a(bdyw, "ProjectionLifecycleBugs__use_unbind_service_safe", true);
    }

    /* renamed from: a */
    public final boolean mo76861a() {
        return ((Boolean) f180016a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76862b() {
        return ((Boolean) f180017b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76863c() {
        return ((Boolean) f180018c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76864d() {
        return ((Boolean) f180019d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76865e() {
        return ((Boolean) f180020e.mo58455c()).booleanValue();
    }
}
