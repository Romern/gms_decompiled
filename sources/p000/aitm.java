package p000;

import android.net.Network;
import java.net.InetSocketAddress;

/* renamed from: aitm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aitm extends aiux {

    /* renamed from: a */
    private final Network f69707a;

    /* renamed from: b */
    private final InetSocketAddress f69708b;

    public aitm(Network network, InetSocketAddress inetSocketAddress) {
        if (network != null) {
            this.f69707a = network;
            this.f69708b = inetSocketAddress;
            return;
        }
        throw new NullPointerException("Null network");
    }

    /* renamed from: a */
    public final Network mo37999a() {
        return this.f69707a;
    }

    /* renamed from: b */
    public final InetSocketAddress mo38000b() {
        return this.f69708b;
    }

    public final boolean equals(Object obj) {
        InetSocketAddress inetSocketAddress;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiux) {
            aiux aiux = (aiux) obj;
            return this.f69707a.equals(aiux.mo37999a()) && ((inetSocketAddress = this.f69708b) == null ? aiux.mo38000b() == null : inetSocketAddress.equals(aiux.mo38000b()));
        }
    }

    public final int hashCode() {
        int hashCode = (this.f69707a.hashCode() ^ 1000003) * 1000003;
        InetSocketAddress inetSocketAddress = this.f69708b;
        return hashCode ^ (inetSocketAddress != null ? inetSocketAddress.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f69707a);
        String valueOf2 = String.valueOf(this.f69708b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("NetworkInfo{network=");
        sb.append(valueOf);
        sb.append(", inetSocketAddress=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
