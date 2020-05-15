package p000;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;

/* renamed from: aiol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiol extends soa {

    /* renamed from: a */
    final String f69344a;

    /* renamed from: b */
    final /* synthetic */ InetAddress f69345b;

    /* renamed from: c */
    final /* synthetic */ ServerSocket f69346c;

    /* renamed from: d */
    final /* synthetic */ aiox f69347d;

    /* renamed from: h */
    final /* synthetic */ ahod f69348h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiol(aiox aiox, int i, InetAddress inetAddress, ServerSocket serverSocket, ahod ahod) {
        super(i);
        this.f69347d = aiox;
        this.f69345b = inetAddress;
        this.f69346c = serverSocket;
        this.f69348h = ahod;
        String valueOf = String.valueOf(this.f69345b);
        int localPort = this.f69346c.getLocalPort();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append(valueOf);
        sb.append("::");
        sb.append(localPort);
        this.f69344a = sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aiox.a(java.net.InetAddress, boolean):void
     arg types: [java.net.InetAddress, int]
     candidates:
      aiox.a(android.net.nsd.NsdServiceInfo, ahfk):aiwf
      aiox.a(java.lang.String, ahod):boolean
      aiox.a(java.lang.String, ahok):boolean
      aiox.a(java.lang.String, android.net.nsd.NsdServiceInfo):boolean
      aiox.a(java.net.InetAddress, boolean):void */
    public final void run() {
        try {
            ails.m57439a();
            while (true) {
                aiwf aiwf = new aiwf(this.f69346c.accept());
                SocketAddress remoteSocketAddress = aiwf.f69929c.getRemoteSocketAddress();
                if (remoteSocketAddress instanceof InetSocketAddress) {
                    InetAddress address = ((InetSocketAddress) remoteSocketAddress).getAddress();
                    this.f69347d.mo37776a(address, true);
                    aiwf.mo37637a(new aioi(this, address));
                    String str = aiwf.f69126a;
                    airo airo = new airo(44);
                    if (airr.SUCCESS == this.f69347d.f69386a.mo37908b(airo)) {
                        aiwf.mo37637a(new aioj(this, airo));
                        this.f69348h.f67650a.mo36910a(aiwf);
                    } else {
                        bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                        bnsl.mo68432a("aiol", "run", 293, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("Failed to create a WifiLanSocket because we were unable to register the MediumOperation.");
                        ails.m57440a(aiwf, "WifiLan", str);
                    }
                } else {
                    String valueOf = String.valueOf(remoteSocketAddress);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    sb.append("Unknown address type: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
        } catch (IOException e) {
            ails.m57444a(this.f69346c, "WifiLan", this.f69344a);
            ails.m57447b();
        } catch (Throwable th) {
            ails.m57447b();
            throw th;
        }
    }
}
