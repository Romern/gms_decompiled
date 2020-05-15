package p000;

/* renamed from: cefs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cefs implements cefr {

    /* renamed from: a */
    public static final bdyx f182612a;

    /* renamed from: b */
    public static final bdyx f182613b;

    /* renamed from: c */
    public static final bdyx f182614c;

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
        f182612a = bdyx.m91610a(a, "AndroidGoogleHelp__share_help_articles", true);
        f182613b = bdyx.m91609a(a, "AndroidGoogleHelp__share_help_articles_blacklist", "");
        f182614c = bdyx.m91609a(a, "AndroidGoogleHelp__share_help_articles_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
    }

    /* renamed from: a */
    public final boolean mo79084a() {
        return ((Boolean) f182612a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo79085b() {
        return (String) f182613b.mo58455c();
    }

    /* renamed from: c */
    public final String mo79086c() {
        return (String) f182614c.mo58455c();
    }
}
