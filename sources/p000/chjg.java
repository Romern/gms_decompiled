package p000;

/* renamed from: chjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chjg implements chjf {

    /* renamed from: a */
    public static final bdyx f188677a;

    /* renamed from: b */
    public static final bdyx f188678b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188677a = bdyx.m91610a(bdyw, "SignatureBasedAuth__enable_detect_lockscreen_key_using_init_sign", true);
        f188678b = bdyx.m91607a(bdyw, "SignatureBasedAuth__lockscreen_user_authentication_validity_duration_seconds", 10L);
    }

    /* renamed from: a */
    public final boolean mo85275a() {
        return ((Boolean) f188677a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo85276b() {
        return ((Long) f188678b.mo58455c()).longValue();
    }
}
