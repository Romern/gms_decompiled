package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import android.net.wifi.aware.DiscoverySession;
import android.net.wifi.aware.PeerHandle;
import android.net.wifi.aware.WifiAwareManager;
import android.net.wifi.aware.WifiAwareNetworkSpecifier;
import android.os.Build;
import com.felicanetworks.sdu.ErrorInfo;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: aivd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aivd {

    /* renamed from: a */
    public final ConnectivityManager f69848a;

    /* renamed from: b */
    public final aiuw f69849b;

    /* renamed from: c */
    public final aitq f69850c;

    /* renamed from: d */
    public final Map f69851d = new C1223np();

    /* renamed from: e */
    public final Map f69852e = new C1223np();

    /* renamed from: f */
    public final Map f69853f = new C1223np();

    /* renamed from: g */
    private final Context f69854g;

    /* renamed from: h */
    private final bqgj f69855h = ahhr.m55806b();

    /* renamed from: i */
    private final WifiAwareManager f69856i;

    /* renamed from: j */
    private final aivn f69857j;

    /* renamed from: k */
    private final airs f69858k;

    /* renamed from: l */
    private final Map f69859l = new C1223np();

    /* renamed from: m */
    private final Map f69860m = new C1223np();

    /* renamed from: n */
    private final Map f69861n = new C1223np();

    /* renamed from: o */
    private final Map f69862o = new C1223np();

    public aivd(Context context, aitq aitq, aivn aivn, airs airs) {
        Context applicationContext = context.getApplicationContext();
        this.f69854g = applicationContext;
        this.f69850c = aitq;
        this.f69857j = aivn;
        this.f69858k = airs;
        this.f69848a = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        this.f69856i = (WifiAwareManager) this.f69854g.getSystemService("wifiaware");
        this.f69849b = new aiuw(this.f69856i, this.f69854g);
        aitq.mo38016a(new aiuh(this));
    }

    /* renamed from: a */
    private final int m57984a(aivw aivw, aiuc aiuc, ahfk ahfk) {
        ails.m57439a();
        Callable callable = aiuj.f69788a;
        butj butj = new butj(cfnv.m140759U());
        butj.f154849a = ahfk.mo36402c();
        ServerSocket serverSocket = (ServerSocket) butl.m120433a(callable, "BindWifiAwareServerSocket", butj.mo73110a());
        if (serverSocket == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aivd", "a", 631, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to host WiFi Aware server socket.");
            return 0;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aivd", "a", 635, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Successfully hosted WiFi Aware server socket.");
        new aiur(this, 9, serverSocket, aivw, aiuc).start();
        this.f69862o.put(aivw, serverSocket);
        return serverSocket.getLocalPort();
    }

    /* renamed from: c */
    private final boolean m57989c(aivw aivw) {
        return this.f69851d.containsKey(aivw);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: f */
    public static String m57990f(String str) {
        return sqd.m35972d(str.getBytes()).replace('_', '.');
    }

    /* renamed from: b */
    public final synchronized void mo38099b(aivw aivw) {
        if (!m57989c(aivw)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "b", 816, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Can't disconnect from %s because we are not connected to that peer.", aivw);
            return;
        }
        try {
            this.f69848a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f69851d.get(aivw));
        } catch (IllegalArgumentException e) {
        }
        this.f69850c.mo38026d(aivw.f69911c);
        ServerSocket serverSocket = (ServerSocket) this.f69862o.remove(aivw);
        if (serverSocket != null) {
            ails.m57444a(serverSocket, "WifiAwareImpl", "listeningSocket");
            ails.m57447b();
        }
        this.f69851d.remove(aivw);
        this.f69852e.remove(aivw);
        this.f69853f.remove(aivw);
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aivd", "b", 838, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Disconnected from WiFi Aware network with %s.", aivw);
    }

    /* renamed from: d */
    public final synchronized void mo38104d(String str) {
        if (!mo38103c(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "d", 500, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop WiFi Aware subscribing because it was never started.");
            return;
        }
        this.f69858k.mo37910c((airo) this.f69860m.remove(str));
    }

    /* renamed from: d */
    public final byte[] mo38105d() {
        return this.f69849b.f69823c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo38106e() {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aivd", "e", 254, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("All DiscoverySessions are closed. Closing WifiAwareSession.");
        this.f69849b.mo38074b();
    }

    /* renamed from: c */
    public final synchronized void mo38102c() {
        this.f69850c.mo38024c();
        this.f69850c.mo38020b();
    }

    /* renamed from: e */
    public final synchronized void mo38107e(String str) {
        this.f69850c.mo38023b(str);
        this.f69850c.mo38017a(str);
    }

    /* renamed from: c */
    public final synchronized boolean mo38103c(String str) {
        return this.f69860m.containsKey(str);
    }

    /* renamed from: b */
    public final synchronized void mo38100b(String str) {
        if (!mo38096a(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "b", 340, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop WiFi Aware publishing because it was never started.");
            return;
        }
        this.f69858k.mo37910c((airo) this.f69859l.remove(str));
    }

    /* renamed from: a */
    private final int m57985a(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        try {
            return bqcn.m112579a((byte[]) list.get(0));
        } catch (IllegalArgumentException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aivd", "a", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to parse version from match filter %s", ails.m57438a((byte[]) list.get(0)));
            return 0;
        }
    }

    /* renamed from: b */
    public final boolean mo38101b() {
        if (!cfnv.f184625a.mo6606a().mo81750aI()) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return (!this.f69854g.getPackageManager().hasSystemFeature("android.hardware.wifi.aware") || this.f69848a == null || this.f69856i == null) ? false : true;
    }

    /* renamed from: a */
    private final NetworkSpecifier m57986a(aivw aivw, String str) {
        int i = Build.VERSION.SDK_INT;
        WifiAwareNetworkSpecifier.Builder builder = new WifiAwareNetworkSpecifier.Builder(aivw.f69911c, aivw.f69909a);
        if (str != null) {
            builder.setPskPassphrase(str);
            ServerSocket serverSocket = (ServerSocket) this.f69862o.get(aivw);
            if (serverSocket != null) {
                builder.setPort(serverSocket.getLocalPort());
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    private static Inet6Address m57987a(LinkProperties linkProperties) {
        Inet6Address inet6Address;
        try {
            NetworkInterface byName = NetworkInterface.getByName(linkProperties.getInterfaceName());
            if (byName == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aivd", "a", 881, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to get WiFi Aware NetworkInterface");
                return null;
            }
            Enumeration<InetAddress> inetAddresses = byName.getInetAddresses();
            while (true) {
                if (!inetAddresses.hasMoreElements()) {
                    inet6Address = null;
                    break;
                }
                InetAddress nextElement = inetAddresses.nextElement();
                if (nextElement instanceof Inet6Address) {
                    inet6Address = (Inet6Address) nextElement;
                    if (inet6Address.isLinkLocalAddress()) {
                        break;
                    }
                }
            }
            if (inet6Address != null) {
                return inet6Address;
            }
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aivd", "a", 887, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to find link-local IPv6 address");
            return null;
        } catch (SocketException e) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aivd", "a", 876, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to parse the NetworkInterface");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m57988a(airr airr) {
        airr airr2 = airr.UNKNOWN;
        int ordinal = airr.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new AssertionError(String.format("Unknown RegistrationResult %s", airr));
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ aivx mo38085a(aivw aivw, InetSocketAddress inetSocketAddress) {
        ails.m57439a();
        Socket socket = new Socket();
        ((Network) this.f69852e.get(aivw)).bindSocket(socket);
        socket.connect(inetSocketAddress, (int) cfnv.f184625a.mo6606a().mo81812bd());
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aivd", "a", 796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Successfully connected to a socket on a WiFi Aware network.");
        aivx aivx = new aivx(socket);
        aivx.mo37637a(new aium(this, aivw));
        return aivx;
    }

    /* renamed from: a */
    public final synchronized aivx mo38086a(aivw aivw, InetSocketAddress inetSocketAddress, ahfk ahfk) {
        if (!m57989c(aivw)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "a", 774, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Can't connect to %s for %s because we are not connected to a WiFi Aware network.", inetSocketAddress, aivw);
            return null;
        } else if (!this.f69852e.containsKey(aivw)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aivd", "a", 781, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("Can't connect to %s for %s because we did not join a remote WiFi Aware network.", inetSocketAddress, aivw);
            return null;
        } else {
            aiul aiul = new aiul(this, aivw, inetSocketAddress);
            butj butj = new butj(cfnv.m140759U());
            butj.f154849a = ahfk.mo36402c();
            return (aivx) butl.m120433a(aiul, "ConnectWifiAwareSocket", butj.mo73110a());
        }
    }

    /* renamed from: a */
    public final synchronized InetSocketAddress mo38087a(aivw aivw) {
        return this.f69853f.containsKey(aivw) ? ((aiux) this.f69853f.get(aivw)).mo38000b() : null;
    }

    /* renamed from: a */
    public final synchronized void mo38088a() {
        ahhr.m55805a(this.f69855h, "WifiAwareImpl.singleThreadOffloader");
        Iterator it = new C1225nr(this.f69859l.keySet()).iterator();
        while (it.hasNext()) {
            mo38100b((String) it.next());
        }
        Iterator it2 = new C1225nr(this.f69860m.keySet()).iterator();
        while (it2.hasNext()) {
            mo38104d((String) it2.next());
        }
        Iterator it3 = new C1225nr(this.f69851d.keySet()).iterator();
        while (it3.hasNext()) {
            mo38099b((aivw) it3.next());
        }
        this.f69850c.mo38011a();
        this.f69849b.mo38074b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo38089a(aivw aivw, NetworkRequest networkRequest) {
        try {
            bqgy c = bqgy.m112818c();
            aius aius = new aius(c, aivw);
            this.f69848a.requestNetwork(networkRequest, aius, ((int) cfnv.f184625a.mo6606a().mo81813be()) * 1000);
            aiux aiux = (aiux) c.get();
            this.f69851d.put(aivw, aius);
            this.f69852e.put(aivw, aiux.mo37999a());
            this.f69853f.put(aivw, aiux);
            this.f69850c.mo38025c(aivw.f69911c);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "a", 746, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Successfully joined a WiFi Aware network.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public final synchronized void mo38090a(LinkProperties linkProperties, int i, aiuc aiuc) {
        Inet6Address a = m57987a(linkProperties);
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aivd", "a", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to obtain our own local IP address despite forming a WiFi Aware network.");
            return;
        }
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aivd", "a", 605, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68420a("Received a WiFi Aware ip address (%s).", a);
        aiuc.f69767c.mo38053a(new aiua(aiuc, aiuc.f69765a, a.getHostAddress(), i, aiuc.f69766b));
    }

    /* renamed from: a */
    public final synchronized void mo38091a(DiscoverySession discoverySession, PeerHandle peerHandle, String str, byte[] bArr, List list, aimm aimm) {
        byte[] bArr2;
        aivc aivc = (aivc) this.f69860m.get(str);
        if ((aivc != null ? aivc.f69844c : null) == discoverySession) {
            int i = 0;
            if (!list.isEmpty()) {
                try {
                    i = bqcn.m112579a((byte[]) list.get(0));
                } catch (IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("aivd", "a", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Failed to parse version from match filter %s", ails.m57438a((byte[]) list.get(0)));
                }
            }
            if (i == 1) {
                if (list.size() < 2) {
                    bArr2 = new byte[2];
                } else {
                    bArr2 = (byte[]) list.get(1);
                    if (bArr2 == null) {
                        bArr2 = new byte[2];
                    }
                }
                aivw aivw = new aivw(peerHandle, str, discoverySession, bArr2);
                if (bArr.length > 0) {
                    srn srn = ailf.f69111a;
                    ails.m57438a(bArr);
                    ails.m57438a(bArr2);
                    this.f69850c.mo38013a(discoverySession, aivw);
                    aimm.f69192a.f67658a.mo36908a(aivw, bArr);
                    this.f69861n.put(Short.valueOf(bqct.m112601a(bArr2)), aivw);
                } else {
                    srn srn2 = ailf.f69111a;
                    ails.m57438a(bArr);
                    ails.m57438a(bArr2);
                    aivw aivw2 = (aivw) this.f69861n.remove(Short.valueOf(bqct.m112601a(bArr2)));
                    if (aivw2 != null) {
                        this.f69850c.mo38022b(discoverySession, aivw2);
                        aimm.f69192a.f67658a.mo36907a(aivw2);
                    }
                }
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aivd", "a", 464, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Processed discovered WifiAwarePeer");
                return;
            }
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aivd", "a", 427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68409a("Discovered a remote WiFi Aware advertisement with unknown version %d. Ignoring.", i);
            return;
        }
        srn srn3 = ailf.f69111a;
        ails.m57438a(bArr);
    }

    /* renamed from: a */
    public final void mo38092a(Runnable runnable) {
        this.f69855h.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized boolean mo38093a(aivw aivw, String str, ahfk ahfk) {
        if (m57989c(aivw)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aivd", "a", 664, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't join a WiFi Aware network because we've already joined a network.");
            return false;
        }
        aiuk aiuk = new aiuk(this, aivw, new NetworkRequest.Builder().addTransportType(5).setNetworkSpecifier(m57986a(aivw, str)).build());
        butj butj = new butj(0);
        butj.f154849a = ahfk.mo36402c();
        return butl.m120434a(aiuk, "RequestWifiAwareNetwork", butj.mo73110a());
    }

    /* renamed from: a */
    public final synchronized boolean mo38094a(aivw aivw, String str, aiuc aiuc) {
        return mo38095a(aivw, str, aiuc, new ahfk());
    }

    /* renamed from: a */
    public final synchronized boolean mo38095a(aivw aivw, String str, aiuc aiuc, ahfk ahfk) {
        int i;
        if (!m57989c(aivw)) {
            ails.m57439a();
            Callable callable = aiuj.f69788a;
            butj butj = new butj(cfnv.m140759U());
            butj.f154849a = ahfk.mo36402c();
            ServerSocket serverSocket = (ServerSocket) butl.m120433a(callable, "BindWifiAwareServerSocket", butj.mo73110a());
            if (serverSocket == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
                bnsl.mo68432a("aivd", "a", 631, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Failed to host WiFi Aware server socket.");
                i = 0;
            } else {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aivd", "a", 635, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Successfully hosted WiFi Aware server socket.");
                new aiur(this, 9, serverSocket, aivw, aiuc).start();
                this.f69862o.put(aivw, serverSocket);
                i = serverSocket.getLocalPort();
            }
            if (i != 0) {
                NetworkRequest build = new NetworkRequest.Builder().addTransportType(5).setNetworkSpecifier(m57986a(aivw, str)).build();
                aiup aiup = new aiup(this, i, aiuc);
                this.f69848a.requestNetwork(build, aiup);
                this.f69851d.put(aivw, aiup);
                this.f69850c.mo38025c(aivw.f69911c);
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aivd", "a", 566, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Successfully hosted a WiFi Aware network.");
                return true;
            }
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
            bnsl4.mo68432a("aivd", "a", 528, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Failed to obtain a port when hosting the WiFi Aware network.");
            return false;
        }
        bnsl bnsl5 = (bnsl) ailf.f69111a.mo68388c();
        bnsl5.mo68432a("aivd", "a", 520, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl5.mo68420a("Cannot host WiFi Aware network for %s because we are already connected to them.", aivw);
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo38096a(String str) {
        return this.f69859l.containsKey(str);
    }

    /* renamed from: a */
    public final synchronized boolean mo38097a(String str, aimm aimm) {
        if (str == null || aimm == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aivd", "a", 354, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start WiFi Aware subscribing because one of serviceId or discoveredPeerCallback is null.");
            return false;
        } else if (mo38103c(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aivd", "a", 361, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to start WiFi Aware subscribing because we're already subscribed.");
            return false;
        } else if (!mo38101b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aivd", "a", 367, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to start WiFi Aware subscribing because WiFi Aware is unavailable.");
            return false;
        } else {
            aivc aivc = new aivc(this.f69849b, str, this.f69857j, this.f69850c, new aiui(this, str, aimm));
            if (!m57988a(this.f69858k.mo37908b(aivc))) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68432a("aivd", "a", 393, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Unable to start WiFi Aware subscribing because the MediumOperation failed to register.");
                return false;
            }
            this.f69860m.put(str, aivc);
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo38098a(String str, byte[] bArr) {
        if (str == null || bArr == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aivd", "a", (int) ErrorInfo.TYPE_FSC_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start WiFi Aware publishing because one of serviceId or serviceInfo is null.");
            return false;
        } else if (mo38096a(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aivd", "a", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to start WiFi Aware publishing because we're already publishing.");
            return false;
        } else if (!mo38101b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
            bnsl3.mo68432a("aivd", "a", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unable to start WiFi Aware publishing because WiFi Aware is unavailable.");
            return false;
        } else {
            aiuz aiuz = new aiuz(this.f69849b, str, bArr, this.f69857j, this.f69850c);
            if (!m57988a(this.f69858k.mo37908b(aiuz))) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
                bnsl4.mo68432a("aivd", "a", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Unable to start WiFi Aware publishing because the MediumOperation failed to register.");
                return false;
            }
            this.f69859l.put(str, aiuz);
            return true;
        }
    }
}
