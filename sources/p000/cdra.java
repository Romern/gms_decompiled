package p000;

/* renamed from: cdra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdra implements cdqz {

    /* renamed from: a */
    public static final bdyx f181585a;

    /* renamed from: b */
    public static final bdyx f181586b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.droidguard"));
        f181585a = bdyx.m91610a(bdyw, "droidguard_enable_client_library_telemetry", false);
        f181586b = bdyx.m91609a(bdyw, "droidguard_flows_with_fine_client_library_telemetry", "");
    }

    /* renamed from: a */
    public final boolean mo78198a() {
        return ((Boolean) f181585a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo78199b() {
        return (String) f181586b.mo58455c();
    }
}
