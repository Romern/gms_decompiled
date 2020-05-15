package p000;

/* renamed from: cgwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgwg implements cgwe {

    /* renamed from: a */
    public static final bdyx f187845a;

    /* renamed from: b */
    public static final bdyx f187846b;

    /* renamed from: c */
    public static final bdyx f187847c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.tapandpay"));
        f187845a = bdyx.m91609a(bdyw, "DynamicAidRegistration__dynamic_registration_mode", "REGISTRATION_MODE_DISABLED");
        f187846b = bdyx.m91610a(bdyw, "DynamicAidRegistration__enable_dynamic_aid_registration", false);
        try {
            f187847c = bdyx.m91608a(bdyw, "test_aids", (bydj) bxvk.m124014a(bydj.f165795b, new byte[0]), cgwf.f187844a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"test_aids\"");
        }
    }

    /* renamed from: a */
    public final String mo84560a() {
        return (String) f187845a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo84561b() {
        return ((Boolean) f187846b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final bydj mo84562c() {
        return (bydj) f187847c.mo58455c();
    }
}
