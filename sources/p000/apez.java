package p000;

import java.util.Arrays;

/* renamed from: apez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apez {

    /* renamed from: a */
    private final String f84282a;

    /* renamed from: b */
    private final String f84283b;

    public apez(String str, String str2) {
        this.f84282a = str;
        this.f84283b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apez) {
            apez apez = (apez) obj;
            if (this.f84282a.equals(apez.f84282a)) {
                String str = this.f84283b;
                if (str != null) {
                    return str.equals(apez.f84283b);
                }
                if (apez.f84283b != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f84282a, this.f84283b});
    }
}
