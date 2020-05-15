package p000;

import com.google.android.gms.auth.api.credentials.Credential;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: hdw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hdw implements Comparable {

    /* renamed from: a */
    private final String f19550a;

    /* renamed from: b */
    private final String f19551b;

    public hdw(String str, String str2) {
        this.f19550a = str;
        this.f19551b = str2;
    }

    /* renamed from: a */
    public static hdw m14231a(Credential credential) {
        return new hdw(credential.f10092a.toLowerCase(Locale.US), bmxx.m108578b(credential.f10097f));
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hdw hdw = (hdw) obj;
        return bneu.f131545b.mo67473a(this.f19550a, hdw.f19550a).mo67473a(this.f19551b, hdw.f19551b).mo67470a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hdw) {
            hdw hdw = (hdw) obj;
            if (!sdg.m34949a(this.f19550a, hdw.f19550a) || !sdg.m34949a(this.f19551b, hdw.f19551b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19550a, this.f19551b});
    }
}
