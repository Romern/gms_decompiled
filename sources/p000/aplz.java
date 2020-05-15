package p000;

import java.util.Arrays;

/* renamed from: aplz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aplz implements rjh, rjj {

    /* renamed from: a */
    public final String f84723a;

    public aplz(aply aply) {
        this.f84723a = aply.f84722a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aplz) {
            return sdg.m34949a(this.f84723a, ((aplz) obj).f84723a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f84723a});
    }
}
