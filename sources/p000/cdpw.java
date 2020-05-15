package p000;

/* renamed from: cdpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdpw implements cdpv {

    /* renamed from: a */
    public static final bdyx f181539a;

    /* renamed from: b */
    public static final bdyx f181540b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.credential_manager")).mo58443a();
        f181539a = bdyx.m91610a(a, "PasswordCheckup__checkup_enabled", false);
        f181540b = bdyx.m91610a(a, "PasswordCheckup__no_search_results_animation_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo78162a() {
        return ((Boolean) f181539a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78163b() {
        return ((Boolean) f181540b.mo58455c()).booleanValue();
    }
}
