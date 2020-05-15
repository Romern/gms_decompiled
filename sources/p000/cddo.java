package p000;

/* renamed from: cddo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cddo implements cddn {

    /* renamed from: a */
    public static final bdyx f180534a;

    /* renamed from: b */
    public static final bdyx f180535b;

    /* renamed from: c */
    public static final bdyx f180536c;

    /* renamed from: d */
    public static final bdyx f180537d;

    /* renamed from: e */
    public static final bdyx f180538e;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:debug:");
        f180534a = bdyx.m91610a(a, "disable_log_operation", false);
        f180535b = bdyx.m91610a(a, "disable_log_operation_scheduling", false);
        f180536c = bdyx.m91610a(a, "disable_log_persistence", false);
        f180537d = bdyx.m91610a(a, "record_simulation_events", false);
        f180538e = bdyx.m91610a(a, "skip_phenotype_commit", false);
    }

    /* renamed from: a */
    public final boolean mo77291a() {
        return ((Boolean) f180534a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo77292b() {
        return ((Boolean) f180535b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo77293c() {
        return ((Boolean) f180536c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77294d() {
        return ((Boolean) f180537d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo77295e() {
        return ((Boolean) f180538e.mo58455c()).booleanValue();
    }
}
