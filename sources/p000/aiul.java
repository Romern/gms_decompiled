package p000;

import android.net.Network;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

/* renamed from: aiul */
final /* synthetic */ class aiul implements Callable {

    /* renamed from: a */
    private final aivd f69792a;

    /* renamed from: b */
    private final aivw f69793b;

    /* renamed from: c */
    private final InetSocketAddress f69794c;

    public aiul(aivd aivd, aivw aivw, InetSocketAddress inetSocketAddress) {
        this.f69792a = aivd;
        this.f69793b = aivw;
        this.f69794c = inetSocketAddress;
    }

    public final Object call() {
        aivd aivd = this.f69792a;
        aivw aivw = this.f69793b;
        InetSocketAddress inetSocketAddress = this.f69794c;
        ails.m57439a();
        Socket socket = new Socket();
        ((Network) aivd.f69852e.get(aivw)).bindSocket(socket);
        socket.connect(inetSocketAddress, (int) cfnv.f184625a.mo6606a().mo81812bd());
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aivd", "a", 796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Successfully connected to a socket on a WiFi Aware network.");
        aivx aivx = new aivx(socket);
        aivx.mo37637a(new aium(aivd, aivw));
        return aivx;
    }
}
