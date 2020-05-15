package p000;

/* renamed from: ccpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccpf implements ccpc {

    /* renamed from: a */
    public static final bdyx f179677a;

    /* renamed from: b */
    public static final bdyx f179678b;

    /* renamed from: c */
    public static final bdyx f179679c;

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
        f179677a = bdyx.m91610a(bdyw, "enable_audio_codec_preferences", true);
        try {
            f179678b = bdyx.m91608a(bdyw, "usb_preferred_audio_codec_list", (bydh) bxvk.m124014a(bydh.f165789b, new byte[]{10, 3, 1, 2, 4}), ccpd.f179675a);
            try {
                f179679c = bdyx.m91608a(bdyw, "wifi_preferred_audio_codec_list", (bydh) bxvk.m124014a(bydh.f165789b, new byte[]{10, 3, 2, 4, 1}), ccpe.f179676a);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"wifi_preferred_audio_codec_list\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"usb_preferred_audio_codec_list\"");
        }
    }

    /* renamed from: a */
    public final boolean mo76575a() {
        return ((Boolean) f179677a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final bydh mo76576b() {
        return (bydh) f179678b.mo58455c();
    }

    /* renamed from: c */
    public final bydh mo76577c() {
        return (bydh) f179679c.mo58455c();
    }
}
