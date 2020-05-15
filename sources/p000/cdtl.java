package p000;

/* renamed from: cdtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdtl implements cdtj {

    /* renamed from: a */
    public static final bdyx f181700a;

    /* renamed from: b */
    public static final bdyx f181701b;

    /* renamed from: c */
    public static final bdyx f181702c;

    /* JADX WARN: Type inference failed for: r3v2, types: [byte[]], assign insn: 0x0020: NEW_ARRAY  (r3v2 ? I:byte[]) = (549 int) type: byte[] */
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
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.family"));
        f181700a = bdyx.m91610a(bdyw, "WebSupervision__enable_web_supervision_for_all", false);
        f181701b = bdyx.m91610a(bdyw, "WebSupervision__enable_web_supervision_for_clickable_rows", false);
        try {
            f181702c = bdyx.m91608a(bdyw, "WebSupervision__webview_urls", (cdtn) bxvk.m124014a(cdtn.f181706e, (byte[]) new byte[]{10, 19, 102, 97, 109, 105, 108, 105, 101, 115, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 36, 102, 97, 109, 105, 108, 105, 101, 115, 45, 97, 117, 116, 111, 112, 117, 115, 104, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 48, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 49, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 50, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 51, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 52, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 53, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 10, 35, 102, 97, 109, 105, 108, 105, 101, 115, 45, 100, 97, 105, 108, 121, 45, 54, 46, 115, 97, 110, 100, 98, 111, 120, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 18, 35, 10, 10, 102, 97, 109, 105, 108, 121, 108, 105, 110, 107, 10, 7, 112, 114, 105, 118, 97, 99, 121, 10, 12, 99, 104, 105, 108, 100, 45, 112, 111, 108, 105, 99, 121, 18, 39, 10, 10, 102, 97, 109, 105, 108, 121, 108, 105, 110, 107, 10, 7, 112, 114, 105, 118, 97, 99, 121, 10, 16, 99, 104, 105, 108, 100, 45, 100, 105, 115, 99, 108, 111, 115, 117, 114, 101, 26, 15, 115, 115, 108, 46, 103, 115, 116, 97, 116, 105, 99, 46, 99, 111, 109, 26, 15, 119, 119, 119, 46, 103, 115, 116, 97, 116, 105, 99, 46, 99, 111, 109, 26, 17, 102, 111, 110, 116, 115, 46, 103, 115, 116, 97, 116, 105, 99, 46, 99, 111, 109, 26, 25, 108, 104, 51, 46, 103, 111, 111, 103, 108, 101, 117, 115, 101, 114, 99, 111, 110, 116, 101, 110, 116, 46, 99, 111, 109, 26, 13, 108, 104, 51, 46, 103, 103, 112, 104, 116, 46, 99, 111, 109, 34, 56, 104, 116, 116, 112, 115, 58, 47, 47, 112, 108, 97, 121, 46, 103, 111, 111, 103, 108, 101, 46, 99, 111, 109, 47, 105, 110, 116, 108, 47, 101, 110, 95, 117, 115, 47, 98, 97, 100, 103, 101, 115, 47, 105, 109, 97, 103, 101, 115, 47, 103, 101, 110, 101, 114, 105, 99}), cdtk.f181699a);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"WebSupervision__webview_urls\"");
        }
    }

    /* renamed from: a */
    public final boolean mo78288a() {
        return ((Boolean) f181700a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78289b() {
        return ((Boolean) f181701b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final cdtn mo78290c() {
        return (cdtn) f181702c.mo58455c();
    }
}
