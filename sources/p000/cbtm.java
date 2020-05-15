package p000;

/* renamed from: cbtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbtm implements cbtl {

    /* renamed from: a */
    public static final bdyx f178269a;

    /* renamed from: b */
    public static final bdyx f178270b;

    /* renamed from: c */
    public static final bdyx f178271c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.admob"));
        f178269a = bdyx.m91610a(bdyw, "gads:gma_attestation:impression:enable", false);
        f178270b = bdyx.m91610a(bdyw, "gads:gma_attestation:request:enable_javascript", false);
        f178271c = bdyx.m91610a(bdyw, "gads:gma_attestation:request:enable", false);
    }

    /* renamed from: a */
    public final boolean mo75365a() {
        return ((Boolean) f178269a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo75366b() {
        return ((Boolean) f178270b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo75367c() {
        return ((Boolean) f178271c.mo58455c()).booleanValue();
    }
}
