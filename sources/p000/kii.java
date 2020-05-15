package p000;

import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.location.places.personalized.AliasedPlace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* renamed from: kii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kii {

    /* renamed from: a */
    public static final /* synthetic */ int f24209a = 0;

    /* renamed from: b */
    private static final srn f24210b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    static bnhe m17889a(bmxv bmxv) {
        if (!bmxv.mo66813a()) {
            return bnoj.f131912b;
        }
        aelj aelj = (aelj) bmxv.mo66814b();
        try {
            bnha h = bnhe.m109414h();
            Iterator it = aelj.iterator();
            while (it.hasNext()) {
                aelh aelh = (aelh) it.next();
                h.mo67695b(aelh.mo8007a(), (aelh) aelh.mo7556bF());
            }
            return h.mo67618b();
        } finally {
            aelj.mo12460c();
        }
    }

    /* renamed from: a */
    static bnhe m17890a(rkj rkj) {
        bnha h = bnhe.m109414h();
        HashSet hashSet = new HashSet();
        for (AliasedPlace aliasedPlace : rkj.mo24811e()) {
            List list = (List) aliasedPlace.f79579b.stream().filter(kih.f24208a).distinct().collect(Collectors.toList());
            if (!list.isEmpty() && hashSet.add(aliasedPlace.f79578a)) {
                h.mo67695b(aliasedPlace.f79578a, (String) list.get(0));
            }
        }
        return h.mo67618b();
    }

    /* renamed from: a */
    static bnic m17891a(bnhe bnhe, bnhe bnhe2) {
        kdg kdg;
        bnia j = bnic.m109500j();
        bnrd a = bnhe.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            aelh aelh = (aelh) bnhe2.get(str);
            if (aelh != null) {
                String n = aelh.mo8021n();
                if (n == null) {
                    ((bnsl) f24210b.mo68388c()).mo68420a("Missing adr address for Place id: %s", str);
                } else {
                    bxvd da = kdg.f23871j.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    kdg kdg2 = (kdg) da.f164949b;
                    str2.getClass();
                    kdg2.f23873a |= 128;
                    kdg2.f23881i = str2;
                    Matcher matcher = Pattern.compile("<span class=\"([a-z\\-]+)\">(.*?)</span>").matcher(n);
                    boolean z = false;
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(group2)) {
                            String a2 = m17894a(group2);
                            if ("country-name".equals(group)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                kdg kdg3 = (kdg) da.f164949b;
                                a2.getClass();
                                kdg3.f23873a |= 2;
                                kdg3.f23875c = a2;
                                z = true;
                            } else if ("postal-code".equals(group)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                kdg kdg4 = (kdg) da.f164949b;
                                a2.getClass();
                                kdg4.f23873a |= 4;
                                kdg4.f23876d = a2;
                                z = true;
                            } else if ("region".equals(group)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                kdg kdg5 = (kdg) da.f164949b;
                                a2.getClass();
                                kdg5.f23873a |= 16;
                                kdg5.f23878f = a2;
                                z = true;
                            } else if ("locality".equals(group)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                kdg kdg6 = (kdg) da.f164949b;
                                a2.getClass();
                                kdg6.f23873a |= 32;
                                kdg6.f23879g = a2;
                                z = true;
                            } else if ("street-address".equals(group)) {
                                da.mo74043d(a2);
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        String a3 = m17894a(matcher.replaceAll("$2"));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        kdg kdg7 = (kdg) da.f164949b;
                        a3.getClass();
                        kdg7.f23873a = 1 | kdg7.f23873a;
                        kdg7.f23874b = a3;
                        kdg = (kdg) da.mo74062i();
                    } else {
                        kdg = null;
                    }
                    if (kdg == null) {
                        ((bnsl) f24210b.mo68388c()).mo68420a("Failed to parse adr address for Place id: %s", str);
                    } else {
                        j.mo67629b(kct.m17647a(kdg, kcs.m17644a("places", str2)));
                    }
                }
            }
        }
        return j.mo67751a();
    }

    /* renamed from: a */
    static bqgg m17892a(aeky aeky) {
        return lqv.m19545a(aeky.mo34287a());
    }

    /* renamed from: a */
    static bqgg m17893a(aeky aeky, bnhe bnhe) {
        if (bnhe.isEmpty()) {
            return bqga.m112775a(bmvz.f131120a);
        }
        return bqdx.m112673a(lqv.m19545a(aeky.mo34288a((String[]) bnhe.keySet().toArray(new String[0]))), new lqu(), bqfb.INSTANCE);
    }

    /* renamed from: a */
    private static String m17894a(String str) {
        return Html.fromHtml(str).toString();
    }
}
