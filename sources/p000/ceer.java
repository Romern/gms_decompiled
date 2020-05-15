package p000;

/* renamed from: ceer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceer implements ceeq {

    /* renamed from: a */
    public static final bdyx f182556a;

    /* renamed from: b */
    public static final bdyx f182557b;

    /* renamed from: c */
    public static final bdyx f182558c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.googlehelp")).mo58443a();
        f182556a = bdyx.m91610a(a, "AndroidGoogleHelp__cancel_chat_polling_after_gcm_received", false);
        f182557b = bdyx.m91610a(a, "AndroidGoogleHelp__is_cbf_chat_enabled", true);
        f182558c = bdyx.m91610a(a, "AndroidGoogleHelp__use_most_recent_chat_version_for_polling", false);
    }

    /* renamed from: a */
    public final boolean mo79037a() {
        return ((Boolean) f182556a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79038b() {
        return ((Boolean) f182557b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79039c() {
        return ((Boolean) f182558c.mo58455c()).booleanValue();
    }
}
