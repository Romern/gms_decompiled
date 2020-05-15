package p000;

/* renamed from: skm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class skm {

    /* renamed from: a */
    public static final bdyw f44632a;

    /* renamed from: b */
    public static final bdyx f44633b;

    /* renamed from: c */
    public static final bdyx f44634c = bdyx.m91607a(f44632a, "upload_network_stats_interval", 0L);

    /* renamed from: d */
    public static final bdyx f44635d = bdyx.m91606a(f44632a, "stats:max_num_of_events", 100);

    /* renamed from: e */
    public static final bdyx f44636e = bdyx.m91606a(f44632a, "stats:max_chunk_size", 100);

    /* renamed from: f */
    public static final bdyx f44637f = bdyx.m91607a(f44632a, "stats:writer:timeout_millis", 60000L);

    /* renamed from: g */
    public static final bdyx f44638g = bdyx.m91606a(f44632a, "stats:writer:buffer_size", 20480);

    /* renamed from: h */
    public static final bdyx f44639h = bdyx.m91610a(f44632a, "stats:allow_non_googler_upload", false);

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
        bdyw a = new bdyw("direct_boot:gms_chimera_phenotype_flags").mo58445a("gms:common:");
        f44632a = a;
        f44633b = bdyx.m91607a(a, "upload_internal_stats_interval", 0L);
    }
}
