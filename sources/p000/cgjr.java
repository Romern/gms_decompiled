package p000;

/* renamed from: cgjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgjr implements cgjq {

    /* renamed from: a */
    public static final bdyx f187088a;

    /* renamed from: b */
    public static final bdyx f187089b;

    /* renamed from: c */
    public static final bdyx f187090c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.romanesco"));
        f187088a = bdyx.m91607a(bdyw, "Network__people_api_grpc_port", 443L);
        f187089b = bdyx.m91609a(bdyw, "Network__people_api_hostname", "people-pa.googleapis.com");
        f187090c = bdyx.m91607a(bdyw, "Network__restore_contacts_grpc_timeout", 30000L);
    }

    /* renamed from: a */
    public final long mo83915a() {
        return ((Long) f187088a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final String mo83916b() {
        return (String) f187089b.mo58455c();
    }

    /* renamed from: c */
    public final long mo83917c() {
        return ((Long) f187090c.mo58455c()).longValue();
    }
}
