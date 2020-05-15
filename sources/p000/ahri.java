package p000;

/* renamed from: ahri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahri implements ahll, ahoq {

    /* renamed from: a */
    public final ahlk f67874a;

    /* renamed from: b */
    private final ahov f67875b;

    /* renamed from: c */
    private final String f67876c = String.format("DIRECT-%s-%s", ails.m57437a(2), ails.m57437a(6));

    /* renamed from: d */
    private final String f67877d = ails.m57437a(8);

    public ahri(ahov ahov, ahlk ahlk) {
        this.f67875b = ahov;
        this.f67874a = ahlk;
    }

    /* renamed from: a */
    public final ahna mo36792a(ahkv ahkv, String str, butx butx) {
        aiwb aiwb;
        this.f67875b.mo36931f();
        butu butu = butx.f154901g;
        if (butu == null) {
            butu = butu.f154874f;
        }
        String str2 = butu.f154877b;
        String str3 = butu.f154878c;
        int i = butu.f154879d;
        butu butu2 = butx.f154901g;
        if (butu2 == null) {
            butu2 = butu.f154874f;
        }
        int i2 = butu2.f154880e;
        srn srn = ahkm.f67363a;
        ahov ahov = this.f67875b;
        ahfk q = ahkv.mo36739q(str);
        synchronized (ahov.f67673i) {
            aiwb = null;
            if (ahov.mo36916a()) {
                if (ahov.f67666b.f69116c.mo37789a()) {
                    aiwb = ahov.f67666b.f69123j.mo37705a(str2, str3, i, i2, q);
                }
            }
        }
        if (aiwb != null) {
            ahrj a = ahrj.m56422a(aiwb);
            if (a != null) {
                return a;
            }
            srz.m36171a(aiwb);
            throw new ahli(bvhu.WIFI_DIRECT_MEDIUM_ERROR, 33, String.format("WifiDirectBandwidthUpgradeMedium failed to create WiFi Direct endpoint channel to the WiFi Direct ssid %s for endpoint %s", str2, str));
        }
        throw new ahli(bvhu.WIFI_DIRECT_MEDIUM_ERROR, 27, String.format("WifiDirectBandwidthUpgradeMedium failed to connect to the WiFi Direct ssid %s for endpoint %s", str2, str));
    }

    /* renamed from: a */
    public final void mo36793a() {
        this.f67875b.mo36933g();
        this.f67875b.mo36935h();
        srn srn = ahkm.f67363a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0 A[SYNTHETIC] */
    /* renamed from: a */
    public final byte[] mo36794a(ahkv ahkv, String str) {
        ahov ahov;
        aind aind;
        boolean z;
        boolean z2;
        this.f67875b.mo36931f();
        ahov ahov2 = this.f67875b;
        synchronized (ahov2.f67673i) {
            if (ahov2.mo36916a()) {
                boolean e = ahov2.f67666b.f69123j.mo37714e();
                if (e) {
                }
            }
            ahov ahov3 = this.f67875b;
            synchronized (ahov3.f67673i) {
                if (ahov3.mo36916a()) {
                    if (ahov3.f67666b.f69116c.mo37789a()) {
                        aine aine = ahov3.f67666b.f69123j;
                        getClass();
                        if (aine.mo37709a(new ahof(this))) {
                            z2 = true;
                            if (z2) {
                                srn srn = ahkm.f67363a;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
            throw new ahli(bvhu.WIFI_DIRECT_MEDIUM_ERROR, 25, String.format("WifiDirectBandwidthUpgradeMedium couldn't initiate the WIFI_DIRECT upgrade for endpoint %s because it failed to start listening for incoming WiFi Direct connections.", str));
        }
        boolean d = ahkv.mo36714d(str);
        ahov ahov4 = this.f67875b;
        synchronized (ahov4.f67673i) {
            if (ahov4.mo36916a()) {
                boolean b = ahov4.f67666b.f69123j.mo37711b();
                if (!b) {
                }
                ahov = this.f67875b;
                synchronized (ahov.f67673i) {
                    aind = null;
                    if (ahov.mo36916a()) {
                        if (ahov.f67666b.f69116c.mo37789a()) {
                            aind = ahov.f67666b.f69123j.mo37713d();
                        }
                    }
                }
                if (aind != null) {
                    String str2 = this.f67876c;
                    String str3 = this.f67877d;
                    int i = aind.f69241a;
                    int i2 = aind.f69242b;
                    bxvd da = butu.f154874f.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    butu butu = (butu) da.f164949b;
                    str2.getClass();
                    int i3 = butu.f154876a | 1;
                    butu.f154876a = i3;
                    butu.f154877b = str2;
                    str3.getClass();
                    int i4 = i3 | 2;
                    butu.f154876a = i4;
                    butu.f154878c = str3;
                    int i5 = i4 | 4;
                    butu.f154876a = i5;
                    butu.f154879d = i;
                    butu.f154876a = i5 | 8;
                    butu.f154880e = i2;
                    butu butu2 = (butu) da.mo74062i();
                    bxvd da2 = butx.f154893h.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    butx butx = (butx) da2.f164949b;
                    butx.f154896b = 8;
                    int i6 = butx.f154895a | 1;
                    butx.f154895a = i6;
                    butu2.getClass();
                    butx.f154901g = butu2;
                    butx.f154895a = i6 | 32;
                    return ahoy.m56310a((butx) da2.mo74062i());
                }
                this.f67875b.mo36935h();
                this.f67875b.mo36933g();
                throw new ahli(bvhu.WIFI_DIRECT_MEDIUM_ERROR, 26, String.format("WifiDirectBandwidthUpgradeMedium couldn't initiate the WIFI_DIRECT upgrade for endpoint %s because we could not obtain the WiFi Direct credentials.", str));
            }
        }
        ahov ahov5 = this.f67875b;
        String str4 = this.f67876c;
        String str5 = this.f67877d;
        ahfk q = ahkv.mo36739q(str);
        synchronized (ahov5.f67673i) {
            if (ahov5.mo36916a()) {
                if (!ahov5.f67666b.f69116c.mo37789a() || !ahov5.f67666b.f69123j.mo37710a(str4, str5, d, q)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    srn srn2 = ahkm.f67363a;
                    ahov = this.f67875b;
                    synchronized (ahov.f67673i) {
                    }
                }
            }
        }
        this.f67875b.mo36935h();
        throw new ahli(bvhu.WIFI_DIRECT_MEDIUM_ERROR, 26, String.format("WifiDirectBandwidthUpgradeMedium couldn't initiate the WIFI_DIRECT upgrade for endpoint %s because it failed to become WiFi Direct discoverable.", str));
    }
}
