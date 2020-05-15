package p000;

/* renamed from: cdsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cdsa implements cdrx {

    /* renamed from: a */
    public static final bdyx f181627a;

    /* renamed from: b */
    public static final bdyx f181628b;

    /* renamed from: c */
    public static final bdyx f181629c;

    /* renamed from: d */
    public static final bdyx f181630d;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.easysignin"));
        f181627a = bdyx.m91610a(bdyw, "EasySignIn__enabled", false);
        f181628b = bdyx.m91610a(bdyw, "EasySignIn__logging_enabled", true);
        try {
            f181629c = bdyx.m91608a(bdyw, "EasySignIn__public_key1", (byct) GeneratedMessageLite.m124014a(byct.f165701c, new byte[]{10, 91, 48, 89, 48, 19, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 8, 42, -122, 72, -50, 61, 3, 1, 7, 3, 66, 0, 4, 63, 41, -35, -1, -39, 113, -89, -62, 92, 31, -88, 111, -8, 76, 54, -98, 120, 72, 41, -79, 70, 104, 79, -114, 73, 15, -114, 84, -31, -20, -122, -121, 28, 18, 103, -103, 44, -16, -104, 102, -20, -46, 1, 61, 118, -109, 121, 22, -6, -79, -26, -61, -116, -27, 121, -99, -106, -17, -122, 48, 50, 18, 61, 54, 18, 71, 48, 69, 2, 32, 1, -107, -61, 109, -34, -23, 21, -105, 124, 39, 94, -113, 57, -102, 108, 69, 15, -50, 104, -75, 11, 110, 52, -86, -6, 72, 23, 27, -107, -26, 57, -11, 2, 33, 0, -64, Byte.MAX_VALUE, -20, 82, 35, 12, 50, -109, Byte.MAX_VALUE, 126, 28, 54, 124, -66, -61, -70, 95, -98, -108, 20, -30, -11, -108, -88, 113, 52, 82, 115, -84, -110, 116, 84}), cdry.f181625a);
            try {
                f181630d = bdyx.m91608a(bdyw, "EasySignIn__public_key2", (byct) GeneratedMessageLite.m124014a(byct.f165701c, new byte[]{10, 91, 48, 89, 48, 19, 6, 7, 42, -122, 72, -50, 61, 2, 1, 6, 8, 42, -122, 72, -50, 61, 3, 1, 7, 3, 66, 0, 4, 25, -70, -32, 26, -40, 61, 123, -26, -18, 90, 76, 93, -44, -84, -14, -16, -27, -109, -114, -96, -66, -11, -64, 4, -20, 85, -74, -122, -64, -26, -77, -110, 70, 61, -4, -101, 60, -43, 84, -62, -46, -79, 13, -53, -65, 14, -77, 65, 23, -97, -61, -120, 96, -19, -29, 85, -95, 23, 96, -73, -18, -58, -29, -120, 18, 70, 48, 68, 2, 32, 57, -14, -105, 79, 101, 125, -56, -86, -107, 87, -26, 6, 75, 105, 12, -103, -117, -118, 73, 74, 50, -80, 2, -4, 116, 65, -70, -80, -6, 99, -33, 54, 2, 32, 74, 35, 24, -66, 61, -53, 59, 30, -59, -43, -115, 102, 82, 21, 66, 49, -35, -28, 0, -91, 36, 105, -32, -38, -46, -16, -24, -46, -53, -22, 31, -123}), cdrz.f181626a);
            } catch (bxwf e) {
                throw new AssertionError("Could not parse proto flag \"EasySignIn__public_key2\"");
            }
        } catch (bxwf e2) {
            throw new AssertionError("Could not parse proto flag \"EasySignIn__public_key1\"");
        }
    }

    /* renamed from: a */
    public final boolean mo78230a() {
        return ((Boolean) f181627a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo78231b() {
        return ((Boolean) f181628b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final byct mo78232c() {
        return (byct) f181629c.mo58455c();
    }

    /* renamed from: d */
    public final byct mo78233d() {
        return (byct) f181630d.mo58455c();
    }
}
