package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: abob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abob {

    /* renamed from: a */
    public static final /* synthetic */ int f57768a = 0;

    /* renamed from: b */
    private static final bngx f57769b = bngx.m109376e();

    /* renamed from: c */
    private static final Comparator f57770c = new abnv();

    /* renamed from: d */
    private static final Pattern f57771d = Pattern.compile("^[0-9a-fA-F]{14}$");

    /* renamed from: a */
    public static int m47970a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    /* renamed from: b */
    public static int m47976b(String str) {
        if (str.length() == 17) {
            return abni.m47954b(str.substring(0, 8));
        }
        return 0;
    }

    /* renamed from: c */
    public static aboa m47979c(Context context) {
        boolean z;
        int i;
        Integer num;
        Integer num2;
        aboa aboa = null;
        if (!spn.m35880d(context)) {
            eoa.m10828c("Herrevad", "Looking up Wifi info on a non-wifi device", new Object[0]);
            return null;
        }
        abne a = abne.m47947a("GET_WIFI_DETAILS");
        try {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                Integer valueOf = Integer.valueOf(connectionInfo.getRssi());
                String d = m47982d(connectionInfo.getSSID());
                String bssid = connectionInfo.getBSSID();
                Integer valueOf2 = Integer.valueOf(connectionInfo.getLinkSpeed());
                boolean hiddenSSID = connectionInfo.getHiddenSSID();
                List<ScanResult> scanResults = wifiManager.getScanResults();
                if (scanResults == null) {
                    num = null;
                    i = 0;
                    z = false;
                } else {
                    Integer num3 = null;
                    int i2 = 0;
                    boolean z2 = false;
                    for (ScanResult scanResult : scanResults) {
                        if (scanResult != null && TextUtils.equals(bssid, scanResult.BSSID) && TextUtils.equals(d, scanResult.SSID)) {
                            num3 = Integer.valueOf(scanResult.frequency);
                            String str = scanResult.capabilities;
                            if (str != null) {
                                i2 = !str.contains("WEP") ? !str.contains("PSK") ? str.contains("EAP") ? 3 : 1 : 4 : 2;
                            } else {
                                i2 = 0;
                            }
                            String str2 = scanResult.capabilities;
                            if (str2 != null) {
                                z2 = str2.contains("[IBSS]");
                            } else {
                                z2 = false;
                            }
                        }
                    }
                    i = i2;
                    z = z2;
                    num = num3;
                }
                DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                if (dhcpInfo != null) {
                    int i3 = dhcpInfo.gateway;
                    StringBuilder sb = new StringBuilder();
                    if (d != null) {
                        sb.append(d);
                    }
                    sb.append(i3);
                    num2 = Integer.valueOf(abni.m47954b(sb.toString()));
                } else {
                    num2 = null;
                }
                aboa = new aboa(num, i, z, valueOf, num2, d, bssid, valueOf2, hiddenSSID);
            } else {
                int i4 = eoa.f15378a;
            }
            a.close();
            return aboa;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f3 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f4 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0217 A[SYNTHETIC, Splitter:B:114:0x0217] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x032d A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0333 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x033e A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x035b A[Catch:{ InterruptedException -> 0x037a }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0373 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0374 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x039e A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03a5 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03b8 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0406 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0408 A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x083a A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x083c A[Catch:{ SecurityException -> 0x0136, all -> 0x08bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0171 A[Catch:{ SecurityException -> 0x018b }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019c A[Catch:{ SecurityException -> 0x01db }] */
    /* renamed from: d */
    public static abnx m47981d(Context context) {
        NetworkInfo networkInfo;
        Collection<CellInfo> collection;
        CellInfo cellInfo;
        borm borm;
        CellLocation cellLocation;
        Network[] allNetworks;
        NetworkInfo networkInfo2;
        NetworkCapabilities networkCapabilities;
        String str;
        Context context2 = context;
        abne a = abne.m47947a("GET_CELL_DETAILS");
        TelephonyManager a2 = aboh.m47994a((TelephonyManager) context2.getSystemService("phone"));
        ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
        abol abol = aboj.f57790a;
        abnx abnx = new abnx();
        bxvd da = borm.f134436t.mo74144da();
        if (a2 == null) {
            eoa.m10824a("Herrevad", "Null telephonyMgr, not building CellDetails", new Object[0]);
        } else {
            borr b = m47977b(a2.getSimOperator(), a2.getSimOperatorName());
            if (cele.f182890a.mo6606a().mo79265c()) {
                int i = Build.VERSION.SDK_INT;
                int simSpecificCarrierId = a2.getSimSpecificCarrierId();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                borm borm2 = (borm) da.f164949b;
                borm2.f134438a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                borm2.f134454q = simSpecificCarrierId;
            }
            if (cekn.m137072c() && abol.mo32244a()) {
                int c = abol.mo32246c();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                borm borm3 = (borm) da.f164949b;
                borm3.f134438a |= 32;
                borm3.f134444g = c;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                int dataNetworkType = a2.getDataNetworkType();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                borm borm4 = (borm) da.f164949b;
                borm4.f134438a |= 32;
                borm4.f134444g = dataNetworkType;
            }
            int simState = a2.getSimState();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borm borm5 = (borm) da.f164949b;
            int i3 = borm5.f134438a | 4096;
            borm5.f134438a = i3;
            borm5.f134450m = simState;
            b.getClass();
            borm5.f134447j = b;
            borm5.f134438a = i3 | 512;
            borr b2 = m47977b(a2.getNetworkOperator(), a2.getNetworkOperatorName());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borm borm6 = (borm) da.f164949b;
            b2.getClass();
            borm6.f134448k = b2;
            borm6.f134438a |= 1024;
            boolean isNetworkRoaming = a2.isNetworkRoaming();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borm borm7 = (borm) da.f164949b;
            borm7.f134438a |= 128;
            borm7.f134445h = isNetworkRoaming;
            int i4 = Build.VERSION.SDK_INT;
            try {
                String groupIdLevel1 = a2.getGroupIdLevel1();
                if (groupIdLevel1 != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    borm borm8 = (borm) da.f164949b;
                    groupIdLevel1.getClass();
                    borm8.f134438a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                    borm8.f134453p = groupIdLevel1;
                }
            } catch (SecurityException e) {
                eoa.m10824a("Herrevad", "Error reading group id level 1", new Object[0]);
            } catch (Throwable th) {
                Throwable th2 = th;
                try {
                    a.close();
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
                throw th2;
            }
            try {
                String subscriberId = a2.getSubscriberId();
                if (subscriberId != null) {
                    if (subscriberId.length() > 5) {
                        str = subscriberId.substring(0, subscriberId.length() - 5);
                        if (str != null) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            borm borm9 = (borm) da.f164949b;
                            str.getClass();
                            borm9.f134438a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                            borm9.f134452o = str;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        allNetworks = connectivityManager.getAllNetworks();
                        if (allNetworks != null) {
                            int length = allNetworks.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length) {
                                    break;
                                }
                                Network network = allNetworks[i6];
                                try {
                                    networkInfo2 = connectivityManager.getNetworkInfo(network);
                                } catch (NullPointerException e2) {
                                    eoa.m10824a("Herrevad", "Failed getting network info. %s", e2.getMessage());
                                    networkInfo2 = null;
                                }
                                if (networkInfo2 != null) {
                                    if (networkInfo2.getType() == 0 && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                                        abnx.f57755f = networkCapabilities.getLinkDownstreamBandwidthKbps();
                                        abnx.f57756g = networkCapabilities.getLinkUpstreamBandwidthKbps();
                                        break;
                                    }
                                }
                                i6++;
                            }
                        }
                        networkInfo = connectivityManager.getNetworkInfo(0);
                        if (networkInfo == null) {
                            boolean isRoaming = networkInfo.isRoaming();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            borm borm10 = (borm) da.f164949b;
                            borm10.f134438a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            borm10.f134446i = isRoaming;
                        }
                        cellLocation = a2.getCellLocation();
                        if (cellLocation != null) {
                            if (cellLocation instanceof CdmaCellLocation) {
                                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                                bxvd da2 = born.f134457d.mo74144da();
                                bxvd a3 = m47971a(cdmaCellLocation.getNetworkId(), cdmaCellLocation.getSystemId(), cdmaCellLocation.getBaseStationId(), cdmaCellLocation.getBaseStationLatitude(), cdmaCellLocation.getBaseStationLongitude());
                                if (a3.f164950c) {
                                    a3.mo74035c();
                                    a3.f164950c = false;
                                }
                                borl borl = (borl) a3.f164949b;
                                borl borl2 = borl.f134427h;
                                borl.f134429a |= 8;
                                borl.f134433e = true;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                born born = (born) da2.f164949b;
                                borl borl3 = (borl) a3.mo74062i();
                                borl3.getClass();
                                born.f134460b = borl3;
                                born.f134459a |= 1;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                borm borm11 = (borm) da.f164949b;
                                born born2 = (born) da2.mo74062i();
                                born2.getClass();
                                borm11.f134451n = born2;
                                borm11.f134438a |= 8192;
                            } else if (cellLocation instanceof GsmCellLocation) {
                                GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                                bxvd da3 = born.f134457d.mo74144da();
                                bxvd a4 = m47972a(gsmCellLocation.getPsc(), gsmCellLocation.getCid(), gsmCellLocation.getLac(), b.f134493b, b.f134494c);
                                if (a4.f164950c) {
                                    a4.mo74035c();
                                    a4.f164950c = false;
                                }
                                boro boro = (boro) a4.f164949b;
                                boro boro2 = boro.f134462h;
                                boro.f134464a |= 32;
                                boro.f134470g = true;
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                born born3 = (born) da3.f164949b;
                                boro boro3 = (boro) a4.mo74062i();
                                boro3.getClass();
                                born3.f134461c = boro3;
                                born3.f134459a |= 2;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                borm borm12 = (borm) da.f164949b;
                                born born4 = (born) da3.mo74062i();
                                born4.getClass();
                                borm12.f134451n = born4;
                                borm12.f134438a |= 8192;
                            }
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        int i8 = Build.VERSION.SDK_INT;
                        abny abny = new abny();
                        Executor abnw = cele.f182890a.mo6606a().mo79266d() ? new abnw() : new abnz();
                        if (celh.m137166b()) {
                            abny.f57758b = SystemClock.elapsedRealtime();
                        }
                        a2.requestCellInfoUpdate(abnw, abny);
                        abny.mo32226a((int) cele.f182890a.mo6606a().mo79267e());
                        if (celh.m137166b()) {
                            if (abny.f57757a == null) {
                                abnd.m47941a().mo54077a(true);
                            } else {
                                abnd.m47941a().mo54077a(false);
                            }
                        }
                        collection = abny.f57757a;
                        if (collection != null) {
                            collection = new ArrayList();
                        }
                        Collection a5 = bnec.m109117a(collection, abnu.f57749a);
                        cellInfo = a5.isEmpty() ? (CellInfo) Collections.min(a5, f57770c) : null;
                        if (!aeri.m52434a(context)) {
                            collection = f57769b;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (CellInfo cellInfo2 : collection) {
                            if (!cellInfo2.equals(cellInfo)) {
                                bxvd da4 = borm.f134436t.mo74144da();
                                if (m47975a(da4, cellInfo2)) {
                                    boolean isRegistered = cellInfo2.isRegistered();
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    borm borm13 = (borm) da4.f164949b;
                                    borm13.f134438a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                                    borm13.f134455r = isRegistered;
                                    arrayList.add((borm) da4.mo74062i());
                                }
                            }
                        }
                        abnx.f57751b = (borm[]) arrayList.toArray(new borm[arrayList.size()]);
                        if (cellInfo == null) {
                            if (m47975a(da, cellInfo)) {
                                if (cellInfo instanceof CellInfoCdma) {
                                    CellSignalStrengthCdma cellSignalStrength = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                                    abnx.f57753d = cellSignalStrength.getDbm();
                                    abnx.f57754e = cellSignalStrength.getLevel();
                                    bxvd da5 = boso.f134628g.mo74144da();
                                    bxvd da6 = bosa.f134539j.mo74144da();
                                    int cdmaDbm = cellSignalStrength.getCdmaDbm();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa = (bosa) da6.f164949b;
                                    bosa.f134541a |= 1;
                                    bosa.f134542b = cdmaDbm;
                                    int cdmaEcio = cellSignalStrength.getCdmaEcio();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa2 = (bosa) da6.f164949b;
                                    bosa2.f134541a |= 2;
                                    bosa2.f134543c = cdmaEcio;
                                    int cdmaLevel = cellSignalStrength.getCdmaLevel();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa3 = (bosa) da6.f164949b;
                                    bosa3.f134541a |= 4;
                                    bosa3.f134544d = cdmaLevel;
                                    int evdoDbm = cellSignalStrength.getEvdoDbm();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa4 = (bosa) da6.f164949b;
                                    bosa4.f134541a |= 8;
                                    bosa4.f134545e = evdoDbm;
                                    int evdoEcio = cellSignalStrength.getEvdoEcio();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa5 = (bosa) da6.f164949b;
                                    bosa5.f134541a |= 16;
                                    bosa5.f134546f = evdoEcio;
                                    int evdoLevel = cellSignalStrength.getEvdoLevel();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa6 = (bosa) da6.f164949b;
                                    bosa6.f134541a |= 32;
                                    bosa6.f134547g = evdoLevel;
                                    int evdoSnr = cellSignalStrength.getEvdoSnr();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa7 = (bosa) da6.f164949b;
                                    bosa7.f134541a |= 64;
                                    bosa7.f134548h = evdoSnr;
                                    int asuLevel = cellSignalStrength.getAsuLevel();
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bosa bosa8 = (bosa) da6.f164949b;
                                    bosa8.f134541a |= 128;
                                    bosa8.f134549i = asuLevel;
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    boso boso = (boso) da5.f164949b;
                                    bosa bosa9 = (bosa) da6.mo74062i();
                                    bosa9.getClass();
                                    boso.f134631b = bosa9;
                                    boso.f134630a |= 1;
                                    abnx.f57752c = (boso) da5.mo74062i();
                                } else if (cellInfo instanceof CellInfoGsm) {
                                    CellSignalStrengthGsm cellSignalStrength2 = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                                    abnx.f57753d = cellSignalStrength2.getDbm();
                                    abnx.f57754e = cellSignalStrength2.getLevel();
                                    bxvd da7 = boso.f134628g.mo74144da();
                                    bxvd da8 = bosb.f134550c.mo74144da();
                                    int asuLevel2 = cellSignalStrength2.getAsuLevel();
                                    if (da8.f164950c) {
                                        da8.mo74035c();
                                        da8.f164950c = false;
                                    }
                                    bosb bosb = (bosb) da8.f164949b;
                                    bosb.f134552a |= 1;
                                    bosb.f134553b = asuLevel2;
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    boso boso2 = (boso) da7.f164949b;
                                    bosb bosb2 = (bosb) da8.mo74062i();
                                    bosb2.getClass();
                                    boso2.f134633d = bosb2;
                                    boso2.f134630a |= 4;
                                    abnx.f57752c = (boso) da7.mo74062i();
                                } else if (cellInfo instanceof CellInfoLte) {
                                    CellSignalStrengthLte cellSignalStrength3 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                                    abnx.f57753d = cellSignalStrength3.getDbm();
                                    abnx.f57754e = cellSignalStrength3.getLevel();
                                    bxvd da9 = boso.f134628g.mo74144da();
                                    bxvd da10 = bosd.f134560h.mo74144da();
                                    int asuLevel3 = cellSignalStrength3.getAsuLevel();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    bosd bosd = (bosd) da10.f164949b;
                                    bosd.f134562a |= 2;
                                    bosd.f134564c = asuLevel3;
                                    int timingAdvance = cellSignalStrength3.getTimingAdvance();
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    bosd bosd2 = (bosd) da10.f164949b;
                                    bosd2.f134562a |= 1;
                                    bosd2.f134563b = timingAdvance;
                                    int a6 = abof.m47993a("mRsrp", cellSignalStrength3);
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    bosd bosd3 = (bosd) da10.f164949b;
                                    bosd3.f134562a |= 4;
                                    bosd3.f134565d = a6;
                                    int a7 = abof.m47993a("mRsrq", cellSignalStrength3);
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    bosd bosd4 = (bosd) da10.f164949b;
                                    bosd4.f134562a |= 8;
                                    bosd4.f134566e = a7;
                                    int a8 = abof.m47993a("mRssnr", cellSignalStrength3);
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    bosd bosd5 = (bosd) da10.f164949b;
                                    bosd5.f134562a |= 16;
                                    bosd5.f134567f = a8;
                                    int a9 = abof.m47993a("mCqi", cellSignalStrength3);
                                    if (da10.f164950c) {
                                        da10.mo74035c();
                                        da10.f164950c = false;
                                    }
                                    bosd bosd6 = (bosd) da10.f164949b;
                                    bosd6.f134562a |= 32;
                                    bosd6.f134568g = a9;
                                    bosd bosd7 = (bosd) da10.mo74062i();
                                    if (da9.f164950c) {
                                        da9.mo74035c();
                                        da9.f164950c = false;
                                    }
                                    boso boso3 = (boso) da9.f164949b;
                                    bosd7.getClass();
                                    boso3.f134634e = bosd7;
                                    boso3.f134630a |= 8;
                                    abnx.f57752c = (boso) da9.mo74062i();
                                } else {
                                    int i9 = Build.VERSION.SDK_INT;
                                    if (cellInfo instanceof CellInfoWcdma) {
                                        CellSignalStrengthWcdma cellSignalStrength4 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                                        abnx.f57753d = cellSignalStrength4.getDbm();
                                        abnx.f57754e = cellSignalStrength4.getLevel();
                                        bxvd da11 = boso.f134628g.mo74144da();
                                        bxvd da12 = bosw.f134737c.mo74144da();
                                        int asuLevel4 = cellSignalStrength4.getAsuLevel();
                                        if (da12.f164950c) {
                                            da12.mo74035c();
                                            da12.f164950c = false;
                                        }
                                        bosw bosw = (bosw) da12.f164949b;
                                        bosw.f134739a |= 1;
                                        bosw.f134740b = asuLevel4;
                                        if (da11.f164950c) {
                                            da11.mo74035c();
                                            da11.f164950c = false;
                                        }
                                        boso boso4 = (boso) da11.f164949b;
                                        bosw bosw2 = (bosw) da12.mo74062i();
                                        bosw2.getClass();
                                        boso4.f134632c = bosw2;
                                        boso4.f134630a |= 2;
                                        abnx.f57752c = (boso) da11.mo74062i();
                                    } else {
                                        if (cele.m137151c()) {
                                            int i10 = Build.VERSION.SDK_INT;
                                            if (cellInfo instanceof CellInfoNr) {
                                                CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) ((CellInfoNr) cellInfo).getCellSignalStrength();
                                                abnx.f57753d = cellSignalStrengthNr.getDbm();
                                                abnx.f57754e = cellSignalStrengthNr.getLevel();
                                                bxvd da13 = boso.f134628g.mo74144da();
                                                bxvd da14 = bosv.f134727i.mo74144da();
                                                int asuLevel5 = cellSignalStrengthNr.getAsuLevel();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv = (bosv) da14.f164949b;
                                                bosv.f134729a |= 1;
                                                bosv.f134730b = asuLevel5;
                                                int ssRsrp = cellSignalStrengthNr.getSsRsrp();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv2 = (bosv) da14.f164949b;
                                                bosv2.f134729a |= 2;
                                                bosv2.f134731c = ssRsrp;
                                                int ssRsrq = cellSignalStrengthNr.getSsRsrq();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv3 = (bosv) da14.f164949b;
                                                bosv3.f134729a |= 4;
                                                bosv3.f134732d = ssRsrq;
                                                int ssSinr = cellSignalStrengthNr.getSsSinr();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv4 = (bosv) da14.f164949b;
                                                bosv4.f134729a |= 8;
                                                bosv4.f134733e = ssSinr;
                                                int csiRsrp = cellSignalStrengthNr.getCsiRsrp();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv5 = (bosv) da14.f164949b;
                                                bosv5.f134729a |= 16;
                                                bosv5.f134734f = csiRsrp;
                                                int csiRsrq = cellSignalStrengthNr.getCsiRsrq();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv6 = (bosv) da14.f164949b;
                                                bosv6.f134729a |= 32;
                                                bosv6.f134735g = csiRsrq;
                                                int csiSinr = cellSignalStrengthNr.getCsiSinr();
                                                if (da14.f164950c) {
                                                    da14.mo74035c();
                                                    da14.f164950c = false;
                                                }
                                                bosv bosv7 = (bosv) da14.f164949b;
                                                bosv7.f134729a |= 64;
                                                bosv7.f134736h = csiSinr;
                                                if (da13.f164950c) {
                                                    da13.mo74035c();
                                                    da13.f164950c = false;
                                                }
                                                boso boso5 = (boso) da13.f164949b;
                                                bosv bosv8 = (bosv) da14.mo74062i();
                                                bosv8.getClass();
                                                boso5.f134635f = bosv8;
                                                boso5.f134630a |= 16;
                                                abnx.f57752c = (boso) da13.mo74062i();
                                            }
                                        }
                                        String valueOf = String.valueOf(cellInfo);
                                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                                        sb.append("Registered cellinfo is unrecognized type ");
                                        sb.append(valueOf);
                                        sb.toString();
                                        int i11 = eoa.f15378a;
                                    }
                                }
                                abnx.f57750a = (borm) da.mo74062i();
                            }
                        }
                        borm = (borm) da.f164949b;
                        if ((borm.f134438a & 8192) == 0) {
                            born born5 = borm.f134451n;
                            if (born5 == null) {
                                born5 = born.f134457d;
                            }
                            if ((born5.f134459a & 1) != 0) {
                                born born6 = ((borm) da.f164949b).f134451n;
                                if (born6 == null) {
                                    born6 = born.f134457d;
                                }
                                borl borl4 = born6.f134460b;
                                if (borl4 == null) {
                                    borl4 = borl.f134427h;
                                }
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                borm borm14 = (borm) da.f164949b;
                                borl4.getClass();
                                borm14.f134439b = borl4;
                                borm14.f134438a |= 1;
                            } else {
                                born born7 = ((borm) da.f164949b).f134451n;
                                if (born7 == null) {
                                    born7 = born.f134457d;
                                }
                                if ((born7.f134459a & 2) != 0) {
                                    born born8 = ((borm) da.f164949b).f134451n;
                                    if (born8 == null) {
                                        born8 = born.f134457d;
                                    }
                                    boro boro4 = born8.f134461c;
                                    if (boro4 == null) {
                                        boro4 = boro.f134462h;
                                    }
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    borm borm15 = (borm) da.f164949b;
                                    boro4.getClass();
                                    borm15.f134440c = boro4;
                                    borm15.f134438a |= 2;
                                }
                            }
                        }
                        abnx.f57750a = (borm) da.mo74062i();
                    }
                }
                String valueOf2 = String.valueOf(subscriberId);
                if (valueOf2.length() == 0) {
                    new String("Unexpected short subscriberId: ");
                } else {
                    "Unexpected short subscriberId: ".concat(valueOf2);
                }
                int i12 = eoa.f15378a;
                str = null;
                if (str != null) {
                }
            } catch (SecurityException e3) {
                eoa.m10824a("Herrevad", "Error reading subscriber id", new Object[0]);
            }
            int i52 = Build.VERSION.SDK_INT;
            try {
                allNetworks = connectivityManager.getAllNetworks();
                if (allNetworks != null) {
                }
            } catch (SecurityException e4) {
                eoa.m10824a("Herrevad", "Error reading connectivity manager networks. %s", e4.getMessage());
            }
            networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo == null) {
            }
            try {
                cellLocation = a2.getCellLocation();
                if (cellLocation != null) {
                }
            } catch (SecurityException e5) {
                eoa.m10824a("Herrevad", "Error reading cell location", new Object[0]);
            }
            int i72 = Build.VERSION.SDK_INT;
            int i82 = Build.VERSION.SDK_INT;
            abny abny2 = new abny();
            if (cele.f182890a.mo6606a().mo79266d()) {
            }
            if (celh.m137166b()) {
            }
            a2.requestCellInfoUpdate(abnw, abny2);
            try {
                abny2.mo32226a((int) cele.f182890a.mo6606a().mo79267e());
                if (celh.m137166b()) {
                }
                collection = abny2.f57757a;
                if (collection != null) {
                }
            } catch (InterruptedException e6) {
                eoa.m10828c("Herrevad", "getDataSubscriptionCellInfo timeout", new Object[0]);
                collection = new ArrayList();
            }
            Collection a52 = bnec.m109117a(collection, abnu.f57749a);
            if (a52.isEmpty()) {
            }
            if (!aeri.m52434a(context)) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (r3.hasNext()) {
            }
            abnx.f57751b = (borm[]) arrayList2.toArray(new borm[arrayList2.size()]);
            if (cellInfo == null) {
            }
            borm = (borm) da.f164949b;
            if ((borm.f134438a & 8192) == 0) {
            }
            abnx.f57750a = (borm) da.mo74062i();
        }
        a.close();
        return abnx;
    }

    /* renamed from: e */
    public static boolean m47983e(Context context) {
        return C1185me.m19630a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    /* renamed from: a */
    private static bxvd m47971a(int i, int i2, int i3, int i4, int i5) {
        bxvd da = borl.f134427h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        borl borl = (borl) da.f164949b;
        int i6 = borl.f134429a | 1;
        borl.f134429a = i6;
        borl.f134430b = i;
        int i7 = i6 | 2;
        borl.f134429a = i7;
        borl.f134431c = i2;
        int i8 = i7 | 4;
        borl.f134429a = i8;
        borl.f134432d = i3;
        int i9 = i8 | 16;
        borl.f134429a = i9;
        borl.f134434f = i4;
        borl.f134429a = i9 | 32;
        borl.f134435g = i5;
        return da;
    }

    /* renamed from: b */
    public static borr m47977b(String str, String str2) {
        bxvd da = borr.f134490e.mo74144da();
        if (TextUtils.isEmpty(str) || str.length() <= 4 || str.length() >= 7) {
            String valueOf = String.valueOf(str);
            eoa.m10828c("Herrevad", valueOf.length() == 0 ? new String("Invalid mccmnc ") : "Invalid mccmnc ".concat(valueOf), new Object[0]);
        } else {
            String substring = str.substring(0, 3);
            String substring2 = str.substring(3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borr borr = (borr) da.f164949b;
            substring.getClass();
            int i = borr.f134492a | 1;
            borr.f134492a = i;
            borr.f134493b = substring;
            substring2.getClass();
            borr.f134492a = i | 2;
            borr.f134494c = substring2;
        }
        if (str2 != null) {
            if (str2.length() > 20) {
                str2 = str2.substring(0, 20);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borr borr2 = (borr) da.f164949b;
            str2.getClass();
            borr2.f134492a |= 4;
            borr2.f134495d = str2;
        }
        return (borr) da.mo74062i();
    }

    /* renamed from: a */
    private static bxvd m47972a(int i, int i2, int i3, String str, String str2) {
        bxvd da = boro.f134462h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boro boro = (boro) da.f164949b;
        int i4 = boro.f134464a | 16;
        boro.f134464a = i4;
        boro.f134469f = i;
        int i5 = i4 | 8;
        boro.f134464a = i5;
        boro.f134468e = i2;
        int i6 = i5 | 4;
        boro.f134464a = i6;
        boro.f134467d = i3;
        str.getClass();
        int i7 = i6 | 1;
        boro.f134464a = i7;
        boro.f134465b = str;
        str2.getClass();
        boro.f134464a = i7 | 2;
        boro.f134466c = str2;
        return da;
    }

    /* renamed from: a */
    public static String m47973a(String str) {
        return abni.m47953a(str);
    }

    /* renamed from: a */
    public static String m47974a(String str, String str2) {
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2);
        return abni.m47953a(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
    }

    /* renamed from: a */
    private static boolean m47975a(bxvd bxvd, CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
            borl borl = (borl) m47971a(cellIdentity.getNetworkId(), cellIdentity.getSystemId(), cellIdentity.getBasestationId(), cellIdentity.getLatitude(), cellIdentity.getLongitude()).mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            borm borm = (borm) bxvd.f164949b;
            borm borm2 = borm.f134436t;
            borl.getClass();
            borm.f134439b = borl;
            borm.f134438a |= 1;
        } else if (cellInfo instanceof CellInfoGsm) {
            CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
            boro boro = (boro) m47972a(cellIdentity2.getPsc(), cellIdentity2.getCid(), cellIdentity2.getLac(), Integer.toString(cellIdentity2.getMcc()), Integer.toString(cellIdentity2.getMnc())).mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            borm borm3 = (borm) bxvd.f164949b;
            borm borm4 = borm.f134436t;
            boro.getClass();
            borm3.f134440c = boro;
            borm3.f134438a |= 2;
        } else if (cellInfo instanceof CellInfoLte) {
            CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
            bxvd da = borp.f134471i.mo74144da();
            String num = Integer.toString(cellIdentity3.getMcc());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp = (borp) da.f164949b;
            num.getClass();
            borp.f134473a |= 1;
            borp.f134474b = num;
            String num2 = Integer.toString(cellIdentity3.getMnc());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp2 = (borp) da.f164949b;
            num2.getClass();
            borp2.f134473a |= 2;
            borp2.f134475c = num2;
            int tac = cellIdentity3.getTac();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp3 = (borp) da.f164949b;
            borp3.f134473a |= 4;
            borp3.f134476d = tac;
            int ci = cellIdentity3.getCi();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp4 = (borp) da.f164949b;
            borp4.f134473a |= 8;
            borp4.f134477e = ci;
            int pci = cellIdentity3.getPci();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp5 = (borp) da.f164949b;
            borp5.f134473a |= 16;
            borp5.f134478f = pci;
            int i = Build.VERSION.SDK_INT;
            int earfcn = cellIdentity3.getEarfcn();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp6 = (borp) da.f164949b;
            borp6.f134473a |= 32;
            borp6.f134479g = earfcn;
            int i2 = Build.VERSION.SDK_INT;
            int bandwidth = cellIdentity3.getBandwidth();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            borp borp7 = (borp) da.f164949b;
            borp7.f134473a |= 64;
            borp7.f134480h = bandwidth;
            borp borp8 = (borp) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            borm borm5 = (borm) bxvd.f164949b;
            borm borm6 = borm.f134436t;
            borp8.getClass();
            borm5.f134441d = borp8;
            borm5.f134438a |= 4;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            if (cellInfo instanceof CellInfoWcdma) {
                CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                bxvd da2 = bors.f134496f.mo74144da();
                String num3 = Integer.toString(cellIdentity4.getMcc());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bors bors = (bors) da2.f164949b;
                num3.getClass();
                bors.f134498a |= 1;
                bors.f134499b = num3;
                String num4 = Integer.toString(cellIdentity4.getMnc());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bors bors2 = (bors) da2.f164949b;
                num4.getClass();
                bors2.f134498a |= 2;
                bors2.f134500c = num4;
                int lac = cellIdentity4.getLac();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bors bors3 = (bors) da2.f164949b;
                bors3.f134498a |= 4;
                bors3.f134501d = lac;
                int cid = cellIdentity4.getCid();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bors bors4 = (bors) da2.f164949b;
                bors4.f134498a |= 8;
                bors4.f134502e = cid;
                bors bors5 = (bors) da2.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                borm borm7 = (borm) bxvd.f164949b;
                borm borm8 = borm.f134436t;
                bors5.getClass();
                borm7.f134442e = bors5;
                borm7.f134438a |= 8;
            } else {
                if (cele.m137151c()) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (cellInfo instanceof CellInfoNr) {
                        CellIdentityNr cellIdentityNr = (CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity();
                        bxvd da3 = borq.f134481h.mo74144da();
                        String mccString = cellIdentityNr.getMccString();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        borq borq = (borq) da3.f164949b;
                        mccString.getClass();
                        borq.f134483a |= 1;
                        borq.f134484b = mccString;
                        String mncString = cellIdentityNr.getMncString();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        borq borq2 = (borq) da3.f164949b;
                        mncString.getClass();
                        borq2.f134483a |= 2;
                        borq2.f134485c = mncString;
                        int tac2 = cellIdentityNr.getTac();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        borq borq3 = (borq) da3.f164949b;
                        borq3.f134483a |= 4;
                        borq3.f134486d = tac2;
                        long nci = cellIdentityNr.getNci();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        borq borq4 = (borq) da3.f164949b;
                        borq4.f134483a |= 8;
                        borq4.f134487e = nci;
                        int pci2 = cellIdentityNr.getPci();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        borq borq5 = (borq) da3.f164949b;
                        borq5.f134483a |= 16;
                        borq5.f134488f = pci2;
                        int nrarfcn = cellIdentityNr.getNrarfcn();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        borq borq6 = (borq) da3.f164949b;
                        borq6.f134483a |= 32;
                        borq6.f134489g = nrarfcn;
                        borq borq7 = (borq) da3.mo74062i();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        borm borm9 = (borm) bxvd.f164949b;
                        borm borm10 = borm.f134436t;
                        borq7.getClass();
                        borm9.f134443f = borq7;
                        borm9.f134438a |= 16;
                    }
                }
                String valueOf = String.valueOf(cellInfo);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Cellinfo is unrecognized type ");
                sb.append(valueOf);
                sb.toString();
                int i5 = eoa.f15378a;
                return false;
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        int cellConnectionStatus = cellInfo.getCellConnectionStatus();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        borm borm11 = (borm) bxvd.f164949b;
        borm11.f134438a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
        borm11.f134456s = cellConnectionStatus;
        return true;
    }

    /* renamed from: b */
    public static bosn m47978b(Context context) {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (TextUtils.isEmpty(telephonyManager.getImei())) {
            str = telephonyManager.getMeid();
        } else {
            str = telephonyManager.getImei();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        bxvd da = bosn.f134621f.mo74144da();
        if (TextUtils.isDigitsOnly(str) && str.length() >= 14 && str.length() <= 16) {
            String substring = str.substring(0, 8);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bosn bosn = (bosn) da.f164949b;
            substring.getClass();
            bosn.f134623a |= 1;
            bosn.f134624b = substring;
            if (str.length() == 16) {
                String substring2 = str.substring(14, 16);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bosn bosn2 = (bosn) da.f164949b;
                substring2.getClass();
                bosn2.f134623a |= 2;
                bosn2.f134625c = substring2;
            }
        } else if (!f57771d.matcher(str).matches()) {
            return null;
        } else {
            String substring3 = str.substring(0, 2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bosn bosn3 = (bosn) da.f164949b;
            substring3.getClass();
            bosn3.f134623a |= 4;
            bosn3.f134626d = substring3;
            String substring4 = str.substring(2, 8);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bosn bosn4 = (bosn) da.f164949b;
            substring4.getClass();
            bosn4.f134623a |= 8;
            bosn4.f134627e = substring4;
        }
        return (bosn) da.mo74062i();
    }

    /* renamed from: c */
    public static boolean m47980c(String str) {
        return str.toLowerCase(Locale.US).contains("_nomap");
    }

    /* renamed from: d */
    public static String m47982d(String str) {
        int i = Build.VERSION.SDK_INT;
        if (str != null) {
            return (!str.startsWith("\"") || !str.endsWith("\"")) ? str : str.substring(1, str.length() - 1);
        }
        return null;
    }
}
