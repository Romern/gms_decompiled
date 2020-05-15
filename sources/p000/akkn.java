package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.netrec.logging.NetworkStateLogger$1;
import java.util.Iterator;

/* renamed from: akkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akkn extends akko {

    /* renamed from: b */
    private final WifiManager f72162b;

    /* renamed from: c */
    private final ConnectivityManager f72163c;

    /* renamed from: d */
    private NetworkInfo.DetailedState f72164d;

    /* renamed from: e */
    private final Context f72165e;

    /* renamed from: f */
    private final Handler f72166f;

    /* renamed from: g */
    private final BroadcastReceiver f72167g = new NetworkStateLogger$1(this, "netrec");

    public akkn(Context context, Handler handler, WifiManager wifiManager, ConnectivityManager connectivityManager) {
        this.f72165e = context;
        this.f72166f = handler;
        this.f72162b = wifiManager;
        this.f72163c = connectivityManager;
    }

    /* renamed from: a */
    public final void mo39521a(Intent intent) {
        int intExtra = intent != null ? intent.getIntExtra("wifi_state", -1) : this.f72162b.getWifiApState();
        if (intExtra == 11 || intExtra == 13) {
            boqx a = aknf.m60072a(50);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((bxvk) a);
            bxvd da = borc.f134378e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borc borc = (borc) da.f164949b;
            borc.f134380a |= 2;
            borc.f134382c = intExtra;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqx boqx = (boqx) bxvd.f164949b;
            borc borc2 = (borc) da.mo74062i();
            boqx boqx2 = boqx.f134343i;
            borc2.getClass();
            boqx.f134350f = borc2;
            boqx.f134345a |= 32;
            aknf.m60074a(bxvd);
        }
    }

    /* renamed from: b */
    public final void mo39523b(Intent intent) {
        if (cfpd.m142366f()) {
            int intExtra = intent != null ? intent.getIntExtra("wifi_state", 4) : this.f72162b.getWifiState();
            if (intExtra == 1 || intExtra == 3) {
                boqx a = aknf.m60072a(49);
                bxvd bxvd = (bxvd) a.mo74142c(5);
                bxvd.mo73625a((bxvk) a);
                bxvd da = borc.f134378e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                borc borc = (borc) da.f164949b;
                borc.f134380a = 1 | borc.f134380a;
                borc.f134381b = intExtra;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqx boqx = (boqx) bxvd.f164949b;
                borc borc2 = (borc) da.mo74062i();
                boqx boqx2 = boqx.f134343i;
                borc2.getClass();
                boqx.f134350f = borc2;
                boqx.f134345a |= 32;
                aknf.m60074a(bxvd);
            }
        }
    }

    /* renamed from: c */
    public final void mo39518c() {
        NetworkInfo.DetailedState detailedState;
        IntentFilter intentFilter = new IntentFilter();
        if (cfpd.m142363c()) {
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            NetworkInfo activeNetworkInfo = this.f72163c.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                detailedState = activeNetworkInfo.getDetailedState();
            } else {
                detailedState = null;
            }
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
                mo39522a(detailedState);
            }
        }
        if (cfpd.m142366f()) {
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
            mo39523b(null);
            mo39521a((Intent) null);
        }
        if (intentFilter.countActions() != 0) {
            this.f72165e.registerReceiver(this.f72167g, intentFilter, null, this.f72166f);
        }
    }

    /* renamed from: d */
    public final void mo39519d() {
        this.f72165e.unregisterReceiver(this.f72167g);
    }

    /* renamed from: a */
    public final void mo39522a(NetworkInfo.DetailedState detailedState) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        long j;
        NetworkInfo.DetailedState detailedState2 = detailedState;
        if (detailedState2 != null && this.f72164d != detailedState2) {
            WifiInfo connectionInfo = this.f72162b.getConnectionInfo();
            WifiConfiguration wifiConfiguration = null;
            if (connectionInfo != null && connectionInfo.getNetworkId() != -1) {
                Iterator it = this.f72162b.getPrivilegedConfiguredNetworks().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WifiConfiguration wifiConfiguration2 = (WifiConfiguration) it.next();
                    if (wifiConfiguration2.status == 0) {
                        wifiConfiguration = wifiConfiguration2;
                        break;
                    }
                }
            }
            if (wifiConfiguration != null) {
                z = wifiConfiguration.isEphemeral();
            } else {
                z = false;
            }
            if (wifiConfiguration == null || wifiConfiguration.allowedKeyManagement == null) {
                i = 1;
            } else if (wifiConfiguration.allowedKeyManagement.get(1)) {
                i = 5;
            } else if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
                i = 4;
            } else {
                if (wifiConfiguration.allowedKeyManagement.get(0)) {
                    String[] strArr = wifiConfiguration.wepKeys;
                    int i3 = 0;
                    while (true) {
                        if (i3 < strArr.length) {
                            if (strArr[i3] != null) {
                                i = 3;
                                break;
                            }
                            i3++;
                        } else {
                            break;
                        }
                    }
                }
                i = 2;
            }
            boqx a = aknf.m60072a(48);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((bxvk) a);
            bxvd da = borc.f134378e.mo74144da();
            switch (akne.f72298a[detailedState.ordinal()]) {
                case 1:
                    i2 = 7;
                    break;
                case 2:
                    i2 = 10;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 9;
                    break;
                case 5:
                    i2 = 14;
                    break;
                case 6:
                    i2 = 11;
                    break;
                case 7:
                    i2 = 12;
                    break;
                case 8:
                    i2 = 2;
                    break;
                case 9:
                    i2 = 3;
                    break;
                case 10:
                    i2 = 5;
                    break;
                case 11:
                    i2 = 6;
                    break;
                case 12:
                    i2 = 8;
                    break;
                case 13:
                    i2 = 13;
                    break;
                default:
                    i2 = 1;
                    break;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borc borc = (borc) da.f164949b;
            borc.f134383d = i2 - 1;
            borc.f134380a |= 4;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boqx boqx = (boqx) bxvd.f164949b;
            borc borc2 = (borc) da.mo74062i();
            boqx boqx2 = boqx.f134343i;
            borc2.getClass();
            boqx.f134350f = borc2;
            boqx.f134345a |= 32;
            if (connectionInfo != null && !TextUtils.isEmpty(connectionInfo.getSSID())) {
                String ssid = connectionInfo.getSSID();
                String a2 = stm.m36299a(connectionInfo.getBSSID());
                bxvd da2 = borb.f134371f.mo74144da();
                byte[] a3 = akmk.m60016a(aknk.m60088b(ssid), "SHA-256");
                if (a3 == null || a3.length < 8) {
                    z2 = z;
                    j = 0;
                } else {
                    z2 = z;
                    j = ((((long) a3[0]) & 255) << 56) | ((((long) a3[1]) & 255) << 48) | ((((long) a3[2]) & 255) << 40) | ((((long) a3[3]) & 255) << 32) | ((((long) a3[4]) & 255) << 24) | ((((long) a3[5]) & 255) << 16) | ((((long) a3[6]) & 255) << 8) | (((long) a3[7]) & 255);
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                borb borb = (borb) da2.f164949b;
                borb.f134373a |= 1;
                borb.f134374b = j;
                String b = akmk.m60017b(ssid, a2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                borb borb2 = (borb) da2.f164949b;
                b.getClass();
                int i4 = borb2.f134373a | 2;
                borb2.f134373a = i4;
                borb2.f134375c = b;
                int i5 = 4 | i4;
                borb2.f134373a = i5;
                borb2.f134376d = z2;
                borb2.f134377e = i - 1;
                borb2.f134373a = i5 | 8;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boqx boqx3 = (boqx) bxvd.f164949b;
                borb borb3 = (borb) da2.mo74062i();
                borb3.getClass();
                boqx3.f134348d = borb3;
                boqx3.f134345a |= 8;
            }
            aknf.m60074a(bxvd);
            this.f72164d = detailedState2;
        }
    }

    /* renamed from: b */
    public final boolean mo39517b() {
        return cfpd.m142363c() || cfpd.m142366f();
    }
}
