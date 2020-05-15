package p000;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bibr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibr {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if ((r0 & 2) == 0) goto L_0x000e;
     */
    /* renamed from: a */
    public static bhzs m101919a(bvul bvul) {
        float f;
        if (bvul != null) {
            int i = bvul.f157710a;
            if ((i & 1) != 0) {
            }
        }
        if (Log.isLoggable("Places", 6)) {
            bioi.m102658a("Places", "PlaceLocation does not have placeId or location");
        }
        float f2 = bvul.f157713d;
        if (f2 != 0.0f) {
            f = f2;
        } else {
            f = 80.0f;
        }
        String str = bvul.f157711b;
        bzrv bzrv = bvul.f157712c;
        if (bzrv == null) {
            bzrv = bzrv.f171206c;
        }
        double d = bzrv.f171208a;
        bzrv bzrv2 = bvul.f157712c;
        if (bzrv2 == null) {
            bzrv2 = bzrv.f171206c;
        }
        return new bhzs(str, d, bzrv2.f171209b, f);
    }

    /* renamed from: a */
    public static bvtn m101920a(LatLngBounds latLngBounds, int i, List list) {
        bxvd da = bvtn.f157585e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtn bvtn = (bvtn) da.f164949b;
        if (!bvtn.f157588b.mo73666a()) {
            bvtn.f157588b = GeneratedMessageLite.m124021a(bvtn.f157588b);
        }
        bxsy.m123078a(list, bvtn.f157588b);
        bvtx a = m101922a(latLngBounds);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtn bvtn2 = (bvtn) da.f164949b;
        a.getClass();
        bvtn2.f157589c = a;
        int i2 = bvtn2.f157587a | 1;
        bvtn2.f157587a = i2;
        bvtn2.f157587a = i2 | 2;
        bvtn2.f157590d = i;
        return (bvtn) da.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019c A[EDGE_INSN: B:81:0x019c->B:67:0x019c ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public static bvts m101921a(Context context, LatLng latLng, int i, PlacesParams placesParams) {
        ArrayList arrayList;
        long j;
        Long l;
        String str;
        int i2;
        bxvd da = bvts.f157611f.mo74144da();
        bzrv a = m101923a(latLng);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvts bvts = (bvts) da.f164949b;
        a.getClass();
        bvts.f157614b = a;
        int i3 = bvts.f157613a | 1;
        bvts.f157613a = i3;
        int i4 = i3 | 2;
        bvts.f157613a = i4;
        bvts.f157615c = i;
        String str2 = placesParams.f79573c;
        str2.getClass();
        bvts.f157613a = i4 | 4;
        bvts.f157617e = str2;
        int i5 = Build.VERSION.SDK_INT;
        if (svr.m36484b(context).mo26169a("android.permission.ACCESS_WIFI_STATE") == 0) {
            long d = cggm.m145258d();
            if (d > 0) {
                long j2 = d * 1000000;
                int e = (int) cggm.m145259e();
                if (e > 0) {
                    WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                    if (wifiManager.isWifiEnabled()) {
                        ArrayList arrayList2 = new ArrayList(e);
                        List<ScanResult> scanResults = wifiManager.getScanResults();
                        if (scanResults != null) {
                            int i6 = 0;
                            for (ScanResult scanResult : scanResults) {
                                if (!bebi.m91719b(scanResult.SSID)) {
                                    if ((SystemClock.elapsedRealtime() * 1000) - scanResult.timestamp <= j2) {
                                        bxvd da2 = bvtr.f157603g.mo74144da();
                                        String str3 = scanResult.BSSID;
                                        if (bicl.f120218a.matcher(str3).matches()) {
                                            try {
                                                j = j2;
                                                try {
                                                    l = Long.valueOf(bqcy.m112610a(str3.replace(":", "")).f140492a);
                                                } catch (NumberFormatException e2) {
                                                }
                                            } catch (NumberFormatException e3) {
                                            }
                                            if (l != null) {
                                                long longValue = l.longValue();
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                bvtr bvtr = (bvtr) da2.f164949b;
                                                bvtr.f157605a |= 1;
                                                bvtr.f157606b = longValue;
                                            }
                                            int i7 = scanResult.level;
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bvtr bvtr2 = (bvtr) da2.f164949b;
                                            bvtr2.f157605a |= 2;
                                            bvtr2.f157607c = i7;
                                            str = scanResult.capabilities;
                                            if (!str.contains("WPA-PSK")) {
                                                i2 = 3;
                                            } else if (!str.contains("WPA-EAP")) {
                                                int i8 = 0;
                                                while (true) {
                                                    if (i8 < bicl.f120219b.length) {
                                                        if (str.contains(bicl.f120219b[i8])) {
                                                            i2 = 5;
                                                            break;
                                                        }
                                                        i8++;
                                                    } else {
                                                        i2 = 1;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i2 = 4;
                                            }
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bvtr bvtr3 = (bvtr) da2.f164949b;
                                            bvtr3.f157608d = i2 - 1;
                                            bvtr3.f157605a |= 4;
                                            int i9 = scanResult.frequency;
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bvtr bvtr4 = (bvtr) da2.f164949b;
                                            bvtr4.f157605a |= 16;
                                            bvtr4.f157610f = i9;
                                            boolean equals = wifiManager.getConnectionInfo().getBSSID().equals(scanResult.BSSID);
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bvtr bvtr5 = (bvtr) da2.f164949b;
                                            bvtr5.f157605a |= 8;
                                            bvtr5.f157609e = equals;
                                            arrayList2.add((bvtr) da2.mo74062i());
                                            i6++;
                                            if (i6 < e) {
                                                break;
                                            }
                                            j2 = j;
                                        }
                                        j = j2;
                                        l = null;
                                        if (l != null) {
                                        }
                                        int i72 = scanResult.level;
                                        if (da2.f164950c) {
                                        }
                                        bvtr bvtr22 = (bvtr) da2.f164949b;
                                        bvtr22.f157605a |= 2;
                                        bvtr22.f157607c = i72;
                                        str = scanResult.capabilities;
                                        if (!str.contains("WPA-PSK")) {
                                        }
                                        if (da2.f164950c) {
                                        }
                                        bvtr bvtr32 = (bvtr) da2.f164949b;
                                        bvtr32.f157608d = i2 - 1;
                                        bvtr32.f157605a |= 4;
                                        int i92 = scanResult.frequency;
                                        if (da2.f164950c) {
                                        }
                                        bvtr bvtr42 = (bvtr) da2.f164949b;
                                        bvtr42.f157605a |= 16;
                                        bvtr42.f157610f = i92;
                                        boolean equals2 = wifiManager.getConnectionInfo().getBSSID().equals(scanResult.BSSID);
                                        if (da2.f164950c) {
                                        }
                                        bvtr bvtr52 = (bvtr) da2.f164949b;
                                        bvtr52.f157605a |= 8;
                                        bvtr52.f157609e = equals2;
                                        arrayList2.add((bvtr) da2.mo74062i());
                                        i6++;
                                        if (i6 < e) {
                                        }
                                    }
                                }
                                j2 = j2;
                            }
                            arrayList = arrayList2;
                            if (arrayList != null) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bvts bvts2 = (bvts) da.f164949b;
                                if (!bvts2.f157616d.mo73666a()) {
                                    bvts2.f157616d = GeneratedMessageLite.m124021a(bvts2.f157616d);
                                }
                                bxsy.m123078a(arrayList, bvts2.f157616d);
                            }
                            return (bvts) da.mo74062i();
                        }
                    }
                }
            }
        }
        arrayList = null;
        if (arrayList != null) {
        }
        return (bvts) da.mo74062i();
    }

    /* renamed from: a */
    public static bvtx m101922a(LatLngBounds latLngBounds) {
        bxvd da = bvtx.f157629d.mo74144da();
        bzrv a = m101923a(latLngBounds.f79897b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtx bvtx = (bvtx) da.f164949b;
        a.getClass();
        bvtx.f157633c = a;
        bvtx.f157631a |= 2;
        bzrv a2 = m101923a(latLngBounds.f79896a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvtx bvtx2 = (bvtx) da.f164949b;
        a2.getClass();
        bvtx2.f157632b = a2;
        bvtx2.f157631a |= 1;
        return (bvtx) da.mo74062i();
    }

    /* renamed from: a */
    private static bzrv m101923a(LatLng latLng) {
        bxvd da = bzrv.f171206c.mo74144da();
        double d = latLng.f79894a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzrv bzrv = (bzrv) da.f164949b;
        bzrv.f171208a = d;
        bzrv.f171209b = latLng.f79895b;
        return (bzrv) da.mo74062i();
    }

    /* renamed from: a */
    public static LatLng m101924a(bzrv bzrv) {
        double d = 0.0d;
        double d2 = bzrv != null ? bzrv.f171208a : 0.0d;
        if (bzrv != null) {
            d = bzrv.f171209b;
        }
        return new LatLng(d2, d);
    }
}
