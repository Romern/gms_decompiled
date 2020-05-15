package p000;

/* renamed from: ccea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccea implements ccdz {

    /* renamed from: a */
    public static final bdyx f178812a;

    /* renamed from: b */
    public static final bdyx f178813b;

    /* renamed from: c */
    public static final bdyx f178814c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_api_phone")).mo58443a();
        f178812a = bdyx.m91607a(a, "RetrieveSmsWithConsentDialogFeature__previous_dialog_action_retention_timeout_seconds", 60L);
        f178813b = bdyx.m91607a(a, "RetrieveSmsWithConsentDialogFeature__request_timeout_seconds", 300L);
        f178814c = bdyx.m91607a(a, "RetrieveSmsWithConsentDialogFeature__result_retention_timeout_seconds", 300L);
    }

    /* renamed from: a */
    public final long mo75813a() {
        return ((Long) f178812a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo75814b() {
        return ((Long) f178813b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo75815c() {
        return ((Long) f178814c.mo58455c()).longValue();
    }
}
