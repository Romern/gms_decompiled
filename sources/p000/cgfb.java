package p000;

/* renamed from: cgfb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgfb implements cgfa {

    /* renamed from: a */
    public static final bdyx f186705a;

    /* renamed from: b */
    public static final bdyx f186706b;

    /* renamed from: c */
    public static final bdyx f186707c;

    /* renamed from: d */
    public static final bdyx f186708d;

    /* renamed from: e */
    public static final bdyx f186709e;

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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.phonesky_recovery")).mo58443a();
        f186705a = bdyx.m91610a(a, "PhoneskyRecoveryFeature__enable_silent_rollback_of_phonesky", false);
        f186706b = bdyx.m91607a(a, "PhoneskyRecoveryFeature__user_interacted_rollback_debounce_duration_ms", 3600000L);
        f186707c = bdyx.m91610a(a, "PhoneskyRecoveryFeature__user_interacted_rollback_latchsky_enabled", false);
        f186708d = bdyx.m91607a(a, "PhoneskyRecoveryFeature__user_interacted_rollback_notification_success_duration_ms", 259200000L);
        f186709e = bdyx.m91609a(a, "PhoneskyRecoveryFeature__user_interacted_rollback_phonesky_versions", "");
    }

    /* renamed from: a */
    public final boolean mo83577a() {
        return ((Boolean) f186705a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo83578b() {
        return ((Long) f186706b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo83579c() {
        return ((Boolean) f186707c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo83580d() {
        return ((Long) f186708d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final String mo83581e() {
        return (String) f186709e.mo58455c();
    }
}
