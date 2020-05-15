package p000;

/* renamed from: cfmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfmi implements cfmh {

    /* renamed from: a */
    public static final bdyx f184365a;

    /* renamed from: b */
    public static final bdyx f184366b;

    /* renamed from: c */
    public static final bdyx f184367c;

    /* renamed from: d */
    public static final bdyx f184368d;

    /* renamed from: e */
    public static final bdyx f184369e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.mobile_data_plan"));
        f184365a = bdyx.m91610a(bdyw, "ConsentImprovements__check_consent_in_apis", false);
        f184366b = bdyx.m91610a(bdyw, "ConsentImprovements__check_consent_with_cpid", true);
        f184367c = bdyx.m91610a(bdyw, "ConsentImprovements__send_all_consent_statuses", true);
        f184368d = bdyx.m91607a(bdyw, "ConsentImprovements__test_consent_rpc_delay_millis", 0L);
        f184369e = bdyx.m91607a(bdyw, "ConsentImprovements__ui_consent_timeout_millis", 0L);
    }

    /* renamed from: a */
    public final boolean mo81472a() {
        return ((Boolean) f184365a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81473b() {
        return ((Boolean) f184366b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81474c() {
        return ((Boolean) f184367c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo81475d() {
        return ((Long) f184368d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo81476e() {
        return ((Long) f184369e.mo58455c()).longValue();
    }
}
