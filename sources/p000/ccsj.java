package p000;

/* renamed from: ccsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccsj implements ccsi {

    /* renamed from: a */
    public static final bdyx f179841a;

    /* renamed from: b */
    public static final bdyx f179842b;

    /* renamed from: c */
    public static final bdyx f179843c;

    /* renamed from: d */
    public static final bdyx f179844d;

    /* renamed from: e */
    public static final bdyx f179845e;

    /* renamed from: f */
    public static final bdyx f179846f;

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
        f179841a = bdyx.m91610a(bdyw, "FrameworkAudioBugs__log_audio_sink_config", true);
        f179842b = bdyx.m91610a(bdyw, "FrameworkAudioBugs__quit_audio_capture_thread_early", true);
        f179843c = bdyx.m91610a(bdyw, "FrameworkAudioBugs__release_audio_source_service_from_bh_in_audio_capture_thread", true);
        bdyx.m91610a(bdyw, "FrameworkAudioBugs__save_pending_focus_request", true);
        bdyx.m91610a(bdyw, "FrameworkAudioBugs__skip_audio_reset_after_phone_call_in_p", true);
        f179844d = bdyx.m91610a(bdyw, "FrameworkAudioBugs__skip_audio_reset_after_phone_call_in_q_and_above", false);
        f179845e = bdyx.m91610a(bdyw, "FrameworkAudioBugs__throw_security_exception_when_audio_record_permission_denied_app_op", true);
        f179846f = bdyx.m91610a(bdyw, "FrameworkAudioBugs__use_mixed_audio_policy_for_single_channel_capture", true);
    }

    /* renamed from: a */
    public final boolean mo76711a() {
        return ((Boolean) f179841a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76712b() {
        return ((Boolean) f179842b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76713c() {
        return ((Boolean) f179843c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo76714d() {
        return ((Boolean) f179844d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo76715e() {
        return ((Boolean) f179845e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76716f() {
        return ((Boolean) f179846f.mo58455c()).booleanValue();
    }
}
