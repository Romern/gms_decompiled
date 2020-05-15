package p000;

import android.location.Location;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Pair;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.WifiScan;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.ulr.ApiLocationStatus;
import com.google.android.ulr.ApiMetadata;
import com.google.android.ulr.ApiRate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: bgtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgtu {

    /* renamed from: a */
    public final bgyf f117525a;

    /* renamed from: b */
    public final bguh f117526b;

    /* renamed from: c */
    public final bgzf f117527c;

    /* renamed from: d */
    public final bgxg f117528d;

    /* renamed from: e */
    private final WifiManager f117529e;

    public bgtu(bgyf bgyf, bguh bguh, bgzf bgzf, bgxg bgxg, WifiManager wifiManager) {
        this.f117525a = bgyf;
        this.f117526b = bguh;
        this.f117527c = bgzf;
        this.f117528d = bgxg;
        this.f117529e = wifiManager;
    }

    /* renamed from: a */
    public static long m99929a(bgyf bgyf) {
        if (bgyf.f118016h) {
            return chcs.f188354a.mo6606a().mo85072ah();
        }
        return chcs.m148245q();
    }

    /* renamed from: a */
    public static void m99930a(ReportingConfig reportingConfig, bgxg bgxg) {
        String valueOf = String.valueOf(reportingConfig.mo70931e());
        if (valueOf.length() == 0) {
            new String("Location reporting no longer active, stopping; reasons: ");
        } else {
            "Location reporting no longer active, stopping; reasons: ".concat(valueOf);
        }
        bgxg.mo63313a(reportingConfig, "LocationReceiver.handleInactive");
    }

    /* renamed from: a */
    public static final boolean m99931a(long j, long j2, long j3) {
        return j3 - j2 < TimeUnit.MILLISECONDS.toNanos(j);
    }

    /* renamed from: a */
    public final void mo63163a(ReportingConfig reportingConfig, bxvd bxvd, Location location) {
        long j;
        long j2;
        ArrayList<bgvz> arrayList;
        long j3;
        long j4;
        boolean z;
        WifiInfo wifiInfo;
        String str;
        int i;
        WifiScan wifiScan;
        long j5;
        long j6;
        ReportingConfig reportingConfig2 = reportingConfig;
        bxvd bxvd2 = bxvd;
        try {
            long g = this.f117525a.mo63389g();
            int i2 = Build.VERSION.SDK_INT;
            long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
            boolean z2 = this.f117525a.f118013e || g == -1 || millis >= chcs.m148250v() + g;
            WifiScan a = WifiScan.m66875a(location);
            if (a != null) {
                int a2 = a.mo43592a();
                arrayList = new ArrayList(a2);
                int i3 = 0;
                while (i3 < a2) {
                    bxvd da = bgvz.f117769m.mo74144da();
                    long a3 = a.mo43593a(i3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bgvz bgvz = (bgvz) da.f164949b;
                    int i4 = a2;
                    bgvz.f117771a |= 1;
                    bgvz.f117772b = a3;
                    byte b = a.mo43594b(i3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bgvz bgvz2 = (bgvz) da.f164949b;
                    bgvz2.f117771a |= 2;
                    bgvz2.f117773c = b;
                    int c = a.mo43595c(i3);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bgvz bgvz3 = (bgvz) da.f164949b;
                    bgvz3.f117771a |= 16;
                    bgvz3.f117776f = c;
                    if (a.mo43596d(i3) == 0) {
                        j5 = g;
                        j6 = millis;
                        wifiScan = a;
                    } else {
                        int d = a.mo43596d(i3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bgvz bgvz4 = (bgvz) da.f164949b;
                        bgvz4.f117771a |= 32;
                        bgvz4.f117777g = d;
                        int e = a.mo43597e(i3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bgvz bgvz5 = (bgvz) da.f164949b;
                        bgvz5.f117771a |= 64;
                        bgvz5.f117778h = e;
                        int f = a.mo43599f(i3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bgvz bgvz6 = (bgvz) da.f164949b;
                        bgvz6.f117771a |= 128;
                        bgvz6.f117779i = f;
                        int g2 = a.mo43600g(i3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bgvz bgvz7 = (bgvz) da.f164949b;
                        bgvz7.f117771a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bgvz7.f117780j = g2;
                        int h = a.mo43601h(i3);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bgvz bgvz8 = (bgvz) da.f164949b;
                        bgvz8.f117771a |= 512;
                        bgvz8.f117781k = h;
                        long a4 = a.mo43593a(i3);
                        int d2 = a.mo43596d(i3);
                        int e2 = a.mo43597e(i3);
                        j6 = millis;
                        int f2 = a.mo43599f(i3);
                        int g3 = a.mo43600g(i3);
                        j5 = g;
                        int h2 = a.mo43601h(i3);
                        wifiScan = a;
                        StringBuilder sb = new StringBuilder((int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR);
                        sb.append("Get RTT Ranging result from AP:");
                        sb.append(a4);
                        sb.append(" RttAttemptCount=");
                        sb.append(d2);
                        sb.append(" RttSuccessCount=");
                        sb.append(e2);
                        sb.append(" RttEstimatedDistanceMm=");
                        sb.append(f2);
                        sb.append(" RttDistanceStddevMm=");
                        sb.append(g3);
                        sb.append(" RttChannelBandwidth=");
                        sb.append(h2);
                        sb.toString();
                    }
                    arrayList.add((bgvz) da.mo74062i());
                    i3++;
                    a2 = i4;
                    millis = j6;
                    g = j5;
                    a = wifiScan;
                }
                j = g;
                j2 = millis;
            } else {
                j = g;
                j2 = millis;
                arrayList = null;
            }
            if (arrayList != null) {
                if (!arrayList.isEmpty()) {
                    bguv.m100047a("UlrWifiReceived", reportingConfig2);
                    bguv.m100052b("UlrWifiReceivedScanSize", (long) arrayList.size());
                }
            }
            if (arrayList == null) {
                j3 = j2;
                j4 = j;
            } else if (z2) {
                WifiManager wifiManager = this.f117529e;
                if (chcs.f188354a.mo6606a().mo85037Z()) {
                    if (wifiManager != null) {
                        wifiInfo = wifiManager.getConnectionInfo();
                    } else {
                        wifiInfo = null;
                    }
                    String bssid = wifiInfo != null ? wifiInfo.getBSSID() : null;
                    if (bssid != null) {
                        long a5 = bupz.m120219a(bssid);
                        int networkId = wifiInfo.getNetworkId();
                        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
                        if (configuredNetworks != null) {
                            boolean z3 = !chcj.f188326a.mo6606a().mo84993g();
                            Iterator<WifiConfiguration> it = configuredNetworks.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    i = 1;
                                    break;
                                }
                                WifiConfiguration next = it.next();
                                if (networkId == next.networkId) {
                                    if (z3) {
                                        i = !next.allowedKeyManagement.get(0) ? !next.allowedKeyManagement.get(1) ? next.allowedKeyManagement.get(2) ? 4 : 5 : 3 : 2;
                                    } else {
                                        i = 1;
                                    }
                                    str = (!chcg.f188323a.mo84984b().mo84985a() || next.SSID == null || bebi.m91719b(next.SSID)) ? null : next.SSID;
                                }
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                bgvz bgvz9 = (bgvz) it2.next();
                                if (bgvz9.f117772b == a5) {
                                    bxvd bxvd3 = (bxvd) bgvz9.mo74142c(5);
                                    bxvd3.mo73625a((GeneratedMessageLite) bgvz9);
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    bgvz bgvz10 = (bgvz) bxvd3.f164949b;
                                    bgvz bgvz11 = bgvz.f117769m;
                                    int i5 = bgvz10.f117771a | 8;
                                    bgvz10.f117771a = i5;
                                    bgvz10.f117775e = true;
                                    if (z3) {
                                        bgvz10.f117774d = i - 1;
                                        i5 |= 4;
                                        bgvz10.f117771a = i5;
                                    }
                                    if (str != null) {
                                        str.getClass();
                                        bgvz10.f117771a = i5 | 1024;
                                        bgvz10.f117782l = str;
                                    }
                                    arrayList.set(arrayList.indexOf(bgvz9), (bgvz) bxvd3.mo74062i());
                                }
                            }
                        }
                    }
                }
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                bgvr bgvr = bgvr.f117713u;
                ((bgvr) bxvd2.f164949b).f117728n = GeneratedMessageLite.m124030de();
                int size = arrayList.size();
                for (bgvz bgvz12 : arrayList) {
                    long j7 = j2;
                    long j8 = j;
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bgvr bgvr2 = (bgvr) bxvd2.f164949b;
                    bgvz12.getClass();
                    if (!bgvr2.f117728n.mo73666a()) {
                        bgvr2.f117728n = GeneratedMessageLite.m124021a(bgvr2.f117728n);
                    }
                    bgvr2.f117728n.add(bgvz12);
                    j = j8;
                    j2 = j7;
                }
                long v = chcs.m148250v();
                StringBuilder sb2 = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED);
                sb2.append("Attached ");
                sb2.append(size);
                sb2.append(" wifi scans. Last wifi scan attached timestamp: ");
                sb2.append(j);
                sb2.append(" location reports. Expected every ");
                sb2.append(v);
                sb2.append(" millis.");
                sb2.toString();
                if (size > 0) {
                    this.f117525a.mo63373a(j2);
                    bguv.m100047a("UlrWifiAttached", reportingConfig2);
                    return;
                }
                return;
            } else {
                j3 = j2;
                j4 = j;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            if (arrayList == null) {
                z = true;
            } else {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = Long.valueOf(j3);
            objArr[2] = Long.valueOf(j4);
            objArr[3] = Long.valueOf(chcs.m148250v());
        } catch (RuntimeException e3) {
            bgur.m100021b("GCoreUlr", "Best-effort Wifi scan attachment failed", e3);
        }
    }

    /* renamed from: a */
    public final boolean mo63164a(long j) {
        ApiRate k = this.f117525a.mo63393k();
        if (k == null || System.currentTimeMillis() - k.mo71580g().longValue() >= j) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo63165a(NetworkLocationStatus networkLocationStatus, ReportingConfig reportingConfig, boolean z) {
        NetworkLocationStatus networkLocationStatus2 = networkLocationStatus;
        NetworkLocationStatus j = this.f117525a.mo63392j();
        if (!z && j != null) {
            long q = chcs.m148245q();
            if (!mo63164a(q) && m99931a(q, j.f79377d, networkLocationStatus2.f79377d)) {
                String valueOf = String.valueOf(j);
                long j2 = j.f79376c;
                String valueOf2 = String.valueOf(networkLocationStatus);
                long j3 = networkLocationStatus2.f79376c;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 123 + String.valueOf(valueOf2).length());
                sb.append("Received location statuses too frequently: [");
                sb.append(valueOf);
                sb.append(", timeStamp(ms): ");
                sb.append(j2);
                sb.append("], [");
                sb.append(valueOf2);
                sb.append(", timeStamp(ms): ");
                sb.append(j3);
                sb.append("]");
                bgur.m100020b("GCoreUlr", sb.toString());
                return false;
            }
        }
        NetworkLocationStatus j4 = this.f117525a.mo63392j();
        if (j4 != null && networkLocationStatus2.f79375b == j4.f79375b && networkLocationStatus2.f79374a == j4.f79374a) {
            String valueOf3 = String.valueOf(networkLocationStatus);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
            sb2.append("skip locationStatus:");
            sb2.append(valueOf3);
            sb2.append(" due to duplicate");
            sb2.toString();
            return false;
        }
        this.f117525a.mo63378a(networkLocationStatus2);
        Boolean bool = true;
        ApiMetadata apiMetadata = new ApiMetadata(null, null, null, null, new ApiLocationStatus(bgzr.m100490a(networkLocationStatus2.f79375b), bool, bgzr.m100490a(networkLocationStatus2.f79374a)), null, null, null, Long.valueOf(networkLocationStatus2.f79376c), null, null);
        bvwq bvwq = null;
        if (chcp.m148193b() && chcp.m148195d()) {
            bxvd da = bvwp.f157977e.mo74144da();
            int a = bgzq.m100483a(networkLocationStatus2.f79374a);
            int a2 = bgzq.m100483a(networkLocationStatus2.f79375b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvwp bvwp = (bvwp) da.f164949b;
            int i = a - 1;
            if (a != 0) {
                bvwp.f157981c = i;
                int i2 = bvwp.f157979a | 2;
                bvwp.f157979a = i2;
                int i3 = a2 - 1;
                if (a2 != 0) {
                    bvwp.f157980b = i3;
                    bvwp.f157979a = i2 | 1;
                    boolean booleanValue = bool.booleanValue();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvwp bvwp2 = (bvwp) da.f164949b;
                    bvwp2.f157979a |= 4;
                    bvwp2.f157982d = booleanValue;
                    bvwp bvwp3 = (bvwp) da.mo74062i();
                    bxvd da2 = bvwq.f157983r.mo74144da();
                    if (bvwp3 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwq bvwq2 = (bvwq) da2.f164949b;
                        bvwp3.getClass();
                        bvwq2.f157990f = bvwp3;
                        bvwq2.f157985a |= 16;
                    }
                    if (networkLocationStatus2 != null) {
                        long j5 = networkLocationStatus2.f79376c;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvwq bvwq3 = (bvwq) da2.f164949b;
                        bvwq3.f157985a |= 1;
                        bvwq3.f157986b = j5;
                    }
                    bvwq = (bvwq) da2.mo74062i();
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        String valueOf4 = String.valueOf(networkLocationStatus);
        String a3 = aeqm.m52399a(reportingConfig.mo70928b());
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 31 + String.valueOf(a3).length());
        sb3.append("Storing location status '");
        sb3.append(valueOf4);
        sb3.append("' for ");
        sb3.append(a3);
        sb3.toString();
        this.f117526b.mo63202a(reportingConfig.mo70928b(), new Pair(apiMetadata, bvwq), "location status");
        return true;
    }
}
