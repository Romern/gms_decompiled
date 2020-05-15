package p000;

/* renamed from: cheq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cheq implements chep {

    /* renamed from: a */
    public static final bdyx f188539a;

    /* renamed from: b */
    public static final bdyx f188540b;

    /* renamed from: c */
    public static final bdyx f188541c;

    /* renamed from: d */
    public static final bdyx f188542d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.wallet"));
        f188539a = bdyx.m91607a(bdyw, "AutofillUpstream__initialization_cache_expiry_millis", 259200000L);
        f188540b = bdyx.m91610a(bdyw, "AutofillUpstream__launch_instrument_manager_directly_from_notification", true);
        f188541c = bdyx.m91610a(bdyw, "AutofillUpstream__launch_instrument_manager_directly_from_save_dialog", true);
        f188542d = bdyx.m91610a(bdyw, "AutofillUpstream__use_initialization_cache", false);
    }

    /* renamed from: a */
    public final long mo85179a() {
        return ((Long) f188539a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo85180b() {
        return ((Boolean) f188540b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85181c() {
        return ((Boolean) f188541c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo85182d() {
        return ((Boolean) f188542d.mo58455c()).booleanValue();
    }
}
