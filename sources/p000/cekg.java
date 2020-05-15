package p000;

/* renamed from: cekg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cekg implements cekf {

    /* renamed from: a */
    public static final bdyx f182836a;

    /* renamed from: b */
    public static final bdyx f182837b;

    /* renamed from: c */
    public static final bdyx f182838c;

    /* renamed from: d */
    public static final bdyx f182839d;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.herrevad")).mo58445a("herrevad:");
        f182836a = bdyx.m91609a(a, "Connectivity__all_networks_type_filter", "0,1");
        f182837b = bdyx.m91610a(a, "Connectivity__collection_enabled", true);
        f182838c = bdyx.m91610a(a, "Connectivity__flip_captive_portal_bit", false);
        f182839d = bdyx.m91610a(a, "flip_captive_portal_bit", false);
    }

    /* renamed from: a */
    public final String mo79217a() {
        return (String) f182836a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo79218b() {
        return ((Boolean) f182837b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79219c() {
        return ((Boolean) f182838c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo79220d() {
        return ((Boolean) f182839d.mo58455c()).booleanValue();
    }
}
