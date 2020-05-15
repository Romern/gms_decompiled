package org.webrtc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NetworkMonitor {

    /* renamed from: a */
    public volatile NetworkMonitorAutoDetect$ConnectionType f191862a = NetworkMonitorAutoDetect$ConnectionType.CONNECTION_UNKNOWN;

    /* renamed from: b */
    private final ArrayList f191863b = new ArrayList();

    /* renamed from: c */
    private final ArrayList f191864c = new ArrayList();

    /* renamed from: d */
    private final Object f191865d = new Object();

    /* renamed from: e */
    private ciuj f191866e;

    /* renamed from: f */
    private int f191867f = 0;

    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    public static NetworkMonitor getInstance() {
        return ciub.f191463a;
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkMonitorAutoDetect$NetworkInformation[] networkMonitorAutoDetect$NetworkInformationArr);

    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.f191865d) {
            ciuj ciuj = this.f191866e;
            z = false;
            if (ciuj != null && ciuj.f191479d.mo86569b()) {
                z = true;
            }
        }
        return z;
    }

    private void startMonitoring(Context context, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        Network[] networkArr;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Start monitoring with native observer ");
        sb.append(j);
        Logging.m151178a("NetworkMonitor", sb.toString());
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        synchronized (this.f191865d) {
            this.f191867f++;
            if (this.f191866e == null) {
                this.f191866e = new ciuj(new ciua(this), context);
            }
            this.f191862a = ciuj.m151025a(this.f191866e.mo86578a());
        }
        synchronized (this.f191863b) {
            this.f191863b.add(Long.valueOf(j));
        }
        synchronized (this.f191865d) {
            ciuj ciuj = this.f191866e;
            arrayList = null;
            if (ciuj != null) {
                ciud ciud = ciuj.f191479d;
                if (ciud.mo86569b()) {
                    arrayList2 = new ArrayList();
                    ConnectivityManager connectivityManager = ciud.f191464a;
                    if (connectivityManager != null) {
                        networkArr = connectivityManager.getAllNetworks();
                    } else {
                        networkArr = new Network[0];
                    }
                    for (Network network : networkArr) {
                        NetworkMonitorAutoDetect$NetworkInformation a = ciud.mo86567a(network);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                    ciuh ciuh = ciuj.f191480e;
                    if (ciuh != null) {
                        NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation = ciuh.f191473b;
                        if (networkMonitorAutoDetect$NetworkInformation != null) {
                            list = Collections.singletonList(networkMonitorAutoDetect$NetworkInformation);
                        } else {
                            list = Collections.emptyList();
                        }
                        arrayList.addAll(list);
                    }
                }
            }
        }
        if (!(arrayList == null || arrayList.size() == 0)) {
            nativeNotifyOfActiveNetworkList(j, (NetworkMonitorAutoDetect$NetworkInformation[]) arrayList.toArray(new NetworkMonitorAutoDetect$NetworkInformation[arrayList.size()]));
        }
        mo86818b();
    }

    private void stopMonitoring(long j) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("Stop monitoring with native observer ");
        sb.append(j);
        Logging.m151178a("NetworkMonitor", sb.toString());
        synchronized (this.f191865d) {
            int i = this.f191867f - 1;
            this.f191867f = i;
            if (i == 0) {
                ciuj ciuj = this.f191866e;
                ConnectivityManager.NetworkCallback networkCallback = ciuj.f191478c;
                if (networkCallback != null) {
                    ciuj.f191479d.mo86568a(networkCallback);
                }
                ConnectivityManager.NetworkCallback networkCallback2 = ciuj.f191477b;
                if (networkCallback2 != null) {
                    ciuj.f191479d.mo86568a(networkCallback2);
                }
                ciuh ciuh = ciuj.f191480e;
                if (ciuh != null) {
                    ciuh.f191472a.unregisterReceiver(ciuh);
                }
                if (ciuj.f191481f) {
                    ciuj.f191481f = false;
                    ciuj.f191476a.unregisterReceiver(ciuj);
                }
                this.f191866e = null;
            }
        }
        synchronized (this.f191863b) {
            this.f191863b.remove(Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final List mo86817a() {
        ArrayList arrayList;
        synchronized (this.f191863b) {
            arrayList = new ArrayList(this.f191863b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo86818b() {
        ArrayList arrayList;
        List a = mo86817a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            nativeNotifyConnectionTypeChanged(((Long) a.get(i)).longValue());
        }
        synchronized (this.f191864c) {
            arrayList = new ArrayList(this.f191864c);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ciuc) arrayList.get(i2)).mo86565a();
        }
    }

    public native void nativeNotifyOfNetworkConnect(long j, NetworkMonitorAutoDetect$NetworkInformation networkMonitorAutoDetect$NetworkInformation);

    public native void nativeNotifyOfNetworkDisconnect(long j, long j2);
}
