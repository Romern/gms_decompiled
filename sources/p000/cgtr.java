package p000;

/* renamed from: cgtr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgtr implements cgtq {

    /* renamed from: a */
    public static final bdyx f187752a;

    /* renamed from: b */
    public static final bdyx f187753b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.metrics"));
        f187752a = bdyx.m91610a(bdyw, "ProcStats__enable_metric_filter", true);
        f187753b = bdyx.m91609a(bdyw, "ProcStats__black_list_metrics", "PROC_ALL,PKG_SVC_ALL,SYS_MEM_ALL");
    }

    /* renamed from: a */
    public final boolean mo84490a() {
        return ((Boolean) f187752a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo84491b() {
        return (String) f187753b.mo58455c();
    }
}
