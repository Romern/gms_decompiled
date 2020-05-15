package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ahlh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahlh implements ahnm, ahlk {

    /* renamed from: a */
    public final ahnp f67435a;

    /* renamed from: b */
    public final ahne f67436b;

    /* renamed from: c */
    public final ScheduledExecutorService f67437c = ahhr.m55804a();

    /* renamed from: d */
    public final bqgj f67438d = ahhr.m55806b();

    /* renamed from: e */
    public final Map f67439e = new C1223np();

    /* renamed from: f */
    public final Map f67440f = new C1223np();

    /* renamed from: g */
    public final Map f67441g = new C1223np();

    /* renamed from: h */
    public final Set f67442h = new C1225nr();

    /* renamed from: i */
    public bvif f67443i;

    /* renamed from: j */
    private final ahov f67444j;

    /* renamed from: k */
    private final Map f67445k = new C1223np();

    /* renamed from: a */
    public final bvif mo36776a(List list) {
        List a = this.f67444j.mo36915a(list);
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bvif bvif = (bvif) a.get(i);
            if (this.f67439e.containsKey(bvif)) {
                arrayList.add(bvif);
            }
        }
        if (this.f67443i == bvif.UNKNOWN_MEDIUM) {
            if (!arrayList.isEmpty()) {
                return (bvif) arrayList.get(0);
            }
            ((bnsl) ahkm.f67363a.mo68390d()).mo68405a("Current upgrade medium is unset, but there are no common supported upgrade mediums.");
        } else if (arrayList.contains(this.f67443i)) {
            return this.f67443i;
        } else {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            String name = this.f67443i.name();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(((bvif) arrayList.get(i2)).name());
            }
            bnsl.mo68424a("Current upgrade medium %s is not supported by the remote endpoint (supported mediums: %s)", name, arrayList2);
        }
        return bvif.UNKNOWN_MEDIUM;
    }

    /* renamed from: b */
    public final void mo36789b(ahkv ahkv, String str) {
        ahna ahna = (ahna) this.f67440f.get(str);
        if (ahna == null) {
            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("BandwidthUpgradeManager received a BANDWIDTH_UPGRADE_NEGOTIATION.LAST_WRITE_TO_PRIOR_CHANNEL OfflineFrame for unknown endpoint %s, can't complete the upgrade protocol.", str);
            this.f67442h.add(str);
            return;
        }
        srn srn = ahkm.f67363a;
        try {
            bxvd da = buty.f154902e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buty buty = (buty) da.f164949b;
            buty.f154905b = 3;
            buty.f154904a |= 1;
            ahna.mo36799a(ahoy.m56304a(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, da.mo74062i()).mo73642k());
        } catch (IOException e) {
            ahna.mo36796a(4);
            this.f67440f.remove(str);
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.SAFE_TO_CLOSE_PRIOR_CHANNEL OfflineFrame to endpoint %s, short-circuiting the upgrade protocol.", str);
            ahkv.f67390f.mo36659a(str, bvhu.RESULT_IO_ERROR, 5);
        }
    }

    public ahlh(ahov ahov, ahnp ahnp, ahne ahne) {
        this.f67444j = ahov;
        this.f67435a = ahnp;
        this.f67436b = ahne;
        if (cfnv.f184625a.mo6606a().mo81798bD()) {
            this.f67439e.put(bvif.WIFI_HOTSPOT, new ahrk(this.f67444j, this.f67436b, this));
        }
        if (cfnv.f184625a.mo6606a().mo81806bL()) {
            this.f67439e.put(bvif.WIFI_LAN, new ahrm(this.f67444j, this));
        }
        if (cfnv.f184625a.mo6606a().mo81858z()) {
            this.f67439e.put(bvif.BLUETOOTH, new ahmq(this.f67444j, this));
        }
        if (cfnv.f184625a.mo6606a().mo81823bo()) {
            this.f67439e.put(bvif.WIFI_AWARE, new ahrf(this.f67444j, this));
        }
        if (cfnv.f184625a.mo6606a().mo81833by()) {
            this.f67439e.put(bvif.WIFI_DIRECT, new ahri(this.f67444j, this));
        }
        if (cfnv.f184625a.mo6606a().mo81767aZ()) {
            this.f67439e.put(bvif.WEB_RTC, new ahrb());
        }
        this.f67443i = bvif.UNKNOWN_MEDIUM;
        ahnp.mo36894a(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, this);
    }

    /* renamed from: a */
    public final void mo36777a() {
        ArrayList arrayList = new ArrayList(this.f67445k.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo36787a((String) arrayList.get(i));
        }
    }

    /* renamed from: a */
    public final void mo36778a(ahkv ahkv, String str) {
        mo36786a(new ahla(this, str, ahkv));
    }

    /* renamed from: a */
    public final void mo36779a(ahkv ahkv, String str, ahna ahna) {
        ahna.mo36806h();
        ahna b = this.f67436b.mo36881b(ahkv, str, ahna);
        if (b == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager didn't find a previous EndpointChannel for %s when registering the new EndpointChannel, short-circuiting the upgrade protocol.", str);
            ahkv.f67390f.mo36659a(str, bvhu.CHANNEL_ERROR, 7);
            ahna.mo36796a(7);
            return;
        }
        srn srn = ahkm.f67363a;
        try {
            bxvd da = buty.f154902e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buty buty = (buty) da.f164949b;
            buty.f154905b = 2;
            buty.f154904a |= 1;
            b.mo36799a(ahoy.m56304a(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, da.mo74062i()).mo73642k());
            this.f67440f.put(str, b);
            if (this.f67442h.remove(str)) {
                mo36789b(ahkv, str);
            }
        } catch (IOException e) {
            b.mo36796a(4);
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68420a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.LAST_WRITE_TO_PRIOR_CHANNEL OfflineFrame to endpoint %s, short-circuiting the upgrade protocol.", str);
            ahkv.f67390f.mo36659a(str, bvhu.RESULT_IO_ERROR, 4);
        }
    }

    /* renamed from: b */
    public final void mo36790b(ahkv ahkv, String str, butx butx) {
        this.f67441g.remove(str);
        int i = 1;
        if (this.f67436b.mo36880b() > 1) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager failed to attempt a new bandwidth upgrade for endpoint %s because we have other connected endpoints and can't try a new upgrade medium.", str);
            ahkv.f67390f.mo36659a(str, bvhu.CHANNEL_ERROR, 3);
            return;
        }
        if (this.f67443i != bvif.UNKNOWN_MEDIUM) {
            ((ahll) this.f67439e.get(this.f67443i)).mo36793a();
            this.f67443i = bvif.UNKNOWN_MEDIUM;
        }
        int a = buts.m120442a(butx.f154896b);
        if (a != 0) {
            i = a;
        }
        bvif a2 = ahoy.m56307a(i);
        ArrayList arrayList = new ArrayList(ahkv.mo36733n(str));
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            bvif bvif = (bvif) arrayList2.get(i2);
            arrayList.remove(bvif);
            i2++;
            if (bvif == a2) {
                break;
            }
        }
        mo36781a(ahkv, str, arrayList);
    }

    /* renamed from: a */
    public final void mo36780a(ahkv ahkv, String str, butx butx) {
        ahna a = this.f67436b.mo36876a(str);
        if (a != null) {
            try {
                bxvd da = buty.f154902e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buty buty = (buty) da.f164949b;
                buty.f154905b = 5;
                int i = buty.f154904a | 1;
                buty.f154904a = i;
                butx.getClass();
                buty.f154906c = butx;
                buty.f154904a = i | 2;
                a.mo36799a(ahoy.m56304a(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, da.mo74062i()).mo73642k());
                if (this.f67443i != bvif.UNKNOWN_MEDIUM) {
                    ((ahll) this.f67439e.get(this.f67443i)).mo36793a();
                    this.f67443i = bvif.UNKNOWN_MEDIUM;
                }
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager has informed endpoint %s that the bandwidth upgrade failed.", str);
            } catch (IOException e) {
                a.mo36796a(4);
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68420a("BandwidthUpgradeManager failed to write BANDWIDTH_UPGRADE_NEGOTIATION.UPGRADE_FAILURE OfflineFrame to endpoint %s, short-circuiting the upgrade protocol.", str);
                ahkv.f67390f.mo36659a(str, bvhu.RESULT_IO_ERROR, 3);
            }
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager didn't find a previous EndpointChannel for %s when sending an upgrade failure frame, short-circuiting the upgrade protocol.", str);
            ahkv.f67390f.mo36659a(str, bvhu.CHANNEL_ERROR, 3);
        }
    }

    /* renamed from: a */
    public final void mo36781a(ahkv ahkv, String str, List list) {
        Object obj;
        bvif a = mo36776a(list);
        ahna a2 = this.f67436b.mo36876a(str);
        bvif l = a2 != null ? a2.mo36865l() : bvif.UNKNOWN_MEDIUM;
        if (ahkv.m55999a(l) != 3 && (a == l || a == bvif.UNKNOWN_MEDIUM || list.isEmpty())) {
            C1240of ofVar = (C1240of) this.f67445k.get(str);
            long b = cfnv.f184625a.mo6606a().mo81794b();
            if (!(ofVar == null || (obj = ofVar.f26799b) == null)) {
                b += ((Long) obj).longValue();
            }
            long min = Math.min(b, cfnv.f184625a.mo6606a().mo81835c());
            mo36787a(str);
            ahlf ahlf = new ahlf(this, ahkv, str);
            srn srn = ahkm.f67363a;
            this.f67445k.put(str, new C1240of(ahfi.m55635b(ahlf, min, this.f67437c), Long.valueOf(min)));
            ((bnsl) ahkm.f67363a.mo68390d()).mo68415a("Retry bandwidth upgrade after %s ms", min);
        } else if (!mo36788a(a)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager failed to attempt a new bandwidth upgrade for endpoint %s because we couldn't set a new bandwidth upgrade medium.", str);
            ahkv.f67390f.mo36659a(str, bvhu.CHANNEL_ERROR, 3);
        } else {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager is attempting to upgrade endpoint %s again with a new bandwidth upgrade medium.", str);
            mo36778a(ahkv, str);
        }
    }

    /* renamed from: a */
    public final void mo36782a(ahkv ahkv, String str, CountDownLatch countDownLatch) {
        mo36786a(new ahkz(this, str, countDownLatch));
    }

    /* renamed from: a */
    public final void mo36783a(ahlj ahlj) {
        mo36786a(new ahlb(this, ahlj));
    }

    /* renamed from: a */
    public final void mo36784a(buuj buuj, String str, ahkv ahkv, bvif bvif) {
        mo36786a(new ahld(this, buuj, ahkv, str, bvif));
    }

    /* renamed from: a */
    public final void mo36785a(bvhu bvhu, int i) {
        Map map = this.f67441g;
        if (((C1245ok) map).f26809h == 1) {
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            String str = (String) entry.getKey();
            this.f67441g.clear();
            mo36777a();
            ((ahkv) entry.getValue()).f67390f.mo36659a(str, bvhu, i);
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
            String a = bvhs.m121121a(i);
            if (i != 0) {
                bnsl.mo68425a("BandwidthUpgradeManager removing endpoint %s from inProgressUpgrades, since we got error %s at stage %s and this is the only endpoint we're trying to upgrade.", str, bvhu, a);
            } else {
                throw null;
            }
        }
        bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
        String a2 = bvhs.m121121a(i);
        if (i != 0) {
            bnsl2.mo68424a("BandwidthUpgradeManager got error %s at stage %s, but we don't know which endpoint was trying to connect to us, so skipping analytics for this error.", bvhu, a2);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36786a(Runnable runnable) {
        this.f67438d.execute(runnable);
    }

    /* renamed from: a */
    public final void mo36787a(String str) {
        Object obj;
        C1240of ofVar = (C1240of) this.f67445k.remove(str);
        if (ofVar != null && (obj = ofVar.f26798a) != null) {
            ((ahfi) obj).mo36396b();
        }
    }

    /* renamed from: a */
    public final boolean mo36788a(bvif bvif) {
        if (!this.f67439e.containsKey(bvif)) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Unable to upgrade to unknown upgrade medium %s", bvif.name());
            return false;
        }
        bvif bvif2 = this.f67443i;
        if (bvif2 == bvif) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("The currentBandwidthUpgradeMedium is staying the same (upgrade medium %s)", bvif.name());
            return true;
        } else if (bvif2 != bvif.UNKNOWN_MEDIUM) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("Unable to switch the currentBandwidthUpgradeMedium to upgrade medium %s. Medium %s has already been locked in.", bvif.name(), this.f67443i.name());
            return false;
        } else {
            this.f67443i = bvif;
            ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("The currentBandwidthUpgradeMedium is set to upgrade medium %s", bvif.name());
            return true;
        }
    }
}
