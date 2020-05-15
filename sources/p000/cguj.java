package p000;

/* renamed from: cguj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cguj implements cgui {

    /* renamed from: a */
    public static final bdyx f187774a;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187774a = bdyx.m91610a(a, "add_external_experiment_ids", true);
        bdyx.m91610a(a, "clearcut_add_external_ids_log_source_BATTERY_STATS", true);
        bdyx.m91610a(a, "clearcut_add_external_ids_log_source_DROP_BOX", true);
    }

    /* renamed from: a */
    public final boolean mo84506a() {
        return ((Boolean) f187774a.mo58455c()).booleanValue();
    }
}
