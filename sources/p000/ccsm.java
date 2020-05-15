package p000;

/* renamed from: ccsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccsm implements ccsl {

    /* renamed from: a */
    public static final bdyx f179849a;

    /* renamed from: b */
    public static final bdyx f179850b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179849a = bdyx.m91607a(bdyw, "FrameworkAudioSaverFeature__audio_saver_storage_limit", 104857600L);
        f179850b = bdyx.m91610a(bdyw, "FrameworkAudioSaverFeature__is_audio_saver_auto_cleanup_enabled", true);
    }

    /* renamed from: a */
    public final long mo76718a() {
        return ((Long) f179849a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final boolean mo76719b() {
        return ((Boolean) f179850b.mo58455c()).booleanValue();
    }
}
