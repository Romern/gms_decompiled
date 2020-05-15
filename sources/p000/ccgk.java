package p000;

/* renamed from: ccgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccgk implements ccgj {

    /* renamed from: a */
    public static final bdyx f178943a;

    /* renamed from: b */
    public static final bdyx f178944b;

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
        f178943a = bdyx.m91610a(bdyw, "AuthManagedBugfixes__force_remove_account", true);
        f178944b = bdyx.m91610a(bdyw, "AuthManagedBugfixes__optional_device_data", true);
    }

    /* renamed from: a */
    public final boolean mo75922a() {
        return ((Boolean) f178943a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75923b() {
        return ((Boolean) f178944b.mo58455c()).booleanValue();
    }
}
