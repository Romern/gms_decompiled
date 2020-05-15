package p000;

import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.westworld.ConfigActivationOperation;
import com.google.android.gms.westworld.DataAlarmOperation;
import com.google.android.gms.westworld.FetchOperation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: ayka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayka {

    /* renamed from: a */
    static final TextUtils.SimpleStringSplitter f97811a = new TextUtils.SimpleStringSplitter(',');

    /* renamed from: a */
    static Set m84135a(String str) {
        f97811a.setString(str);
        bnia j = bnic.m109500j();
        while (f97811a.hasNext()) {
            try {
                j.mo67629b(Long.valueOf(Long.parseLong(f97811a.next())));
            } catch (NumberFormatException e) {
            }
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    private static void m84136a(Context context, StatsManager statsManager, Set set) {
        Set<String> stringSet = aykk.m84183d(context).getStringSet("SENT_CONFIGS", bnon.f131923a);
        try {
            if (!stringSet.contains(String.valueOf(chpw.m149307f())) && !set.contains(Long.valueOf(chpw.m149307f()))) {
                statsManager.removeConfig(chpw.m149307f());
            }
            for (String str : stringSet) {
                long parseLong = Long.parseLong(str);
                if (!set.contains(Long.valueOf(parseLong))) {
                    statsManager.removeConfig(parseLong);
                }
            }
        } catch (StatsManager.StatsUnavailableException e) {
        }
    }

    /* renamed from: a */
    public static void m84137a(Context context, Set set, List list, boolean z, bymq bymq, rjx rjx) {
        Set<bkn> set2;
        Set<String> stringSet;
        bnia j = bnic.m109500j();
        bnia j2 = bnic.m109500j();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (set.contains(Long.valueOf(longValue))) {
                j2.mo67629b(String.valueOf(longValue));
                bkn a = aykk.m84162a(longValue);
                if (a != null) {
                    j.mo67629b(a);
                }
            }
        }
        SharedPreferences d = aykk.m84183d(context);
        bnic<bkn> a2 = j.mo67751a();
        Set<String> stringSet2 = d.getStringSet("ACTIVE_CONFIGS", bnon.f131923a);
        if (stringSet2.isEmpty()) {
            stringSet2 = d.getStringSet("SENT_CONFIGS", bnon.f131923a);
        }
        if (stringSet2 != null) {
            bnia j3 = bnic.m109500j();
            for (String str : stringSet2) {
                bkn a3 = aykk.m84162a(Long.parseLong(str));
                if (a3 != null) {
                    j3.mo67629b(a3);
                }
            }
            set2 = j3.mo67751a();
        } else {
            set2 = bnon.f131923a;
        }
        for (bkn bkn : set2) {
            if (!a2.contains(bkn)) {
                DataAlarmOperation.m94459a(context, bkn);
            }
        }
        qxq f = aykk.m84185f(context);
        for (bkn bkn2 : a2) {
            DataAlarmOperation.m94460a(context, Long.valueOf(DataAlarmOperation.m94458a(bkn2)), f, bkn2, false);
        }
        if (!((bymq == null && rjx == null) || (stringSet = d.getStringSet("ACTIVE_CONFIGS", bnon.f131923a)) == null || stringSet.isEmpty())) {
            qxq f2 = aykk.m84185f(context);
            for (String str2 : stringSet) {
                Long valueOf = Long.valueOf(Long.parseLong(str2));
                if (!list.contains(valueOf)) {
                    FetchOperation.m94465b(context, rjx, bymq, f2, new Intent("com.google.android.gms.westworld.action.DEACTIVATE").putExtra("FETCH_CONFIG_ID", valueOf));
                }
            }
        }
        SharedPreferences.Editor edit = d.edit();
        edit.putStringSet("ACTIVE_CONFIGS", j2.mo67751a());
        if (z) {
            bnia j4 = bnic.m109500j();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                j4.mo67629b(String.valueOf(((Long) it2.next()).longValue()));
            }
            edit.putStringSet("SENT_CONFIGS", j4.mo67751a());
        }
        edit.apply();
    }

    /* renamed from: a */
    static void m84138a(bxvd bxvd, bky bky) {
        bxvd da = bkx.f5046d.mo74144da();
        long j = bky.f5054b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkx bkx = (bkx) da.f164949b;
        int i = bkx.f5048a | 1;
        bkx.f5048a = i;
        bkx.f5049b = j;
        int i2 = bky.f5055c;
        bkx.f5048a = i | 2;
        bkx.f5050c = i2;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bky bky2 = (bky) bxvd.f164949b;
        bkx bkx2 = (bkx) da.mo74062i();
        bky bky3 = bky.f5051v;
        bkx2.getClass();
        if (!bky2.f5068p.mo73666a()) {
            bky2.f5068p = GeneratedMessageLite.m124021a(bky2.f5068p);
        }
        bky2.f5068p.add(bkx2);
    }

    /* renamed from: a */
    public static boolean m84139a(Context context) {
        aykc aykc;
        boolean z;
        Iterator it;
        aykc aykc2;
        Map<String, ?> map;
        Map<String, ?> map2;
        aykc aykc3;
        bkq bkq;
        bxvw bxvw;
        bkq bkq2;
        bxvw bxvw2;
        bkq bkq3;
        bxvw bxvw3;
        bkq bkq4;
        bxvw bxvw4;
        bkq bkq5;
        List list;
        Iterator it2;
        int i;
        int i2;
        int i3;
        bxwc bxwc;
        Context context2 = context;
        StatsManager statsManager = (StatsManager) context2.getSystemService("stats");
        int i4 = 0;
        if (statsManager == null) {
            return false;
        }
        SharedPreferences c = aykk.m84182c(context);
        new ayke();
        int i5 = Build.VERSION.SDK_INT;
        bymq a = aykk.m84163a(context);
        aykc aykc4 = new aykc();
        aykd aykd = new aykd(a, context2, aykc4);
        Map<String, ?> all = c.getAll();
        Iterator it3 = new TreeSet(all.keySet()).iterator();
        boolean z2 = false;
        while (it3.hasNext()) {
            String str = (String) it3.next();
            if (str.startsWith(chpw.m149308g())) {
                byte[] decode = Base64.decode((String) all.get(str), i4);
                if (decode == null || decode.length == 0) {
                    map = all;
                    it = it3;
                    aykc2 = aykc;
                } else {
                    try {
                        bky bky = (bky) GeneratedMessageLite.m124016a(bky.f5051v, decode, bxus.m123744c());
                        int i6 = Build.VERSION.SDK_INT;
                        if (chnv.m149212b()) {
                            bxwc bxwc2 = bky.f5061i;
                            int size = bxwc2.size();
                            int i7 = 0;
                            while (true) {
                                i = 3;
                                if (i7 >= size) {
                                    break;
                                }
                                bkf bkf = (bkf) bxwc2.get(i7);
                                map2 = all;
                                try {
                                    if (!aykc.f97812a.containsKey(Long.valueOf(bkf.f4961c))) {
                                        aykc.f97812a.put(Long.valueOf(bkf.f4961c), bkf);
                                        if (bkf.f4959a == 3) {
                                            bxvw bxvw5 = ((bke) bkf.f4960b).f4956a;
                                            int size2 = bxvw5.size();
                                            int i8 = 0;
                                            while (i8 < size2) {
                                                bxvw bxvw6 = bxvw5;
                                                int i9 = size2;
                                                it = it3;
                                                try {
                                                    aykc.f97816e.mo67268a(Long.valueOf(bkf.f4961c), Long.valueOf(((Long) bxvw5.get(i8)).longValue()));
                                                    i8++;
                                                    bxvw5 = bxvw6;
                                                    it3 = it;
                                                    size2 = i9;
                                                } catch (bxwf e) {
                                                    aykc2 = aykc;
                                                    aykk.m84185f(context).mo24383c("InvalidConfigProto").mo24359a();
                                                    all = map;
                                                    aykc4 = aykc2;
                                                    it3 = it;
                                                    i4 = 0;
                                                }
                                            }
                                            it = it3;
                                        } else {
                                            it = it3;
                                        }
                                    } else {
                                        it = it3;
                                    }
                                    i7++;
                                    all = map2;
                                    it3 = it;
                                } catch (bxwf e2) {
                                    it = it3;
                                    aykc2 = aykc;
                                    aykk.m84185f(context).mo24383c("InvalidConfigProto").mo24359a();
                                    all = map;
                                    aykc4 = aykc2;
                                    it3 = it;
                                    i4 = 0;
                                }
                            }
                            map = all;
                            it2 = it3;
                            bxwc bxwc3 = bky.f5062j;
                            int size3 = bxwc3.size();
                            int i10 = 0;
                            while (i10 < size3) {
                                bks bks = (bks) bxwc3.get(i10);
                                if (!aykc.f97813b.containsKey(Long.valueOf(bks.f5031c))) {
                                    aykc.f97813b.put(Long.valueOf(bks.f5031c), bks);
                                    if (bks.f5029a == i) {
                                        bxvw bxvw7 = ((bkr) bks.f5030b).f5026a;
                                        int size4 = bxvw7.size();
                                        int i11 = 0;
                                        while (i11 < size4) {
                                            aykc.f97815d.mo67268a(Long.valueOf(bks.f5031c), Long.valueOf(((Long) bxvw7.get(i11)).longValue()));
                                            i11++;
                                            bxwc3 = bxwc3;
                                            size3 = size3;
                                        }
                                        bxwc = bxwc3;
                                        i3 = size3;
                                    } else {
                                        bxwc = bxwc3;
                                        i3 = size3;
                                    }
                                } else {
                                    bxwc = bxwc3;
                                    i3 = size3;
                                }
                                i10++;
                                bxwc3 = bxwc;
                                size3 = i3;
                                i = 3;
                            }
                            bxwc bxwc4 = bky.f5063k;
                            int size5 = bxwc4.size();
                            for (int i12 = 0; i12 < size5; i12++) {
                                bkd bkd = (bkd) bxwc4.get(i12);
                                if (!aykc.f97814c.containsKey(Long.valueOf(bkd.f4951a))) {
                                    aykc.f97814c.put(Long.valueOf(bkd.f4951a), bkd);
                                    aykc.f97818g.mo67268a(Long.valueOf(bkd.f4952b), Long.valueOf(bkd.f4951a));
                                }
                            }
                            bxwc bxwc5 = bky.f5065m;
                            int size6 = bxwc5.size();
                            for (int i13 = 0; i13 < size6; i13++) {
                                blb blb = (blb) bxwc5.get(i13);
                                int a2 = bla.m3277a(blb.f5080b);
                                if (a2 != 0) {
                                    if (a2 == 3 && !aykc.f97820i.mo67271d(Long.valueOf(blb.f5079a))) {
                                        aykc.f97820i.mo67268a(Long.valueOf(blb.f5081c), blb);
                                    }
                                }
                                if (!aykc.f97821j.mo67271d(Long.valueOf(blb.f5079a))) {
                                    aykc.f97821j.mo67268a(Long.valueOf(blb.f5081c), blb);
                                }
                            }
                            int i14 = Build.VERSION.SDK_INT;
                            bxwc bxwc6 = bky.f5070r;
                            int size7 = bxwc6.size();
                            int i15 = 0;
                            while (i15 < size7) {
                                bkp bkp = (bkp) bxwc6.get(i15);
                                long j = bkp.f5013a;
                                aykc.f97819h.mo67268a(Long.valueOf(j), bkp);
                                bxwc bxwc7 = bkp.f5014b;
                                int size8 = bxwc7.size();
                                int i16 = 0;
                                while (true) {
                                    i2 = i15 + 1;
                                    if (i16 >= size8) {
                                        break;
                                    }
                                    bkk bkk = (bkk) bxwc7.get(i16);
                                    bnkd bnkd = aykc.f97817f;
                                    bxwc bxwc8 = bxwc6;
                                    Long valueOf = Long.valueOf(j);
                                    int i17 = size7;
                                    int i18 = i15;
                                    bnkd.mo67268a(valueOf, Long.valueOf(bkk.f4983b));
                                    if ((bkk.f4982a & 4) != 0) {
                                        aykc.f97817f.mo67268a(valueOf, Long.valueOf(bkk.f4984c));
                                    }
                                    i16++;
                                    bxwc6 = bxwc8;
                                    size7 = i17;
                                    i15 = i18;
                                }
                                i15 = i2;
                            }
                        } else {
                            map = all;
                            it2 = it3;
                        }
                        if (!chnv.m149212b()) {
                            aykc3 = aykc;
                        } else if (bky.f5064l.size() != 0) {
                            long f = chpw.m149307f();
                            aykd.mo54046a(f);
                            bxvd bxvd = (bxvd) aykd.f97822a.get(Long.valueOf(f));
                            aykd.mo54052b(f, bky);
                            for (bkc bkc : bky.f5064l) {
                                if (aykd.m84145a(aykd.f97825d, bkc.f4947a, aykd.f97833l.mo67124a(Long.valueOf(f)))) {
                                    bxvd.mo73989a(bkc);
                                }
                                if (!aykd.f97825d.contains(Long.valueOf(bkc.f4947a))) {
                                    for (blb blb2 : aykd.f97828g.f97821j.mo67124a(Long.valueOf(bkc.f4947a))) {
                                        aykc2 = aykc;
                                        try {
                                            if (aykd.m84145a(aykd.f97826e, blb2.f5079a, aykd.f97834m.mo67124a(Long.valueOf(f)))) {
                                                bxvd.mo73994a(blb2);
                                                aykc = aykc2;
                                            } else {
                                                aykc = aykc2;
                                            }
                                        } catch (bxwf e3) {
                                            aykk.m84185f(context).mo24383c("InvalidConfigProto").mo24359a();
                                            all = map;
                                            aykc4 = aykc2;
                                            it3 = it;
                                            i4 = 0;
                                        }
                                    }
                                }
                            }
                            aykc3 = aykc;
                        } else {
                            aykc3 = aykc;
                        }
                        List a3 = bngx.m109368a((Collection) bky.f5067o);
                        for (bkl bkl : bky.f5056d) {
                            bkq bkq6 = bkl.f4991e;
                            if (bkq6 == null) {
                                bkq6 = bkq.f5016g;
                            }
                            Long valueOf2 = Long.valueOf(aykk.m84160a(bkq6));
                            Set set = aykd.f97823b;
                            long j2 = bkl.f4988b;
                            bkq bkq7 = bkl.f4991e;
                            if (bkq7 != null) {
                                bkq5 = bkq7;
                            } else {
                                bkq5 = bkq.f5016g;
                            }
                            List a4 = aykd.f97832k.mo67124a(valueOf2);
                            if (chnp.m149198b()) {
                                list = bky.f5067o;
                            } else {
                                list = a3;
                            }
                            List list2 = a3;
                            bky bky2 = bky;
                            if (aykd.mo54051a(set, j2, bkq5, a4, list, aykd.f97836o.mo67124a(valueOf2))) {
                                aykd.mo54046a(valueOf2.longValue());
                                bxvd bxvd2 = (bxvd) aykd.f97822a.get(valueOf2);
                                if (chnv.m149212b()) {
                                    aykd.mo54053b(bxvd2, bkl.f4989c, bky2.f5054b);
                                    if ((bkl.f4987a & 4) != 0) {
                                        aykd.mo54049a(bxvd2, bkl.f4990d, bky2.f5054b);
                                    }
                                } else {
                                    aykd.mo54048a(valueOf2.longValue(), bky2);
                                }
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                bky bky3 = (bky) bxvd2.f164949b;
                                bkl.getClass();
                                if (!bky3.f5056d.mo73666a()) {
                                    bky3.f5056d = GeneratedMessageLite.m124021a(bky3.f5056d);
                                }
                                bky3.f5056d.add(bkl);
                                if (!chnv.m149212b()) {
                                    int i19 = Build.VERSION.SDK_INT;
                                    aykd.m84143a(bxvd2, bkl.f4988b, bky2);
                                }
                                if (chnv.m149212b()) {
                                    int i20 = Build.VERSION.SDK_INT;
                                    aykd.mo54054c(bxvd2, bkl.f4988b, bky2.f5054b);
                                }
                                if (!chnv.m149212b() && !aykd.f97837p.mo67309b(valueOf2, Long.valueOf(bkl.f4988b))) {
                                    aykd.f97837p.mo67268a(valueOf2, Long.valueOf(bkl.f4988b));
                                }
                                if (chny.m149217b() && bkl.f4992f) {
                                    aykd.f97827f.add(valueOf2);
                                }
                            }
                            if (!chnv.m149212b()) {
                                bky = bky2;
                                a3 = list2;
                            } else if (!aykd.f97823b.contains(Long.valueOf(bkl.f4988b))) {
                                bkq bkq8 = bkl.f4991e;
                                if (bkq8 == null) {
                                    bkq8 = bkq.f5016g;
                                }
                                if (aykd.mo54050a(bkq8)) {
                                    aykd.mo54052b(valueOf2.longValue(), bky2);
                                    aykd.mo54047a(bky2.f5054b, valueOf2.longValue(), bkl.f4988b);
                                    bky = bky2;
                                    a3 = list2;
                                } else {
                                    bky = bky2;
                                    a3 = list2;
                                }
                            } else {
                                bky = bky2;
                                a3 = list2;
                            }
                        }
                        bky bky4 = bky;
                        for (bki bki : bky4.f5057e) {
                            bkq bkq9 = bki.f4970e;
                            if (bkq9 == null) {
                                bkq9 = bkq.f5016g;
                            }
                            Long valueOf3 = Long.valueOf(aykk.m84160a(bkq9));
                            Set set2 = aykd.f97823b;
                            long j3 = bki.f4967b;
                            bkq bkq10 = bki.f4970e;
                            if (bkq10 != null) {
                                bkq4 = bkq10;
                            } else {
                                bkq4 = bkq.f5016g;
                            }
                            List a5 = aykd.f97832k.mo67124a(valueOf3);
                            if (!chnp.m149198b()) {
                                bxvw4 = aykd.f97835n.mo67124a(valueOf3);
                            } else {
                                bxvw4 = bky4.f5067o;
                            }
                            if (aykd.mo54051a(set2, j3, bkq4, a5, bxvw4, aykd.f97836o.mo67124a(valueOf3))) {
                                aykd.mo54046a(valueOf3.longValue());
                                bxvd bxvd3 = (bxvd) aykd.f97822a.get(valueOf3);
                                if (chnv.m149212b()) {
                                    aykd.mo54053b(bxvd3, bki.f4968c, bky4.f5054b);
                                    if ((bki.f4966a & 4) != 0) {
                                        aykd.mo54049a(bxvd3, bki.f4969d, bky4.f5054b);
                                    }
                                } else {
                                    aykd.mo54048a(valueOf3.longValue(), bky4);
                                }
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                bky bky5 = (bky) bxvd3.f164949b;
                                bki.getClass();
                                if (!bky5.f5057e.mo73666a()) {
                                    bky5.f5057e = GeneratedMessageLite.m124021a(bky5.f5057e);
                                }
                                bky5.f5057e.add(bki);
                                if (!chnv.m149212b()) {
                                    int i21 = Build.VERSION.SDK_INT;
                                    aykd.m84143a(bxvd3, bki.f4967b, bky4);
                                }
                                if (chnv.m149212b()) {
                                    int i22 = Build.VERSION.SDK_INT;
                                    aykd.mo54054c(bxvd3, bki.f4967b, bky4.f5054b);
                                }
                                if (!chnv.m149212b() && !aykd.f97837p.mo67309b(valueOf3, Long.valueOf(bki.f4967b))) {
                                    aykd.f97837p.mo67268a(valueOf3, Long.valueOf(bki.f4967b));
                                }
                                if (chny.m149217b() && bki.f4971f) {
                                    aykd.f97827f.add(valueOf3);
                                }
                            }
                            if (chnv.m149212b() && !aykd.f97823b.contains(Long.valueOf(bki.f4967b))) {
                                bkq bkq11 = bki.f4970e;
                                if (bkq11 == null) {
                                    bkq11 = bkq.f5016g;
                                }
                                if (aykd.mo54050a(bkq11)) {
                                    aykd.mo54052b(valueOf3.longValue(), bky4);
                                    aykd.mo54047a(bky4.f5054b, valueOf3.longValue(), bki.f4967b);
                                }
                            }
                        }
                        for (bkj bkj : bky4.f5060h) {
                            bkq bkq12 = bkj.f4978e;
                            if (bkq12 == null) {
                                bkq12 = bkq.f5016g;
                            }
                            Long valueOf4 = Long.valueOf(aykk.m84160a(bkq12));
                            Set set3 = aykd.f97823b;
                            long j4 = bkj.f4975b;
                            bkq bkq13 = bkj.f4978e;
                            if (bkq13 != null) {
                                bkq3 = bkq13;
                            } else {
                                bkq3 = bkq.f5016g;
                            }
                            List a6 = aykd.f97832k.mo67124a(valueOf4);
                            if (!chnp.m149198b()) {
                                bxvw3 = aykd.f97835n.mo67124a(valueOf4);
                            } else {
                                bxvw3 = bky4.f5067o;
                            }
                            if (aykd.mo54051a(set3, j4, bkq3, a6, bxvw3, aykd.f97836o.mo67124a(valueOf4))) {
                                aykd.mo54046a(valueOf4.longValue());
                                bxvd bxvd4 = (bxvd) aykd.f97822a.get(valueOf4);
                                if (chnv.m149212b()) {
                                    aykd.mo54049a(bxvd4, bkj.f4976c, bky4.f5054b);
                                    if ((bkj.f4974a & 4) != 0) {
                                        aykd.mo54049a(bxvd4, bkj.f4977d, bky4.f5054b);
                                    }
                                } else {
                                    aykd.mo54048a(valueOf4.longValue(), bky4);
                                }
                                if (bxvd4.f164950c) {
                                    bxvd4.mo74035c();
                                    bxvd4.f164950c = false;
                                }
                                bky bky6 = (bky) bxvd4.f164949b;
                                bkj.getClass();
                                if (!bky6.f5060h.mo73666a()) {
                                    bky6.f5060h = GeneratedMessageLite.m124021a(bky6.f5060h);
                                }
                                bky6.f5060h.add(bkj);
                                if (!chnv.m149212b()) {
                                    int i23 = Build.VERSION.SDK_INT;
                                    aykd.m84143a(bxvd4, bkj.f4975b, bky4);
                                }
                                if (chnv.m149212b()) {
                                    int i24 = Build.VERSION.SDK_INT;
                                    aykd.mo54054c(bxvd4, bkj.f4975b, bky4.f5054b);
                                }
                                if (!chnv.m149212b() && !aykd.f97837p.mo67309b(valueOf4, Long.valueOf(bkj.f4975b))) {
                                    aykd.f97837p.mo67268a(valueOf4, Long.valueOf(bkj.f4975b));
                                }
                                if (chny.m149217b() && bkj.f4979f) {
                                    aykd.f97827f.add(valueOf4);
                                }
                            }
                            if (chnv.m149212b() && !aykd.f97823b.contains(Long.valueOf(bkj.f4975b))) {
                                bkq bkq14 = bkj.f4978e;
                                if (bkq14 == null) {
                                    bkq14 = bkq.f5016g;
                                }
                                if (aykd.mo54050a(bkq14)) {
                                    aykd.mo54052b(valueOf4.longValue(), bky4);
                                    aykd.mo54047a(bky4.f5054b, valueOf4.longValue(), bkj.f4975b);
                                }
                            }
                        }
                        for (blc blc : bky4.f5058f) {
                            bkq bkq15 = blc.f5089e;
                            if (bkq15 == null) {
                                bkq15 = bkq.f5016g;
                            }
                            Long valueOf5 = Long.valueOf(aykk.m84160a(bkq15));
                            Set set4 = aykd.f97823b;
                            long j5 = blc.f5086b;
                            bkq bkq16 = blc.f5089e;
                            if (bkq16 != null) {
                                bkq2 = bkq16;
                            } else {
                                bkq2 = bkq.f5016g;
                            }
                            List a7 = aykd.f97832k.mo67124a(valueOf5);
                            if (!chnp.m149198b()) {
                                bxvw2 = aykd.f97835n.mo67124a(valueOf5);
                            } else {
                                bxvw2 = bky4.f5067o;
                            }
                            if (aykd.mo54051a(set4, j5, bkq2, a7, bxvw2, aykd.f97836o.mo67124a(valueOf5))) {
                                aykd.mo54046a(valueOf5.longValue());
                                bxvd bxvd5 = (bxvd) aykd.f97822a.get(valueOf5);
                                if (chnv.m149212b()) {
                                    aykd.mo54053b(bxvd5, blc.f5087c, bky4.f5054b);
                                    if ((blc.f5085a & 8) != 0) {
                                        aykd.mo54049a(bxvd5, blc.f5088d, bky4.f5054b);
                                    }
                                } else {
                                    aykd.mo54048a(valueOf5.longValue(), bky4);
                                }
                                if (bxvd5.f164950c) {
                                    bxvd5.mo74035c();
                                    bxvd5.f164950c = false;
                                }
                                bky bky7 = (bky) bxvd5.f164949b;
                                blc.getClass();
                                if (!bky7.f5058f.mo73666a()) {
                                    bky7.f5058f = GeneratedMessageLite.m124021a(bky7.f5058f);
                                }
                                bky7.f5058f.add(blc);
                                if (!chnv.m149212b()) {
                                    int i25 = Build.VERSION.SDK_INT;
                                    aykd.m84143a(bxvd5, blc.f5086b, bky4);
                                }
                                if (chnv.m149212b()) {
                                    int i26 = Build.VERSION.SDK_INT;
                                    aykd.mo54054c(bxvd5, blc.f5086b, bky4.f5054b);
                                }
                                if (!chnv.m149212b() && !aykd.f97837p.mo67309b(valueOf5, Long.valueOf(blc.f5086b))) {
                                    aykd.f97837p.mo67268a(valueOf5, Long.valueOf(blc.f5086b));
                                }
                                if (chny.m149217b() && blc.f5090f) {
                                    aykd.f97827f.add(valueOf5);
                                }
                            }
                            if (chnv.m149212b() && !aykd.f97823b.contains(Long.valueOf(blc.f5086b))) {
                                bkq bkq17 = blc.f5089e;
                                if (bkq17 == null) {
                                    bkq17 = bkq.f5016g;
                                }
                                if (aykd.mo54050a(bkq17)) {
                                    aykd.mo54052b(valueOf5.longValue(), bky4);
                                    aykd.mo54047a(bky4.f5054b, valueOf5.longValue(), blc.f5086b);
                                }
                            }
                        }
                        for (bko bko : bky4.f5059g) {
                            bkq bkq18 = bko.f5009f;
                            if (bkq18 == null) {
                                bkq18 = bkq.f5016g;
                            }
                            Long valueOf6 = Long.valueOf(aykk.m84160a(bkq18));
                            Set set5 = aykd.f97823b;
                            long j6 = bko.f5005b;
                            bkq bkq19 = bko.f5009f;
                            if (bkq19 != null) {
                                bkq = bkq19;
                            } else {
                                bkq = bkq.f5016g;
                            }
                            List a8 = aykd.f97832k.mo67124a(valueOf6);
                            if (!chnp.m149198b()) {
                                bxvw = aykd.f97835n.mo67124a(valueOf6);
                            } else {
                                bxvw = bky4.f5067o;
                            }
                            if (aykd.mo54051a(set5, j6, bkq, a8, bxvw, aykd.f97836o.mo67124a(valueOf6))) {
                                aykd.mo54046a(valueOf6.longValue());
                                bxvd bxvd6 = (bxvd) aykd.f97822a.get(valueOf6);
                                if (chnv.m149212b()) {
                                    aykd.mo54053b(bxvd6, bko.f5006c, bky4.f5054b);
                                    if ((bko.f5004a & 16) != 0) {
                                        aykd.mo54049a(bxvd6, bko.f5008e, bky4.f5054b);
                                    }
                                } else {
                                    aykd.mo54048a(valueOf6.longValue(), bky4);
                                }
                                if (bxvd6.f164950c) {
                                    bxvd6.mo74035c();
                                    bxvd6.f164950c = false;
                                }
                                bky bky8 = (bky) bxvd6.f164949b;
                                bko.getClass();
                                if (!bky8.f5059g.mo73666a()) {
                                    bky8.f5059g = GeneratedMessageLite.m124021a(bky8.f5059g);
                                }
                                bky8.f5059g.add(bko);
                                if (!chnv.m149212b()) {
                                    int i27 = Build.VERSION.SDK_INT;
                                    aykd.m84143a(bxvd6, bko.f5005b, bky4);
                                }
                                if (chnv.m149212b()) {
                                    int i28 = Build.VERSION.SDK_INT;
                                    aykd.mo54054c(bxvd6, bko.f5005b, bky4.f5054b);
                                }
                                if (chnv.m149212b() && (bko.f5004a & 4) != 0) {
                                    aykd.mo54053b(bxvd6, bko.f5007d, bky4.f5054b);
                                }
                                if (!chnv.m149212b() && !aykd.f97837p.mo67309b(valueOf6, Long.valueOf(bko.f5005b))) {
                                    aykd.f97837p.mo67268a(valueOf6, Long.valueOf(bko.f5005b));
                                }
                                if (chny.m149217b() && bko.f5010g) {
                                    aykd.f97827f.add(valueOf6);
                                }
                            }
                            if (chnv.m149212b() && !aykd.f97823b.contains(Long.valueOf(bko.f5005b))) {
                                bkq bkq20 = bko.f5009f;
                                if (bkq20 == null) {
                                    bkq20 = bkq.f5016g;
                                }
                                if (aykd.mo54050a(bkq20)) {
                                    aykd.mo54052b(valueOf6.longValue(), bky4);
                                    aykd.mo54047a(bky4.f5054b, valueOf6.longValue(), bko.f5005b);
                                }
                            }
                        }
                        all = map;
                        aykc4 = aykc3;
                        it3 = it;
                        i4 = 0;
                        z2 = true;
                    } catch (bxwf e4) {
                        map2 = all;
                        it = it3;
                        aykc2 = aykc;
                        aykk.m84185f(context).mo24383c("InvalidConfigProto").mo24359a();
                        all = map;
                        aykc4 = aykc2;
                        it3 = it;
                        i4 = 0;
                    }
                }
            } else {
                map = all;
                it = it3;
                aykc2 = aykc;
            }
            all = map;
            aykc4 = aykc2;
            it3 = it;
            i4 = 0;
        }
        Map<String, ?> map3 = all;
        int i29 = Build.VERSION.SDK_INT;
        if (!chnv.m149212b()) {
            Iterator it4 = new TreeSet(map3.keySet()).iterator();
            while (it4.hasNext()) {
                String str2 = (String) it4.next();
                if (str2.startsWith(chpw.m149308g())) {
                    Map<String, ?> map4 = map3;
                    byte[] decode2 = Base64.decode((String) map4.get(str2), 0);
                    if (decode2 == null || decode2.length == 0) {
                        map3 = map4;
                    } else {
                        try {
                            for (bkd bkd2 : ((bky) GeneratedMessageLite.m124016a(bky.f5051v, decode2, bxus.m123744c())).f5063k) {
                                long j7 = bkd2.f4952b;
                                for (Long l : aykd.f97837p.mo67316o()) {
                                    if (!aykd.f97831j.mo67309b(l, Long.valueOf(bkd2.f4951a)) && aykd.f97837p.mo67309b(l, Long.valueOf(j7)) && !aykd.f97823b.contains(Long.valueOf(bkd2.f4952b)) && !aykd.f97824c.contains(Long.valueOf(bkd2.f4951a))) {
                                        ((bxvd) aykd.f97822a.get(l)).mo73990a(bkd2);
                                        aykd.f97831j.mo67268a(l, Long.valueOf(bkd2.f4951a));
                                    }
                                }
                            }
                            map3 = map4;
                        } catch (bxwf e5) {
                            map3 = map4;
                        }
                    }
                }
            }
        }
        for (Long l2 : aykd.f97835n.mo67316o()) {
            for (Long l3 : aykd.f97835n.mo67124a(l2)) {
                if (aykd.f97836o.mo67271d(l2) && !aykd.f97836o.mo67309b(l2, l3)) {
                    bxvd bxvd7 = (bxvd) aykd.f97822a.get(l2);
                    long longValue = l3.longValue();
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bky bky9 = (bky) bxvd7.f164949b;
                    bky bky10 = bky.f5051v;
                    if (!bky9.f5067o.mo73666a()) {
                        bky9.f5067o = GeneratedMessageLite.m124020a(bky9.f5067o);
                    }
                    bky9.f5067o.mo74161a(longValue);
                }
            }
        }
        bnha h = bnhe.m109414h();
        for (Map.Entry entry : aykd.f97822a.entrySet()) {
            bxvd bxvd8 = (bxvd) entry.getValue();
            f97811a.setString(chox.f188929a.mo6606a().mo85478a());
            TextUtils.SimpleStringSplitter simpleStringSplitter = f97811a;
            if (bxvd8.f164950c) {
                bxvd8.mo74035c();
                bxvd8.f164950c = false;
            }
            bky bky11 = (bky) bxvd8.f164949b;
            bky bky12 = bky.f5051v;
            if (!bky11.f5066n.mo73666a()) {
                bky11.f5066n = GeneratedMessageLite.m124021a(bky11.f5066n);
            }
            bxsy.m123078a(simpleStringSplitter, bky11.f5066n);
            if (chpw.f188958a.mo6606a().mo85504g()) {
                if (!bxvd8.f164950c) {
                    z = false;
                } else {
                    bxvd8.mo74035c();
                    z = false;
                    bxvd8.f164950c = false;
                }
                bky bky13 = (bky) bxvd8.f164949b;
                bky13.f5053a |= 8;
                bky13.f5069q = z;
            }
            if (chpp.f188949a.mo6606a().mo85494c()) {
                f97811a.setString(chpp.f188949a.mo6606a().mo85492a());
                TextUtils.SimpleStringSplitter simpleStringSplitter2 = f97811a;
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                bky bky14 = (bky) bxvd8.f164949b;
                if (!bky14.f5072t.mo73666a()) {
                    bky14.f5072t = GeneratedMessageLite.m124021a(bky14.f5072t);
                }
                bxsy.m123078a(simpleStringSplitter2, bky14.f5072t);
                bxwc bxwc9 = chpp.f188949a.mo6606a().mo85493b().f5037a;
                if (bxvd8.f164950c) {
                    bxvd8.mo74035c();
                    bxvd8.f164950c = false;
                }
                bky bky15 = (bky) bxvd8.f164949b;
                if (!bky15.f5073u.mo73666a()) {
                    bky15.f5073u = GeneratedMessageLite.m124021a(bky15.f5073u);
                }
                bxsy.m123078a(bxwc9, bky15.f5073u);
            }
            h.mo67695b((Long) entry.getKey(), (bky) bxvd8.mo74062i());
        }
        bnhe b = h.mo67618b();
        if (chny.m149217b()) {
            SharedPreferences.Editor edit = aykk.m84183d(context).edit();
            Set<Long> set6 = aykd.f97827f;
            bnia j8 = bnic.m109500j();
            for (Long l4 : set6) {
                j8.mo67629b(String.valueOf(l4));
            }
            edit.putStringSet("KEEP_UID_MAP_CONFIGS", j8.mo67751a()).apply();
        }
        if (b.isEmpty() && z2) {
            b = bnhe.m109408a(Long.valueOf(chpw.m149307f()), bky.f5051v);
        }
        if (b.isEmpty()) {
            return false;
        }
        int i30 = Build.VERSION.SDK_INT;
        ConfigActivationOperation.m94457a(statsManager);
        if (!m84140a(context2, statsManager, b)) {
            return false;
        }
        int i31 = Build.VERSION.SDK_INT;
        m84136a(context2, statsManager, b.keySet());
        m84137a(context, b.keySet(), ConfigActivationOperation.m94455a(statsManager, context2), true, null, null);
        return true;
    }

    /* renamed from: a */
    private static boolean m84140a(Context context, StatsManager statsManager, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    statsManager.addConfig(((Long) entry.getKey()).longValue(), ((bky) entry.getValue()).serializeToBytes());
                    int i = Build.VERSION.SDK_INT;
                    aykk.m84167a(statsManager, ((Long) entry.getKey()).longValue(), context);
                } catch (IllegalArgumentException e) {
                    return false;
                } catch (StatsManager.StatsUnavailableException e2) {
                    return false;
                }
            }
        }
        return true;
    }
}
