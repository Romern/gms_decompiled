package p000;

/* renamed from: cfbn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfbn implements cfbm {

    /* renamed from: a */
    public static final bdyx f183590a;

    /* renamed from: b */
    public static final bdyx f183591b;

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
        bdyw b = new bdyw("com.google.android.gms.lockbox").mo58445a("gms:lockbox:policy").mo58450b();
        f183590a = bdyx.m91610a(b, "get_opt_in_udc_only", true);
        f183591b = bdyx.m91610a(b, "set_opt_in_calls_facs", false);
    }

    /* renamed from: a */
    public final boolean mo80808a() {
        return ((Boolean) f183590a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo80809b() {
        return ((Boolean) f183591b.mo58455c()).booleanValue();
    }
}
