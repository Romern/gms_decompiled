package p000;

/* renamed from: ccsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccsg implements ccsf {

    /* renamed from: a */
    public static final bdyx f179833a;

    /* renamed from: b */
    public static final bdyx f179834b;

    /* renamed from: c */
    public static final bdyx f179835c;

    /* renamed from: d */
    public static final bdyx f179836d;

    /* renamed from: e */
    public static final bdyx f179837e;

    /* renamed from: f */
    public static final bdyx f179838f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.car"));
        f179833a = bdyx.m91610a(bdyw, "FrameworkAudioBufferingFeature__can_clear_audio_buffers", false);
        f179834b = bdyx.m91610a(bdyw, "FrameworkAudioBufferingFeature__cannot_clear_audio_buffers", true);
        f179835c = bdyx.m91607a(bdyw, "FrameworkAudioBufferingFeature__minimum_audio_buffers_for_usb", 0L);
        f179836d = bdyx.m91607a(bdyw, "FrameworkAudioBufferingFeature__minimum_audio_buffers_for_usb_navigation", 0L);
        f179837e = bdyx.m91607a(bdyw, "FrameworkAudioBufferingFeature__minimum_audio_buffers_for_wifi", 0L);
        f179838f = bdyx.m91607a(bdyw, "FrameworkAudioBufferingFeature__minimum_audio_buffers_for_wifi_navigation", 0L);
    }

    /* renamed from: a */
    public final boolean mo76704a() {
        return ((Boolean) f179833a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76705b() {
        return ((Boolean) f179834b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo76706c() {
        return ((Long) f179835c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo76707d() {
        return ((Long) f179836d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final long mo76708e() {
        return ((Long) f179837e.mo58455c()).longValue();
    }

    /* renamed from: f */
    public final long mo76709f() {
        return ((Long) f179838f.mo58455c()).longValue();
    }
}
