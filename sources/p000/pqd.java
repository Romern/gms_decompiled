package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: pqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pqd {

    /* renamed from: a */
    public final String f40055a;

    /* renamed from: b */
    public long f40056b;

    public pqd(String str) {
        this.f40055a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pqd) {
            pqd pqd = (pqd) obj;
            return TextUtils.equals(this.f40055a, pqd.f40055a) && this.f40056b == pqd.f40056b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40055a, Long.valueOf(this.f40056b)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "GaiaInfo { gaiaAccountName=%s }", this.f40055a);
    }

    public pqd(pqd pqd) {
        this.f40055a = pqd.f40055a;
        this.f40056b = pqd.f40056b;
    }
}
