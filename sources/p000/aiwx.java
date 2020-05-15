package p000;

import java.util.Arrays;

/* renamed from: aiwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwx {

    /* renamed from: a */
    public final ajca f69964a;

    public aiwx(byte[] bArr) {
        boolean z;
        if (bArr.length == 20) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "iBeacon ID must be a UUID, a major, and a minor (20 total bytes).");
        this.f69964a = new ajca(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiwx) {
            return sdg.m34949a(this.f69964a, ((aiwx) obj).f69964a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69964a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f69964a.mo38475b());
        short shortValue = this.f69964a.mo38476c().shortValue();
        short shortValue2 = this.f69964a.mo38477d().shortValue();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("IBeaconId{proximityUuid=");
        sb.append(valueOf);
        sb.append(", major=");
        sb.append((int) shortValue);
        sb.append(", minor=");
        sb.append((int) shortValue2);
        sb.append('}');
        return sb.toString();
    }
}
