package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bbbg */
final /* synthetic */ class bbbg implements bqeh {

    /* renamed from: a */
    private final bbch f102274a;

    public bbbg(bbch bbch) {
        this.f102274a = bbch;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        bqgg bqgg2;
        bqgg bqgg3;
        ArrayList arrayList;
        bbch bbch;
        bqgg bqgg4;
        long j;
        int i;
        long j2;
        ArrayList arrayList2;
        bbch bbch2;
        Iterator<String> it;
        HashSet hashSet;
        int i2;
        long j3;
        bqgg bqgg5;
        bbch bbch3 = this.f102274a;
        Void voidR = (Void) obj;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(bbch3.mo56068d());
        bbav bbav = bbch3.f102317d;
        SharedPreferences a = bbfh.m87928a(bbav.f102244a, "gms_icing_mdd_file_group_manager_metadata", bbav.f102252i);
        int i3 = 0;
        if (a.getBoolean("done_remove_groupkeys_with_downloaded_field_not_set", false)) {
            bqgg = bqga.m112775a((Object) null);
        } else {
            bqgg = bqdx.m112674a(bbav.f102247d.mo56050a(), new bayy(bbav, a), bbav.f102251h);
        }
        arrayList3.add(bqgg);
        if (ceni.f183073a.mo6606a().mo79441r()) {
            bbav bbav2 = bbch3.f102317d;
            arrayList3.add(bqdx.m112674a(bbav2.f102247d.mo56050a(), new bayz(bbav2), bbav2.f102251h));
        }
        if (ceni.f183073a.mo6606a().mo79444u()) {
            bbav bbav3 = bbch3.f102317d;
            arrayList3.add(bqdx.m112674a(bbav3.f102247d.mo56050a(), new bayp(bbav3), bbav3.f102251h));
        }
        if (ceni.f183073a.mo6606a().mo79443t()) {
            bbav bbav4 = bbch3.f102317d;
            if (!bbav4.f102250g.mo66813a()) {
                bqgg5 = bqga.m112775a((Object) null);
            } else {
                Account[] accountsByTypeForPackage = ((AccountManager) bbav4.f102250g.mo66814b()).getAccountsByTypeForPackage("com.google", bbav4.f102244a.getPackageName());
                bnia bnia = new bnia();
                for (Account account : accountsByTypeForPackage) {
                    if (!(account.name == null || account.type == null)) {
                        bnia.mo67629b(bawv.m87644a(account));
                    }
                }
                bqgg5 = bqdx.m112674a(bbav4.f102247d.mo56050a(), new bayq(bbav4, bnia.mo67751a()), bbav4.f102251h);
            }
            arrayList3.add(bqgg5);
        }
        if (ceni.f183073a.mo6606a().mo79446w()) {
            bayg bayg = bbch3.f102321h;
            List c = bayg.f102087b.mo56058c();
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                bavd bavd = (bavd) it2.next();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                bauz bauz = bavd.f101872b;
                if (bauz == null) {
                    bauz = bauz.f101860g;
                }
                if (bbfe.m87921a(Math.min(timeUnit.toMillis(bauz.f101863b), bbfe.m87919a(bavd)), bayg.f102091f)) {
                    bayg.f102090e.mo34980a(1052, bavd.f101873c, bavd.f101875e);
                    it2.remove();
                }
            }
            bayg.f102087b.mo56060e();
            if (!bayg.f102087b.mo56054a(c)) {
                bayg.f102090e.mo34988b(1036);
                bbev.m87905a("%s: Failed to write back stale groups!", "ExpirationHandler");
            }
            arrayList3.add(bqdx.m112674a(bqga.m112775a((Object) null), new baxw(bayg), bayg.f102094i));
            bbch3.f102316c.mo34988b(1053);
        }
        bbeu bbeu = bbch3.f102324k;
        int b = (int) cenp.f183105a.mo6606a().mo79454b();
        if (!afoq.m53361a(b)) {
            bqgg2 = bqga.m112775a((Object) null);
        } else {
            bqgg2 = bqdx.m112674a(bbeu.f102507b.mo56055b(), new bbeq(bbeu, b), bbeu.f102509d);
        }
        arrayList3.add(bqgg2);
        bbfc bbfc = bbch3.f102323j;
        int h = (int) cenp.f183105a.mo6606a().mo79460h();
        if (!afoq.m53361a(h)) {
            bqgg3 = bqga.m112775a((Object) null);
        } else {
            bqgg3 = bqdx.m112674a(bbfc.f102530a.mo56055b(), new bbex(bbfc, h), bbfc.f102537h);
        }
        arrayList3.add(bqgg3);
        bbew bbew = bbch3.f102325l;
        int f = (int) cenp.f183105a.mo6606a().mo79458f();
        if (afoq.m53361a(f)) {
            HashSet hashSet2 = new HashSet();
            bxvd da = bpxt.f139777e.mo74144da();
            synchronized (bbfn.class) {
                SharedPreferences a2 = bbfh.m87928a(bbew.f102511b, "gms_icing_mdd_network_usage_monitor", bbew.f102512c);
                Iterator<String> it3 = a2.getAll().keySet().iterator();
                j = 0;
                long j4 = 0;
                while (it3.hasNext()) {
                    List c2 = bmyx.m108643a("|").mo66925c((CharSequence) it3.next());
                    if (c2.size() >= 4) {
                        int parseInt = Integer.parseInt((String) c2.get(2));
                        String a3 = bbfn.m87949a((String) c2.get(i3), (String) c2.get(1), parseInt);
                        if (!hashSet2.contains(a3)) {
                            hashSet2.add(a3);
                            String a4 = bbfn.m87948a(a3, "w");
                            String a5 = bbfn.m87948a(a3, "c");
                            HashSet hashSet3 = hashSet2;
                            int i4 = f;
                            Iterator<String> it4 = it3;
                            long j5 = a2.getLong(a4, 0);
                            long j6 = a2.getLong(a5, 0);
                            bxvd da2 = bpwz.f139594g.mo74144da();
                            String str = (String) c2.get(0);
                            bbch bbch4 = bbch3;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpwz bpwz = (bpwz) da2.f164949b;
                            str.getClass();
                            ArrayList arrayList4 = arrayList3;
                            bpwz.f139596a |= 4;
                            bpwz.f139599d = str;
                            String str2 = (String) c2.get(1);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bpwz bpwz2 = (bpwz) da2.f164949b;
                            str2.getClass();
                            int i5 = bpwz2.f139596a | 1;
                            bpwz2.f139596a = i5;
                            bpwz2.f139597b = str2;
                            bpwz2.f139596a = i5 | 2;
                            bpwz2.f139598c = parseInt;
                            bpwz bpwz3 = (bpwz) da2.mo74062i();
                            bxvd da3 = bpxs.f139771e.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bpxs bpxs = (bpxs) da3.f164949b;
                            bpwz3.getClass();
                            bpxs.f139774b = bpwz3;
                            int i6 = bpxs.f139773a | 1;
                            bpxs.f139773a = i6;
                            int i7 = i6 | 2;
                            bpxs.f139773a = i7;
                            bpxs.f139775c = j5;
                            bpxs.f139773a = i7 | 4;
                            bpxs.f139776d = j6;
                            bpxs bpxs2 = (bpxs) da3.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpxt bpxt = (bpxt) da.f164949b;
                            bpxs2.getClass();
                            if (!bpxt.f139780b.mo73666a()) {
                                bpxt.f139780b = bxvk.m124021a(bpxt.f139780b);
                            }
                            bpxt.f139780b.add(bpxs2);
                            j += j5;
                            j4 += j6;
                            f = i4;
                            hashSet2 = hashSet3;
                            it3 = it4;
                            bbch3 = bbch4;
                            arrayList3 = arrayList4;
                            i3 = 0;
                        } else {
                            bbch2 = bbch3;
                            arrayList2 = arrayList3;
                            hashSet = hashSet2;
                            i2 = f;
                            it = it3;
                            j3 = j4;
                        }
                    } else {
                        bbch2 = bbch3;
                        arrayList2 = arrayList3;
                        hashSet = hashSet2;
                        i2 = f;
                        it = it3;
                        j3 = j4;
                    }
                    j4 = j3;
                    f = i2;
                    hashSet2 = hashSet;
                    it3 = it;
                    bbch3 = bbch2;
                    arrayList3 = arrayList2;
                    i3 = 0;
                }
                bbch = bbch3;
                arrayList = arrayList3;
                i = f;
                j2 = j4;
                a2.edit().clear().commit();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxt bpxt2 = (bpxt) da.f164949b;
            int i8 = bpxt2.f139779a | 1;
            bpxt2.f139779a = i8;
            bpxt2.f139781c = j;
            bpxt2.f139779a = i8 | 2;
            bpxt2.f139782d = j2;
            bbew.f102510a.mo34985a((bpxt) da.mo74062i(), i);
            bqgg4 = bqga.m112775a((Object) null);
        } else {
            bbch = bbch3;
            arrayList = arrayList3;
            synchronized (bbfn.class) {
                bbfh.m87928a(bbew.f102511b, "gms_icing_mdd_network_usage_monitor", bbew.f102512c).edit().clear().commit();
            }
            bqgg4 = bqga.m112775a((Object) null);
        }
        arrayList.add(bqgg4);
        bbfh.m87928a(bbch.f102315b, "gms_icing_mdd_manager_metadata", bbch.f102326m).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
        return bqga.m112782b(arrayList).mo69216a(bbbs.f102288a, bbch.f102327n);
    }
}
