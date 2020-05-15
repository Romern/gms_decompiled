package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.RouteInfo;
import android.os.Build;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abnf {

    /* renamed from: a */
    private static final bmyx f57729a = bmyx.m108640a(',');

    /* renamed from: b */
    private final ConnectivityManager f57730b;

    /* renamed from: c */
    private final bnic f57731c;

    public abnf(ConnectivityManager connectivityManager) {
        this.f57730b = connectivityManager;
        bnia j = bnic.m109500j();
        for (String str : f57729a.mo66918a((CharSequence) ceke.f182834a.mo6606a().mo79217a())) {
            try {
                j.mo67629b(Integer.valueOf(str));
            } catch (NumberFormatException e) {
                eoa.m10825a("Herrevad", e, "Unable to parse network type %s", str);
            }
        }
        this.f57731c = j.mo67751a();
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    static abnf m47948a(Context context) {
        return new abnf((ConnectivityManager) context.getSystemService("connectivity"));
    }

    /* renamed from: a */
    private final bosl m47949a(Network network, NetworkInfo networkInfo) {
        bosj bosj;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        bxvd da = bosl.f134609e.mo74144da();
        if (networkInfo != null) {
            bxvd da2 = bosk.f134601g.mo74144da();
            boolean isAvailable = networkInfo.isAvailable();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosk bosk = (bosk) da2.f164949b;
            bosk.f134603a |= 1;
            bosk.f134604b = isAvailable;
            NetworkInfo.DetailedState detailedState = networkInfo.getDetailedState();
            int i2 = 7;
            if (detailedState != null) {
                switch (abng.f57733b[detailedState.ordinal()]) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    case 8:
                        i = 9;
                        break;
                    case 9:
                        i = 10;
                        break;
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    case 13:
                        i = 14;
                        break;
                    default:
                        i = 1;
                        break;
                }
            } else {
                i = 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosk bosk2 = (bosk) da2.f164949b;
            bosk2.f134605c = i - 1;
            bosk2.f134603a |= 2;
            NetworkInfo.State state = networkInfo.getState();
            if (state != null) {
                switch (abng.f57732a[state.ordinal()]) {
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        break;
                    default:
                        i2 = 1;
                        break;
                }
            } else {
                i2 = 1;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosk bosk3 = (bosk) da2.f164949b;
            bosk3.f134606d = i2 - 1;
            bosk3.f134603a |= 4;
            int subtype = networkInfo.getSubtype();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosk bosk4 = (bosk) da2.f164949b;
            bosk4.f134603a = 8 | bosk4.f134603a;
            bosk4.f134607e = subtype;
            int type = networkInfo.getType();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bosk bosk5 = (bosk) da2.f164949b;
            bosk5.f134603a |= 16;
            bosk5.f134608f = type;
            bosk bosk6 = (bosk) da2.mo74062i();
            if (bosk6 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bosl bosl = (bosl) da.f164949b;
                bosk6.getClass();
                bosl.f134612b = bosk6;
                bosl.f134611a |= 1;
            }
        }
        NetworkCapabilities networkCapabilities = this.f57730b.getNetworkCapabilities(network);
        bosi bosi = null;
        if (networkCapabilities == null) {
            eoa.m10828c("Herrevad", "getNetworkCapabilities() is null", new Object[0]);
            bosj = null;
        } else {
            long j = 0;
            for (int i3 = 0; i3 <= 17; i3++) {
                if (networkCapabilities.hasCapability(i3)) {
                    j |= (long) (1 << i3);
                }
            }
            bxvd da3 = bosj.f134597c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bosj bosj2 = (bosj) da3.f164949b;
            bosj2.f134599a |= 1;
            bosj2.f134600b = j;
            bosj = (bosj) da3.mo74062i();
        }
        if (bosj != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bosl bosl2 = (bosl) da.f164949b;
            bosj.getClass();
            bosl2.f134613c = bosj;
            bosl2.f134611a |= 2;
        }
        LinkProperties linkProperties = this.f57730b.getLinkProperties(network);
        if (linkProperties == null) {
            eoa.m10828c("Herrevad", "getLinkProperties() is null", new Object[0]);
        } else {
            bxvd da4 = bosi.f134593c.mo74144da();
            List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            if (linkAddresses == null) {
                eoa.m10828c("Herrevad", "getLinkAddresses() is null", new Object[0]);
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (LinkAddress linkAddress : linkAddresses) {
                    if (linkAddress == null) {
                        eoa.m10828c("Herrevad", "getLinkAddresses() item is null", new Object[0]);
                    } else {
                        bxvd da5 = bosg.f134581e.mo74144da();
                        InetAddress address = linkAddress.getAddress();
                        if (address != null) {
                            int a = abnh.m47951a(address);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bosg bosg = (bosg) da5.f164949b;
                            bosg.f134584b = a - 1;
                            bosg.f134583a |= 1;
                            boolean isLoopbackAddress = address.isLoopbackAddress();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bosg bosg2 = (bosg) da5.f164949b;
                            bosg2.f134583a |= 2;
                            bosg2.f134585c = isLoopbackAddress;
                            boolean isSiteLocalAddress = address.isSiteLocalAddress();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            bosg bosg3 = (bosg) da5.f164949b;
                            bosg3.f134583a |= 4;
                            bosg3.f134586d = isSiteLocalAddress;
                        }
                        arrayList3.add((bosg) da5.mo74062i());
                    }
                }
                arrayList = arrayList3;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bosi bosi2 = (bosi) da4.f164949b;
            if (!bosi2.f134595a.mo73666a()) {
                bosi2.f134595a = bxvk.m124021a(bosi2.f134595a);
            }
            bxsy.m123078a(arrayList, bosi2.f134595a);
            List<RouteInfo> routes = linkProperties.getRoutes();
            if (routes == null) {
                eoa.m10828c("Herrevad", "getRoutes() is null", new Object[0]);
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (RouteInfo routeInfo : routes) {
                    if (routeInfo == null) {
                        eoa.m10828c("Herrevad", "getRoutes() item is null", new Object[0]);
                    } else {
                        bxvd da6 = bosh.f134587e.mo74144da();
                        InetAddress gateway = routeInfo.getGateway();
                        boolean z = gateway != null && !gateway.isAnyLocalAddress();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bosh bosh = (bosh) da6.f164949b;
                        bosh.f134589a |= 2;
                        bosh.f134591c = z;
                        if (gateway != null) {
                            int a2 = abnh.m47951a(gateway);
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            bosh bosh2 = (bosh) da6.f164949b;
                            bosh2.f134592d = a2 - 1;
                            bosh2.f134589a |= 4;
                        }
                        boolean isDefaultRoute = routeInfo.isDefaultRoute();
                        if (da6.f164950c) {
                            da6.mo74035c();
                            da6.f164950c = false;
                        }
                        bosh bosh3 = (bosh) da6.f164949b;
                        bosh3.f134589a |= 1;
                        bosh3.f134590b = isDefaultRoute;
                        arrayList4.add((bosh) da6.mo74062i());
                    }
                }
                arrayList2 = arrayList4;
            }
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bosi bosi3 = (bosi) da4.f164949b;
            if (!bosi3.f134596b.mo73666a()) {
                bosi3.f134596b = bxvk.m124021a(bosi3.f134596b);
            }
            bxsy.m123078a(arrayList2, bosi3.f134596b);
            bosi = (bosi) da4.mo74062i();
        }
        if (bosi != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bosl bosl3 = (bosl) da.f164949b;
            bosi.getClass();
            bosl3.f134614d = bosi;
            bosl3.f134611a |= 4;
        }
        return (bosl) da.mo74062i();
    }

    /* renamed from: a */
    public final bosm mo32222a() {
        ArrayList arrayList;
        bosl bosl = null;
        if (ceke.f182834a.mo6606a().mo79218b()) {
            if (this.f57730b != null) {
                bxvd da = bosm.f134615e.mo74144da();
                int i = Build.VERSION.SDK_INT;
                boolean isDefaultNetworkActive = this.f57730b.isDefaultNetworkActive();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bosm bosm = (bosm) da.f164949b;
                bosm.f134617a |= 1;
                bosm.f134618b = isDefaultNetworkActive;
                int i2 = Build.VERSION.SDK_INT;
                Network activeNetwork = this.f57730b.getActiveNetwork();
                if (activeNetwork != null) {
                    bosl = m47949a(activeNetwork, this.f57730b.getNetworkInfo(activeNetwork));
                }
                if (bosl != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bosm bosm2 = (bosm) da.f164949b;
                    bosl.getClass();
                    bosm2.f134619c = bosl;
                    bosm2.f134617a |= 2;
                }
                int i3 = Build.VERSION.SDK_INT;
                Network[] allNetworks = this.f57730b.getAllNetworks();
                if (allNetworks == null) {
                    eoa.m10828c("Herrevad", "getAllNetworks() is null", new Object[0]);
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (Network network : allNetworks) {
                        if (network == null) {
                            eoa.m10828c("Herrevad", "getAllNetworks() item is null", new Object[0]);
                        } else {
                            NetworkInfo networkInfo = this.f57730b.getNetworkInfo(network);
                            if (networkInfo == null) {
                                eoa.m10828c("Herrevad", "getNetworkInfo() is null", new Object[0]);
                            } else if (this.f57731c.contains(Integer.valueOf(networkInfo.getType()))) {
                                arrayList2.add(m47949a(network, networkInfo));
                            }
                        }
                    }
                    arrayList = arrayList2;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bosm bosm3 = (bosm) da.f164949b;
                if (!bosm3.f134620d.mo73666a()) {
                    bosm3.f134620d = bxvk.m124021a(bosm3.f134620d);
                }
                bxsy.m123078a(arrayList, bosm3.f134620d);
                return (bosm) da.mo74062i();
            }
            eoa.m10828c("Herrevad", "ConnectivityManager is null", new Object[0]);
        }
        return null;
    }
}
