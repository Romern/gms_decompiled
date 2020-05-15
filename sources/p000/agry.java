package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import com.google.android.gms.mobiledataplan.consent.SafeHtml;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: agry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agry {

    /* renamed from: f */
    public static final srn f66337f = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: g */
    private static final bnic f66338g = bnpf.m110045a(bszx.GCORE_MSG_TYPE_PLAN_STATUS_UPDATED, bszx.GCORE_MSG_TYPE_UPSELL_OFFER, bszx.GCORE_MSG_TYPE_ACCOUNT_ALERT);

    /* renamed from: a */
    public final ClientContext f66339a;

    /* renamed from: b */
    public final String f66340b;

    /* renamed from: c */
    public final String f66341c;

    /* renamed from: d */
    public final int f66342d;

    /* renamed from: e */
    public final Context f66343e;

    public agry(Context context, String str, String str2, int i) {
        this.f66343e = context;
        int i2 = context.getApplicationInfo().uid;
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = context.getApplicationInfo().uid;
        clientContext.f30216f = "com.google.android.gms";
        clientContext.f30215e = "com.google.android.gms";
        this.f66339a = clientContext;
        this.f66340b = str;
        this.f66341c = str2;
        this.f66342d = i;
        str2.substring(str2.length() - 2);
    }

    /* renamed from: a */
    private static SafeHtml m55023a(boab boab) {
        agqp agqp = new agqp();
        String str = boac.m110961a(boab).f132440a;
        SafeHtml safeHtml = agqp.f66283a;
        safeHtml.f80282a = str;
        return safeHtml;
    }

    /* renamed from: a */
    private final void m55024a(btaa btaa) {
        String str;
        if (cfmv.f184430a.mo6606a().mo81536E()) {
            bszu bszu = (bszu) bszw.f147894b.mo74144da();
            if (cfmn.f184389a.mo6606a().mo81501g()) {
                if (btaa.f164950c) {
                    btaa.mo74035c();
                    btaa.f164950c = false;
                }
                bszw bszw = (bszw) bszu.mo74062i();
                btab btab = btab.f147917l;
                bszw.getClass();
                ((btab) btaa.f164949b).f147921c = bszw;
                return;
            }
            int a = agyu.m55308a(this.f66343e);
            Locale locale = Locale.US;
            int i = Build.VERSION.SDK_INT;
            bszu.mo70729a("reg_extra_os", String.format(locale, "api=%d rel=%s sec=%s", Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.RELEASE, Build.VERSION.SECURITY_PATCH));
            bszu.mo70729a("reg_extra_gcore", String.format(Locale.US, "verName=%s verCode=%d buildNum=%d buildType=%s arch=%d screen=%d", stu.m36315a(), Integer.valueOf(stu.m36316b()), Long.valueOf(stu.m36321g()), stu.m36323i(), Integer.valueOf(stu.m36324j()), Integer.valueOf(stu.m36325k())));
            if (a != -1) {
                str = String.format(Locale.US, "ver=%d apkVerName=%s apkVerCode=%d", Integer.valueOf(a), agyu.m55309b(this.f66343e), Integer.valueOf(agyu.m55310c(this.f66343e)));
            } else {
                str = "INVALID_MODULE_INFO";
            }
            bszu.mo70729a("reg_extra_mdp", str);
            bszu.mo70729a("reg_extra_locale", agyt.m55306c(this.f66343e));
            bszu.mo70729a("reg_extra_timezone", TimeZone.getDefault().getID());
            try {
                bszu.mo70729a("reg_extra_lang", Locale.getDefault().getISO3Language());
            } catch (NullPointerException | MissingResourceException e) {
                bszu.mo70729a("reg_extra_lang", stm.m36299a(Locale.getDefault().getLanguage()));
            }
            String f = agyq.m55285f(this.f66343e);
            if (f == null) {
                f = "";
            }
            bszu.mo70729a("reg_extra_mccmnc", f);
            bszu.mo70729a("reg_extra_carrier", String.format(Locale.US, "gid1=%s spn=%s wifi=%b cellular=%b roaming=%b", agyq.m55292m(this.f66343e), agyq.m55294o(this.f66343e), Boolean.valueOf(agyq.m55281c(this.f66343e)), Boolean.valueOf(agyq.m55280b(this.f66343e)), Boolean.valueOf(agyq.m55283d(this.f66343e))));
            if (btaa.f164950c) {
                btaa.mo74035c();
                btaa.f164950c = false;
            }
            bszw bszw2 = (bszw) bszu.mo74062i();
            btab btab2 = btab.f147917l;
            bszw2.getClass();
            ((btab) btaa.f164949b).f147921c = bszw2;
        }
    }

    /* renamed from: a */
    private static SafeHtml[] m55025a(List list) {
        SafeHtml[] safeHtmlArr = new SafeHtml[list.size()];
        for (int i = 0; i < list.size(); i++) {
            safeHtmlArr[i] = m55023a((boab) list.get(i));
        }
        return safeHtmlArr;
    }

    /* renamed from: a */
    public final btac mo36040a(String str, Long l, String str2, String str3, Integer num, Long l2) {
        Throwable th;
        bxzx bxzx;
        btas d;
        bxzx j;
        btas d2;
        Long l3 = l;
        String str4 = str2;
        f66337f.mo26019b(agyt.m55307c()).mo68429a("%s: gcoreRegister: <%s, %s, %s> ignoreDefault:%s allSims:%s useSupportedMccMnc:%s", "Rpc", l, str2, str3, Boolean.valueOf(cflr.m139936m()), Boolean.valueOf(cfmn.m140202d()), Boolean.valueOf(cfmn.m140204f()));
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Invalid parameters; empty GCM token.");
        } else if ((!cflr.m139936m() || !cfmn.m140202d()) && TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Invalid parameters; empty CPID.");
        } else {
            btaa btaa = (btaa) btab.f147917l.mo74144da();
            if (btaa.f164950c) {
                btaa.mo74035c();
                btaa.f164950c = false;
            }
            str.getClass();
            ((btab) btaa.f164949b).f147919a = str;
            long j2 = 0;
            if (l3 != null && l.longValue() > 0) {
                long longValue = Long.valueOf(l.longValue()).longValue();
                if (btaa.f164950c) {
                    btaa.mo74035c();
                    btaa.f164950c = false;
                }
                ((btab) btaa.f164949b).f147924f = longValue;
            } else if (cfmn.m140204f()) {
                String h = agyq.m55287h(this.f66343e);
                f66337f.mo26019b(agyt.m55307c()).mo68424a("%s: gcoreRegister: supportedMccMnc: %s", "Rpc", h);
                if (!TextUtils.isEmpty(h)) {
                    String substring = h.substring(0, 3);
                    if (btaa.f164950c) {
                        btaa.mo74035c();
                        btaa.f164950c = false;
                    }
                    substring.getClass();
                    ((btab) btaa.f164949b).f147922d = substring;
                    String substring2 = h.substring(3);
                    if (btaa.f164950c) {
                        btaa.mo74035c();
                        btaa.f164950c = false;
                    }
                    substring2.getClass();
                    ((btab) btaa.f164949b).f147923e = substring2;
                } else if (!cfmn.f184389a.mo6606a().mo81496b()) {
                    throw new IllegalArgumentException("Invalid parameters; empty carrier_id/mcc/mnc.");
                }
            } else {
                throw new IllegalArgumentException("Invalid parameters; empty carrier_id.");
            }
            if (cfmq.m140247r()) {
                int intValue = num.intValue();
                if (btaa.f164950c) {
                    btaa.mo74035c();
                    btaa.f164950c = false;
                }
                ((btab) btaa.f164949b).f147928j = intValue;
                long longValue2 = l2.longValue();
                if (btaa.f164950c) {
                    btaa.mo74035c();
                    btaa.f164950c = false;
                }
                ((btab) btaa.f164949b).f147927i = longValue2;
            }
            if (cfmn.f184389a.mo6606a().mo81504j()) {
                bxvd da = bszn.f147859i.mo74144da();
                int i = Build.VERSION.SDK_INT;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bszn) da.f164949b).f147861a = i;
                String str5 = Build.VERSION.RELEASE;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str5.getClass();
                ((bszn) da.f164949b).f147862b = str5;
                int i2 = Build.VERSION.SDK_INT;
                String str6 = Build.VERSION.SECURITY_PATCH;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str6.getClass();
                ((bszn) da.f164949b).f147863c = str6;
                String a = agyt.m55301a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a.getClass();
                ((bszn) da.f164949b).f147864d = a;
                String c = agyt.m55306c(this.f66343e);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                c.getClass();
                ((bszn) da.f164949b).f147865e = c;
                String id = TimeZone.getDefault().getID();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                id.getClass();
                ((bszn) da.f164949b).f147866f = id;
                boolean b = agyt.m55305b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bszn) da.f164949b).f147867g = b;
                if (cfmn.f184389a.mo6606a().mo81503i()) {
                    for (String str7 : agyq.m55286g(this.f66343e)) {
                        bxvd da2 = btbh.f148131c.mo74144da();
                        String substring3 = str7.substring(0, 3);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        substring3.getClass();
                        ((btbh) da2.f164949b).f148133a = substring3;
                        String substring4 = str7.substring(3);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        substring4.getClass();
                        ((btbh) da2.f164949b).f148134b = substring4;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bszn bszn = (bszn) da.f164949b;
                        btbh btbh = (btbh) da2.mo74062i();
                        btbh.getClass();
                        if (!bszn.f147868h.mo73666a()) {
                            bszn.f147868h = bxvk.m124021a(bszn.f147868h);
                        }
                        bszn.f147868h.add(btbh);
                    }
                }
                if (btaa.f164950c) {
                    btaa.mo74035c();
                    btaa.f164950c = false;
                }
                bszn bszn2 = (bszn) da.mo74062i();
                bszn2.getClass();
                ((btab) btaa.f164949b).f147929k = bszn2;
            }
            if (cfmn.m140203e() || cflx.m140018e()) {
                boolean e = cfmn.m140203e();
                boolean e2 = cflx.m140018e();
                if (e || e2) {
                    bxvd da3 = bszm.f147844n.mo74144da();
                    if (e) {
                        String a2 = stu.m36315a();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        a2.getClass();
                        ((bszm) da3.f164949b).f147846a = a2;
                        int b2 = stu.m36316b();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147847b = b2;
                        long g = stu.m36321g();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147848c = g;
                        String i3 = stu.m36323i();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        i3.getClass();
                        ((bszm) da3.f164949b).f147849d = i3;
                        int j3 = stu.m36324j();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147850e = j3;
                        int k = stu.m36325k();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147851f = k;
                        int a3 = agyu.m55308a(this.f66343e);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147854i = a3;
                        String b3 = agyu.m55309b(this.f66343e);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        b3.getClass();
                        ((bszm) da3.f164949b).f147855j = b3;
                        int c2 = agyu.m55310c(this.f66343e);
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147856k = c2;
                        if (!TextUtils.isEmpty(cfmv.m140327z())) {
                            String z = cfmv.m140327z();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            z.getClass();
                            ((bszm) da3.f164949b).f147857l = z;
                        }
                    }
                    if (e2) {
                        agrq agrq = new agrq();
                        boolean b4 = agrq.mo36031b();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        ((bszm) da3.f164949b).f147852g = b4;
                        bnrd a4 = agrq.f66321a.entrySet().iterator();
                        while (a4.hasNext()) {
                            Map.Entry entry = (Map.Entry) a4.next();
                            if (agrq.m55005a((bszx) entry.getKey()) || (!cfnf.m140504e() && f66338g.contains(entry.getKey()))) {
                                int a5 = ((bszx) entry.getKey()).mo3214a();
                                boolean a6 = agrq.mo36028a((String) entry.getValue());
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bszm bszm = (bszm) da3.f164949b;
                                bxww bxww = bszm.f147853h;
                                if (!bxww.f165014a) {
                                    bszm.f147853h = bxww.mo74203a();
                                }
                                bszm.f147853h.put(Integer.valueOf(a5), Boolean.valueOf(a6));
                            }
                        }
                    }
                    if (cfmj.f184370a.mo6606a().mo81487j()) {
                        bxzx c3 = agpk.m54726a().mo35843c();
                        if (c3 == null) {
                            ((bnsl) f66337f.mo68388c()).mo68405a("Device consent status does not exist!");
                        } else {
                            bygb a7 = bygb.m124774a(c3.f165204f);
                            if (a7 == null) {
                                a7 = bygb.UNRECOGNIZED;
                            }
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            ((bszm) da3.f164949b).f147858m = a7.mo3214a();
                        }
                    }
                    if (btaa.f164950c) {
                        btaa.mo74035c();
                        btaa.f164950c = false;
                    }
                    bszm bszm2 = (bszm) da3.mo74062i();
                    bszm2.getClass();
                    ((btab) btaa.f164949b).f147926h = bszm2;
                }
            }
            if (cfmn.m140202d()) {
                for (agzc agzc : agyq.m55295p(this.f66343e)) {
                    f66337f.mo26019b(agyt.m55307c()).mo68424a("%s: gcoreRegister: Supported SIM: %s", "Rpc", agzc);
                    agpk a8 = agpk.m54726a();
                    String a9 = agzc.mo36193a();
                    boolean d3 = agzc.mo36196d();
                    Long b5 = a8.mo35839b(a9);
                    String e3 = a8.mo35845e(a9);
                    if (b5 == null || b5.longValue() <= j2) {
                        if (cflr.m139936m()) {
                            b5 = agth.f66446a;
                        } else {
                            b5 = !d3 ? agth.f66446a : l3;
                        }
                    }
                    if (TextUtils.isEmpty(e3)) {
                        e3 = cflr.m139936m() ? "dummy_cpid_before_retrieval" : !d3 ? "dummy_cpid_before_retrieval" : str4;
                    } else if (!a8.mo35849i(a9)) {
                        e3 = "dummy_cpid_before_consent";
                    }
                    btbd btbd = (btbd) btbe.f148105j.mo74144da();
                    long longValue3 = b5.longValue();
                    if (btbd.f164950c) {
                        btbd.mo74035c();
                        btbd.f164950c = false;
                    }
                    btbe btbe = (btbe) btbd.f164949b;
                    btbe.f148107a = longValue3;
                    e3.getClass();
                    btbe.f148110d = e3;
                    boolean d4 = agzc.mo36196d();
                    if (btbd.f164950c) {
                        btbd.mo74035c();
                        btbd.f164950c = false;
                    }
                    ((btbe) btbd.f164949b).f148115i = d4;
                    if (cfmn.m140201c()) {
                        String b6 = agzc.mo36194b();
                        String substring5 = b6.substring(0, 3);
                        if (btbd.f164950c) {
                            btbd.mo74035c();
                            btbd.f164950c = false;
                        }
                        substring5.getClass();
                        ((btbe) btbd.f164949b).f148108b = substring5;
                        String substring6 = b6.substring(3);
                        if (btbd.f164950c) {
                            btbd.mo74035c();
                            btbd.f164950c = false;
                        }
                        substring6.getClass();
                        ((btbe) btbd.f164949b).f148109c = substring6;
                    } else if (cfmd.f184339a.mo6606a().mo81460l()) {
                        agpw a10 = a8.f66242a.mo35854a(a9);
                        Pair pair = null;
                        bxzz h2 = a10 != null ? a10.mo35917h() : null;
                        if (h2 != null && !h2.f165213a.isEmpty() && !h2.f165214b.isEmpty()) {
                            pair = Pair.create(h2.f165213a, h2.f165214b);
                        }
                        if (pair != null) {
                            String str8 = (String) pair.first;
                            if (btbd.f164950c) {
                                btbd.mo74035c();
                                btbd.f164950c = false;
                            }
                            str8.getClass();
                            ((btbe) btbd.f164949b).f148108b = str8;
                            String str9 = (String) pair.second;
                            if (btbd.f164950c) {
                                btbd.mo74035c();
                                btbd.f164950c = false;
                            }
                            str9.getClass();
                            ((btbe) btbd.f164949b).f148109c = str9;
                        }
                    }
                    if (cfmn.f184389a.mo6606a().mo81500f()) {
                        long c4 = agzc.mo36195c();
                        if (btbd.f164950c) {
                            btbd.mo74035c();
                            btbd.f164950c = false;
                        }
                        ((btbe) btbd.f164949b).f148114h = c4;
                    }
                    if (cfnf.m140509j() && (d2 = a8.mo35844d(a9)) != null) {
                        if (btbd.f164950c) {
                            btbd.mo74035c();
                            btbd.f164950c = false;
                        }
                        d2.getClass();
                        ((btbe) btbd.f164949b).f148112f = d2;
                    }
                    if (cfmn.m140200b() && (j = a8.mo35850j(a9)) != null) {
                        bygb a11 = bygb.m124774a(j.f165204f);
                        if (a11 == null) {
                            a11 = bygb.UNRECOGNIZED;
                        }
                        if (btbd.f164950c) {
                            btbd.mo74035c();
                            btbd.f164950c = false;
                        }
                        ((btbe) btbd.f164949b).f148113g = a11.mo3214a();
                    }
                    btaa.mo70731a(btbd);
                    j2 = 0;
                }
            } else {
                btbd btbd2 = (btbd) btbe.f148105j.mo74144da();
                if (btbd2.f164950c) {
                    btbd2.mo74035c();
                    btbd2.f164950c = false;
                }
                str2.getClass();
                ((btbe) btbd2.f164949b).f148110d = str4;
                btbd2.mo70736a(bszx.GCORE_MSG_TYPE_PLAN_STATUS_UPDATED);
                btbd2.mo70736a(bszx.GCORE_MSG_TYPE_UPSELL_OFFER);
                if (l3 != null && l.longValue() > 0) {
                    long longValue4 = Long.valueOf(l.longValue()).longValue();
                    if (btbd2.f164950c) {
                        btbd2.mo74035c();
                        btbd2.f164950c = false;
                    }
                    ((btbe) btbd2.f164949b).f148107a = longValue4;
                } else if (cfmn.m140204f()) {
                    String h3 = agyq.m55287h(this.f66343e);
                    if (!TextUtils.isEmpty(h3)) {
                        String substring7 = h3.substring(0, 3);
                        if (btbd2.f164950c) {
                            btbd2.mo74035c();
                            btbd2.f164950c = false;
                        }
                        substring7.getClass();
                        ((btbe) btbd2.f164949b).f148108b = substring7;
                        String substring8 = h3.substring(3);
                        if (btbd2.f164950c) {
                            btbd2.mo74035c();
                            btbd2.f164950c = false;
                        }
                        substring8.getClass();
                        ((btbe) btbd2.f164949b).f148109c = substring8;
                    }
                }
                String i4 = agyq.m55288i(this.f66343e);
                if (cfnf.m140509j() && (d = agpk.m54726a().mo35844d(i4)) != null) {
                    btbd2.mo70736a(bszx.GCORE_MSG_TYPE_ACCOUNT_ALERT);
                    if (btbd2.f164950c) {
                        btbd2.mo74035c();
                        btbd2.f164950c = false;
                    }
                    d.getClass();
                    ((btbe) btbd2.f164949b).f148112f = d;
                }
                if (cfmn.m140200b()) {
                    if (cfmg.m140137c()) {
                        bxzx = agpk.m54726a().mo35837b(l3, str3);
                    } else {
                        bxzx = agpk.m54726a().mo35850j(i4);
                    }
                    if (bxzx != null) {
                        bygb a12 = bygb.m124774a(bxzx.f165204f);
                        if (a12 == null) {
                            a12 = bygb.UNRECOGNIZED;
                        }
                        if (btbd2.f164950c) {
                            btbd2.mo74035c();
                            btbd2.f164950c = false;
                        }
                        ((btbe) btbd2.f164949b).f148113g = a12.mo3214a();
                    }
                }
                btaa.mo70731a(btbd2);
            }
            if (((btab) btaa.f164949b).f147920b.size() > 0) {
                m55024a(btaa);
                if (agqg.m54836C().booleanValue()) {
                    bxvd da4 = bszz.f147914b.mo74144da();
                    for (bdyx bdyx : Collections.unmodifiableList(agqg.f66278a)) {
                        String b7 = bdyx.mo58453b();
                        String valueOf = String.valueOf(bdyx.mo58455c());
                        b7.getClass();
                        valueOf.getClass();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        bszz bszz = (bszz) da4.f164949b;
                        bxww bxww2 = bszz.f147916a;
                        if (!bxww2.f165014a) {
                            bszz.f147916a = bxww2.mo74203a();
                        }
                        bszz.f147916a.put(b7, valueOf);
                    }
                    if (btaa.f164950c) {
                        btaa.mo74035c();
                        btaa.f164950c = false;
                    }
                    bszz bszz2 = (bszz) da4.mo74062i();
                    bszz2.getClass();
                    ((btab) btaa.f164949b).f147925g = bszz2;
                }
                f66337f.mo26019b(agyt.m55307c()).mo68424a("%s: gcoreRegister: rpcReq:{%s}\n", "Rpc", btaa.mo74062i());
                agrx agrx = new agrx(this);
                try {
                    agqf a13 = agrx.mo36038a();
                    ClientContext clientContext = this.f66339a;
                    btab btab = (btab) btaa.mo74062i();
                    if (agqf.f66273f == null) {
                        agqf.f66273f = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/GcoreRegister", ciie.m150370a(btab.f147917l), ciie.m150370a(btac.f147931d));
                    }
                    btac btac = (btac) a13.f66277a.mo25553a(agqf.f66273f, clientContext, btab, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
                    agrx.close();
                    f66337f.mo26019b(agyt.m55307c()).mo68424a("%s: gcoreRegister: rpcRsp:{%s}\n", "Rpc", btac);
                    f66337f.mo26019b(agyt.m55307c()).mo68428a("%s: gcoreRegister: Sync v:%s q:<%s, %s> <%s>, # of RegistrationRecords: %s", "Rpc", bryx.m114908a(Integer.valueOf(agyu.m55308a(this.f66343e))), bryx.m114908a(Long.valueOf(((btab) btaa.f164949b).f147924f)), new bryx(2, str4), new bryx(2, ((btab) btaa.f164949b).f147919a.substring(Math.max(((btab) btaa.f164949b).f147919a.length() - 16, 0))), bryx.m114908a(Integer.valueOf(((btab) btaa.f164949b).f147920b.size())));
                    if (cfmn.f184389a.mo6606a().mo81495a()) {
                        for (btbe btbe2 : Collections.unmodifiableList(((btab) btaa.f164949b).f147920b)) {
                            f66337f.mo26019b(agyt.m55307c()).mo68427a("%s: gcoreRegister: RegistrationRecord: %s %s CPID: %s data: %s", "Rpc", new bryx(2, btbe2.f148108b), new bryx(2, btbe2.f148109c), new bryx(2, btbe2.f148110d), new bryx(2, Boolean.valueOf(btbe2.f148115i)));
                        }
                    }
                    return btac;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                throw new IllegalArgumentException("Invalid parameters; no SIMs are supported.");
            }
        }
        throw th;
    }

    /* renamed from: a */
    public final btap mo36041a(Integer num, Long l, String str) {
        bxvd da = btao.f148017i.mo74144da();
        if (cfmq.m140247r()) {
            if (num == null) {
                num = 0;
            }
            if (l == null) {
                l = 0L;
            }
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btao) da.f164949b).f148026h = intValue;
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btao) da.f164949b).f148025g = longValue;
        }
        agqg.m54847b();
        if (agqg.m54847b().longValue() > 0) {
            long longValue2 = agqg.m54847b().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btao) da.f164949b).f148023e = longValue2;
        }
        String f = agyq.m55285f(this.f66343e);
        if (agyq.m55275a() && f != null) {
            String substring = f.substring(0, 3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            substring.getClass();
            ((btao) da.f164949b).f148019a = substring;
            String substring2 = f.substring(3);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            substring2.getClass();
            ((btao) da.f164949b).f148020b = substring2;
            String m = agyq.m55292m(this.f66343e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            m.getClass();
            ((btao) da.f164949b).f148021c = m;
            String o = agyq.m55294o(this.f66343e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            o.getClass();
            ((btao) da.f164949b).f148022d = o;
            String c = agyt.m55306c(this.f66343e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            c.getClass();
            ((btao) da.f164949b).f148024f = c;
        }
        f66337f.mo26019b(agyt.m55307c()).mo68426a("%s: listEndpoints: mcc: %s, mnc: %s, carrier_id %d", "Rpc", ((btao) da.mo74062i()).f148019a, ((btao) da.mo74062i()).f148020b, Long.valueOf(((btao) da.mo74062i()).f148023e));
        f66337f.mo26019b(agyt.m55307c()).mo68424a("%s: listCpidEndpoints: req:{%s}", "Rpc", ((btao) da.mo74062i()).toString());
        if (cfmq.m140244o()) {
            agrl a = agrl.m54942a();
            btao btao = (btao) da.mo74062i();
            boot a2 = a.mo35978a(26, "GTAF_Server", str);
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((bxvk) a2);
            bxvd da2 = boph.f134120d.mo74144da();
            bxvd da3 = bope.f134108e.mo74144da();
            String str2 = btao.f148019a;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bope bope = (bope) da3.f164949b;
            str2.getClass();
            bope.f134110a = str2;
            String str3 = btao.f148020b;
            str3.getClass();
            bope.f134111b = str3;
            String str4 = btao.f148021c;
            str4.getClass();
            bope.f134112c = str4;
            String str5 = btao.f148022d;
            str5.getClass();
            bope.f134113d = str5;
            bope bope2 = (bope) da3.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bope2.getClass();
            ((boph) da2.f164949b).f134122a = bope2;
            boph boph = (boph) da2.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = (boot) bxvd.f164949b;
            boot boot2 = boot.f133997z;
            boph.getClass();
            boot.f134022y = boph;
            boot.f134015r = btao.f148025g;
            a.mo35995a((boot) bxvd.mo74062i(), bygd.LIST_CPID_ENDPOINTS_REQUEST, Integer.valueOf(btao.f148026h));
        }
        agrx agrx = new agrx(this);
        try {
            agqf a3 = agrx.mo36038a();
            ClientContext clientContext = this.f66339a;
            btao btao2 = (btao) da.mo74062i();
            if (agqf.f66272e == null) {
                agqf.f66272e = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/ListCpidEndpoints", ciie.m150370a(btao.f148017i), ciie.m150370a(btap.f148027h));
            }
            btap btap = (btap) a3.f66277a.mo25553a(agqf.f66272e, clientContext, btao2, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
            f66337f.mo26019b(agyt.m55307c()).mo68424a("%s: listCpidEndpoints: rsp:{%s}\n", "Rpc", btap.toString());
            f66337f.mo26019b(agyt.m55307c()).mo68425a("%s: listCpidEndpoints: carrier_name: %s, carrier_id: %d", "Rpc", btap.f148031c, Long.valueOf(btap.f148030b));
            agrx.close();
            return btap;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0199, code lost:
        if (p000.cflr.m139930g() != false) goto L_0x019b;
     */
    /* renamed from: a */
    public final GetConsentInformationResponse mo36042a(Long l, int i, Integer num, Long l2) {
        int i2;
        if (cfmg.m140139e() > 0) {
            bqhi.m112839a(cfmg.m140139e(), TimeUnit.MILLISECONDS);
        }
        bxvd da = btad.f147938g.mo74144da();
        bxvd da2 = bygc.f166107e.mo74144da();
        long longValue = l.longValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bygc) da2.f164949b).f166109a = longValue;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygc bygc = (bygc) da2.mo74062i();
        bygc.getClass();
        ((btad) da.f164949b).f147940a = bygc;
        int a = byga.m124773a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btad) da.f164949b).f147941b = a;
        String c = agyt.m55306c(this.f66343e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((btad) da.f164949b).f147942c = c;
        if (cfmq.m140247r()) {
            if (num == null) {
                num = 0;
            }
            if (l2 == null) {
                l2 = 0L;
            }
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btad) da.f164949b).f147944e = intValue;
            long longValue2 = l2.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btad) da.f164949b).f147943d = longValue2;
        }
        if (cfmd.m140084d()) {
            String a2 = agqz.m54893a().mo35966a(this.f66343e);
            if (!TextUtils.isEmpty(a2)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a2.getClass();
                ((btad) da.f164949b).f147945f = a2;
            }
        }
        btad btad = (btad) da.mo74062i();
        agrx agrx = new agrx(this);
        try {
            agqf a3 = agrx.mo36038a();
            ClientContext clientContext = this.f66339a;
            if (agqf.f66275h == null) {
                agqf.f66275h = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/GetConsentInformation", ciie.m150370a(btad.f147938g), ciie.m150370a(btae.f147946e));
            }
            btae btae = (btae) a3.f66277a.mo25553a(agqf.f66275h, clientContext, btad, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
            agqh agqh = new agqh();
            byfz byfz = btae.f147948a;
            if (byfz == null) {
                byfz = byfz.f166084i;
            }
            agqh.f66279a.f80265d = byfz.f166089d;
            byfz byfz2 = btae.f147948a;
            if (byfz2 == null) {
                byfz2 = byfz.f166084i;
            }
            agqh.f66279a.f80266e = byfz2.f166090e;
            byfz byfz3 = btae.f147948a;
            if (byfz3 == null) {
                byfz3 = byfz.f166084i;
            }
            agqh.f66279a.f80267f = byfz3.f166091f;
            byfz byfz4 = btae.f147948a;
            if (byfz4 == null) {
                byfz4 = byfz.f166084i;
            }
            boab boab = byfz4.f166086a;
            if (boab == null) {
                boab = boab.f132441b;
            }
            agqh.f66279a.f80262a = m55023a(boab);
            byfz byfz5 = btae.f147948a;
            if (byfz5 == null) {
                byfz5 = byfz.f166084i;
            }
            agqh.f66279a.f80263b = m55025a(byfz5.f166087b);
            byfz byfz6 = btae.f147948a;
            if (byfz6 == null) {
                byfz6 = byfz.f166084i;
            }
            agqh.f66279a.f80264c = m55025a(byfz6.f166088c);
            byfz byfz7 = btae.f147948a;
            if (byfz7 == null) {
                byfz7 = byfz.f166084i;
            }
            agqh.f66279a.f80268g = byfz7.f166092g;
            if (cfmd.m140084d()) {
            }
            byfz byfz8 = btae.f147948a;
            if (byfz8 == null) {
                byfz8 = byfz.f166084i;
            }
            agqh.f66279a.f80269h = byfz8.f166093h;
            agqn agqn = new agqn();
            agqj agqj = new agqj();
            if (!btae.f147949b) {
                i2 = 3;
            } else {
                i2 = 4;
            }
            agqj.mo35935a(i2);
            agqn.mo35942a(agqj.f66280a);
            agqn.mo35941a(agqh.f66279a);
            if (cfmq.m140247r()) {
                agqn.mo35945b(Integer.valueOf(btae.f147951d));
                agqn.mo35946b(Long.valueOf(btae.f147950c));
            }
            GetConsentInformationResponse getConsentInformationResponse = agqn.f66282a;
            agrx.close();
            return getConsentInformationResponse;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo36043a(String str, Long l, int i, bygb bygb, byge byge, Integer num, bxyk bxyk, Integer num2, Long l2) {
        bxvd da = btbf.f148118j.mo74144da();
        bxvd da2 = bygc.f166107e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str.getClass();
        ((bygc) da2.f164949b).f166110b = str;
        long longValue = l.longValue();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bygc) da2.f164949b).f166109a = longValue;
        String n = agyq.m55293n(this.f66343e);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        n.getClass();
        ((bygc) da2.f164949b).f166111c = n;
        String l3 = Long.toString(ryv.m34682b(this.f66343e, "android_id"));
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        l3.getClass();
        ((bygc) da2.f164949b).f166112d = l3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bygc bygc = (bygc) da2.mo74062i();
        bygc.getClass();
        ((btbf) da.f164949b).f148120a = bygc;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byge.getClass();
        ((btbf) da.f164949b).f148123d = byge;
        int a = byga.m124773a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btbf) da.f164949b).f148121b = a;
        int a2 = bygb.mo3214a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btbf) da.f164949b).f148122c = a2;
        String c = agyt.m55306c(this.f66343e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((btbf) da.f164949b).f148124e = c;
        int intValue = num.intValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btbf btbf = (btbf) da.f164949b;
        btbf.f148125f = intValue;
        bxyk.getClass();
        btbf.f148126g = bxyk;
        if (cfmq.m140247r()) {
            int intValue2 = num2.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btbf) da.f164949b).f148128i = intValue2;
            long longValue2 = l2.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btbf) da.f164949b).f148127h = longValue2;
        }
        agrx agrx = new agrx(this);
        try {
            da.mo74062i();
            agqf a3 = agrx.mo36038a();
            ClientContext clientContext = this.f66339a;
            btbf btbf2 = (btbf) da.mo74062i();
            if (agqf.f66276i == null) {
                agqf.f66276i = chtv.m149566a(chtu.UNARY, "google.internal.mobiledataplan.v1.MobileDataPlanService/SetConsentStatus", ciie.m150370a(btbf.f148118j), ciie.m150370a(btbg.f148129a));
            }
            btbg btbg = (btbg) a3.f66277a.mo25553a(agqf.f66276i, clientContext, btbf2, (long) agqf.f66269b, TimeUnit.MILLISECONDS);
            agrx.close();
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
