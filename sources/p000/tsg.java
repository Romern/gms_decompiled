package p000;

import java.util.Locale;

/* renamed from: tsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tsg {
    /* renamed from: a */
    public static quo m37426a(boolean z, String str) {
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

    /* renamed from: b */
    public static boolean m37429b(bngx bngx) {
        return m37428a(bngx, "credentials_enable_autosignin");
    }

    /* renamed from: a */
    public static boolean m37427a(bngx bngx) {
        return m37428a(bngx, "credentials_enable_service");
    }

    /* renamed from: a */
    private static boolean m37428a(bngx bngx, String str) {
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            quo quo = (quo) i.next();
            int i2 = quo.f42181a;
            if ((i2 & 1) != 0 && (i2 & 2) != 0 && quo.f42182b.equals(str)) {
                return quo.f42183c.toLowerCase(Locale.US).equals("true");
            }
        }
        return true;
    }
}
