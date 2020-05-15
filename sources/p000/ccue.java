package p000;

/* renamed from: ccue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccue implements ccud {

    /* renamed from: a */
    public static final bdyx f179930a;

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
        bdyx.m91610a(bdyw, "ImeFlags__enable_projection_input_service", true);
        f179930a = bdyx.m91610a(bdyw, "ImeFlags__show_ime_on_video_focus_only", true);
    }

    /* renamed from: a */
    public final boolean mo76783a() {
        return ((Boolean) f179930a.mo58455c()).booleanValue();
    }
}
