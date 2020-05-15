package p000;

/* renamed from: cfrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfrw implements cfrv {

    /* renamed from: a */
    public static final bdyx f185532a;

    /* renamed from: b */
    public static final bdyx f185533b;

    /* renamed from: c */
    public static final bdyx f185534c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.update"));
        f185532a = bdyx.m91607a(bdyw, "initial_sync_threshold", 4294967296L);
        f185533b = bdyx.m91610a(bdyw, "use_adaptively_aggressive_sync", true);
        f185534c = bdyx.m91610a(bdyw, "use_download_progress_decoupling", true);
    }

    /* renamed from: a */
    public final long mo82583a() {
        return ((Long) f185532a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo82584b() {
        return ((Boolean) f185533b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo82585c() {
        return ((Boolean) f185534c.mo58455c()).booleanValue();
    }
}
