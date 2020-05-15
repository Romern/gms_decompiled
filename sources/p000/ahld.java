package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahld */
final /* synthetic */ class ahld implements Runnable {

    /* renamed from: a */
    private final ahlh f67422a;

    /* renamed from: b */
    private final buuj f67423b;

    /* renamed from: c */
    private final ahkv f67424c;

    /* renamed from: d */
    private final String f67425d;

    /* renamed from: e */
    private final bvif f67426e;

    public ahld(ahlh ahlh, buuj buuj, ahkv ahkv, String str, bvif bvif) {
        this.f67422a = ahlh;
        this.f67423b = buuj;
        this.f67424c = ahkv;
        this.f67425d = str;
        this.f67426e = bvif;
    }

    public final void run() {
        butx butx;
        ahna ahna;
        String str;
        ahlh ahlh = this.f67422a;
        buuj buuj = this.f67423b;
        ahkv ahkv = this.f67424c;
        String str2 = this.f67425d;
        bvif bvif = this.f67426e;
        buux buux = buuj.f154950c;
        if (buux == null) {
            buux = buux.f155003j;
        }
        buty buty = buux.f155010f;
        if (buty == null) {
            buty = buty.f154902e;
        }
        int b = butp.m120439b(buty.f154905b);
        int i = 1;
        if (b == 0) {
            b = 1;
        }
        int i2 = b - 1;
        int i3 = 2;
        if (i2 == 1) {
            butx butx2 = buty.f154906c;
            if (butx2 != null) {
                butx = butx2;
            } else {
                butx = butx.f154893h;
            }
            int a = buts.m120442a(butx.f154896b);
            if (a == 0) {
                a = 1;
            }
            if (!ahlh.mo36788a(ahoy.m56307a(a))) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
                int a2 = buts.m120442a(butx.f154896b);
                if (a2 != 0) {
                    i = a2;
                }
                switch (i) {
                    case 1:
                        str = "UNKNOWN_MEDIUM";
                        break;
                    case 2:
                        str = "MDNS";
                        break;
                    case 3:
                        str = "BLUETOOTH";
                        break;
                    case 4:
                        str = "WIFI_HOTSPOT";
                        break;
                    case 5:
                        str = "BLE";
                        break;
                    case 6:
                        str = "WIFI_LAN";
                        break;
                    case 7:
                        str = "WIFI_AWARE";
                        break;
                    case 8:
                        str = "NFC";
                        break;
                    case 9:
                        str = "WIFI_DIRECT";
                        break;
                    default:
                        str = "WEB_RTC";
                        break;
                }
                bnsl.mo68420a("BandwidthUpgradeManager failed to process incoming BANDWIDTH_UPGRADE_NEGOTIAION.UPGRADE_PATH_AVAILABLE for Medium %s because we were unable to set the bandwidth upgrade medium.", str);
                ahlh.mo36780a(ahkv, str2, butx);
                return;
            }
            ahkv.f67390f.mo36662a(str2, bvif, ahlh.f67443i, 3);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                ahna = ((ahll) ahlh.f67439e.get(ahlh.f67443i)).mo36792a(ahkv, str2, butx);
                try {
                    String c = ahkv.mo36711c();
                    bxvd da = butn.f154857c.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    butn butn = (butn) da.f164949b;
                    c.getClass();
                    butn.f154859a |= 1;
                    butn.f154860b = c;
                    butn butn2 = (butn) da.mo74062i();
                    bxvd da2 = buty.f154902e.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    buty buty2 = (buty) da2.f164949b;
                    buty2.f154905b = 4;
                    int i4 = 1 | buty2.f154904a;
                    buty2.f154904a = i4;
                    butn2.getClass();
                    buty2.f154907d = butn2;
                    buty2.f154904a = i4 | 4;
                    ahna.mo36799a(ahoy.m56304a(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, da2.mo74062i()).mo73642k());
                    srn srn = ahkm.f67363a;
                    ahna.mo36800b();
                    ahna.mo36797a(ahkv.f67390f, str2);
                } catch (IOException e) {
                    ahna.mo36805g();
                    bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68420a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.CLIENT_INTRODUCTION OfflineFrame to newly-created EndpointChannel %s, aborting upgrade.", ahna.mo36800b());
                    ahkv.f67390f.mo36659a(str2, bvhu.RESULT_IO_ERROR, 2);
                    ahna = null;
                }
            } catch (ahli e2) {
                bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68387b();
                bnsl3.mo68437a(e2);
                bnsl3.mo68420a("BandwidthUpgradeManager failed to create an endpoint channel to endpoint %s, aborting upgrade.", str2);
                ahkv.f67390f.mo36659a(str2, e2.f67446a, e2.f67447b);
                ahna = null;
            }
            if (ahna == null) {
                if (!ahkv.mo36739q(str2).mo36401b()) {
                    i3 = 3;
                } else {
                    i3 = 4;
                }
            }
            ahkv.f67390f.mo36655a(str2, 3, ahlh.f67443i, i3, SystemClock.elapsedRealtime() - elapsedRealtime);
            if (ahna == null) {
                ahlh.mo36780a(ahkv, str2, butx);
            } else {
                ahlh.mo36779a(ahkv, str2, ahna);
            }
        } else if (i2 == 2) {
            ahlh.mo36789b(ahkv, str2);
        } else if (i2 == 3) {
            ahna ahna2 = (ahna) ahlh.f67440f.remove(str2);
            if (ahna2 == null) {
                ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("BandwidthUpgradeManager received a BANDWIDTH_UPGRADE_NEGOTIATION.SAFE_TO_CLOSE_PRIOR_CHANNEL OfflineFrame for unknown endpoint %s, can't complete the upgrade protocol.", str2);
                return;
            }
            srn srn2 = ahkm.f67363a;
            ahna2.mo36801c();
            try {
                ahna2.mo36799a(ahoy.m56308a());
            } catch (IOException e3) {
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new soa(9, new ahle(ahna2, countDownLatch)).start();
            ahhf.m55775a("processSafeToClosePriorChannelEvent", countDownLatch, cfnv.f184625a.mo6606a().mo81744aC());
            ahna2.mo36796a(5);
            ahna2.mo36795a();
            ahkv.f67390f.mo36669b(str2, ahlh.f67443i);
            ahkv.f67390f.mo36675g(str2);
            ahna a3 = ahlh.f67436b.mo36876a(str2);
            if (a3 == null) {
                ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("BandwidthUpgradeManager attempted to resume the current EndpointChannel with endpoint %s, but none was found", str2);
                return;
            }
            a3.mo36808j();
            ahkv.mo36694a(str2, a3.mo36865l());
        } else if (i2 != 5) {
            bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
            int b2 = butp.m120439b(buty.f154905b);
            if (b2 != 0) {
                i = b2;
            }
            bnsl4.mo68420a("BandwidthUpgradeManager can't process unknown incoming OfflineFrame of type %s, ignoring it.", butp.m120438a(i));
        } else {
            butx butx3 = buty.f154906c;
            if (butx3 == null) {
                butx3 = butx.f154893h;
            }
            ahlh.mo36790b(ahkv, str2, butx3);
        }
    }
}
