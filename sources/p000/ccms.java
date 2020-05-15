package p000;

/* renamed from: ccms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccms implements ccmr {

    /* renamed from: a */
    public static final bdyx f179469a;

    /* renamed from: b */
    public static final bdyx f179470b;

    /* renamed from: c */
    public static final bdyx f179471c;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.backup"));
        f179469a = bdyx.m91610a(bdyw, "backup_all_builds_should_always_log", false);
        bdyx.m91610a(bdyw, "backup_enable_pre_lmp_source_components", true);
        bdyx.m91607a(bdyw, "backup_pre_lmp_sleep_between_packets_ms", 100L);
        f179470b = bdyx.m91607a(bdyw, "backup_usb_sender_send_queue_capacity", 50L);
        f179471c = bdyx.m91610a(bdyw, "backup_userdebug_and_eng_builds_should_always_log", true);
    }

    /* renamed from: a */
    public final boolean mo76390a() {
        return ((Boolean) f179469a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final long mo76391b() {
        return ((Long) f179470b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final boolean mo76392c() {
        return ((Boolean) f179471c.mo58455c()).booleanValue();
    }
}
