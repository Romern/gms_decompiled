package p000;

/* renamed from: chgn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chgn implements chgm {

    /* renamed from: a */
    public static final bdyx f188591a;

    /* renamed from: b */
    public static final bdyx f188592b;

    /* renamed from: c */
    public static final bdyx f188593c;

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
        f188591a = bdyx.m91609a(bdyw, "DynamicUpdate__display_item_price_format", "-?[0-9]*(\\.[0-9][0-9]?)?");
        f188592b = bdyx.m91610a(bdyw, "DynamicUpdate__enable_populating_client_updatable_parameters", false);
        f188593c = bdyx.m91610a(bdyw, "DynamicUpdate__enable_skip_action_on_initialization", false);
    }

    /* renamed from: a */
    public final String mo85214a() {
        return (String) f188591a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo85215b() {
        return ((Boolean) f188592b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo85216c() {
        return ((Boolean) f188593c.mo58455c()).booleanValue();
    }
}
