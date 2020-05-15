package p000;

/* renamed from: cdop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdop implements cdoo {

    /* renamed from: a */
    public static final bdyx f181440a;

    /* renamed from: b */
    public static final bdyx f181441b;

    /* renamed from: c */
    public static final bdyx f181442c;

    /* renamed from: d */
    public static final bdyx f181443d;

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:shush_native:");
        f181440a = bdyx.m91610a(a, "ShushNative__shush_native_crashes_enabled", false);
        f181441b = bdyx.m91607a(a, "ShushNative__shush_native_crashes_reporter_poll_millis", 100L);
        f181442c = bdyx.m91607a(a, "ShushNative__shush_native_crashes_reporter_timeout_millis", 500L);
        f181443d = bdyx.m91607a(a, "ShushNative__shush_native_crashes_reportermax_files_limit", 5L);
    }

    /* renamed from: a */
    public final boolean mo78075a() {
        return ((Boolean) f181440a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo78076b() {
        return ((Long) f181441b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo78077c() {
        return ((Long) f181442c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo78078d() {
        return ((Long) f181443d.mo58455c()).longValue();
    }
}
