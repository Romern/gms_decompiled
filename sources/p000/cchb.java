package p000;

/* renamed from: cchb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cchb implements ccha {

    /* renamed from: a */
    public static final bdyx f178968a;

    /* renamed from: b */
    public static final bdyx f178969b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_managed"));
        f178968a = bdyx.m91610a(bdyw, "auth_managed_enable_sync_auth_app_info", false);
        f178969b = bdyx.m91610a(bdyw, "auth_managed_enable_sync_auth_log_events", true);
    }

    /* renamed from: a */
    public final boolean mo75942a() {
        return ((Boolean) f178968a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75943b() {
        return ((Boolean) f178969b.mo58455c()).booleanValue();
    }
}
