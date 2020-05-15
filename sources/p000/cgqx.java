package p000;

/* renamed from: cgqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgqx implements cgqw {

    /* renamed from: a */
    public static final bdyx f187580a;

    /* renamed from: b */
    public static final bdyx f187581b;

    /* renamed from: c */
    public static final bdyx f187582c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187580a = bdyx.m91609a(bdyw, "QrCode__secondary_instruction_flow", "SETTINGS");
        f187581b = bdyx.m91610a(bdyw, "QrCode__target_generate_encryption_key", false);
        f187582c = bdyx.m91610a(bdyw, "QrCode__use_qr_instruction_flow", false);
    }

    /* renamed from: a */
    public final String mo84342a() {
        return (String) f187580a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo84343b() {
        return ((Boolean) f187581b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84344c() {
        return ((Boolean) f187582c.mo58455c()).booleanValue();
    }
}
