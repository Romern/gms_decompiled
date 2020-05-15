package p000;

/* renamed from: cefm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cefm implements cefl {

    /* renamed from: a */
    public static final bdyx f182604a;

    /* renamed from: b */
    public static final bdyx f182605b;

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
        f182604a = bdyx.m91609a(a, "AndroidGoogleHelp__prefetch_offline_help_content_app_package_name_white_list", "");
        f182605b = bdyx.m91610a(a, "AndroidGoogleHelp__should_prefetch_offline_help_content_periodically", false);
    }

    /* renamed from: a */
    public final String mo79078a() {
        return (String) f182604a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo79079b() {
        return ((Boolean) f182605b.mo58455c()).booleanValue();
    }
}
