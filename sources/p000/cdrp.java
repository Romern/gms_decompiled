package p000;

/* renamed from: cdrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdrp implements cdro {

    /* renamed from: a */
    public static final bdyx f181607a;

    /* renamed from: b */
    public static final bdyx f181608b;

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
        f181607a = bdyx.m91610a(bdyw, "droidguard_enable_local_apk_signature_verification_in_client", true);
        f181608b = bdyx.m91610a(bdyw, "droidguard_enable_local_apk_signature_verification_in_module", true);
    }

    /* renamed from: a */
    public final boolean mo78215a() {
        return ((Boolean) f181607a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78216b() {
        return ((Boolean) f181608b.mo58455c()).booleanValue();
    }
}
