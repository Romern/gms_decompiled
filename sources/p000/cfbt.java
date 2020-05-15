package p000;

/* renamed from: cfbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfbt implements cfbs {

    /* renamed from: a */
    public static final bdyx f183598a;

    /* renamed from: b */
    public static final bdyx f183599b;

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
        bdyw a = new bdyw("com.google.android.gms.lockbox").mo58445a("gms:lockbox:service");
        f183598a = bdyx.m91610a(a, "enable_task_info", true);
        f183599b = bdyx.m91607a(a, "logging_interval_millis", 60000L);
    }

    /* renamed from: a */
    public final boolean mo80814a() {
        return ((Boolean) f183598a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo80815b() {
        return ((Long) f183599b.mo58455c()).longValue();
    }
}
