package p000;

/* renamed from: cfcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfcu implements cfct {

    /* renamed from: a */
    public static final bdyx f183637a;

    /* renamed from: b */
    public static final bdyx f183638b;

    /* renamed from: c */
    public static final bdyx f183639c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.magictether")).mo58445a("gms:magictether:");
        f183637a = bdyx.m91610a(a, "UnifiedSetup__check_magic_tether_client_supported_bit", false);
        bdyx.m91610a(a, "UnifiedSetup__hide_settings_item", true);
        f183638b = bdyx.m91607a(a, "MagicTether__reportFeatureSupportTimeoutSec", 90L);
        f183639c = bdyx.m91610a(a, "UnifiedSetup__use_better_together_host_feature_bits", true);
    }

    /* renamed from: a */
    public final boolean mo80844a() {
        return ((Boolean) f183637a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo80845b() {
        return ((Long) f183638b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo80846c() {
        return ((Boolean) f183639c.mo58455c()).booleanValue();
    }
}
