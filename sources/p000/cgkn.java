package p000;

/* renamed from: cgkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgkn implements cgkm {

    /* renamed from: a */
    public static final bdyx f187172a;

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
        bdyw b = new bdyw(bdyj.m91581a("com.google.android.gms.security")).mo58445a("mdm.").mo58450b();
        bdyx.m91610a(b, "ring_my_phone_sidewinder", false);
        f187172a = bdyx.m91610a(b, "show_location_notification", true);
        bdyx.m91610a(b, "wearable_obstruction_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo83991a() {
        return ((Boolean) f187172a.mo58455c()).booleanValue();
    }
}
