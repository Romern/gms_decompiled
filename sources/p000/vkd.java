package p000;

/* renamed from: vkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vkd {

    /* renamed from: a */
    private static final sbw f49391a = new sbw("JsonValues", "");

    /* renamed from: a */
    static Object m40629a(String str) {
        try {
            return new bkxi(str).mo66427a(bkxg.f125375a);
        } catch (IllegalArgumentException e) {
            f49391a.mo25373b("JsonValues", String.format("Invalid JSON in Realtime data model: %s", str), e);
            return null;
        }
    }
}
