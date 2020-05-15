package p000;

/* renamed from: cejb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cejb implements ceja {

    /* renamed from: a */
    public static final bdyx f182742a;

    /* renamed from: b */
    public static final bdyx f182743b;

    /* renamed from: c */
    public static final bdyx f182744c;

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
        f182742a = bdyx.m91610a(a, "AndroidGoogleHelp__add_network_request_failure_metrics", false);
        f182743b = bdyx.m91610a(a, "AndroidGoogleHelp__fix_search_infinite_spinner_when_no_network", false);
        bdyx.m91610a(a, "AndroidGoogleHelp__include_num_attempts_in_network_request_latency_metrics", false);
        f182744c = bdyx.m91610a(a, "AndroidGoogleHelp__use_network_unavailable_message_open_to_search", false);
    }

    /* renamed from: a */
    public final boolean mo79185a() {
        return ((Boolean) f182742a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79186b() {
        return ((Boolean) f182743b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79187c() {
        return ((Boolean) f182744c.mo58455c()).booleanValue();
    }
}
