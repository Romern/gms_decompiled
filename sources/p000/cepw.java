package p000;

/* renamed from: cepw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cepw implements cepv {

    /* renamed from: a */
    public static final bdyx f183243a;

    /* renamed from: b */
    public static final bdyx f183244b;

    /* renamed from: c */
    public static final bdyx f183245c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.instantapps")).mo58443a();
        bdyx.m91610a(a, "Routing__checkDomainFilterBeforeOptInState", false);
        bdyx.m91610a(a, "Routing__doNotCheckAppInfoForBrowserIncomingIntents", false);
        f183243a = bdyx.m91610a(a, "Routing__enableDynamicIntentActionLookup", false);
        f183244b = bdyx.m91610a(a, "Routing__return_null_intent_on_go_to_browser_o_plus", true);
        f183245c = bdyx.m91610a(a, "Routing__useSupervisorMinGmsCoreMetadata", false);
    }

    /* renamed from: a */
    public final boolean mo79570a() {
        return ((Boolean) f183243a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo79571b() {
        return ((Boolean) f183244b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79572c() {
        return ((Boolean) f183245c.mo58455c()).booleanValue();
    }
}
