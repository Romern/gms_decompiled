package p000;

/* renamed from: chni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chni implements chnh {

    /* renamed from: a */
    public static final bdyx f188810a;

    /* renamed from: b */
    public static final bdyx f188811b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.wearable")).mo58445a("gms:wearable:service:");
        bdyx.m91610a(a, "WearableGacFeature__remove_gac_auth", true);
        f188810a = bdyx.m91610a(a, "WearableGacFeature__remove_gac_data", true);
        f188811b = bdyx.m91610a(a, "WearableGacFeature__remove_gac_usage", true);
        bdyx.m91610a(a, "WearableGacFeature__remove_gac_wifi", true);
    }

    /* renamed from: a */
    public final boolean mo85372a() {
        return ((Boolean) f188810a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo85373b() {
        return ((Boolean) f188811b.mo58455c()).booleanValue();
    }
}
