package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkMonitorAutoDetect$NetworkInformation {

    /* renamed from: a */
    public final String f191880a;

    /* renamed from: b */
    public final NetworkMonitorAutoDetect$ConnectionType f191881b;

    /* renamed from: c */
    public final NetworkMonitorAutoDetect$ConnectionType f191882c;

    /* renamed from: d */
    public final long f191883d;

    /* renamed from: e */
    public final NetworkMonitorAutoDetect$IPAddress[] f191884e;

    public NetworkMonitorAutoDetect$NetworkInformation(String str, NetworkMonitorAutoDetect$ConnectionType networkMonitorAutoDetect$ConnectionType, NetworkMonitorAutoDetect$ConnectionType networkMonitorAutoDetect$ConnectionType2, long j, NetworkMonitorAutoDetect$IPAddress[] networkMonitorAutoDetect$IPAddressArr) {
        this.f191880a = str;
        this.f191881b = networkMonitorAutoDetect$ConnectionType;
        this.f191882c = networkMonitorAutoDetect$ConnectionType2;
        this.f191883d = j;
        this.f191884e = networkMonitorAutoDetect$IPAddressArr;
    }

    private NetworkMonitorAutoDetect$ConnectionType getConnectionType() {
        return this.f191881b;
    }

    private long getHandle() {
        return this.f191883d;
    }

    private NetworkMonitorAutoDetect$IPAddress[] getIpAddresses() {
        return this.f191884e;
    }

    private String getName() {
        return this.f191880a;
    }

    private NetworkMonitorAutoDetect$ConnectionType getUnderlyingConnectionTypeForVpn() {
        return this.f191882c;
    }
}
