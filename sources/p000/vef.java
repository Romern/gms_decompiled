package p000;

import android.net.NetworkInfo;
import java.util.Arrays;

/* renamed from: vef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vef implements ved {

    /* renamed from: a */
    public final vee f49112a;

    /* renamed from: b */
    public final boolean f49113b;

    /* renamed from: c */
    private final boolean f49114c;

    public vef(veg veg) {
        this.f49112a = veg.mo28344b();
        NetworkInfo c = veg.mo28345c();
        boolean z = false;
        if (c != null && c.isRoaming()) {
            z = true;
        }
        this.f49114c = z;
        this.f49113b = veg.mo28343a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            vef vef = (vef) obj;
            return sdg.m34949a(Boolean.valueOf(this.f49114c), Boolean.valueOf(vef.f49114c)) && sdg.m34949a(Boolean.valueOf(this.f49113b), Boolean.valueOf(vef.f49113b)) && sdg.m34949a(this.f49112a, vef.f49112a);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49112a, Boolean.valueOf(this.f49114c), Boolean.valueOf(this.f49113b)});
    }
}
