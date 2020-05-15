package p000;

/* renamed from: cfcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfcx implements cfcw {

    /* renamed from: a */
    public static final bdyx f183642a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183642a = bdyx.m91610a(a, "enable_anonymous_registration", false);
        bdyx.m91610a(a, "AnonymousChat__only_accept_phone_number_as_display_name", false);
        bdyx.m91610a(a, "AnonymousChat__skip_display_name_confirm_dialog", true);
    }

    /* renamed from: a */
    public final boolean mo80848a() {
        return ((Boolean) f183642a.mo58455c()).booleanValue();
    }
}
