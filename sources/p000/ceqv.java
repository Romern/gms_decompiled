package p000;

/* renamed from: ceqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceqv implements ceqt {

    /* renamed from: a */
    public static final bdyx f183328a;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.kids")).mo58443a();
        try {
            bdyx.m91608a(a, "ParentalControlsFeature__allowed_calling_packages", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 10, 45, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 107, 105, 100, 115, 46, 102, 97, 109, 105, 108, 121, 108, 105, 110, 107, 104, 101, 108, 112, 101, 114, 10, 33, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 119, 101, 108, 108, 98, 101, 105, 110, 103}), cequ.f183327a);
            f183328a = bdyx.m91610a(a, "ParentalControlsFeature__enable_local_controls", false);
            bdyx.m91610a(a, "ParentalControlsFeature__send_experimental_droid_guard_blob", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"ParentalControlsFeature__allowed_calling_packages\"");
        }
    }

    /* renamed from: a */
    public final boolean mo79646a() {
        return ((Boolean) f183328a.mo58455c()).booleanValue();
    }
}
