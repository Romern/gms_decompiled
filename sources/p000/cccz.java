package p000;

/* renamed from: cccz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cccz implements cccy {

    /* renamed from: a */
    public static final bdyx f178773a;

    /* renamed from: b */
    public static final bdyx f178774b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth.api.credentials"));
        f178773a = bdyx.m91609a(bdyw, "GisGalServerSettings__hostname", "accountlinking-pa.googleapis.com");
        f178774b = bdyx.m91607a(bdyw, "GisGalServerSettings__port", 443L);
    }

    /* renamed from: a */
    public final String mo75783a() {
        return (String) f178773a.mo58455c();
    }

    /* renamed from: b */
    public final long mo75784b() {
        return ((Long) f178774b.mo58455c()).longValue();
    }
}
