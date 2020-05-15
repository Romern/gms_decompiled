package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* renamed from: ppn */
final /* synthetic */ class ppn implements aubw {

    /* renamed from: a */
    private final ppp f40025a;

    /* renamed from: b */
    private final String f40026b;

    public ppn(ppp ppp, String str) {
        this.f40025a = ppp;
        this.f40026b = str;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        int i;
        ppp ppp = this.f40025a;
        String str = this.f40026b;
        bsil bsil = (bsil) obj;
        if (ppz.f40045d.mo23546a(str)) {
            pqd pqd = new pqd((pqd) ppz.f40045d.mo23548c().get(str));
            pes pes = pes.f38974a;
            pqd.f40056b = System.currentTimeMillis();
            ppz.f40045d.mo23545a(pqd);
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = bsil.f144729a;
            int size = bxwc.size();
            int i2 = 0;
            while (i2 < size) {
                bxwc bxwc2 = ((bsio) bxwc.get(i2)).f144740a;
                int size2 = bxwc2.size();
                int i3 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i3 >= size2) {
                        break;
                    }
                    bsif bsif = (bsif) bxwc2.get(i3);
                    if (ppc.m30978a(bsif.f144707b)) {
                        arrayList.add(bsif);
                    }
                    i3++;
                }
                i2 = i;
            }
            bxwc bxwc3 = bsil.f144730b;
            int size3 = bxwc3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                bsif bsif2 = (bsif) bxwc3.get(i4);
                if (ppc.m30978a(bsif2.f144707b)) {
                    arrayList.add(bsif2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size4 = arrayList.size();
            for (int i5 = 0; i5 < size4; i5++) {
                bsig bsig = ((bsif) arrayList.get(i5)).f144706a;
                if (bsig == null) {
                    bsig = bsig.f144713b;
                }
                bsic bsic = bsig.f144715a;
                if (bsic == null) {
                    bsic = bsic.f144661b;
                }
                String str2 = bsic.f144663a;
                if (!TextUtils.isEmpty(str2)) {
                    arrayList2.add(new ppu(str, str2));
                }
            }
            Collection collection = (List) Collections.unmodifiableMap(ppz.f40045d.f40048g).get(str);
            if (collection == null) {
                collection = new ArrayList();
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            ArrayList arrayList4 = new ArrayList(collection);
            arrayList3.removeAll(collection);
            arrayList4.removeAll(arrayList2);
            int size5 = arrayList3.size();
            for (int i6 = 0; i6 < size5; i6++) {
                ppu ppu = (ppu) arrayList3.get(i6);
                ppz ppz = ppz.f40045d;
                if (ppz.mo23546a(ppu.f40040a)) {
                    List list = (List) ppz.f40048g.get(ppu.f40040a);
                    if (list == null) {
                        list = new ArrayList();
                        ppz.f40048g.put(ppu.f40040a, list);
                    }
                    if (!list.contains(ppu)) {
                        list.add(ppu);
                        ppz.mo23539b();
                    }
                }
            }
            int size6 = arrayList4.size();
            for (int i7 = 0; i7 < size6; i7++) {
                ppz.f40045d.mo23544a((ppu) arrayList4.get(i7));
            }
            int size7 = arrayList.size();
            for (int i8 = 0; i8 < size7; i8++) {
                bsif bsif3 = (bsif) arrayList.get(i8);
                bsig bsig2 = bsif3.f144706a;
                if (bsig2 == null) {
                    bsig2 = bsig.f144713b;
                }
                bsic bsic2 = bsig2.f144715a;
                if (bsic2 == null) {
                    bsic2 = bsic.f144661b;
                }
                String str3 = bsic2.f144663a;
                ppc ppc = (ppc) ppz.f40045d.mo23549d().get(str3);
                ppc ppc2 = ppc != null ? new ppc(ppc) : new ppc(str3);
                bsig bsig3 = bsif3.f144706a;
                if (bsig3 == null) {
                    bsig3 = bsig.f144713b;
                }
                bsic bsic3 = bsig3.f144715a;
                if (bsic3 == null) {
                    bsic3 = bsic.f144661b;
                }
                String str4 = bsic3.f144663a;
                if (!TextUtils.isEmpty(str4) && TextUtils.equals(ppc2.f40006b, str4)) {
                    ppc2.f40007c = bsif3.f144707b;
                    bsih bsih = bsif3.f144711f;
                    String str5 = "";
                    if (bsih != null) {
                        if (TextUtils.isEmpty(bsih.f144718a)) {
                            bsih bsih2 = bsif3.f144711f;
                            if (bsih2 == null) {
                                bsih2 = bsih.f144716d;
                            }
                            if (TextUtils.isEmpty(bsih2.f144719b)) {
                                bsih bsih3 = bsif3.f144711f;
                                if (bsih3 == null) {
                                    bsih3 = bsih.f144716d;
                                }
                                bxwc bxwc4 = bsih3.f144720c;
                                if (bxwc4.size() > 0) {
                                    str5 = (String) bxwc4.get(0);
                                }
                            } else {
                                bsih bsih4 = bsif3.f144711f;
                                if (bsih4 == null) {
                                    bsih4 = bsih.f144716d;
                                }
                                str5 = bsih4.f144719b;
                            }
                        } else {
                            bsih bsih5 = bsif3.f144711f;
                            if (bsih5 == null) {
                                bsih5 = bsih.f144716d;
                            }
                            str5 = bsih5.f144718a;
                        }
                    }
                    ppc2.f40008d = str5;
                    ppc2.f40009e = bsif3.f144708c;
                    bsie bsie = bsif3.f144710e;
                    if (bsie == null) {
                        bsie = bsie.f144666K;
                    }
                    EnumSet noneOf = EnumSet.noneOf(ppb.class);
                    if (bsie != null) {
                        if (bsie.f144678a) {
                            noneOf.add(ppb.DISPLAY_SUPPORTED);
                        }
                        if (bsie.f144679b) {
                            noneOf.add(ppb.ASSISTANT_SUPPORTED);
                        }
                        if (bsie.f144680c) {
                            noneOf.add(ppb.IS_VIRTUAL_DEVICE_GROUP);
                        }
                        if (bsie.f144681d) {
                            noneOf.add(ppb.AUDIO_SUPPORTED);
                        }
                        if (bsie.f144682e) {
                            noneOf.add(ppb.OVERLAY_APPLICATIONS_SUPPORTED);
                        }
                        if (bsie.f144683f) {
                            noneOf.add(ppb.WIFI_SUPPORTED);
                        }
                        if (bsie.f144684g) {
                            noneOf.add(ppb.WIFI_REGULATORY_DOMAIN_LOCKED);
                        }
                        if (bsie.f144685h) {
                            noneOf.add(ppb.HOTSPOT_SUPPORTED);
                        }
                        if (bsie.f144686i) {
                            noneOf.add(ppb.BLE_SUPPORTED);
                        }
                        if (bsie.f144687j) {
                            noneOf.add(ppb.MULTICHANNEL_GROUP_SUPPORTED);
                        }
                        if (bsie.f144688k) {
                            noneOf.add(ppb.MULTIZONE_SUPPORTED);
                        }
                        if (bsie.f144689l) {
                            noneOf.add(ppb.HI_RES_AUDIO_SUPPORTED);
                        }
                        if (bsie.f144690m) {
                            noneOf.add(ppb.ROOM_EQUALIZER_SUPPORTED);
                        }
                        if (bsie.f144691n) {
                            noneOf.add(ppb.SETUP_SUPPORTED);
                        }
                        if (bsie.f144692o) {
                            noneOf.add(ppb.FDR_SUPPORTED);
                        }
                        if (bsie.f144693p) {
                            noneOf.add(ppb.REBOOT_SUPPORTED);
                        }
                        if (bsie.f144694q) {
                            noneOf.add(ppb.SYSTEM_SOUND_EFFECTS_SUPPORTED);
                        }
                        if (bsie.f144695r) {
                            noneOf.add(ppb.AUDIO_HDR_SUPPORTED);
                        }
                        if (bsie.f144696s) {
                            noneOf.add(ppb.AUDIO_SURROUND_MODE_SUPPORTED);
                        }
                        if (bsie.f144697t) {
                            noneOf.add(ppb.AUTOPLAY_ON_SIGNAL);
                        }
                        if (bsie.f144698u) {
                            noneOf.add(ppb.HDMI_PREFER_50HZ_SUPPORTED);
                        }
                        if (bsie.f144699v) {
                            noneOf.add(ppb.HDMI_PREFER_HIGH_FPS_SUPPORTED);
                        }
                        if (bsie.f144700w) {
                            noneOf.add(ppb.OPENCAST_SUPPORTED);
                        }
                        if (bsie.f144701x) {
                            noneOf.add(ppb.PREVIEW_CHANNEL_SUPPORTED);
                        }
                        if (bsie.f144702y) {
                            noneOf.add(ppb.SHOW_DEBUG_OVERLAY_SUPPORTED);
                        }
                        if (bsie.f144703z) {
                            noneOf.add(ppb.STATS_SUPPORTED);
                        }
                        if (bsie.f144668A) {
                            noneOf.add(ppb.CLOUDCAST_SUPPORTED);
                        }
                        if (bsie.f144669B) {
                            noneOf.add(ppb.REMOTE_DUCKING_SUPPORTED);
                        }
                        if (bsie.f144670C) {
                            noneOf.add(ppb.MULTI_USER_SUPPORTED);
                        }
                        if (bsie.f144671D) {
                            noneOf.add(ppb.PROXY_SERVER_SUPPORTED);
                        }
                        if (bsie.f144672E) {
                            noneOf.add(ppb.BLUETOOTH_SUPPORTED);
                        }
                        if (bsie.f144673F) {
                            noneOf.add(ppb.BLUETOOTH_AUDIO_SINK_SUPPORTED);
                        }
                        if (bsie.f144674G) {
                            noneOf.add(ppb.USER_EQ_SUPPORTED);
                        }
                        if (bsie.f144675H) {
                            noneOf.add(ppb.UI_FLIPPING_SUPPORTED);
                        }
                        if (bsie.f144676I) {
                            noneOf.add(ppb.CLOUD_SETTINGS_SUPPORTED);
                        }
                        if (bsie.f144677J) {
                            noneOf.add(ppb.IOT_AUTH_SUPPORTED);
                        }
                    }
                    ppc2.f40010f = noneOf;
                    ppc2.f40011g = bsif3.f144709d;
                    ppc2.f40012h = System.currentTimeMillis();
                }
                if (!ppc2.equals(ppc)) {
                    ppz.f40045d.mo23543a(ppc2);
                }
            }
            ppl ppl = ppp.f40030b;
            aucb a = ppl.f40022b.mo23536a(new ppi(new pyy(ppl.f40022b), ppq.m30994a(str)));
            a.mo50380a(pes.m30266a(), new ppj());
            a.mo50379a(pes.m30266a(), new ppk(ppl));
        }
    }
}
