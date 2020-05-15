package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.google.android.gms.cast.util.NetUtils$CastWifiState;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* renamed from: qat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qat {

    /* renamed from: a */
    public static final qav f40827a = new qav("NetUtils");

    /* renamed from: e */
    private static final boolean f40828e = cczj.f180304a.mo6606a().mo77102b();

    /* renamed from: b */
    public final Context f40829b;

    /* renamed from: c */
    public final NetUtils$CastWifiState f40830c;

    /* renamed from: d */
    public boolean f40831d;

    public qat(Context context) {
        NetUtils$CastWifiState netUtils$CastWifiState;
        boolean a = cdap.f180386a.mo6606a().mo77171a();
        this.f40829b = context;
        if (a) {
            netUtils$CastWifiState = new NetUtils$CastWifiState(context);
        } else {
            netUtils$CastWifiState = null;
        }
        this.f40830c = netUtils$CastWifiState;
        if (netUtils$CastWifiState != null) {
            f40827a.mo23861b("Register wifi state receiver.");
            context.registerReceiver(this.f40830c, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            this.f40831d = true;
        }
    }

    /* renamed from: a */
    public static byte[] m31759a(InetAddress inetAddress) {
        if (inetAddress instanceof Inet6Address) {
            return null;
        }
        return new byte[]{inetAddress.getAddress()[2], inetAddress.getAddress()[3]};
    }

    /* renamed from: b */
    public final String mo23850b() {
        WifiInfo connectionInfo;
        NetUtils$CastWifiState netUtils$CastWifiState = this.f40830c;
        String str = null;
        if (netUtils$CastWifiState == null) {
            WifiManager wifiManager = (WifiManager) this.f40829b.getSystemService("wifi");
            if (wifiManager == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return null;
            }
            return connectionInfo.getSSID();
        }
        synchronized (netUtils$CastWifiState) {
            if (this.f40831d) {
                str = this.f40830c.f29927a;
            }
        }
        return str;
    }

    /* renamed from: c */
    public final byte[] mo23851c() {
        Integer d = mo23852d();
        if (d == null) {
            return null;
        }
        return new byte[]{(byte) d.intValue(), (byte) (d.intValue() >> 8)};
    }

    /* renamed from: d */
    public final Integer mo23852d() {
        WifiInfo connectionInfo;
        int ipAddress;
        NetUtils$CastWifiState netUtils$CastWifiState = this.f40830c;
        Integer num = null;
        if (netUtils$CastWifiState == null) {
            WifiManager wifiManager = (WifiManager) this.f40829b.getSystemService("wifi");
            if (wifiManager == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null || (ipAddress = connectionInfo.getIpAddress()) == 0) {
                return null;
            }
            return Integer.valueOf(ipAddress);
        }
        synchronized (netUtils$CastWifiState) {
            if (this.f40831d) {
                num = this.f40830c.f29929c;
            }
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0075 A[SYNTHETIC, Splitter:B:34:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x000e A[SYNTHETIC] */
    /* renamed from: e */
    public final List mo23853e() {
        ArrayList arrayList = new ArrayList();
        try {
            for (pmv pmv : mo23854f()) {
                if (pmv.mo23444a()) {
                    boolean z = true;
                    if (pmv != null) {
                        try {
                            if (!pmv.mo23445b() && !pmv.mo23446c() && !pmv.mo23447d() && pmv.mo23444a() && pmv.mo23448e()) {
                                if (!cczx.m132361b()) {
                                    z = mo23849a(pmv);
                                } else if (!mo23849a(pmv)) {
                                    Iterator it = pmv.mo23449f().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((InterfaceAddress) it.next()).getAddress() instanceof Inet6Address) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                    arrayList.add(pmv);
                                }
                            }
                        } catch (IOException e) {
                            z = false;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
            }
        } catch (IOException e2) {
            f40827a.mo23679f("Exception while selecting network interface", new Object[0]);
        }
        return arrayList;
    }

    /* renamed from: f */
    public final List mo23854f() {
        ArrayList arrayList = new ArrayList();
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces != null) {
            while (networkInterfaces.hasMoreElements()) {
                arrayList.add(new pmv(networkInterfaces.nextElement()));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r3 = r5;
     */
    /* renamed from: g */
    public final boolean mo23855g() {
        List e = mo23853e();
        if (e.isEmpty()) {
            return false;
        }
        int size = e.size();
        int i = 0;
        while (i < size) {
            Iterator it = ((pmv) e.get(i)).mo23449f().iterator();
            while (true) {
                int i2 = i + 1;
                if (!it.hasNext()) {
                    break;
                } else if (!(((InterfaceAddress) it.next()).getAddress() instanceof Inet6Address)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String mo23848a() {
        WifiInfo connectionInfo;
        if (f40828e) {
            return "0:24:b2:df:a9:ed";
        }
        NetUtils$CastWifiState netUtils$CastWifiState = this.f40830c;
        String str = null;
        if (netUtils$CastWifiState == null) {
            WifiManager wifiManager = (WifiManager) this.f40829b.getSystemService("wifi");
            if (wifiManager == null || !wifiManager.isWifiEnabled() || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
                return null;
            }
            return connectionInfo.getBSSID();
        }
        synchronized (netUtils$CastWifiState) {
            if (this.f40831d) {
                str = this.f40830c.f29928b;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final boolean mo23849a(pmv pmv) {
        for (InterfaceAddress interfaceAddress : pmv.mo23449f()) {
            if (interfaceAddress.getAddress() instanceof Inet4Address) {
                return true;
            }
        }
        return false;
    }
}
