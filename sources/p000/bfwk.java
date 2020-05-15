package p000;

import java.util.Arrays;

/* renamed from: bfwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwk {

    /* renamed from: a */
    public final String f115510a;

    /* renamed from: b */
    public final String f115511b;

    public bfwk(String str, String str2) {
        this.f115510a = str;
        this.f115511b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bfwk)) {
            bfwk bfwk = (bfwk) obj;
            if (!this.f115510a.equals(bfwk.f115510a) || !this.f115511b.equals(bfwk.f115511b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f115510a, this.f115511b});
    }

    public final String toString() {
        String str = this.f115510a;
        String str2 = this.f115511b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        return sb.toString();
    }
}
