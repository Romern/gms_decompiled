package p000;

/* renamed from: cdfj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdfj implements cdfi {

    /* renamed from: a */
    public static final bdyx f180649a;

    /* renamed from: b */
    public static final bdyx f180650b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.constellation")).mo58445a("gms:constellation:");
        f180649a = bdyx.m91610a(a, "CarrierAuthApi__is_enabled", false);
        f180650b = bdyx.m91609a(a, "CarrierAuthApi__packages_allowed_to_call", "com.google.android.apps.messaging");
    }

    /* renamed from: a */
    public final boolean mo77388a() {
        return ((Boolean) f180649a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo77389b() {
        return (String) f180650b.mo58455c();
    }
}
