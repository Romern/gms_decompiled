package p000;

/* renamed from: cedh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cedh implements cedg {

    /* renamed from: a */
    public static final bdyx f182386a;

    /* renamed from: b */
    public static final bdyx f182387b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.gcm"));
        f182386a = bdyx.m91607a(bdyw, "gcm_enable_aia_registration_flow", 1L);
        bdyx.m91610a(bdyw, "gcm_forward_to_aia", true);
        f182387b = bdyx.m91610a(bdyw, "gcm_include_aia", true);
    }

    /* renamed from: a */
    public final long mo78879a() {
        return ((Long) f182386a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo78880b() {
        return ((Boolean) f182387b.mo58455c()).booleanValue();
    }
}
