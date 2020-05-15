package p000;

/* renamed from: ccpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccpi implements ccph {

    /* renamed from: a */
    public static final bdyx f179682a;

    /* renamed from: b */
    public static final bdyx f179683b;

    /* renamed from: c */
    public static final bdyx f179684c;

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
        f179682a = bdyx.m91610a(bdyw, "AudioFocusFeature__enable_focus_request_during_unsolicited_loss_transient", true);
        f179683b = bdyx.m91610a(bdyw, "AudioFocusFeature__should_stop_media_without_interrupting_guidance", true);
        f179684c = bdyx.m91610a(bdyw, "AudioFocusFeature__skip_initial_focus_request", false);
    }

    /* renamed from: a */
    public final boolean mo76579a() {
        return ((Boolean) f179682a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo76580b() {
        return ((Boolean) f179683b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo76581c() {
        return ((Boolean) f179684c.mo58455c()).booleanValue();
    }
}
