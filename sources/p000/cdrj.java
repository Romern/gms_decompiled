package p000;

/* renamed from: cdrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdrj implements cdri {

    /* renamed from: a */
    public static final bdyx f181597a;

    /* renamed from: b */
    public static final bdyx f181598b;

    /* renamed from: c */
    public static final bdyx f181599c;

    /* renamed from: d */
    public static final bdyx f181600d;

    /* renamed from: e */
    public static final bdyx f181601e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.droidguard"));
        f181597a = bdyx.m91607a(bdyw, "droidguard_client_timeout_millis", 60000L);
        f181598b = bdyx.m91607a(bdyw, "droidguard_connection_timeout_millis", 30000L);
        f181599c = bdyx.m91607a(bdyw, "droidguard_read_timeout_millis", 30000L);
        f181600d = bdyx.m91607a(bdyw, "gms:droidguard:retry_backoff_seconds_base", 900L);
        f181601e = bdyx.m91607a(bdyw, "gms:droidguard:retry_backoff_seconds_limit", 28800L);
    }

    /* renamed from: a */
    public final long mo78207a() {
        return ((Long) f181597a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78208b() {
        return ((Long) f181598b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo78209c() {
        return ((Long) f181599c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo78210d() {
        return ((Long) f181600d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo78211e() {
        return ((Long) f181601e.mo58455c()).longValue();
    }
}
