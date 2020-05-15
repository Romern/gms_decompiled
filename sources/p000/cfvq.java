package p000;

/* renamed from: cfvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfvq implements cfvp {

    /* renamed from: a */
    public static final bdyx f185794a;

    /* renamed from: b */
    public static final bdyx f185795b;

    /* renamed from: c */
    public static final bdyx f185796c;

    /* renamed from: d */
    public static final bdyx f185797d;

    /* renamed from: e */
    public static final bdyx f185798e;

    /* renamed from: f */
    public static final bdyx f185799f;

    /* renamed from: g */
    public static final bdyx f185800g;

    /* renamed from: h */
    public static final bdyx f185801h;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        f185794a = bdyx.m91607a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_interval_seconds", 86400L);
        f185795b = bdyx.m91607a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_task_flex_seconds", 600L);
        f185796c = bdyx.m91610a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_task_is_enabled", true);
        f185797d = bdyx.m91610a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_task_persisted", true);
        f185798e = bdyx.m91610a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_task_requires_charging", true);
        f185799f = bdyx.m91610a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_task_requires_device_idle", false);
        f185800g = bdyx.m91610a(bdyw, "FsaBackupAndSyncOptInValidator__periodic_task_use_flex", false);
        f185801h = bdyx.m91610a(bdyw, "FsaBackupAndSyncOptInValidator__service_enabled", true);
    }

    /* renamed from: a */
    public final long mo82788a() {
        return ((Long) f185794a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo82789b() {
        return ((Long) f185795b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo82790c() {
        return ((Boolean) f185796c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo82791d() {
        return ((Boolean) f185797d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo82792e() {
        return ((Boolean) f185798e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo82793f() {
        return ((Boolean) f185799f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo82794g() {
        return ((Boolean) f185800g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo82795h() {
        return ((Boolean) f185801h.mo58455c()).booleanValue();
    }
}
