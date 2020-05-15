package p000;

import android.net.Uri;
import java.util.Set;

/* renamed from: brji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brji {

    /* renamed from: a */
    public final String f142895a;

    /* renamed from: b */
    public final String f142896b;

    /* renamed from: c */
    private final String f142897c;

    /* renamed from: d */
    private final String f142898d;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("recoverEmail", 2);
        h.mo67695b("resetPassword", 0);
        h.mo67695b("signIn", 4);
        h.mo67695b("verifyEmail", 1);
        h.mo67695b("verifyBeforeChangeEmail", 5);
        h.mo67695b("revertSecondFactorAddition", 6);
        h.mo67618b();
    }

    private brji(String str) {
        this.f142897c = m114104a(str, "apiKey");
        this.f142895a = m114104a(str, "oobCode");
        String a = m114104a(str, "mode");
        this.f142898d = a;
        if (this.f142897c == null || this.f142895a == null || a == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        m114104a(str, "continueUrl");
        m114104a(str, "languageCode");
        this.f142896b = m114104a(str, "tenantId");
    }

    /* renamed from: a */
    public static brji m114103a(String str) {
        sdo.m34977c(str);
        try {
            return new brji(str);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* renamed from: a */
    private static final String m114104a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException e) {
            return null;
        }
    }
}
