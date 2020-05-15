package p000;

import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import java.util.Arrays;

/* renamed from: aivw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aivw {

    /* renamed from: a */
    public final PeerHandle f69909a;

    /* renamed from: b */
    public final String f69910b;

    /* renamed from: c */
    public final DiscoverySession f69911c;

    /* renamed from: d */
    public byte[] f69912d;

    public aivw(PeerHandle peerHandle, String str, DiscoverySession discoverySession, byte[] bArr) {
        this.f69909a = peerHandle;
        this.f69910b = str;
        this.f69911c = discoverySession;
        this.f69912d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aivw) {
            aivw aivw = (aivw) obj;
            return sdg.m34949a(this.f69909a, aivw.f69909a) && sdg.m34949a(this.f69911c, aivw.f69911c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f69909a, this.f69911c});
    }

    public final String toString() {
        return String.format("WifiAwarePeer{serviceId=%s, sessionId=%s, peerHandle=%s, discoverySession=%s}", this.f69910b, ails.m57438a(this.f69912d), this.f69909a, this.f69911c);
    }
}
