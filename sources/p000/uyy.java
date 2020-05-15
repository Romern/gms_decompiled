package p000;

import java.util.Locale;

/* renamed from: uyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uyy {

    /* renamed from: a */
    public final String f48723a;

    private uyy(String str) {
        this.f48723a = str.toLowerCase(Locale.US);
    }

    /* renamed from: a */
    public static uyy m39807a(String str) {
        boolean z = true;
        if (str != null && str.isEmpty()) {
            z = false;
        }
        sdo.m34974b(z);
        if (str != null) {
            return new uyy(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.f48723a.equals(((uyy) obj).f48723a);
    }

    public final int hashCode() {
        return this.f48723a.hashCode();
    }

    public final String toString() {
        return this.f48723a;
    }

    /* renamed from: a */
    public final boolean mo28124a() {
        return this.f48723a.equals("application/vnd.google-apps.drive-sdk");
    }
}
