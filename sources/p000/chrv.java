package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: chrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrv {

    /* renamed from: a */
    public String f189059a;

    /* renamed from: b */
    public String f189060b;

    /* renamed from: c */
    private SocketAddress f189061c;

    /* renamed from: d */
    private InetSocketAddress f189062d;

    /* renamed from: a */
    public final chrw mo85583a() {
        return new chrw(this.f189061c, this.f189062d, this.f189059a, this.f189060b);
    }

    /* renamed from: a */
    public final void mo85584a(InetSocketAddress inetSocketAddress) {
        bmxy.m108582a(inetSocketAddress, "targetAddress");
        this.f189062d = inetSocketAddress;
    }

    /* renamed from: a */
    public final void mo85585a(SocketAddress socketAddress) {
        bmxy.m108582a(socketAddress, "proxyAddress");
        this.f189061c = socketAddress;
    }
}
