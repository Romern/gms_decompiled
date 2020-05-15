package p000;

/* renamed from: ccut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccut implements ccus {

    /* renamed from: a */
    public static final bdyx f180002a;

    /* renamed from: b */
    public static final bdyx f180003b;

    /* renamed from: c */
    public static final bdyx f180004c;

    /* renamed from: d */
    public static final bdyx f180005d;

    /* renamed from: e */
    public static final bdyx f180006e;

    /* renamed from: f */
    public static final bdyx f180007f;

    /* renamed from: g */
    public static final bdyx f180008g;

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
        f180002a = bdyx.m91610a(bdyw, "MediaSourceFlowControlFeature__audio_never_block_frames", false);
        f180003b = bdyx.m91610a(bdyw, "MediaSourceFlowControlFeature__audio_reset_after_frame_timeout", true);
        f180004c = bdyx.m91607a(bdyw, "MediaSourceFlowControlFeature__extra_additional_depth", 0L);
        f180005d = bdyx.m91607a(bdyw, "MediaSourceFlowControlFeature__max_pending_frames_to_send", 1000000000L);
        f180006e = bdyx.m91610a(bdyw, "MediaSourceFlowControlFeature__pending_frames_includes_senderlib", false);
        f180007f = bdyx.m91610a(bdyw, "MediaSourceFlowControlFeature__video_never_block_frames", false);
        f180008g = bdyx.m91610a(bdyw, "MediaSourceFlowControlFeature__video_reset_after_frame_timeout", false);
    }

    /* renamed from: a */
    public final boolean mo76850a() {
        return ((Boolean) f180002a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76851b() {
        return ((Boolean) f180003b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo76852c() {
        return ((Long) f180004c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final long mo76853d() {
        return ((Long) f180005d.mo58455c()).longValue();
    }

    /* renamed from: e */
    public final boolean mo76854e() {
        return ((Boolean) f180006e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo76855f() {
        return ((Boolean) f180007f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo76856g() {
        return ((Boolean) f180008g.mo58455c()).booleanValue();
    }
}
