package p000;

/* renamed from: cftp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cftp implements cfto {

    /* renamed from: a */
    public static final bdyx f185690a;

    /* renamed from: b */
    public static final bdyx f185691b;

    /* renamed from: c */
    public static final bdyx f185692c;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.update")).mo58450b();
        f185690a = bdyx.m91607a(b, "update_installation_allocation_failure_retry_delay", 86400000L);
        f185691b = bdyx.m91607a(b, "update_installation_cleanup_failure_retry_delay", 86400000L);
        f185692c = bdyx.m91610a(b, "update_installation_enable_virtual_ab_support", false);
    }

    /* renamed from: a */
    public final long mo82705a() {
        return ((Long) f185690a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo82706b() {
        return ((Long) f185691b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo82707c() {
        return ((Boolean) f185692c.mo58455c()).booleanValue();
    }
}
