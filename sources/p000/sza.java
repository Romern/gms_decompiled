package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.ClientContext;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: sza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sza {

    /* renamed from: c */
    public static final Logger f45464c = tea.m36798a("rpc_manager");

    /* renamed from: a */
    public final Context f45465a;

    /* renamed from: b */
    public final ClientContext f45466b;

    /* renamed from: d */
    public final tds f45467d = tds.m36774a(this.f45465a);

    /* renamed from: e */
    public final long f45468e = Math.max(10000L, cdfq.f180688a.mo6606a().mo77430e());

    /* renamed from: f */
    private sze f45469f;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public sza(Context context) {
        this.f45465a = context;
        ClientContext clientContext = new ClientContext();
        clientContext.f30216f = "com.google.android.gms";
        this.f45466b = clientContext;
    }

    /* renamed from: a */
    private static final long m36624a(cbrc cbrc) {
        bxyk bxyk = cbrc.f178106a;
        if (bxyk == null) {
            bxyk = bxyk.f165095c;
        }
        long a = tdo.m36763a(bxyk);
        bxyk bxyk2 = cbrc.f178107b;
        if (bxyk2 == null) {
            bxyk2 = bxyk.f165095c;
        }
        return (System.currentTimeMillis() + a) - tdo.m36763a(bxyk2);
    }

    /* renamed from: a */
    public static final String m36625a(List list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cbqe cbqe = (cbqe) it.next();
                if (cbqe.f178012a.equals(str)) {
                    return cbqe.f178013b;
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    private final void m36626a(cbrc cbrc, boolean z) {
        szq a = szq.m36667a(this.f45465a);
        long a2 = m36624a(cbrc);
        long g = a.mo26296g();
        if (g == -1 || !z || g > a2) {
            a.mo26289b(a2);
        }
    }

    /* renamed from: a */
    public static final boolean m36627a(chuv chuv) {
        if (chuv == null) {
            return false;
        }
        chus chus = chuv.f189233s;
        return chus == chus.DEADLINE_EXCEEDED || chus == chus.CANCELLED || chus == chus.ABORTED || chus == chus.UNAVAILABLE || chus == chus.RESOURCE_EXHAUSTED;
    }

    /* renamed from: a */
    private static final boolean m36628a(szq szq) {
        if (cdfb.m132905c() || !szq.mo26292c()) {
            return cdfb.m132905c() && szq.mo26301l();
        }
        return true;
    }

    /* renamed from: a */
    public final cbqj mo26251a(tdx tdx, bxyk bxyk, boolean z, boolean z2, String str) {
        byte[] bArr;
        ArrayList arrayList;
        int i;
        int i2;
        tdx tdx2 = tdx;
        bxyk bxyk2 = bxyk;
        bxvd da = cbqj.f178031e.mo74144da();
        List list = tdx2.f45713f;
        bxvd da2 = cbph.f177913p.mo74144da();
        if (!TextUtils.isEmpty(tdx2.f45712e)) {
            bxvd da3 = cbpq.f177946b.mo74144da();
            String str2 = tdx2.f45712e;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            str2.getClass();
            ((cbpq) da3.f164949b).f177948a = str2;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbpq cbpq = (cbpq) da3.mo74062i();
            cbpq.getClass();
            ((cbph) da2.f164949b).f177915a = cbpq;
        }
        String str3 = Build.MODEL;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str3.getClass();
        ((cbph) da2.f164949b).f177923i = str3;
        String str4 = Build.MANUFACTURER;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        str4.getClass();
        ((cbph) da2.f164949b).f177924j = str4;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str5 = (String) list.get(i3);
                bxvd da4 = cbpw.f177965b.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                str5.getClass();
                ((cbpw) da4.f164949b).f177967a = str5;
                arrayList2.add((cbpw) da4.mo74062i());
            }
        }
        if (!arrayList2.isEmpty()) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbph cbph = (cbph) da2.f164949b;
            if (!cbph.f177927m.mo73666a()) {
                cbph.f177927m = GeneratedMessageLite.m124021a(cbph.f177927m);
            }
            bxsy.m123078a(arrayList2, cbph.f177927m);
        }
        Map b = tec.m36805a(this.f45465a, tdx2).mo26420b(tdx2, this.f45465a);
        bxvd da5 = cbpo.f177938c.mo74144da();
        for (Map.Entry entry : b.entrySet()) {
            cbrh cbrh = (cbrh) entry.getValue();
            cbrd cbrd = cbrh.f178120e;
            if (cbrd == null) {
                cbrd = cbrd.f178108e;
            }
            String str6 = cbrd.f178110a;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            cbpo cbpo = (cbpo) da5.f164949b;
            str6.getClass();
            if (!cbpo.f177941b.mo73666a()) {
                cbpo.f177941b = GeneratedMessageLite.m124021a(cbpo.f177941b);
            }
            cbpo.f177941b.add(str6);
            cbrd cbrd2 = cbrh.f178119d;
            if (cbrd2 == null) {
                cbrd2 = cbrd.f178108e;
            }
            String str7 = cbrd2.f178110a;
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            cbpo cbpo2 = (cbpo) da5.f164949b;
            str7.getClass();
            if (!cbpo2.f177940a.mo73666a()) {
                cbpo2.f177940a = GeneratedMessageLite.m124021a(cbpo2.f177940a);
            }
            cbpo2.f177940a.add(str7);
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbpo cbpo3 = (cbpo) da5.mo74062i();
        cbpo3.getClass();
        ((cbph) da2.f164949b).f177919e = cbpo3;
        syz a = syz.m36620a(this.f45465a);
        szq a2 = szq.m36667a(this.f45465a);
        String string = a2.f45525b.getString("public_key", null);
        if (TextUtils.isEmpty(string)) {
            KeyPair a3 = a.mo26249a(tdx2, a2);
            a2.mo26291b(false);
            bArr = a3.getPublic().getEncoded();
        } else {
            bArr = Base64.decode(string, 0);
        }
        ByteString a4 = ByteString.m123261a(bArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        a4.getClass();
        ((cbph) da2.f164949b).f177917c = a4;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        int i4 = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
        sb.append(language);
        sb.append("_");
        sb.append(country);
        String sb2 = sb.toString();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        sb2.getClass();
        ((cbph) da2.f164949b).f177918d = sb2;
        int a5 = srr.m36143a(201515033);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbph cbph2 = (cbph) da2.f164949b;
        cbph2.f177920f = a5;
        "20.15.15 (120300-{{cl}})".getClass();
        cbph2.f177921g = "20.15.15 (120300-{{cl}})";
        int i5 = Build.VERSION.SDK_INT;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbph) da2.f164949b).f177922h = i5;
        String g = cdfq.f180688a.mo6606a().mo77432g();
        int i6 = 2;
        if (!TextUtils.isEmpty(g)) {
            String[] split = TextUtils.split(g, ",");
            if ((split.length & 1) != 1) {
                for (int i7 = 0; i7 < split.length; i7 += 2) {
                    bxvd da6 = cbpu.f177959c.mo74144da();
                    String str8 = split[i7];
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    cbpu cbpu = (cbpu) da6.f164949b;
                    str8.getClass();
                    cbpu.f177961a = str8;
                    String str9 = split[i7 + 1];
                    str9.getClass();
                    cbpu.f177962b = str9;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    cbph cbph3 = (cbph) da2.f164949b;
                    cbpu cbpu2 = (cbpu) da6.mo74062i();
                    cbpu2.getClass();
                    if (!cbph3.f177925k.mo73666a()) {
                        cbph3.f177925k = GeneratedMessageLite.m124021a(cbph3.f177925k);
                    }
                    cbph3.f177925k.add(cbpu2);
                }
            } else {
                throw new tdw("Experiment key-value's should appear in pairs.", 2, false);
            }
        }
        bxvd da7 = cbps.f177952b.mo74144da();
        if (z2) {
            tdj tdj = tdx2.f45709b;
            Context context = this.f45465a;
            String str10 = tdx2.f45712e;
            tdj.mo26397a(context, cdfq.f180688a.mo6606a().mo77431f());
            HashMap hashMap = new HashMap();
            hashMap.put("iidHash", tdj.m36753a(str10));
            hashMap.put("rpc", str);
            String a6 = tdj.mo26396a(hashMap);
            tdj.f45697a.mo28907b();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            a6.getClass();
            ((cbps) da7.f164949b).f177954a = a6;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbps cbps = (cbps) da7.mo74062i();
        cbps.getClass();
        ((cbph) da2.f164949b).f177916b = cbps;
        Context context2 = this.f45465a;
        int i8 = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context2.getSystemService("user");
        int i9 = (userManager == null || !userManager.isManagedProfile()) ? 3 : 4;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbph) da2.f164949b).f177926l = cbpg.m128070a(i9);
        tdi a7 = tdi.m36751a(this.f45465a);
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f45465a.getSystemService("connectivity");
        ArrayList arrayList3 = new ArrayList();
        new ArrayList();
        try {
            for (NetworkInfo networkInfo : Arrays.asList(connectivityManager.getAllNetworkInfo())) {
                int type = networkInfo.getType();
                if (type == 0 || type == i4) {
                    bxvd da8 = cbpl.f177933d.mo74144da();
                    int type2 = networkInfo.getType();
                    if (type2 == 0) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177935a = cbpk.m128074a(4);
                    } else if (type2 != i4) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177935a = cbpk.m128074a(i6);
                    } else {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177935a = cbpk.m128074a(3);
                    }
                    int i10 = tdh.f45691a[networkInfo.getState().ordinal()];
                    if (i10 == i4) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177936b = cbpj.m128073a(4);
                    } else if (i10 == i6) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177936b = cbpj.m128073a(3);
                    } else if (i10 == 3) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177936b = cbpj.m128073a(6);
                    } else if (i10 == 4) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177936b = cbpj.m128073a(5);
                    } else if (i10 != 5) {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177936b = cbpj.m128073a(i6);
                    } else {
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        ((cbpl) da8.f164949b).f177936b = cbpj.m128073a(7);
                    }
                    if (!networkInfo.isAvailable()) {
                        i2 = 4;
                    } else {
                        i2 = 3;
                    }
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    ((cbpl) da8.f164949b).f177937c = i2 - 2;
                    arrayList3.add((cbpl) da8.mo74062i());
                    i6 = 2;
                    i4 = 1;
                } else {
                    i6 = 2;
                    i4 = 1;
                }
            }
        } catch (SecurityException e) {
            tdi.f45692a.mo25414c("Couldn't read connectivity info", new Object[0]);
            a7.f45694b.mo26410a(tdx2, 45, e);
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbph cbph4 = (cbph) da2.f164949b;
        if (!cbph4.f177928n.mo73666a()) {
            cbph4.f177928n = GeneratedMessageLite.m124021a(cbph4.f177928n);
        }
        bxsy.m123078a(arrayList3, cbph4.f177928n);
        tec a8 = tec.m36805a(this.f45465a, tdx2);
        ArrayList arrayList4 = tdx2.f45714g;
        if (arrayList4 != null) {
            arrayList = arrayList4;
        } else if (cdft.f180703a.mo6606a().mo77441b()) {
            arrayList = new ArrayList();
            bnre i11 = a8.f45725d.listIterator();
            while (i11.hasNext()) {
                ted ted = (ted) i11.next();
                bxvd da9 = cbqf.f178014c.mo74144da();
                String a9 = tec.m36804a(ted.mo26422b());
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                a9.getClass();
                ((cbqf) da9.f164949b).f178017b = a9;
                String e2 = ted.mo26425e();
                if (da9.f164950c) {
                    da9.mo74035c();
                    da9.f164950c = false;
                }
                e2.getClass();
                ((cbqf) da9.f164949b).f178016a = e2;
                arrayList.add((cbqf) da9.mo74062i());
            }
            tdx2.f45714g = arrayList;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbph cbph5 = (cbph) da2.f164949b;
            if (!cbph5.f177929o.mo73666a()) {
                cbph5.f177929o = GeneratedMessageLite.m124021a(cbph5.f177929o);
            }
            bxsy.m123078a(arrayList, cbph5.f177929o);
        }
        cbph cbph6 = (cbph) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbph6.getClass();
        ((cbqj) da.f164949b).f178033a = cbph6;
        if (z && szq.m36667a(this.f45465a).f45525b.getBoolean("is_public_key_acked", false)) {
            bxvd da10 = cbpe.f177905d.mo74144da();
            if (!TextUtils.isEmpty(tdx2.f45712e)) {
                bxvd da11 = cbpq.f177946b.mo74144da();
                String str11 = tdx2.f45712e;
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                str11.getClass();
                ((cbpq) da11.f164949b).f177948a = str11;
                if (da10.f164950c) {
                    da10.mo74035c();
                    da10.f164950c = false;
                }
                cbpq cbpq2 = (cbpq) da11.mo74062i();
                cbpq2.getClass();
                ((cbpe) da10.f164949b).f177907a = cbpq2;
            }
            String str12 = tdx2.f45712e;
            long j = bxyk2.f165097a;
            int i12 = bxyk2.f165098b;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str12).length() + 33);
            sb3.append(str12);
            sb3.append(":");
            sb3.append(j);
            sb3.append(":");
            sb3.append(i12);
            String sb4 = sb3.toString();
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bxyk.getClass();
            ((cbpe) da10.f164949b).f177909c = bxyk2;
            ByteString a10 = ByteString.m123261a(syz.m36620a(this.f45465a).mo26250a(tdx2, szq.m36667a(this.f45465a), sb4));
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            a10.getClass();
            ((cbpe) da10.f164949b).f177908b = a10;
            cbpe cbpe = (cbpe) da10.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbpe.getClass();
            ((cbqj) da.f164949b).f178034b = cbpe;
        }
        String str13 = tdx2.f45708a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str13.getClass();
        ((cbqj) da.f164949b).f178035c = str13;
        bxvd da12 = cbqk.f178037b.mo74144da();
        switch (tdx2.f45711d) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            default:
                i = 0;
                break;
        }
        if (da12.f164950c) {
            da12.mo74035c();
            da12.f164950c = false;
        }
        ((cbqk) da12.f164949b).f178039a = i - 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbqk cbqk = (cbqk) da12.mo74062i();
        cbqk.getClass();
        ((cbqj) da.f164949b).f178036d = cbqk;
        return (cbqj) da.mo74062i();
    }

    /* renamed from: a */
    public final cbqj mo26252a(tdx tdx, boolean z, boolean z2, String str) {
        return mo26251a(tdx, tdo.m36764a(System.currentTimeMillis()), z, z2, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sza.a(cbrc, boolean):void
     arg types: [cbrc, int]
     candidates:
      sza.a(java.util.List, java.lang.String):java.lang.String
      sza.a(tdx, cbqu):java.util.List
      sza.a(tdx, cbpx):boolean
      sza.a(cbrc, boolean):void */
    /* renamed from: a */
    public final cbqy mo26253a(tdx tdx, cbqy cbqy, cboe cboe) {
        tdx tdx2 = tdx;
        cbqy cbqy2 = cbqy;
        cboe cboe2 = cboe;
        if (cbqy2 == null) {
            return null;
        }
        boolean equals = m36625a(cbqy2.f178088f, "one_time_verification").equals("True");
        bxvd da = cbqh.f178021d.mo74144da();
        cbqj a = mo26252a(tdx2, true, cdfq.f180688a.mo6606a().mo77434i(), "proceed");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbqh cbqh = (cbqh) da.f164949b;
        a.getClass();
        cbqh.f178023a = a;
        cbqy.getClass();
        cbqh.f178024b = cbqy2;
        if (cboe2 != null) {
            cboe.getClass();
            cbqh.f178025c = cboe2;
        }
        cbqh cbqh2 = (cbqh) da.mo74062i();
        tds tds = this.f45467d;
        bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
        if (bqjd.f164950c) {
            bqjd.mo74035c();
            bqjd.f164950c = false;
        }
        bqje bqje = (bqje) bqjd.f164949b;
        bqje.f140935b = bqjw.m112936a(8);
        bqje.f140934a |= 1;
        cbqy cbqy3 = cbqh2.f178024b;
        if (cbqy3 != null) {
            bqjd.mo69271a(tds.m36771a(cbqy3));
        }
        tds.mo26409a(tdx2, 7, (bqje) bqjd.mo74062i());
        f45464c.mo25412b("ProceedRequest: %s", cbqh2);
        try {
            sze a2 = mo26255a();
            ClientContext clientContext = this.f45466b;
            long j = this.f45468e;
            if (sze.f45481e == null) {
                sze.f45481e = chtv.m149566a(chtu.UNARY, "google.internal.communications.phonedeviceverification.v1.PhoneDeviceVerification/Proceed", ciie.m150370a(cbqh.f178021d), ciie.m150370a(cbqi.f178026d));
            }
            cbqi cbqi = (cbqi) a2.f45483a.mo25553a(sze.f45481e, clientContext, cbqh2, j, TimeUnit.MILLISECONDS);
            if (cbqi == null || cbqi.f178029b == null) {
                return null;
            }
            tds tds2 = this.f45467d;
            bqjd bqjd2 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd2.f164950c) {
                bqjd2.mo74035c();
                bqjd2.f164950c = false;
            }
            bqje bqje2 = (bqje) bqjd2.f164949b;
            bqje2.f140935b = bqjw.m112936a(8);
            bqje2.f140934a |= 1;
            cbqy cbqy4 = cbqi.f178029b;
            if (cbqy4 != null) {
                bqjd2.mo69271a(tds.m36771a(cbqy4));
            }
            tds2.mo26409a(tdx2, 8, (bqje) bqjd2.mo74062i());
            cbql cbql = cbqi.f178028a;
            if (cbql == null) {
                cbql = cbql.f178040b;
            }
            mo26256a(cbql);
            f45464c.mo25412b("ProceedResponse: %s", cbqi);
            cbrc cbrc = cbqi.f178030c;
            if (cbrc != null && !equals) {
                m36626a(cbrc, true);
            }
            cbqy cbqy5 = cbqi.f178029b;
            return cbqy5 == null ? cbqy.f178081i : cbqy5;
        } catch (chuw | gid e) {
            tds tds3 = this.f45467d;
            bqjd bqjd3 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd3.f164950c) {
                bqjd3.mo74035c();
                bqjd3.f164950c = false;
            }
            bqje bqje3 = (bqje) bqjd3.f164949b;
            bqje3.f140935b = bqjw.m112936a(8);
            bqje3.f140934a |= 1;
            tds3.mo26413a(tdx2, e, (bqje) bqjd3.mo74062i(), cbqy2);
            if (e instanceof chuw) {
                chuw chuw = (chuw) e;
                f45464c.mo25417e("Proceed failed with status: %s\nException: ", e, chuw.f189236a.toString());
                throw new tdu("proceed", bqjk.m112922b(chuw.f189236a.f189233s.f189211r), false);
            }
            f45464c.mo25417e("Proceed failed with GoogleAuthException: ", e, new Object[0]);
            throw new tdu("proceed", 30, false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sza.a(cbrc, boolean):void
     arg types: [cbrc, int]
     candidates:
      sza.a(java.util.List, java.lang.String):java.lang.String
      sza.a(tdx, cbqu):java.util.List
      sza.a(tdx, cbpx):boolean
      sza.a(cbrc, boolean):void */
    /* renamed from: a */
    public final List mo26254a(tdx tdx, cbqu cbqu) {
        boolean z;
        bxyk bxyk;
        tdx tdx2 = tdx;
        cbqu cbqu2 = cbqu;
        szq a = szq.m36667a(this.f45465a);
        ArrayList arrayList = new ArrayList();
        tds tds = this.f45467d;
        bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
        boolean z2 = false;
        if (bqjd.f164950c) {
            bqjd.mo74035c();
            bqjd.f164950c = false;
        }
        bqje bqje = (bqje) bqjd.f164949b;
        bqje.f140935b = bqjw.m112936a(7);
        bqje.f140934a |= 1;
        if (cbqu2.f178074b.size() > 0) {
            bxvd da = bqiz.f140917c.mo74144da();
            cbqj cbqj = cbqu2.f178073a;
            if (cbqj == null) {
                cbqj = cbqj.f178031e;
            }
            cbph cbph = cbqj.f178033a;
            if (cbph == null) {
                cbph = cbph.f177913p;
            }
            int i = cbph.f177926l;
            int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
            if (i2 == 0) {
                i2 = 1;
            }
            int a2 = bqiy.m112909a(cbpg.m128070a(i2));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiz bqiz = (bqiz) da.f164949b;
            int i3 = a2 - 1;
            if (a2 != 0) {
                bqiz.f140920b = i3;
                bqiz.f140919a |= 1;
                if (bqjd.f164950c) {
                    bqjd.mo74035c();
                    bqjd.f164950c = false;
                }
                bqje bqje2 = (bqje) bqjd.f164949b;
                bqiz bqiz2 = (bqiz) da.mo74062i();
                bqiz2.getClass();
                bqje2.f140940g = bqiz2;
                bqje2.f140934a |= 8;
                bxwc bxwc = cbqu2.f178074b;
                int size = bxwc.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bqjd.mo69271a(tds.m36771a((cbqy) bxwc.get(i4)));
                }
            } else {
                throw null;
            }
        }
        tds.mo26409a(tdx2, 7, (bqje) bqjd.mo74062i());
        if (cbqu2.f178074b.size() > 0) {
            boolean equals = m36625a(((cbqy) cbqu2.f178074b.get(0)).f178088f, "one_time_verification").equals("True");
            if (!equals) {
                long e = a.mo26294e();
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = a.f45525b.edit();
                edit.putLong("last_sync_with_server_time_millis", currentTimeMillis);
                edit.apply();
                a.mo26290b("previous_session_sync_timestamp_millis", String.valueOf(e));
            }
            z = equals;
        } else {
            z = false;
        }
        sze a3 = mo26255a();
        ClientContext clientContext = this.f45466b;
        long j = this.f45468e;
        if (sze.f45480d == null) {
            sze.f45480d = chtv.m149566a(chtu.UNARY, "google.internal.communications.phonedeviceverification.v1.PhoneDeviceVerification/Sync", ciie.m150370a(cbqu.f178071c), ciie.m150370a(cbqv.f178075d));
        }
        cbqv cbqv = (cbqv) a3.f45483a.mo25553a(sze.f45480d, clientContext, cbqu, j, TimeUnit.MILLISECONDS);
        if (cbqv != null) {
            tds tds2 = this.f45467d;
            bqjd bqjd2 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd2.f164950c) {
                bqjd2.mo74035c();
                bqjd2.f164950c = false;
            }
            bqje bqje3 = (bqje) bqjd2.f164949b;
            bqje3.f140935b = bqjw.m112936a(7);
            bqje3.f140934a |= 1;
            ArrayList arrayList2 = new ArrayList();
            bxwc bxwc2 = cbqv.f178078b;
            int size2 = bxwc2.size();
            int i5 = 0;
            while (i5 < size2) {
                cbrb cbrb = (cbrb) bxwc2.get(i5);
                if (cbrb.f178102b != null) {
                    bxvd da2 = bqiv.f140904d.mo74144da();
                    bxbg bxbg = cbrb.f178102b;
                    if (bxbg == null) {
                        bxbg = bxbg.f161808c;
                    }
                    int b = bqjk.m112922b(bxbg.f161810a);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z2;
                    }
                    bqiv bqiv = (bqiv) da2.f164949b;
                    bqiv.f140907b = bqjk.m112921a(b);
                    bqiv.f140906a |= 1;
                    bxbg bxbg2 = cbrb.f178102b;
                    if (bxbg2 == null) {
                        bxbg2 = bxbg.f161808c;
                    }
                    String str = bxbg2.f161811b;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z2;
                    }
                    bqiv bqiv2 = (bqiv) da2.f164949b;
                    str.getClass();
                    bqiv2.f140906a |= 2;
                    bqiv2.f140908c = str;
                    arrayList2.add((bqiv) da2.mo74062i());
                }
                cbqy cbqy = cbrb.f178101a;
                if (cbqy == null) {
                    cbqy = cbqy.f178081i;
                }
                bqjd2.mo69271a(tds.m36771a(cbqy));
                i5++;
                z2 = false;
            }
            cbrc cbrc = cbqv.f178079c;
            if (!(cbrc == null || (bxyk = cbrc.f178106a) == null)) {
                int a4 = (int) tdo.m36763a(bxyk);
                if (bqjd2.f164950c) {
                    bqjd2.mo74035c();
                    bqjd2.f164950c = false;
                }
                bqje bqje4 = (bqje) bqjd2.f164949b;
                bqje4.f140934a |= 4;
                bqje4.f140938e = a4;
            }
            if (!arrayList2.isEmpty()) {
                if (bqjd2.f164950c) {
                    bqjd2.mo74035c();
                    bqjd2.f164950c = false;
                }
                bqje bqje5 = (bqje) bqjd2.f164949b;
                if (!bqje5.f140939f.mo73666a()) {
                    bqje5.f140939f = GeneratedMessageLite.m124021a(bqje5.f140939f);
                }
                bxsy.m123078a(arrayList2, bqje5.f140939f);
            }
            tds2.mo26409a(tdx2, 8, (bqje) bqjd2.mo74062i());
            f45464c.mo25412b("SyncResponse: %s", cbqv);
            cbql cbql = cbqv.f178077a;
            if (cbql == null) {
                cbql = cbql.f178040b;
            }
            mo26256a(cbql);
            bxwc bxwc3 = cbqv.f178078b;
            int size3 = bxwc3.size();
            for (int i6 = 0; i6 < size3; i6++) {
                cbrb cbrb2 = (cbrb) bxwc3.get(i6);
                cbqy cbqy2 = cbrb2.f178101a;
                if (cbqy2 != null) {
                    arrayList.add(cbqy2);
                }
                if (cbrb2.f178102b != null) {
                    Logger Logger = f45464c;
                    Object[] objArr = new Object[1];
                    bxbg bxbg3 = cbrb2.f178102b;
                    if (bxbg3 == null) {
                        bxbg3 = bxbg.f161808c;
                    }
                    objArr[0] = bxbg3.f161811b;
                    Logger.mo25414c("Verification failed with error: %s", objArr);
                }
            }
            cbrc cbrc2 = cbqv.f178079c;
            if (cbrc2 != null && !z) {
                m36626a(cbrc2, false);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final sze mo26255a() {
        if (this.f45469f == null) {
            shl shl = new shl(this.f45465a, cdfe.f180643a.mo6606a().mo77386b(), (int) cdfe.f180643a.mo6606a().mo77385a(), this.f45465a.getApplicationInfo().uid, 16640);
            shl.mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
            shl.mo25556a("X-Android-Package", this.f45465a.getPackageName());
            Context context = this.f45465a;
            shl.mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
            this.f45469f = new sze(shl);
        }
        return this.f45469f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26256a(cbql cbql) {
        cbpi cbpi;
        if (cbql != null && (cbpi = cbql.f178042a) != null) {
            int i = cbpi.f177932a;
            char c = i != 0 ? i != 1 ? (char) 0 : 3 : 2;
            if (c != 0 && c == 3) {
                szq.m36667a(this.f45465a).mo26291b(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo26257a(tdx tdx, boolean z, boolean z2) {
        mo26258a(tdx, z, z2, cbnw.CONSTELLATION, null, bngx.m109376e());
    }

    /* renamed from: a */
    public final void mo26258a(tdx tdx, boolean z, boolean z2, cbnw cbnw, byte[] bArr, List list) {
        boolean z3;
        boolean z4;
        tdx tdx2 = tdx;
        boolean z5 = z;
        List list2 = list;
        bxvd da = cbqr.f178055g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbqr) da.f164949b).f178060d = cbnw.mo3214a();
        if (bArr != null) {
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a.getClass();
            ((cbqr) da.f164949b).f178061e = a;
        }
        if (list2 != null && !list.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbqr cbqr = (cbqr) da.f164949b;
            if (!cbqr.f178062f.mo73666a()) {
                cbqr.f178062f = GeneratedMessageLite.m124021a(cbqr.f178062f);
            }
            bxsy.m123078a(list2, cbqr.f178062f);
        }
        cbqj a2 = mo26252a(tdx2, false, cdfq.m133004d(), "setConsent");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cbqr) da.f164949b).f178057a = a2;
        bxvd da2 = cbpp.f177942c.mo74144da();
        int i = 4;
        int i2 = !z5 ? 4 : 3;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((cbpp) da2.f164949b).f177944a = cbpm.m128076a(i2);
        if (z5) {
            if (z2) {
                i = 3;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((cbpp) da2.f164949b).f177945b = i - 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbpp cbpp = (cbpp) da2.mo74062i();
        cbpp.getClass();
        ((cbqr) da.f164949b).f178058b = cbpp;
        cbqr cbqr2 = (cbqr) da.mo74062i();
        f45464c.mo25412b("SetConsentRequest: %s", cbqr2);
        try {
            tds tds = this.f45467d;
            bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd.f164950c) {
                bqjd.mo74035c();
                bqjd.f164950c = false;
            }
            bqje bqje = (bqje) bqjd.f164949b;
            bqje.f140935b = bqjw.m112936a(10);
            bqje.f140934a |= 1;
            bxvd da3 = bqja.f140921d.mo74144da();
            cbpp cbpp2 = cbqr2.f178058b;
            if (cbpp2 == null) {
                cbpr cbpr = cbqr2.f178059c;
                if (cbpr == null) {
                    cbpr = cbpr.f177949b;
                }
                int b = cbpm.m128077b(cbpr.f177951a);
                boolean z6 = b == 0 ? false : b == 3;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bqja bqja = (bqja) da3.f164949b;
                bqja.f140923a |= 1;
                bqja.f140924b = z6;
            } else {
                int b2 = cbpm.m128077b(cbpp2.f177944a);
                if (b2 == 0) {
                    z3 = false;
                } else {
                    z3 = b2 == 3;
                }
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bqja bqja2 = (bqja) da3.f164949b;
                bqja2.f140923a |= 1;
                bqja2.f140924b = z3;
                cbpp cbpp3 = cbqr2.f178058b;
                if (cbpp3 == null) {
                    cbpp3 = cbpp.f177942c;
                }
                int a3 = cbpn.m128078a(cbpp3.f177945b);
                if (a3 == 0) {
                    z4 = false;
                } else {
                    z4 = a3 == 3;
                }
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bqja bqja3 = (bqja) da3.f164949b;
                bqja3.f140923a |= 2;
                bqja3.f140925c = z4;
            }
            if (bqjd.f164950c) {
                bqjd.mo74035c();
                bqjd.f164950c = false;
            }
            bqje bqje2 = (bqje) bqjd.f164949b;
            bqja bqja4 = (bqja) da3.mo74062i();
            bqja4.getClass();
            bqje2.f140936c = bqja4;
            bqje2.f140934a |= 2;
            tds.mo26409a(tdx2, 7, (bqje) bqjd.mo74062i());
            sze a4 = mo26255a();
            ClientContext clientContext = this.f45466b;
            long j = this.f45468e;
            if (sze.f45479c == null) {
                sze.f45479c = chtv.m149566a(chtu.UNARY, "google.internal.communications.phonedeviceverification.v1.PhoneDeviceVerification/SetConsent", ciie.m150370a(cbqr.f178055g), ciie.m150370a(cbqs.f178063a));
            }
            f45464c.mo25412b("SetConsentResponse: %s", (cbqs) a4.f45483a.mo25553a(sze.f45479c, clientContext, cbqr2, j, TimeUnit.MILLISECONDS));
            tds tds2 = this.f45467d;
            bqjd bqjd2 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd2.f164950c) {
                bqjd2.mo74035c();
                bqjd2.f164950c = false;
            }
            bqje bqje3 = (bqje) bqjd2.f164949b;
            bqje3.f140935b = bqjw.m112936a(10);
            bqje3.f140934a |= 1;
            tds2.mo26409a(tdx2, 8, (bqje) bqjd2.mo74062i());
            szq a5 = szq.m36667a(this.f45465a.getApplicationContext());
            a5.mo26287a(z5);
            a5.mo26286a(Boolean.valueOf(z2));
        } catch (chuw | gid e) {
            tds tds3 = this.f45467d;
            bqjd bqjd3 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd3.f164950c) {
                bqjd3.mo74035c();
                bqjd3.f164950c = false;
            }
            bqje bqje4 = (bqje) bqjd3.f164949b;
            bqje4.f140935b = bqjw.m112936a(10);
            bqje4.f140934a |= 1;
            tds3.mo26413a(tdx2, e, (bqje) bqjd3.mo74062i(), (cbqy) null);
            if (e instanceof chuw) {
                chuw chuw = (chuw) e;
                f45464c.mo25417e("SetConsent failed with status: %s\nException: ", e, chuw.f189236a.toString());
                throw new tdu("setConsent", bqjk.m112922b(chuw.f189236a.f189233s.f189211r), false);
            }
            f45464c.mo25417e("setConsent failed with GoogleAuthException: ", e, new Object[0]);
            throw new tdu("setConsent", 30, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cc, code lost:
        if (r5 == 2) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x025e A[Catch:{ chuw | gid -> 0x02b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fe A[Catch:{ chuw | gid -> 0x02b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x020e A[Catch:{ chuw | gid -> 0x02b4 }] */
    /* renamed from: a */
    public final boolean mo26259a(tdx tdx, cbpx cbpx) {
        String str;
        boolean z;
        boolean z2;
        cbrc cbrc;
        cbpf cbpf;
        boolean z3;
        boolean z4;
        List list = tdx.f45713f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) list.get(i);
                bxvd da = cbpw.f177965b.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str2.getClass();
                ((cbpw) da.f164949b).f177967a = str2;
                if (cbpx.f164950c) {
                    cbpx.mo74035c();
                    cbpx.f164950c = false;
                }
                cbpy cbpy = (cbpy) cbpx.f164949b;
                cbpw cbpw = (cbpw) da.mo74062i();
                cbpy cbpy2 = cbpy.f177968h;
                cbpw.getClass();
                if (!cbpy.f177972c.mo73666a()) {
                    cbpy.f177972c = GeneratedMessageLite.m124021a(cbpy.f177972c);
                }
                cbpy.f177972c.add(cbpw);
            }
        }
        cbpy cbpy3 = (cbpy) cbpx.mo74062i();
        f45464c.mo25412b("GetConsentRequest: %s", cbpy3);
        try {
            tds tds = this.f45467d;
            bqjd bqjd = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd.f164950c) {
                bqjd.mo74035c();
                bqjd.f164950c = false;
            }
            bqje bqje = (bqje) bqjd.f164949b;
            bqje.f140935b = bqjw.m112936a(6);
            bqje.f140934a |= 1;
            tds.mo26409a(tdx, 7, (bqje) bqjd.mo74062i());
            szq a = szq.m36667a(this.f45465a.getApplicationContext());
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = a.f45525b.edit();
            edit.putLong("last_consent_check_with_server_time_millis", currentTimeMillis);
            edit.apply();
            sze a2 = mo26255a();
            ClientContext clientContext = this.f45466b;
            long j = this.f45468e;
            if (sze.f45478b == null) {
                sze.f45478b = chtv.m149566a(chtu.UNARY, "google.internal.communications.phonedeviceverification.v1.PhoneDeviceVerification/GetConsent", ciie.m150370a(cbpy.f177968h), ciie.m150370a(cbpz.f177977e));
            }
            cbpz cbpz = (cbpz) a2.f45483a.mo25553a(sze.f45478b, clientContext, cbpy3, j, TimeUnit.MILLISECONDS);
            if (cbpz == null) {
                return false;
            }
            tds tds2 = this.f45467d;
            bqjd bqjd2 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd2.f164950c) {
                bqjd2.mo74035c();
                bqjd2.f164950c = false;
            }
            bqje bqje2 = (bqje) bqjd2.f164949b;
            bqje2.f140935b = bqjw.m112936a(6);
            bqje2.f140934a |= 1;
            bxvd da2 = bqja.f140921d.mo74144da();
            cbpp cbpp = cbpz.f177979a;
            if (cbpp == null) {
                cbpp = cbpp.f177942c;
            }
            int b = cbpm.m128077b(cbpp.f177944a);
            if (b == 0) {
                b = 1;
            }
            char c = 3;
            boolean z5 = b == 3;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bqja bqja = (bqja) da2.f164949b;
            bqja.f140923a |= 1;
            bqja.f140924b = z5;
            cbpp cbpp2 = cbpz.f177979a;
            if (cbpp2 == null) {
                cbpp2 = cbpp.f177942c;
            }
            int a3 = cbpn.m128078a(cbpp2.f177945b);
            if (a3 == 0) {
                z = false;
            } else {
                z = a3 == 3;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bqja bqja2 = (bqja) da2.f164949b;
            bqja2.f140923a |= 2;
            bqja2.f140925c = z;
            if (bqjd2.f164950c) {
                bqjd2.mo74035c();
                bqjd2.f164950c = false;
            }
            bqje bqje3 = (bqje) bqjd2.f164949b;
            bqja bqja3 = (bqja) da2.mo74062i();
            bqja3.getClass();
            bqje3.f140936c = bqja3;
            bqje3.f140934a |= 2;
            tds2.mo26409a(tdx, 8, (bqje) bqjd2.mo74062i());
            f45464c.mo25412b("GetConsentResponse: %s", cbpz);
            szq a4 = szq.m36667a(this.f45465a);
            boolean a5 = m36628a(a4);
            cbpp cbpp3 = cbpz.f177979a;
            if (cbpp3 != null) {
                int b2 = cbpm.m128077b(cbpp3.f177944a);
                if (b2 != 0 && b2 == 3) {
                    a4.mo26287a(true);
                    cbpp cbpp4 = cbpz.f177979a;
                    if (cbpp4 == null) {
                        cbpp4 = cbpp.f177942c;
                    }
                    int a6 = cbpn.m128078a(cbpp4.f177945b);
                    if (a6 == 0) {
                        cbpp cbpp5 = cbpz.f177979a;
                        if (cbpp5 == null) {
                            cbpp5 = cbpp.f177942c;
                        }
                        int a7 = cbpn.m128078a(cbpp5.f177945b);
                        if (a7 == 0) {
                            z4 = false;
                        } else {
                            z4 = a7 == 3;
                        }
                        a4.mo26286a(Boolean.valueOf(z4));
                    }
                    z2 = true;
                    cbrc = cbpz.f177980b;
                    if (cbrc != null) {
                        a4.mo26284a(m36624a(cbrc) - cdfw.m133047b());
                    }
                    cbpf = cbpz.f177981c;
                    if (cbpf != null) {
                        int i2 = cbpf.f177912a;
                        if (i2 == 0) {
                            c = 2;
                        } else if (i2 != 1) {
                            c = i2 != 2 ? (char) 0 : 4;
                        }
                        if (c == 0) {
                            z3 = false;
                        } else {
                            z3 = c == 4;
                        }
                        Boolean valueOf = Boolean.valueOf(z3);
                        SharedPreferences.Editor edit2 = a4.f45525b.edit();
                        edit2.putBoolean("checkers_active", valueOf.booleanValue());
                        edit2.apply();
                    }
                    if (a5 && !m36628a(a4)) {
                        szr.m36692a();
                        szr.m36695a(new ArrayList());
                        a4.mo26288b();
                        a4.mo26283a();
                        a4.mo26299j();
                    }
                    if (cdfq.m133006f()) {
                        for (cbpc cbpc : cbpz.f177982d) {
                            bnhe bnhe = szq.f45523a;
                            cbnw a8 = cbnw.m128030a(cbpc.f177900a);
                            if (a8 == null) {
                                a8 = cbnw.UNRECOGNIZED;
                            }
                            if (bnhe.containsKey(a8)) {
                                SharedPreferences.Editor edit3 = a4.f45525b.edit();
                                bnhe bnhe2 = szq.f45523a;
                                cbnw a9 = cbnw.m128030a(cbpc.f177900a);
                                if (a9 == null) {
                                    a9 = cbnw.UNRECOGNIZED;
                                }
                                String str3 = (String) bnhe2.get(a9);
                                int b3 = cbpm.m128077b(cbpc.f177901b);
                                if (b3 == 0) {
                                    b3 = 1;
                                }
                                edit3.putLong(str3, (long) cbpm.m128076a(b3));
                                edit3.apply();
                            }
                        }
                    }
                    return z2;
                }
            }
            a4.mo26287a(false);
            a4.mo26286a((Boolean) false);
            z2 = false;
            cbrc = cbpz.f177980b;
            if (cbrc != null) {
            }
            cbpf = cbpz.f177981c;
            if (cbpf != null) {
            }
            szr.m36692a();
            szr.m36695a(new ArrayList());
            a4.mo26288b();
            a4.mo26283a();
            a4.mo26299j();
            if (cdfq.m133006f()) {
            }
            return z2;
        } catch (chuw | gid e) {
            tds tds3 = this.f45467d;
            bqjd bqjd3 = (bqjd) bqje.f140932h.mo74144da();
            if (bqjd3.f164950c) {
                bqjd3.mo74035c();
                bqjd3.f164950c = false;
            }
            bqje bqje4 = (bqje) bqjd3.f164949b;
            bqje4.f140935b = bqjw.m112936a(6);
            bqje4.f140934a |= 1;
            tds3.mo26413a(tdx, e, (bqje) bqjd3.mo74062i(), (cbqy) null);
            if (e instanceof chuw) {
                chuw chuw = (chuw) e;
                f45464c.mo25417e("GetConsent failed with status: %s\nException: ", e, chuw.f189236a.toString());
                boolean a10 = m36627a(chuw.f189236a);
                Logger Logger = f45464c;
                Object[] objArr = new Object[1];
                if (!a10) {
                    str = "not";
                } else {
                    str = "";
                }
                objArr[0] = str;
                Logger.logVerbose("Need %s to retry getconsent", objArr);
                throw new tdu("getConsent", bqjk.m112922b(chuw.f189236a.f189233s.f189211r), a10);
            }
            f45464c.mo25417e("GetConsent failed with GoogleAuthException: ", e, new Object[0]);
            throw new tdu("getConsent", 30, false);
        }
    }

    /* renamed from: a */
    public final boolean mo26260a(tdx tdx, List list, cbnw cbnw) {
        cbpx cbpx = (cbpx) cbpy.f177968h.mo74144da();
        cbqj a = mo26252a(tdx, false, cdfq.m133004d(), "getConsent");
        if (cbpx.f164950c) {
            cbpx.mo74035c();
            cbpx.f164950c = false;
        }
        cbpy cbpy = (cbpy) cbpx.f164949b;
        a.getClass();
        cbpy.f177970a = a;
        cbpy.f177975f = cbnw.mo3214a();
        if (cbpx.f164950c) {
            cbpx.mo74035c();
            cbpx.f164950c = false;
        }
        ((cbpy) cbpx.f164949b).f177976g = true;
        if (!TextUtils.isEmpty(tdx.f45712e)) {
            bxvd da = cbpq.f177946b.mo74144da();
            String str = tdx.f45712e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbpq) da.f164949b).f177948a = str;
            if (cbpx.f164950c) {
                cbpx.mo74035c();
                cbpx.f164950c = false;
            }
            cbpq cbpq = (cbpq) da.mo74062i();
            cbpq.getClass();
            ((cbpy) cbpx.f164949b).f177971b = cbpq;
        }
        if (!list.isEmpty()) {
            cbpx.mo75240a(list);
        }
        return mo26259a(tdx, cbpx);
    }
}
