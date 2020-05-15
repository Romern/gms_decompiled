package p000;

/* renamed from: hmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hmu {

    /* renamed from: a */
    public static final bnic f20045a = bnic.m109492a("credentials_enable_sync", "credentials_enable_service", "credentials_enable_autosignin", "credentials_need_first_time_welcome");

    /* renamed from: a */
    public static quo m14620a(String str, boolean z) {
        String str2;
        bxvd da = quo.f42179d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        quo quo = (quo) da.f164949b;
        str.getClass();
        int i = quo.f42181a | 1;
        quo.f42181a = i;
        quo.f42182b = str;
        if (!z) {
            str2 = "false";
        } else {
            str2 = "true";
        }
        str2.getClass();
        quo.f42181a = i | 2;
        quo.f42183c = str2;
        return (quo) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m14621a(quo quo, boolean z) {
        String str = quo.f42183c;
        if ("true".equalsIgnoreCase(str)) {
            return true;
        }
        if (!"false".equalsIgnoreCase(str)) {
            return z;
        }
        return false;
    }
}
