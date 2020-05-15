package p000;

/* renamed from: cdmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdmq implements cdmo {

    /* renamed from: a */
    public static final bdyx f181244a;

    /* renamed from: b */
    public static final bdyx f181245b;

    /* renamed from: c */
    public static final bdyx f181246c;

    /* renamed from: d */
    public static final bdyx f181247d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms")).mo58445a("gms:common:");
        f181244a = bdyx.m91607a(a, "Phenotype__checkin_interval_in_seconds", 86400L);
        try {
            f181245b = bdyx.m91608a(a, "Phenotype__forced_global_broadcast_packages", (bydj) GeneratedMessageLite.m124014a(bydj.f165795b, new byte[]{10, 27, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 108, 111, 99, 97, 116, 105, 111, 110, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 117, 108, 114, 10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 108, 97, 99, 101, 115}), cdmp.f181243a);
            f181246c = bdyx.m91610a(a, "Phenotype__include_device_provisioning_state_in_request", true);
            f181247d = bdyx.m91610a(a, "Phenotype__targeted_notifications_enabled", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"Phenotype__forced_global_broadcast_packages\"");
        }
    }

    /* renamed from: a */
    public final long mo77896a() {
        return ((Long) f181244a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final bydj mo77897b() {
        return (bydj) f181245b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo77898c() {
        return ((Boolean) f181246c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo77899d() {
        return ((Boolean) f181247d.mo58455c()).booleanValue();
    }
}
