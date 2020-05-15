package p000;

import java.util.Arrays;

/* renamed from: vwh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwh {
    /* renamed from: a */
    public static final boolean m41491a(String str) {
        return !m41492a(str, cdrq.f181609a.mo6606a().mo78223f());
    }

    /* renamed from: a */
    public static boolean m41492a(String str, String str2) {
        if (str2 != null) {
            return Arrays.asList(str2.split(",")).contains(str);
        }
        return false;
    }
}
