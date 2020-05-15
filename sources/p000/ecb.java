package p000;

import java.util.List;

/* renamed from: ecb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecb {

    /* renamed from: a */
    public final long f14661a;

    /* renamed from: b */
    public final List f14662b;

    /* renamed from: c */
    public final int f14663c;

    public ecb(long j, List list, int i) {
        if (!list.isEmpty()) {
            this.f14661a = j;
            this.f14662b = list;
            this.f14663c = i;
            return;
        }
        throw new IllegalArgumentException("snrs must be non-empty, even if they're all just NO_GPS_SNR");
    }

    public final String toString() {
        long j = this.f14661a;
        String valueOf = String.valueOf(this.f14662b);
        int i = this.f14663c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("GpsFeatureGroup{nanos=");
        sb.append(j);
        sb.append(", snrs=");
        sb.append(valueOf);
        sb.append(", numUsed=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
