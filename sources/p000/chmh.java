package p000;

/* renamed from: chmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chmh implements chmg {

    /* renamed from: a */
    public static final bdyx f188777a;

    /* renamed from: b */
    public static final bdyx f188778b;

    /* renamed from: c */
    public static final bdyx f188779c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.wearable")).mo58445a("gms:wearable:service:");
        f188777a = bdyx.m91607a(a, "bt_socket_creation_failure_delay_ms", 100L);
        f188778b = bdyx.m91607a(a, "bt_socket_creation_max_attempts", 3L);
        f188779c = bdyx.m91610a(a, "enable_bt_socket_creation_retry", true);
    }

    /* renamed from: a */
    public final long mo85348a() {
        return ((Long) f188777a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo85349b() {
        return ((Long) f188778b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo85350c() {
        return ((Boolean) f188779c.mo58455c()).booleanValue();
    }
}
