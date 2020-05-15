package p000;

/* renamed from: cdeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdeg implements cdef {

    /* renamed from: a */
    public static final bdyx f180580a;

    /* renamed from: b */
    public static final bdyx f180581b;

    /* renamed from: c */
    public static final bdyx f180582c;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:service:");
        f180580a = bdyx.m91607a(a, "clearcut_collect_for_debug_duration_millis", 86400000L);
        f180581b = bdyx.m91607a(a, "clearcut_collect_for_debug_upload_latency_millis", 10000L);
        f180582c = bdyx.m91609a(a, "sidewinder_permissions", "");
    }

    /* renamed from: a */
    public final long mo77329a() {
        return ((Long) f180580a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo77330b() {
        return ((Long) f180581b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final String mo77331c() {
        return (String) f180582c.mo58455c();
    }
}
