package p000;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* renamed from: chrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrw extends chum {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final SocketAddress f189063a;

    /* renamed from: b */
    public final InetSocketAddress f189064b;

    /* renamed from: c */
    public final String f189065c;

    /* renamed from: d */
    public final String f189066d;

    public chrw(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        bmxy.m108582a(socketAddress, "proxyAddress");
        bmxy.m108582a(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            bmxy.m108605b(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f189063a = socketAddress;
        this.f189064b = inetSocketAddress;
        this.f189065c = str;
        this.f189066d = str2;
    }

    /* renamed from: a */
    public static chrv m149474a() {
        return new chrv();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chrw) {
            chrw chrw = (chrw) obj;
            if (!bmxi.m108538a(this.f189063a, chrw.f189063a) || !bmxi.m108538a(this.f189064b, chrw.f189064b) || !bmxi.m108538a(this.f189065c, chrw.f189065c) || !bmxi.m108538a(this.f189066d, chrw.f189066d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f189063a, this.f189064b, this.f189065c, this.f189066d});
    }

    public final String toString() {
        boolean z;
        bmxt a = bmxu.m108563a(this);
        a.mo66885a("proxyAddr", this.f189063a);
        a.mo66885a("targetAddr", this.f189064b);
        a.mo66885a("username", this.f189065c);
        if (this.f189066d != null) {
            z = true;
        } else {
            z = false;
        }
        a.mo66886a("hasPassword", z);
        return a.toString();
    }
}
