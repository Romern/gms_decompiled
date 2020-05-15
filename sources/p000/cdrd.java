package p000;

/* renamed from: cdrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdrd implements cdrc {

    /* renamed from: a */
    public static final bdyx f181589a;

    /* renamed from: b */
    public static final bdyx f181590b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.droidguard"));
        f181589a = bdyx.m91609a(bdyw, "gms:droidguard:backend_address", "https://www.googleapis.com");
        f181590b = bdyx.m91610a(bdyw, "gms:droidguard:enable_key_override", false);
    }

    /* renamed from: a */
    public final String mo78201a() {
        return (String) f181589a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo78202b() {
        return ((Boolean) f181590b.mo58455c()).booleanValue();
    }
}
