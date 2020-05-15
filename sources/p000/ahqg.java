package p000;

import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahqg extends ahqh {

    /* renamed from: m */
    public final ahov f67787m;

    public ahqg(ahov ahov, ahnp ahnp, ahne ahne, ahlh ahlh) {
        super(ahov, ahnp, ahne, ahlh);
        this.f67787m = ahov;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ahmk mo36837a(ahkv ahkv, String str, DiscoveryOptions discoveryOptions) {
        ArrayList a = bnkn.m109661a();
        a.addAll(super.mo36837a(ahkv, str, discoveryOptions).f67541b);
        if (cfnv.m140760V() && discoveryOptions.f80475i && !discoveryOptions.f80471e) {
            if (!this.f67787m.mo36918a(str, new ahqc(this, ahkv, str))) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In startWifiAwareDiscovery(), client %d couldn't start scanning on Wifi Aware for serviceId %s.", ahkv.mo36706b(), str);
            } else {
                srn srn = ahkm.f67363a;
                ahkv.mo36706b();
                a.add(bvif.WIFI_AWARE);
            }
        }
        if (!a.isEmpty()) {
            return ahmk.m56135a(a);
        }
        ((bnsl) ahkm.f67363a.mo68387b()).mo68415a("Failed startDiscovery() for client %d", ahkv.mo36706b());
        return ahmk.m56134a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36850b(ahkv ahkv) {
        super.mo36850b(ahkv);
        this.f67787m.mo36937i(ahkv.mo36729l());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo36855c(ahkv ahkv) {
        return !mo36860e(ahkv) && !mo36862f(ahkv);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final List mo36857d() {
        return Arrays.asList(bvif.WEB_RTC, bvif.WIFI_AWARE, bvif.WIFI_LAN, bvif.WIFI_DIRECT, bvif.WIFI_HOTSPOT, bvif.BLUETOOTH, bvif.BLE, bvif.NFC);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final bvif mo36859e() {
        return bvif.WIFI_AWARE;
    }

    /* renamed from: g */
    public final Strategy mo36958g() {
        return Strategy.f80482c;
    }

    /* renamed from: h */
    public final int mo36959h() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo36858d(ahkv ahkv) {
        return !mo36860e(ahkv) && !mo36862f(ahkv);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b2  */
    /* renamed from: a */
    public final ahmk mo36838a(ahkv ahkv, String str, String str2, byte[] bArr, byte[] bArr2, AdvertisingOptions advertisingOptions) {
        byte[] a;
        String str3 = str;
        byte[] bArr3 = bArr;
        AdvertisingOptions advertisingOptions2 = advertisingOptions;
        ArrayList a2 = bnkn.m109661a();
        a2.addAll(super.mo36838a(ahkv, str, str2, bArr, bArr2, advertisingOptions).f67541b);
        if (cfnv.m140760V()) {
            if (advertisingOptions2.f80452k && !advertisingOptions2.f80448g) {
                ahov ahov = this.f67787m;
                synchronized (ahov.f67672h) {
                    if (ahov.mo36916a()) {
                        boolean a3 = ahov.f67666b.f69122i.f69194b.mo38135a(str3);
                        if (a3) {
                            byte[] a4 = m56332a(str);
                            a = ahrh.m56418a(str2, a4, bArr3);
                            if (a != null) {
                                ((bnsl) ahkm.f67363a.mo68388c()).mo68429a("In startWifiAwareAdvertising(%s), client %d failed to generate WifiAwareServiceInfo {Version = %d, PCP = %d, EndpointId = %s, ServiceIdHash = %s, EndpointInfo = %s}", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), 1, 3, str2, ahkm.m55981a(a4), ahkm.m55981a(bArr));
                                this.f67787m.mo36934g(str3);
                            } else {
                                srn srn = ahkm.f67363a;
                                ahkm.m55981a(bArr);
                                ahkv.mo36706b();
                                if (!this.f67787m.mo36922a(str3, a)) {
                                    ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("In startWifiAwareAdvertising(%s), client %d couldn't become Wifi Aware discoverable with WifiAwareServiceInfo %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), a);
                                    this.f67787m.mo36934g(str3);
                                } else {
                                    ahkm.m55981a(bArr);
                                    ahkv.mo36706b();
                                    a2.add(bvif.WIFI_AWARE);
                                }
                            }
                        }
                    }
                }
                if (!this.f67787m.mo36921a(str3, (String) null, new ahqe(this, ahkv, bArr3))) {
                    ((bnsl) ahkm.f67363a.mo68388c()).mo68425a("In startWifiAwareAdvertising(%s), client %d failed to start listening for incoming Wifi Aware connections to ServiceId %s", ahkm.m55981a(bArr), Long.valueOf(ahkv.mo36706b()), str3);
                } else {
                    srn srn2 = ahkm.f67363a;
                    ahkm.m55981a(bArr);
                    ahkv.mo36706b();
                    byte[] a42 = m56332a(str);
                    a = ahrh.m56418a(str2, a42, bArr3);
                    if (a != null) {
                    }
                }
            }
        }
        if (!a2.isEmpty()) {
            return ahmk.m56135a(a2);
        }
        ((bnsl) ahkm.f67363a.mo68387b()).mo68423a("Failed startAdvertising(%s) for client %d", ahkm.m55981a(bArr), ahkv.mo36706b());
        return ahmk.m56134a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ahna mo36839a(ahkv ahkv, ahmg ahmg) {
        if (!(ahmg instanceof ahqf)) {
            return super.mo36839a(ahkv, ahmg);
        }
        ahqf ahqf = (ahqf) ahmg;
        aivx a = this.f67787m.mo36914a(ahqf.f67786a, (String) null, ahkv.mo36739q(ahqf.f67521b));
        if (a != null) {
            ahrg a2 = ahrg.m56414a(a);
            if (a2 != null) {
                srn srn = ahkm.f67363a;
                ahkv.mo36706b();
                return a2;
            }
            srz.m36171a(a);
            throw new ahmf(bvif.WIFI_AWARE, 13, String.format("In wifiAwareConnectImpl(), failed to create Wifi Aware endpoint channel for endpoint %s", ahqf.f67521b));
        }
        throw new ahmf(bvif.WIFI_AWARE, 13, String.format("In wifiAwareConnectImpl(), failed to connect to Wifi Aware device for endpoint %s", ahqf.f67521b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36841a(ahkv ahkv) {
        super.mo36841a(ahkv);
        this.f67787m.mo36936h(ahkv.mo36721h());
        this.f67787m.mo36934g(ahkv.mo36721h());
    }
}
