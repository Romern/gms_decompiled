package p000;

/* renamed from: cfdp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfdp implements cfdo {

    /* renamed from: a */
    public static final bdyx f183662a;

    /* renamed from: b */
    public static final bdyx f183663b;

    /* renamed from: c */
    public static final bdyx f183664c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.matchstick")).mo58443a();
        f183662a = bdyx.m91610a(a, "dfm_require_google_signed", true);
        f183663b = bdyx.m91610a(a, "enable_direct_forward_message_fallback", false);
        f183664c = bdyx.m91610a(a, "enable_direct_forward_message", false);
    }

    /* renamed from: a */
    public final boolean mo80862a() {
        return ((Boolean) f183662a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo80863b() {
        return ((Boolean) f183663b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo80864c() {
        return ((Boolean) f183664c.mo58455c()).booleanValue();
    }
}
