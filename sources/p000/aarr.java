package p000;

import android.text.TextUtils;

/* renamed from: aarr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aarr {

    /* renamed from: a */
    public final String f56375a;

    /* renamed from: b */
    public final int f56376b;

    public aarr(abee abee) {
        this.f56375a = abee.f57183b;
        this.f56376b = abee.f57184c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aarr) {
            aarr aarr = (aarr) obj;
            if (this.f56376b != aarr.f56376b || !TextUtils.equals(this.f56375a, aarr.f56375a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f56375a;
        return str != null ? str.hashCode() * this.f56376b : this.f56376b;
    }
}
