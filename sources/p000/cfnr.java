package p000;

/* renamed from: cfnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfnr implements cfnq {

    /* renamed from: a */
    public static final bdyx f184597a;

    /* renamed from: b */
    public static final bdyx f184598b;

    /* renamed from: c */
    public static final bdyx f184599c;

    /* renamed from: d */
    public static final bdyx f184600d;

    /* renamed from: e */
    public static final bdyx f184601e;

    /* renamed from: f */
    public static final bdyx f184602f;

    /* renamed from: g */
    public static final bdyx f184603g;

    /* renamed from: h */
    public static final bdyx f184604h;

    /* renamed from: i */
    public static final bdyx f184605i;

    /* renamed from: j */
    public static final bdyx f184606j;

    /* renamed from: k */
    public static final bdyx f184607k;

    /* renamed from: l */
    public static final bdyx f184608l;

    /* renamed from: m */
    public static final bdyx f184609m;

    /* renamed from: n */
    public static final bdyx f184610n;

    /* renamed from: o */
    public static final bdyx f184611o;

    /* renamed from: p */
    public static final bdyx f184612p;

    /* renamed from: q */
    public static final bdyx f184613q;

    /* renamed from: r */
    public static final bdyx f184614r;

    /* renamed from: s */
    public static final bdyx f184615s;

    /* renamed from: t */
    public static final bdyx f184616t;

    /* renamed from: u */
    public static final bdyx f184617u;

    /* renamed from: v */
    public static final bdyx f184618v;

    /* renamed from: w */
    public static final bdyx f184619w;

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
     method: bdyx.a(bdyw, java.lang.String, double):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, double):bdyx */
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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.nearby")).mo58445a("audiomodem:");
        f184597a = bdyx.m91607a(a, "broadcaster_low_volume", 5L);
        f184598b = bdyx.m91607a(a, "broadcaster_max_ultrasound_volume", 5L);
        f184599c = bdyx.m91607a(a, "broadcaster_stopped_threshold_millis", 150L);
        f184600d = bdyx.m91607a(a, "decoding_period_millis", 500L);
        f184601e = bdyx.m91605a(a, "detect_broadcaster_score_threshold", 4.0d);
        f184602f = bdyx.m91605a(a, "dsss_num_token_reps_in_decoding_buffer", 7.0d);
        f184603g = bdyx.m91605a(a, "dtmf_num_token_reps_in_decoding_buffer", 2.5d);
        f184604h = bdyx.m91610a(a, "enable_broadcaster", true);
        f184605i = bdyx.m91610a(a, "enable_receiver", true);
        f184606j = bdyx.m91607a(a, "max_token_guesses_dsss", 1L);
        f184607k = bdyx.m91607a(a, "max_token_guesses_dtmf", 1L);
        f184608l = bdyx.m91607a(a, "processing_period_millis", 0L);
        f184609m = bdyx.m91605a(a, "record_buffer_size_multiplier", 0.5d);
        f184610n = bdyx.m91605a(a, "record_byte_size_multiplier", 8.0d);
        f184611o = bdyx.m91609a(a, "recording_audio_source", "DEFAULT");
        f184612p = bdyx.m91609a(a, "recording_audio_source_fallback", "VOICE_RECOGNITION");
        f184613q = bdyx.m91609a(a, "recording_channel_config", "CHANNEL_IN_DEFAULT");
        f184614r = bdyx.m91607a(a, "recording_sample_rate", 44100L);
        f184615s = bdyx.m91610a(a, "should_record_stereo", false);
        f184616t = bdyx.m91610a(a, "should_use_odp", false);
        f184617u = bdyx.m91607a(a, "start_transition_duration_millis", 5L);
        f184618v = bdyx.m91610a(a, "use_hotsound", false);
        f184619w = bdyx.m91609a(a, "whitelisted_packages", "");
    }

    /* renamed from: a */
    public final long mo81687a() {
        return ((Long) f184597a.mo58455c()).longValue();
    }

    /* renamed from: b */
    public final long mo81688b() {
        return ((Long) f184598b.mo58455c()).longValue();
    }

    /* renamed from: c */
    public final long mo81689c() {
        return ((Long) f184599c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo81690d() {
        return ((Long) f184600d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final double mo81691e() {
        return ((Double) f184601e.mo58455c()).doubleValue();
    }

    /* renamed from: f */
    public final double mo81692f() {
        return ((Double) f184602f.mo58455c()).doubleValue();
    }

    /* renamed from: g */
    public final double mo81693g() {
        return ((Double) f184603g.mo58455c()).doubleValue();
    }

    /* renamed from: h */
    public final boolean mo81694h() {
        return ((Boolean) f184604h.mo58455c()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo81695i() {
        return ((Boolean) f184605i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final long mo81696j() {
        return ((Long) f184606j.mo58455c()).longValue();
    }

    /* renamed from: k */
    public final long mo81697k() {
        return ((Long) f184607k.mo58455c()).longValue();
    }

    /* renamed from: l */
    public final long mo81698l() {
        return ((Long) f184608l.mo58455c()).longValue();
    }

    /* renamed from: m */
    public final double mo81699m() {
        return ((Double) f184609m.mo58455c()).doubleValue();
    }

    /* renamed from: n */
    public final double mo81700n() {
        return ((Double) f184610n.mo58455c()).doubleValue();
    }

    /* renamed from: o */
    public final String mo81701o() {
        return (String) f184611o.mo58455c();
    }

    /* renamed from: p */
    public final String mo81702p() {
        return (String) f184612p.mo58455c();
    }

    /* renamed from: q */
    public final String mo81703q() {
        return (String) f184613q.mo58455c();
    }

    /* renamed from: r */
    public final long mo81704r() {
        return ((Long) f184614r.mo58455c()).longValue();
    }

    /* renamed from: s */
    public final boolean mo81705s() {
        return ((Boolean) f184615s.mo58455c()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo81706t() {
        return ((Boolean) f184616t.mo58455c()).booleanValue();
    }

    /* renamed from: u */
    public final long mo81707u() {
        return ((Long) f184617u.mo58455c()).longValue();
    }

    /* renamed from: v */
    public final boolean mo81708v() {
        return ((Boolean) f184618v.mo58455c()).booleanValue();
    }

    /* renamed from: w */
    public final String mo81709w() {
        return (String) f184619w.mo58455c();
    }
}
