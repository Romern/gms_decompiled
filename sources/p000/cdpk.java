package p000;

/* renamed from: cdpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdpk implements cdpj {

    /* renamed from: a */
    public static final bdyx f181518a;

    /* renamed from: b */
    public static final bdyx f181519b;

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
        bdyw bdyw = new bdyw("direct_boot:gms_chimera_phenotype_flags");
        f181518a = bdyx.m91607a(bdyw, "uncertified_status", 0L);
        f181519b = bdyx.m91607a(bdyw, "uncertified_status_expiration_time_ms", 0L);
    }

    /* renamed from: a */
    public final long mo78145a() {
        return ((Long) f181518a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo78146b() {
        return ((Long) f181519b.mo58455c()).longValue();
    }
}
