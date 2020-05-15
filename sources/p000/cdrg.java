package p000;

/* renamed from: cdrg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdrg implements cdrf {

    /* renamed from: a */
    public static final bdyx f181593a;

    /* renamed from: b */
    public static final bdyx f181594b;

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
        f181593a = bdyx.m91610a(bdyw, "enable_droidguard_based_widevine_provisioning", false);
        f181594b = bdyx.m91610a(bdyw, "enable_droidguard_fallback_widevine", false);
    }

    /* renamed from: a */
    public final boolean mo78204a() {
        return ((Boolean) f181593a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78205b() {
        return ((Boolean) f181594b.mo58455c()).booleanValue();
    }
}
