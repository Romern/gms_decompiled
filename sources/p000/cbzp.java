package p000;

/* renamed from: cbzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbzp implements cbzo {

    /* renamed from: a */
    public static final bdyx f178594a;

    /* renamed from: b */
    public static final bdyx f178595b;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account")).mo58443a();
        f178594a = bdyx.m91610a(a, "enable_brand_product_device_upload", false);
        f178595b = bdyx.m91610a(a, "enable_fingerprint_upload", false);
    }

    /* renamed from: a */
    public final boolean mo75634a() {
        return ((Boolean) f178594a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75635b() {
        return ((Boolean) f178595b.mo58455c()).booleanValue();
    }
}
