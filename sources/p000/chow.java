package p000;

/* renamed from: chow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chow implements chov {

    /* renamed from: a */
    public static final bdyx f188927a;

    /* renamed from: b */
    public static final bdyx f188928b;

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
        bdyw a = new bdyw("com.google.android.westworld").mo58445a("gms:westworld:");
        f188927a = bdyx.m91610a(a, "incident_enabled", false);
        f188928b = bdyx.m91609a(a, "incident_log_source", "INCIDENT_REPORT");
    }

    /* renamed from: a */
    public final boolean mo85475a() {
        return ((Boolean) f188927a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo85476b() {
        return (String) f188928b.mo58455c();
    }
}
