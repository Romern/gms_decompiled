package p000;

import java.io.IOException;
import java.net.InetAddress;

/* renamed from: ahrm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahrm implements ahll, ahos {

    /* renamed from: a */
    private final ahov f67884a;

    /* renamed from: b */
    private final ahlk f67885b;

    /* renamed from: c */
    private final String f67886c = ails.m57437a(10);

    public ahrm(ahov ahov, ahlk ahlk) {
        this.f67884a = ahov;
        this.f67885b = ahlk;
    }

    /* renamed from: a */
    public final ahna mo36792a(ahkv ahkv, String str, butx butx) {
        aiwf aiwf;
        butw butw = butx.f154898d;
        if (butw == null) {
            butw = butw.f154888d;
        }
        try {
            InetAddress byAddress = InetAddress.getByAddress(butw.f154891b.getKey());
            srn srn = ahkm.f67363a;
            ahov ahov = this.f67884a;
            int i = butw.f154892c;
            ahfk q = ahkv.mo36739q(str);
            synchronized (ahov.f67671g) {
                aiwf = null;
                if (ahov.mo36916a()) {
                    if (ahov.f67666b.f69116c.mo37789a()) {
                        aiwf = ahov.f67666b.f69121h.mo37769a(byAddress, i, q);
                    }
                }
            }
            if (aiwf != null) {
                byAddress.toString();
                ahrn a = ahrn.m56434a(aiwf);
                if (a != null) {
                    return a;
                }
                srz.m36171a(aiwf);
                throw new ahli(bvhu.WIFI_LAN_MEDIUM_ERROR, 30, String.format("WifiLanBandwidthUpgradeMedium failed to create new EndpointChannel for outgoing socket %s, aborting upgrade.", aiwf));
            }
            throw new ahli(bvhu.WIFI_LAN_MEDIUM_ERROR, 16, String.format("WifiLanBandwidthUpgradeMedium failed to join available wifi LAN socket (%s, %d) on endpoint %s, aborting upgrade.", byAddress, Integer.valueOf(butw.f154892c), str));
        } catch (IOException e) {
            throw new ahli(bvhu.WIFI_LAN_MEDIUM_ERROR, 15, String.format("WifiLanBandwidthUpgradeMedium couldn't initiate WIFI_LAN upgrade for endpoint %s because the IP address is invalid.", str), e);
        }
    }

    /* renamed from: a */
    public final void mo36793a() {
        this.f67884a.mo36932f(this.f67886c);
        srn srn = ahkm.f67363a;
    }

    /* renamed from: a */
    public final void mo36910a(aiwf aiwf) {
        this.f67885b.mo36783a(new ahlj(ahrn.m56434a(aiwf), aiwf));
    }

    /* renamed from: a */
    public final byte[] mo36794a(ahkv ahkv, String str) {
        aios c;
        if (!this.f67884a.mo36930e(this.f67886c)) {
            if (this.f67884a.mo36920a(this.f67886c, this)) {
                srn srn = ahkm.f67363a;
            } else {
                throw new ahli(bvhu.WIFI_LAN_MEDIUM_ERROR, 14, String.format("WifiLanBandwidthUpgradeMedium couldn't initiate the WIFI_LAN upgrade for endpoint %s because it failed to start listening for incoming Wifi connections.", str));
            }
        }
        ahov ahov = this.f67884a;
        String str2 = this.f67886c;
        synchronized (ahov.f67671g) {
            c = ahov.f67666b.f69121h.mo37782c(str2);
        }
        if (c != null) {
            byte[] address = c.mo37556a().getAddress();
            int b = c.mo37557b();
            bxvd da = butw.f154888d.mo74144da();
            ByteString a = ByteString.m123261a(address);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            butw butw = (butw) da.f164949b;
            a.getClass();
            int i = butw.f154890a | 1;
            butw.f154890a = i;
            butw.f154891b = a;
            butw.f154890a = i | 2;
            butw.f154892c = b;
            butw butw2 = (butw) da.mo74062i();
            bxvd da2 = butx.f154893h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            butx butx = (butx) da2.f164949b;
            butx.f154896b = 5;
            int i2 = butx.f154895a | 1;
            butx.f154895a = i2;
            butw2.getClass();
            butx.f154898d = butw2;
            butx.f154895a = i2 | 4;
            return ahoy.m56310a((butx) da2.mo74062i());
        }
        throw new ahli(bvhu.WIFI_LAN_MEDIUM_ERROR, 14, String.format("WifiLanBandwidthUpgradeMedium couldn't initiate the WIFI_LAN upgrade for endpoint %s because the Wifi LAN credentials were unable to be obtained.", str));
    }
}
