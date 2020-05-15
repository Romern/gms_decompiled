package p000;

/* renamed from: cgmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgmc implements cgmb {

    /* renamed from: a */
    public static final bdyx f187308a;

    /* renamed from: b */
    public static final bdyx f187309b;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.signin"));
        f187308a = bdyx.m91610a(bdyw, "CommonAccountAccountPickerRefactoring__phone_enabled", false);
        f187309b = bdyx.m91610a(bdyw, "CommonAccountAccountPickerRefactoring__simple_picker_enabled", false);
        bdyx.m91610a(bdyw, "CommonAccountAccountPickerRefactoring__wearable_enabled", false);
    }

    /* renamed from: a */
    public final boolean mo84113a() {
        return ((Boolean) f187308a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo84114b() {
        return ((Boolean) f187309b.mo58455c()).booleanValue();
    }
}
