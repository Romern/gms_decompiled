package p000;

/* renamed from: ccjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccjr implements ccjq {

    /* renamed from: a */
    public static final bdyx f179195a;

    /* renamed from: b */
    public static final bdyx f179196b;

    /* renamed from: c */
    public static final bdyx f179197c;

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
        f179195a = bdyx.m91610a(bdyw, "MultiPage__email_address_conversion_enabled", true);
        f179196b = bdyx.m91610a(bdyw, "MultiPage__enabled", true);
        f179197c = bdyx.m91610a(bdyw, "MultiPage__phone_number_conversion_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo76145a() {
        return ((Boolean) f179195a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76146b() {
        return ((Boolean) f179196b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76147c() {
        return ((Boolean) f179197c.mo58455c()).booleanValue();
    }
}
