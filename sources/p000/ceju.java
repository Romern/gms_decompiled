package p000;

/* renamed from: ceju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ceju implements cejs {

    /* renamed from: a */
    public static final bdyx f182806a;

    /* renamed from: b */
    public static final bdyx f182807b;

    /* renamed from: c */
    public static final bdyx f182808c;

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
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.growth")).mo58443a();
        try {
            f182806a = bdyx.m91608a(a, "Notifications__log_notification_block_state_channels", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 56, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 103, 114, 111, 119, 116, 104, 46, 110, 111, 116, 105, 102, 105, 99, 97, 116, 105, 111, 110, 115, 46, 103, 111, 111, 103, 108, 101, 95, 103, 117, 105, 100, 101}), cejt.f182805a);
            f182807b = bdyx.m91610a(a, "Notifications__read_gmscore_notification_payload_from_any_proto", false);
            f182808c = bdyx.m91610a(a, "Notifications__wait_for_dsuw_to_dismiss", false);
        } catch (bxwf e) {
            throw new AssertionError("Could not parse proto flag \"Notifications__log_notification_block_state_channels\"");
        }
    }

    /* renamed from: a */
    public final bydj mo79193a() {
        return (bydj) f182806a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo79194b() {
        return ((Boolean) f182807b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo79195c() {
        return ((Boolean) f182808c.mo58455c()).booleanValue();
    }
}
