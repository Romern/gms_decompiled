package p000;

/* renamed from: cgsz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgsz implements cgsy {

    /* renamed from: a */
    public static final bdyx f187687a;

    /* renamed from: b */
    public static final bdyx f187688b;

    /* renamed from: c */
    public static final bdyx f187689c;

    /* renamed from: d */
    public static final bdyx f187690d;

    /* renamed from: e */
    public static final bdyx f187691e;

    /* renamed from: f */
    public static final bdyx f187692f;

    /* renamed from: g */
    public static final bdyx f187693g;

    /* renamed from: h */
    public static final bdyx f187694h;

    /* renamed from: i */
    public static final bdyx f187695i;

    /* renamed from: j */
    public static final bdyx f187696j;

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
        bdyw a = new bdyw("com.google.android.metrics").mo58445a("gms:stats:");
        f187687a = bdyx.m91610a(a, "DropBox__broadcast_enabled", true);
        f187688b = bdyx.m91607a(a, "DropBox__default_max_entry_size", 196608L);
        f187689c = bdyx.m91610a(a, "DropBox__is_charging_required", true);
        f187690d = bdyx.m91609a(a, "DropBox__logcat_start", "(?m)^(stack:|memory near|\\-\\-\\-\\-\\-\\-\\-\\-\\- beginning of)");
        f187691e = bdyx.m91607a(a, "DropBox__max_split", 100L);
        f187692f = bdyx.m91610a(a, "DropBox__package_manager", false);
        f187693g = bdyx.m91609a(a, "DropBox__package_pattern", "Package: ((?:\\w+\\.)*\\w+) v(\\d+) \\(((?:[^()]+|(?:\\([^)]*\\)?)+)+)\\)");
        f187694h = bdyx.m91607a(a, "DropBox__record_interval_secs", 86400L);
        f187695i = bdyx.m91610a(a, "DropBox__split_entries", true);
        f187696j = bdyx.m91610a(a, "use_phenotype_flags_for_dropbox_task", false);
    }

    /* renamed from: a */
    public final boolean mo84431a() {
        return ((Boolean) f187687a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo84432b() {
        return ((Long) f187688b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo84433c() {
        return ((Boolean) f187689c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final String mo84434d() {
        return (String) f187690d.mo58455c();
    }

    /* renamed from: e */
    public final long mo84435e() {
        return ((Long) f187691e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final boolean mo84436f() {
        return ((Boolean) f187692f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final String mo84437g() {
        return (String) f187693g.mo58455c();
    }

    /* renamed from: h */
    public final long mo84438h() {
        return ((Long) f187694h.mo58455c()).longValue();
    }

    /* renamed from: i */
    public final boolean mo84439i() {
        return ((Boolean) f187695i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo84440j() {
        return ((Boolean) f187696j.mo58455c()).booleanValue();
    }
}
