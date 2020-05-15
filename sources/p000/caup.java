package p000;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: caup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caup {

    /* renamed from: a */
    public final catk f176065a;

    /* renamed from: b */
    public final Proxy f176066b;

    /* renamed from: c */
    public final InetSocketAddress f176067c;

    public caup(catk catk, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (catk == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f176065a = catk;
            this.f176066b = proxy;
            this.f176067c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof caup) {
            caup caup = (caup) obj;
            return this.f176065a.equals(caup.f176065a) && this.f176066b.equals(caup.f176066b) && this.f176067c.equals(caup.f176067c);
        }
    }

    public final int hashCode() {
        return ((((this.f176065a.hashCode() + 527) * 31) + this.f176066b.hashCode()) * 31) + this.f176067c.hashCode();
    }
}
