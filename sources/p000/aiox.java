package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.nsd.NsdServiceInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.mdns.MdnsServiceInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* renamed from: aiox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiox {

    /* renamed from: a */
    public final airs f69386a;

    /* renamed from: b */
    private final Context f69387b;

    /* renamed from: c */
    private final WifiManager f69388c;

    /* renamed from: d */
    private final ConnectivityManager f69389d;

    /* renamed from: e */
    private final ahgq f69390e;

    /* renamed from: f */
    private final Map f69391f = new C1223np();

    /* renamed from: g */
    private final Map f69392g = new C1223np();

    /* renamed from: h */
    private final Map f69393h = new C1223np();

    /* renamed from: i */
    private final Map f69394i = new C1223np();

    /* renamed from: j */
    private final Map f69395j = new C1223np();

    /* renamed from: k */
    private final bqgj f69396k = ahhr.m55806b();

    /* renamed from: l */
    private final aiwe f69397l;

    public aiox(Context context, airs airs) {
        Context applicationContext = context.getApplicationContext();
        this.f69387b = applicationContext;
        this.f69386a = airs;
        this.f69388c = (WifiManager) applicationContext.getSystemService("wifi");
        this.f69389d = (ConnectivityManager) this.f69387b.getSystemService("connectivity");
        this.f69390e = new ahgq(this.f69387b);
        this.f69397l = new aiwe(this.f69387b, this.f69388c);
    }

    /* renamed from: a */
    public static void m57586a(WifiManager wifiManager, InetAddress inetAddress, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (wifiManager.isTdlsSupported()) {
            wifiManager.setTdlsEnabled(inetAddress, z);
        }
    }

    /* renamed from: c */
    public static boolean m57588c() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                if (networkInterfaces.nextElement().supportsMulticast()) {
                    return true;
                }
            }
            return false;
        } catch (SocketException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aiox", "c", 717, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to query networks for multicast support.");
            return false;
        }
    }

    /* renamed from: h */
    public static String m57589h(String str) {
        return String.format("_%s._tcp.local", m57590i(str));
    }

    /* renamed from: i */
    private static String m57590i(String str) {
        return srv.m36164d(ails.m57446a(str.getBytes(), 6));
    }

    /* renamed from: b */
    public final boolean mo37780b() {
        ConnectivityManager connectivityManager;
        return cfnv.f184625a.mo6606a().mo81755aN() && this.f69387b.getPackageManager().hasSystemFeature("android.hardware.wifi") && this.f69388c != null && (connectivityManager = this.f69389d) != null && m57587a(connectivityManager) && !this.f69397l.mo38149c();
    }

    /* renamed from: d */
    public final synchronized void mo37783d(String str) {
        if (!mo37784e(str)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiox", "d", 409, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Can't stop LAN advertising because we're not currently advertising.");
            return;
        }
        this.f69386a.mo37910c((airo) this.f69393h.remove(str));
        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
        bnsl2.mo68432a("aiox", "d", 414, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("Stopped Wifi LAN advertising.");
    }

    /* renamed from: e */
    public final synchronized boolean mo37784e(String str) {
        return this.f69393h.containsKey(str);
    }

    /* renamed from: f */
    public final synchronized void mo37785f(String str) {
        if (mo37786g(str)) {
            this.f69386a.mo37910c((airo) this.f69394i.remove(str));
            this.f69395j.remove(str);
            bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiox", "f", 593, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Stopped Wifi LAN discovery.");
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo37786g(String str) {
        return this.f69394i.containsKey(str);
    }

    /* renamed from: a */
    public static boolean m57587a(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == 1 && networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized aiwf mo37768a(NsdServiceInfo nsdServiceInfo, ahfk ahfk) {
        if (nsdServiceInfo == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiox", "a", 635, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to connect to remote Wifi device because serviceInfo is null.");
            return null;
        }
        return mo37769a(nsdServiceInfo.getHost(), nsdServiceInfo.getPort(), ahfk);
    }

    /* renamed from: c */
    public final synchronized aios mo37782c(String str) {
        return (aios) this.f69392g.get(str);
    }

    /* renamed from: a */
    public final synchronized aiwf mo37769a(InetAddress inetAddress, int i, ahfk ahfk) {
        if (inetAddress == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiox", "a", 647, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to connect to remote Wifi device because ipAddress is null.");
            return null;
        } else if (!mo37780b()) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiox", "a", 652, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Can't connect to remote Wifi device %s because Wifi LAN is not available.", inetAddress);
            return null;
        } else {
            aior aior = new aior(this.f69388c, inetAddress, i, ahfk);
            if (airr.SUCCESS != this.f69386a.mo37908b(aior)) {
                this.f69397l.mo38147a();
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68388c();
                bnsl3.mo68432a("aiox", "a", 662, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to create client Wifi socket because we failed to register the MediumOperation.");
                return null;
            }
            aiwf aiwf = aior.f69369c;
            aiwf.mo37637a(new aiog(this, aior));
            return aiwf;
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo37781b(String str) {
        return this.f69391f.containsKey(str);
    }

    /* renamed from: a */
    public final synchronized void mo37770a() {
        ahhr.m55805a(this.f69396k, "WifiLan.singleThreadOffloader");
        Iterator it = new C1225nr(this.f69394i.keySet()).iterator();
        while (it.hasNext()) {
            mo37785f((String) it.next());
        }
        Iterator it2 = new C1225nr(this.f69393h.keySet()).iterator();
        while (it2.hasNext()) {
            mo37783d((String) it2.next());
        }
        Iterator it3 = new C1225nr(this.f69391f.keySet()).iterator();
        while (it3.hasNext()) {
            mo37773a((String) it3.next());
        }
    }

    /* renamed from: a */
    public final synchronized void mo37771a(airo airo) {
        this.f69386a.mo37910c(airo);
    }

    /* renamed from: a */
    public final void mo37772a(Runnable runnable) {
        this.f69396k.execute(runnable);
    }

    /* renamed from: a */
    public final synchronized void mo37773a(String str) {
        bnsl bnsl;
        String str2;
        if (!mo37781b(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiox", "a", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Can't stop accepting Wifi connections because it was never started.");
            return;
        }
        try {
            ((ServerSocket) this.f69391f.remove(str)).close();
            this.f69392g.remove(str);
            bnsl = (bnsl) ailf.f69111a.mo68390d();
            bnsl.mo68432a("aiox", "a", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            str2 = "Stopped listening for incoming Wifi Lan connections.";
        } catch (IOException e) {
            try {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68387b();
                bnsl3.mo68437a(e);
                bnsl3.mo68432a("aiox", "a", 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Failed to close existing Wifi server socket.");
                this.f69392g.remove(str);
                bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("aiox", "a", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                str2 = "Stopped listening for incoming Wifi Lan connections.";
            } catch (Throwable th) {
                this.f69392g.remove(str);
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68432a("aiox", "a", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Stopped listening for incoming Wifi Lan connections.");
                throw th;
            }
        }
        bnsl.mo68405a(str2);
    }

    /* renamed from: a */
    public final synchronized void mo37774a(String str, MdnsServiceInfo mdnsServiceInfo, ahok ahok) {
        String h = m57589h(str);
        String str2 = mdnsServiceInfo.f80071a;
        if (str2 == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aiox", "a", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Wifi LAN discovered service with null service name. Ignoring.");
            return;
        }
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(str2);
        nsdServiceInfo.setServiceType(h);
        nsdServiceInfo.setPort(mdnsServiceInfo.f80075e);
        for (Map.Entry entry : Collections.unmodifiableMap(mdnsServiceInfo.f80079i).entrySet()) {
            nsdServiceInfo.setAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        String str3 = mdnsServiceInfo.f80076f;
        if (str3 == null) {
            String str4 = mdnsServiceInfo.f80077g;
            if (str4 != null) {
                try {
                    nsdServiceInfo.setHost(InetAddress.getByName(str4));
                } catch (UnknownHostException e) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("aiox", "a", 505, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Discovered %s over Wifi LAN, but with no attached ip address", str2);
                    return;
                }
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aiox", "a", 510, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68420a("Discovered %s over Wifi LAN, but with no attached ip address", str2);
                return;
            }
        } else {
            try {
                nsdServiceInfo.setHost(InetAddress.getByName(str3));
            } catch (UnknownHostException e2) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68388c();
                bnsl4.mo68437a(e2);
                bnsl4.mo68432a("aiox", "a", 497, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Discovered %s over Wifi LAN, but with no attached ip address", str2);
                return;
            }
        }
        if (nsdServiceInfo.getServiceType().contains(h)) {
            if (mo37784e(str)) {
                if (((aiop) this.f69393h.get(str)).f69361a.getServiceName().equals(nsdServiceInfo.getServiceName())) {
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl5.mo68432a("aiox", "a", 524, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68420a("Wifi LAN discovered service %s, but that's us. Ignoring.", str2);
                    return;
                }
            }
            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
            bnsl6.mo68432a("aiox", "a", 529, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68420a("Found service %s on Wifi LAN.", str2);
            aiot aiot = (aiot) this.f69395j.get(str);
            if (aiot == null) {
                bnsl bnsl7 = (bnsl) ailf.f69111a.mo68388c();
                bnsl7.mo68432a("aiox", "a", 532, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68420a("Wifi LAN discovered service %s but service tracker does not exist. Ignoring.", str2);
                return;
            }
            this.f69397l.mo38148b();
            aiot.f69373a.put(str2, nsdServiceInfo);
            ahpm ahpm = ahok.f67657a;
            ahpm.f67734d.mo36847a(new ahpk(ahpm, nsdServiceInfo));
            return;
        }
        bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
        bnsl8.mo68432a("aiox", "a", 516, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl8.mo68425a("Wifi LAN discovered service %s with service type %s, but was looking for services with service type %s.", str2, nsdServiceInfo.getServiceType(), h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo37775a(String str, String str2, ahok ahok) {
        if (str2 != null) {
            aiot aiot = (aiot) this.f69395j.get(str);
            if (aiot == null) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                bnsl.mo68432a("aiox", "a", 554, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Ignoring Wifi LAN lost event for service %s because we're no longer scanning.", str2);
                return;
            }
            NsdServiceInfo nsdServiceInfo = (NsdServiceInfo) aiot.f69373a.remove(str2);
            if (nsdServiceInfo != null) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                bnsl2.mo68432a("aiox", "a", 567, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Lost service %s on Wifi LAN.", str2);
                ahpm ahpm = ahok.f67657a;
                ahpm.f67734d.mo36847a(new ahpl(ahpm, nsdServiceInfo));
                return;
            }
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aiox", "a", 562, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Wifi LAN lost %s but it was never reported as found.", str2);
        }
    }

    /* renamed from: a */
    public final void mo37776a(InetAddress inetAddress, boolean z) {
        m57586a(this.f69388c, inetAddress, z);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x00f1=Splitter:B:46:0x00f1, B:64:0x0141=Splitter:B:64:0x0141} */
    /* renamed from: a */
    public final synchronized boolean mo37777a(String str, ahod ahod) {
        InetAddress inetAddress;
        String str2;
        if (str == null || ahod == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiox", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to start accepting Wifi connections because serviceId and/or acceptedConnectionCallback is null.");
            return false;
        } else if (mo37781b(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aiox", "a", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to start accepting Wifi connections because another Wifi server is already in-progress.");
            return false;
        } else if (!mo37780b()) {
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aiox", "a", 233, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Can't start accepting Wifi connections because Wifi LAN is not available.");
            return false;
        } else {
            ails.m57439a();
            try {
                ServerSocket serverSocket = new ServerSocket();
                int ipAddress = this.f69388c.getConnectionInfo().getIpAddress();
                if (ipAddress == 0) {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    loop0:
                    while (it.hasNext()) {
                        Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                inetAddress = (InetAddress) it2.next();
                                if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    throw new IOException("Failed to find my own IPv4 address.");
                }
                inetAddress = ails.m57449c(ipAddress);
                serverSocket.bind(new InetSocketAddress(inetAddress, 0));
                if (serverSocket.getInetAddress() != null) {
                    if (!serverSocket.getInetAddress().isLoopbackAddress()) {
                        new aiol(this, 9, inetAddress, serverSocket, ahod).start();
                        this.f69391f.put(str, serverSocket);
                        this.f69392g.put(str, new aiiu(serverSocket.getInetAddress(), serverSocket.getLocalPort()));
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl4.mo68432a("aiox", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68405a("Successfully started listening for incoming Wifi Lan connections.");
                        return true;
                    }
                }
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68387b();
                bnsl5.mo68432a("aiox", "a", (int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                if (inetAddress != null) {
                    str2 = "the IP address is a loopback address. (The Server Socket's security manager has denied access to the real IP address.)";
                } else {
                    str2 = "the IP address is unknown (the socket is not bound).";
                }
                bnsl5.mo68420a("Unable to start accepting Wifi connections because %s", str2);
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    bnsl bnsl6 = (bnsl) ailf.f69111a.mo68387b();
                    bnsl6.mo68437a(e);
                    bnsl6.mo68432a("aiox", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("Failed to close Wifi server socket.");
                }
            } catch (IOException e2) {
                bnsl bnsl7 = (bnsl) ailf.f69111a.mo68387b();
                bnsl7.mo68437a(e2);
                bnsl7.mo68432a("aiox", "a", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl7.mo68405a("Failed to start accepting Wifi connections over LAN.");
                ails.m57447b();
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final synchronized boolean mo37778a(String str, ahok ahok) {
        if (str == null || ahok == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiox", "a", 424, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to discover over the local area network because serviceId or discoveredServiceCallback was null.");
            return false;
        } else if (mo37786g(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aiox", "a", 431, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to discover over the local area network because we're already discovering.");
            return false;
        } else {
            aiow aiow = new aiow(this.f69387b, this.f69389d, new aiou(this, str, ahok), str);
            if (airr.FAILURE == this.f69386a.mo37908b(aiow)) {
                srn srn = ailf.f69111a;
                return false;
            }
            this.f69394i.put(str, aiow);
            this.f69395j.put(str, new aiot());
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo37779a(String str, NsdServiceInfo nsdServiceInfo) {
        if (str == null || nsdServiceInfo == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiox", "a", 365, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Refusing to advertise over the local area network because a null serviceId and/or serviceName was passed in.");
            return false;
        } else if (mo37784e(str)) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aiox", "a", 372, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Refusing to advertise over the local area network because we're already advertising.");
            return false;
        } else if (mo37781b(str)) {
            nsdServiceInfo.setServiceType(String.format("_%s._tcp", m57590i(str)));
            nsdServiceInfo.setPort(((ServerSocket) this.f69391f.get(str)).getLocalPort());
            aiop aiop = new aiop(this.f69387b, this.f69389d, this.f69390e, nsdServiceInfo);
            if (airr.FAILURE == this.f69386a.mo37908b(aiop)) {
                srn srn = ailf.f69111a;
                return false;
            }
            this.f69393h.put(str, aiop);
            bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
            bnsl3.mo68432a("aiox", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68424a("Successfully advertised %s on serviceID %s over Wifi LAN.", nsdServiceInfo.getServiceName(), str);
            return true;
        } else {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68387b();
            bnsl4.mo68432a("aiox", "a", 378, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Can't advertise over the local area network because we're not accepting connections.");
            return false;
        }
    }
}
