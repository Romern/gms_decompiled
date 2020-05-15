package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: afaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afaf {

    /* renamed from: d */
    private static final Comparator f64081d = new afac();

    /* renamed from: a */
    private final Context f64082a;

    /* renamed from: b */
    private final TelephonyManager f64083b;

    /* renamed from: c */
    private final afad f64084c;

    public afaf(Context context) {
        afad afad = new afad(context);
        this.f64082a = context;
        this.f64084c = afad;
        this.f64083b = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: b */
    private final int m52778b() {
        List<CellInfo> list;
        if (!cfcj.m138658e()) {
            list = this.f64083b.getAllCellInfo();
        } else {
            int i = Build.VERSION.SDK_INT;
            bqgy c = bqgy.m112818c();
            this.f64083b.requestCellInfoUpdate(snp.m35704b(9), new afab(c));
            try {
                list = (List) c.get();
            } catch (InterruptedException | ExecutionException e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                list = this.f64083b.getAllCellInfo();
            }
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (CellInfo cellInfo : list) {
                if (cellInfo.isRegistered()) {
                    arrayList.add(cellInfo);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, f64081d);
                CellInfo cellInfo2 = (CellInfo) arrayList.get(0);
                if (cellInfo2 instanceof CellInfoLte) {
                    return ((CellInfoLte) cellInfo2).getCellSignalStrength().getLevel();
                }
                if (cellInfo2 instanceof CellInfoWcdma) {
                    return ((CellInfoWcdma) cellInfo2).getCellSignalStrength().getLevel();
                }
                if (cellInfo2 instanceof CellInfoCdma) {
                    return ((CellInfoCdma) cellInfo2).getCellSignalStrength().getLevel();
                }
                if (cellInfo2 instanceof CellInfoGsm) {
                    return ((CellInfoGsm) cellInfo2).getCellSignalStrength().getLevel();
                }
            }
        }
        return 0;
    }

    /* renamed from: c */
    private final afbp m52779c() {
        int i;
        bxvd da = afbp.f64150d.mo74144da();
        NetworkInfo networkInfo = ((ConnectivityManager) this.f64082a.getSystemService("connectivity")).getNetworkInfo(1);
        if (networkInfo == null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            afbp afbp = (afbp) da.f164949b;
            afbp.f64153b = 0;
            afbp.f64152a = 1 | afbp.f64152a;
        } else {
            if (!networkInfo.isConnected()) {
                i = 3;
            } else {
                i = 2;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            afbp afbp2 = (afbp) da.f164949b;
            afbp2.f64153b = i - 1;
            afbp2.f64152a |= 1;
        }
        afbp afbp3 = (afbp) da.f164949b;
        "".getClass();
        afbp3.f64152a |= 2;
        afbp3.f64154c = "";
        int a = afbo.m52818a(afbp3.f64153b);
        if (a != 0 && a == 2) {
            String ssid = ((WifiManager) this.f64082a.getSystemService("wifi")).getConnectionInfo().getSSID();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            afbp afbp4 = (afbp) da.f164949b;
            ssid.getClass();
            afbp4.f64152a |= 2;
            afbp4.f64154c = ssid;
        }
        return (afbp) da.mo74062i();
    }

    /* renamed from: a */
    public final afbf mo34708a() {
        boolean z;
        int a;
        bxvd da = afbf.f64124h.mo74144da();
        int intProperty = ((BatteryManager) this.f64082a.getSystemService("batterymanager")).getIntProperty(4);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbf afbf = (afbf) da.f164949b;
        boolean z2 = true;
        afbf.f64126a |= 1;
        afbf.f64127b = intProperty;
        String simOperatorName = this.f64083b.getSimOperatorName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbf afbf2 = (afbf) da.f164949b;
        simOperatorName.getClass();
        int i = afbf2.f64126a | 2;
        afbf2.f64126a = i;
        afbf2.f64128c = simOperatorName;
        if ((i & 2) == 0 || afbf2.f64128c.isEmpty()) {
            String networkOperatorName = this.f64083b.getNetworkOperatorName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            afbf afbf3 = (afbf) da.f164949b;
            networkOperatorName.getClass();
            afbf3.f64126a |= 2;
            afbf3.f64128c = networkOperatorName;
        }
        int b = m52778b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbf afbf4 = (afbf) da.f164949b;
        afbf4.f64126a = 4 | afbf4.f64126a;
        afbf4.f64129d = b;
        afbp c = m52779c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbf afbf5 = (afbf) da.f164949b;
        c.getClass();
        afbf5.f64130e = c;
        afbf5.f64126a |= 8;
        boolean z3 = this.f64084c.f64080a.getRestrictBackgroundStatus() != 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbf afbf6 = (afbf) da.f164949b;
        afbf6.f64126a |= 16;
        afbf6.f64131f = z3;
        if (m52778b() != 0) {
            if (!cfcj.m138658e()) {
                z = this.f64083b.getDataEnabled();
            } else {
                int i2 = Build.VERSION.SDK_INT;
                z = this.f64083b.isDataEnabled();
            }
            if (!z || (((a = afbo.m52818a(m52779c().f64153b)) == 0 || a != 2) && this.f64083b.getDataState() != 2)) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        afbf afbf7 = (afbf) da.f164949b;
        afbf7.f64126a |= 32;
        afbf7.f64132g = z2;
        return (afbf) da.mo74062i();
    }
}
