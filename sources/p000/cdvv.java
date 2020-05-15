package p000;

/* renamed from: cdvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdvv implements cdvu {

    /* renamed from: a */
    public static final bdyx f181823a;

    /* renamed from: b */
    public static final bdyx f181824b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.fido"));
        f181823a = bdyx.m91610a(bdyw, "enable_fido2_client_refactor", false);
        f181824b = bdyx.m91610a(bdyw, "EnableFido2ClientRefactor__enable_internal_transport", false);
    }

    /* renamed from: a */
    public final boolean mo78382a() {
        return ((Boolean) f181823a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78383b() {
        return ((Boolean) f181824b.mo58455c()).booleanValue();
    }
}
