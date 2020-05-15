package p000;

import java.util.Arrays;

/* renamed from: acps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acps {

    /* renamed from: a */
    final String f60446a;

    /* renamed from: b */
    final bqbd f60447b;

    public acps(acpn acpn) {
        this.f60446a = acpn.f60439j;
        this.f60447b = acpn.f60436g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof acps) {
            acps acps = (acps) obj;
            if (!sdg.m34949a(this.f60446a, acps.f60446a) || !sdg.m34949a(this.f60447b, acps.f60447b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60446a, Integer.valueOf(this.f60447b.mo3214a())});
    }
}
