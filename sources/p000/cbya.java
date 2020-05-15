package p000;

/* renamed from: cbya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbya implements cbxz {

    /* renamed from: a */
    public static final bdyx f178546a;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.auth_account"));
        bdyx.m91610a(bdyw, "ControlledActivityFeatures__enable_chimera_request_extras", true);
        f178546a = bdyx.m91610a(bdyw, "enable_controlled_activity_session_extras", false);
    }

    /* renamed from: a */
    public final boolean mo75601a() {
        return ((Boolean) f178546a.mo58455c()).booleanValue();
    }
}
