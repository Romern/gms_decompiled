package p000;

/* renamed from: cbwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbwx implements cbww {

    /* renamed from: a */
    public static final bdyx f178494a;

    /* renamed from: b */
    public static final bdyx f178495b;

    /* renamed from: c */
    public static final bdyx f178496c;

    /* renamed from: d */
    public static final bdyx f178497d;

    /* renamed from: e */
    public static final bdyx f178498e;

    /* renamed from: f */
    public static final bdyx f178499f;

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
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.audit")).mo58443a();
        f178494a = bdyx.m91609a(a, "ConfigFeature__upload_grpc_host", "auditrecording-pa.googleapis.com");
        f178495b = bdyx.m91607a(a, "ConfigFeature__upload_grpc_port", 443L);
        f178496c = bdyx.m91607a(a, "ConfigFeature__upload_grpc_timeout", 10000L);
        f178497d = bdyx.m91607a(a, "ConfigFeature__upload_task_records_per_run_count", 10L);
        f178498e = bdyx.m91607a(a, "ConfigFeature__upload_task_window_maximum", 8640000L);
        f178499f = bdyx.m91607a(a, "ConfigFeature__upload_task_window_minimum", 60L);
        bdyx.m91610a(a, "Upload__use_new_grpc_logic", true);
    }

    /* renamed from: a */
    public final String mo75560a() {
        return (String) f178494a.mo58455c();
    }

    /* renamed from: b */
    public final long mo75561b() {
        return ((Long) f178495b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo75562c() {
        return ((Long) f178496c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo75563d() {
        return ((Long) f178497d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo75564e() {
        return ((Long) f178498e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo75565f() {
        return ((Long) f178499f.mo58455c()).longValue();
    }
}
