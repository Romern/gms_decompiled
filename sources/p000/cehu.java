package p000;

/* renamed from: cehu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cehu implements ceht {

    /* renamed from: a */
    public static final bdyx f182691a;

    /* renamed from: b */
    public static final bdyx f182692b;

    /* renamed from: c */
    public static final bdyx f182693c;

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
        f182691a = bdyx.m91610a(a, "AndroidGoogleHelp__enable_day_night_functionality", false);
        f182692b = bdyx.m91610a(a, "AndroidGoogleHelp__enable_open_to_smart_journey_step_3", false);
        f182693c = bdyx.m91609a(a, "AndroidGoogleHelp__open_to_smart_journey_step_3_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
    }

    /* renamed from: a */
    public final boolean mo79145a() {
        return ((Boolean) f182691a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79146b() {
        return ((Boolean) f182692b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final String mo79147c() {
        return (String) f182693c.mo58455c();
    }
}
