package p000;

import android.os.Build;

/* renamed from: vym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vym {

    /* renamed from: a */
    private final String f50240a;

    public vym(String str) {
        this.f50240a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vym) {
            return this.f50240a.equals(((vym) obj).f50240a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50240a.hashCode();
    }

    public final String toString() {
        String str = this.f50240a;
        String str2 = Build.FINGERPRINT;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/20.15.15 (120300-{{cl}})/");
        sb.append(str2);
        return sb.toString();
    }
}
