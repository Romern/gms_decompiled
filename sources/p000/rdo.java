package p000;

import java.util.Arrays;

/* renamed from: rdo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rdo {

    /* renamed from: a */
    public final String f42753a;

    /* renamed from: b */
    public final String f42754b;

    public rdo(String str, String str2) {
        this.f42753a = str;
        this.f42754b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rdo) {
            rdo rdo = (rdo) obj;
            return sdg.m34949a(this.f42753a, rdo.f42753a) && sdg.m34949a(this.f42754b, rdo.f42754b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42753a, this.f42754b});
    }
}
