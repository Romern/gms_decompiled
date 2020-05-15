package p000;

import java.io.IOException;

/* renamed from: ahla */
final /* synthetic */ class ahla implements Runnable {

    /* renamed from: a */
    private final ahlh f67416a;

    /* renamed from: b */
    private final String f67417b;

    /* renamed from: c */
    private final ahkv f67418c;

    public ahla(ahlh ahlh, String str, ahkv ahkv) {
        this.f67416a = ahlh;
        this.f67417b = str;
        this.f67418c = ahkv;
    }

    public final void run() {
        ahlh ahlh = this.f67416a;
        String str = this.f67417b;
        ahkv ahkv = this.f67418c;
        if (ahlh.f67441g.containsKey(str)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager is ignoring bandwidth upgrade for endpoint %s because we're already upgrading bandwidth for that endpoint.", str);
        } else if (!ahlh.mo36788a(ahlh.mo36776a(ahkv.mo36733n(str)))) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68420a("BandwidthUpgradeManager cannot initiate bandwidth upgrade for endpoint %s because the current BandwidthUpgradeMedium cannot be deduced.", str);
        } else {
            ahna a = ahlh.f67436b.mo36876a(str);
            int i = 2;
            ahkv.f67390f.mo36662a(str, a != null ? a.mo36865l() : bvif.UNKNOWN_MEDIUM, ahlh.f67443i, 2);
            if (a == null) {
                ((bnsl) ahkm.f67363a.mo68387b()).mo68420a("BandwidthUpgradeManager couldn't complete the upgrade for endpoint %s because it couldn't find an existing EndpointChannel for it.", str);
                ahkv.f67390f.mo36659a(str, bvhu.CHANNEL_ERROR, 3);
            } else if (ahlh.f67443i == a.mo36865l()) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("BandwidthUpgradeManager ignoring the upgrade for endpoint %s because it is already connected over medium %s.", str, ahlh.f67443i.name());
                ahkv.f67390f.mo36659a(str, bvhu.ALREADY_ON_MEDIUM_ERROR, 3);
            } else {
                try {
                    a.mo36799a(((ahll) ahlh.f67439e.get(ahlh.f67443i)).mo36794a(ahkv, str));
                    srn srn = ahkm.f67363a;
                    ahlh.f67441g.put(str, ahkv);
                } catch (ahli e) {
                    bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68420a("BandwidthUpgradeManager couldn't complete the upgrade for endpoint %s because it failed to initialize the BANDWIDTH_UPGRADE_NEGOTIATION.UPGRADE_PATH_AVAILABLE OfflineFrame.", str);
                    bxvd da = butx.f154893h.mo74144da();
                    bvif bvif = ahlh.f67443i;
                    buub buub = buub.UNKNOWN_MEDIUM;
                    bvif bvif2 = bvif.UNKNOWN_MEDIUM;
                    buuw buuw = buuw.UNKNOWN_FRAME_TYPE;
                    switch (bvif.ordinal()) {
                        case 1:
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
                        default:
                            i = 1;
                            break;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    butx butx = (butx) da.f164949b;
                    butx.f154896b = i - 1;
                    butx.f154895a |= 1;
                    ahlh.mo36790b(ahkv, str, (butx) da.mo74062i());
                } catch (IOException e2) {
                    bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68420a("BandwidthUpgradeManager couldn't complete the upgrade for endpoint %s because it failed to write the BANDWIDTH_UPGRADE_NEGOTIATION.UPGRADE_PATH_AVAILABLE OfflineFrame.", str);
                    ahkv.f67390f.mo36659a(str, bvhu.RESULT_IO_ERROR, 3);
                }
            }
        }
    }
}
