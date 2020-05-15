package p000;

/* renamed from: chdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chdm implements chdl {

    /* renamed from: a */
    public static final bdyx f188490a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.usagereporting")).mo58445a("gms:usagereporting:");
        f188490a = bdyx.m91607a(a, "connectionless_timeout_seconds", 15L);
        bdyx.m91610a(a, "disable_create_gac", false);
        bdyx.m91610a(a, "use_connectionless", true);
    }

    /* renamed from: a */
    public final long mo85140a() {
        return ((Long) f188490a.mo58455c()).longValue();
    }
}
