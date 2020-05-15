package p000;

/* renamed from: cdea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdea implements cddy {

    /* renamed from: a */
    public static final bdyx f180557a;

    /* renamed from: b */
    public static final bdyx f180558b;

    /* renamed from: c */
    public static final bdyx f180559c;

    /* renamed from: d */
    public static final bdyx f180560d;

    /* renamed from: e */
    public static final bdyx f180561e;

    /* renamed from: f */
    public static final bdyx f180562f;

    /* renamed from: g */
    public static final bdyx f180563g;

    /* renamed from: h */
    public static final bdyx f180564h;

    /* renamed from: i */
    public static final bdyx f180565i;

    /* renamed from: j */
    public static final bdyx f180566j;

    /* renamed from: k */
    public static final bdyx f180567k;

    /* renamed from: l */
    public static final bdyx f180568l;

    /* renamed from: m */
    public static final bdyx f180569m;

    /* renamed from: n */
    public static final bdyx f180570n;

    /* renamed from: o */
    public static final bdyx f180571o;

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
        bdyw a = new bdyw("direct_boot:com.google.android.gms.playlog.uploader").mo58445a("gms:playlog:logstore:");
        f180557a = bdyx.m91610a(a, "ClearcutLogStore__catch_eofexception_read_logs", false);
        f180558b = bdyx.m91609a(a, "ClearcutLogStore__compression_algorithm_for_flat_file", "NONE");
        bdyx.m91610a(a, "ClearcutLogStore__delete_sqlite_log_store", true);
        bdyx.m91610a(a, "ClearcutLogStore__disable_sqlite_upload", true);
        bdyx.m91610a(a, "disable_wal_journal", false);
        bdyx.m91610a(a, "ClearcutLogStore__enable_direct_boot", true);
        f180559c = bdyx.m91610a(a, "ClearcutLogStore__enforce_log_cap_per_log_source", false);
        f180560d = bdyx.m91607a(a, "ClearcutLogStore__internal_event_age_cutoff_millis", 604800000L);
        try {
            f180561e = bdyx.m91608a(a, "ClearcutLogStore__log_cap_policy", (cahl) GeneratedMessageLite.m124014a(cahl.f174556d, new byte[0]), cddz.f180556a);
            f180562f = bdyx.m91610a(a, "ClearcutLogStore__log_file_age", false);
            f180563g = bdyx.m91607a(a, "log_file_age_cutoff_millis", 604800000L);
            f180564h = bdyx.m91607a(a, "ClearcutLogStore__max_entries_in_file_cache", 400L);
            f180565i = bdyx.m91607a(a, "max_entries_in_file_cache", 40L);
            f180566j = bdyx.m91607a(a, "max_log_file_size_bytes", 1048576L);
            f180567k = bdyx.m91607a(a, "max_storage_size_bytes", 10485760L);
            f180568l = bdyx.m91610a(a, "ClearcutLogStore__read_event_count", true);
            bdyx.m91610a(a, "read_from_flat_file_storage", true);
            bdyx.m91610a(a, "ClearcutLogStore__reorder_events_use_boot_count_uptime", true);
            bdyx.m91610a(a, "sqlite_log_reader_uses_single_query", false);
            f180569m = bdyx.m91610a(a, "timestamp_events_kill_switch", true);
            bdyx.m91607a(a, "vacuum_interval_millis", 0L);
            f180570n = bdyx.m91607a(a, "ClearcutLogStore__warn_byte_threshold", 100000L);
            f180571o = bdyx.m91607a(a, "ClearcutLogStore__warn_event_threshold", 1024L);
            bdyx.m91610a(a, "write_to_flat_file_storage", true);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"ClearcutLogStore__log_cap_policy\"");
        }
    }

    /* renamed from: a */
    public final boolean mo77308a() {
        return ((Boolean) f180557a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final String mo77309b() {
        return (String) f180558b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo77310c() {
        return ((Boolean) f180559c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final long mo77311d() {
        return ((Long) f180560d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final cahl mo77312e() {
        return (cahl) f180561e.mo58455c();
    }

    /* renamed from: f */
    public final boolean mo77313f() {
        return ((Boolean) f180562f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final long mo77314g() {
        return ((Long) f180563g.mo58455c()).longValue();
    }

    /* renamed from: h */
    public final long mo77315h() {
        return ((Long) f180564h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final long mo77316i() {
        return ((Long) f180565i.mo58455c()).longValue();
    }

    /* renamed from: j */
    public final long mo77317j() {
        return ((Long) f180566j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo77318k() {
        return ((Long) f180567k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final boolean mo77319l() {
        return ((Boolean) f180568l.mo58455c()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo77320m() {
        return ((Boolean) f180569m.mo58455c()).booleanValue();
    }

    /* renamed from: n */
    public final long mo77321n() {
        return ((Long) f180570n.mo58455c()).longValue();
    }

    /* renamed from: o */
    public final long mo77322o() {
        return ((Long) f180571o.mo58455c()).longValue();
    }
}
