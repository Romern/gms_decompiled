package p000;

/* renamed from: cciv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cciv implements cciu {

    /* renamed from: a */
    public static final bdyx f179107a;

    /* renamed from: b */
    public static final bdyx f179108b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.autofill"));
        f179107a = bdyx.m91610a(bdyw, "Biometrics__is_biometrics_credentials_enabled", false);
        f179108b = bdyx.m91610a(bdyw, "Biometrics__is_biometrics_payments_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76065a() {
        return ((Boolean) f179107a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76066b() {
        return ((Boolean) f179108b.mo58455c()).booleanValue();
    }
}
