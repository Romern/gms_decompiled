package p000;

/* renamed from: cdfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdfd implements cdfc {

    /* renamed from: a */
    public static final bdyx f180640a;

    /* renamed from: b */
    public static final bdyx f180641b;

    /* renamed from: c */
    public static final bdyx f180642c;

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
        f180640a = bdyx.m91610a(a, "AsterismConsentApi__are_enabled", false);
        f180641b = bdyx.m91609a(a, "AsterismConsentApi__packages_allowed_to_call", "com.google.android.apps.messaging");
        f180642c = bdyx.m91610a(a, "AsterismConsentApi__respect_client_behavior", true);
    }

    /* renamed from: a */
    public final boolean mo77381a() {
        return ((Boolean) f180640a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo77382b() {
        return (String) f180641b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo77383c() {
        return ((Boolean) f180642c.mo58455c()).booleanValue();
    }
}
