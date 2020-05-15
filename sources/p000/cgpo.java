package p000;

/* renamed from: cgpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgpo implements cgpn {

    /* renamed from: a */
    public static final bdyx f187461a;

    /* renamed from: b */
    public static final bdyx f187462b;

    /* renamed from: c */
    public static final bdyx f187463c;

    /* renamed from: d */
    public static final bdyx f187464d;

    /* renamed from: e */
    public static final bdyx f187465e;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.smartdevice"));
        f187461a = bdyx.m91610a(bdyw, "DirectTransfer__allow_source_activity_customization", true);
        f187462b = bdyx.m91610a(bdyw, "DirectTransfer__check_3p_in_progress", true);
        f187463c = bdyx.m91610a(bdyw, "DirectTransfer__erase_result_receiver_type", true);
        f187464d = bdyx.m91610a(bdyw, "DirectTransfer__use_account_transfer", true);
        f187465e = bdyx.m91610a(bdyw, "DirectTransfer__wait_sending_complete_message", false);
    }

    /* renamed from: a */
    public final boolean mo84236a() {
        return ((Boolean) f187461a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84237b() {
        return ((Boolean) f187462b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo84238c() {
        return ((Boolean) f187463c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo84239d() {
        return ((Boolean) f187464d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo84240e() {
        return ((Boolean) f187465e.mo58455c()).booleanValue();
    }
}
