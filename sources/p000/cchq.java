package p000;

/* renamed from: cchq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cchq implements cchp {

    /* renamed from: a */
    public static final bdyx f178997a;

    /* renamed from: b */
    public static final bdyx f178998b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth.proximity")).mo58445a("auth_proximity_");
        f178997a = bdyx.m91607a(a, "ProximityAuth__cryptauth_v2_enrollment_timeout_sec", 90L);
        f178998b = bdyx.m91610a(a, "CryptauthV2Enrollment__use_feature_toggled_invocation_reason", false);
    }

    /* renamed from: a */
    public final long mo75966a() {
        return ((Long) f178997a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo75967b() {
        return ((Boolean) f178998b.mo58455c()).booleanValue();
    }
}
