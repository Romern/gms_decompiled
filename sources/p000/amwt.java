package p000;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: amwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amwt extends amwr {

    /* renamed from: h */
    public static final String[] f76222h;

    /* renamed from: j */
    private static final btct[] f76223j = {btct.GDATA_COMPATIBILITY};

    /* renamed from: k */
    private static final String[] f76224k;

    /* renamed from: i */
    public final bmxv f76225i;

    static {
        String[] strArr = {"person.about", "person.address", "person.birthday", "person.calendar", "person.client_data", "person.contact_group_membership", "person.email", "person.event", "person.external_id", "person.file_as", "person.gender", "person.im", "person.interest", "person.language", "person.name", "person.nickname", "person.occupation", "person.organization", "person.other_keyword", "person.phone", "person.relation", "person.sip_address", "person.user_defined", "person.website"};
        f76224k = strArr;
        f76222h = (String[]) sqc.m35962a((Object[][]) new String[][]{strArr, new String[]{"person.photo", "person.metadata"}});
    }

    public amwt(Context context, ClientContext clientContext, ampm ampm, String str, sqv sqv, bmza bmza, anaz anaz, btea btea, anbu anbu, bmxv bmxv) {
        super(context, clientContext, ampm, str, bmza, anaz, btea, anbu);
        this.f76225i = bmxv;
    }

    /* renamed from: a */
    public static final btbx[] m63566a(LinkedHashMap linkedHashMap, boolean z) {
        btbx[] btbxArr = new btbx[linkedHashMap.size()];
        int i = 0;
        for (amvp amvp : linkedHashMap.keySet()) {
            bxvd da = btbx.f148227c.mo74144da();
            bler b = z ? amwv.m63579b(amvp) : amwv.m63574a(amvp);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((btbx) da.f164949b).f148229a = b;
            long longValue = ((Long) linkedHashMap.get(amvp)).longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((btbx) da.f164949b).f148230b = longValue;
            btbxArr[i] = (btbx) da.mo74062i();
            i++;
        }
        return btbxArr;
    }

    /* renamed from: b */
    public static final btcu m63567b() {
        bxvd da = btcu.f148353b.mo74144da();
        List<btct> asList = Arrays.asList(f76223j);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btcu btcu = (btcu) da.f164949b;
        if (!btcu.f148355a.mo73666a()) {
            btcu.f148355a = bxvk.m124019a(btcu.f148355a);
        }
        for (btct btct : asList) {
            btcu.f148355a.mo74153d(btct.mo3214a());
        }
        return (btcu) da.mo74062i();
    }

    /* renamed from: c */
    public static final btdy m63568c() {
        btdw btdw = (btdw) btdy.f148473d.mo74144da();
        bxvd da = bteb.f148487b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bteb) da.f164949b).f148489a = 2;
        if (btdw.f164950c) {
            btdw.mo74035c();
            btdw.f164950c = false;
        }
        bteb bteb = (bteb) da.mo74062i();
        bteb.getClass();
        ((btdy) btdw.f164949b).f148476b = bteb;
        amig.m62939a();
        if (Boolean.valueOf(cfvk.f185780a.mo6606a().mo83004be()).booleanValue()) {
            btdw.mo70749a(btdx.CORE_ID);
        }
        return (btdy) btdw.mo74062i();
    }

    /* renamed from: b */
    public final btcz mo41507b(String str) {
        btcy btcy = (btcy) btcz.f148362g.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            btcy.mo70740a(str);
        }
        amig.m62939a();
        if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo83038o()).booleanValue()) {
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            ((btcz) btcy.f164949b).f148368e = btcx.m116436a(3);
        }
        btcu b = m63567b();
        if (btcy.f164950c) {
            btcy.mo74035c();
            btcy.f164950c = false;
        }
        btcz btcz = (btcz) btcy.f164949b;
        b.getClass();
        btcz.f148366c = b;
        btea btea = this.f76218f;
        btea.getClass();
        btcz.f148367d = btea;
        btef btef = (btef) bteh.f148502d.mo74144da();
        bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
        bxuv.mo73905a(Arrays.asList(f76222h));
        bxuw bxuw = (bxuw) bxuv.mo74062i();
        if (btef.f164950c) {
            btef.mo74035c();
            btef.f164950c = false;
        }
        bxuw.getClass();
        ((bteh) btef.f164949b).f148504a = bxuw;
        if (btcy.f164950c) {
            btcy.mo74035c();
            btcy.f164950c = false;
        }
        bteh bteh = (bteh) btef.mo74062i();
        bteh.getClass();
        ((btcz) btcy.f164949b).f148365b = bteh;
        btdy c = m63568c();
        if (btcy.f164950c) {
            btcy.mo74035c();
            btcy.f164950c = false;
        }
        c.getClass();
        ((btcz) btcy.f164949b).f148369f = c;
        return (btcz) btcy.mo74062i();
    }

    /* renamed from: a */
    public final amvp mo41503a(bler bler, String str) {
        btec btec;
        bxvd da = btev.f148574h.mo74144da();
        String str2 = bler.f126252b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btev btev = (btev) da.f164949b;
        str2.getClass();
        btev.f148576a = str2;
        bler.getClass();
        btev.f148577b = bler;
        bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
        bxuv.mo73905a(Arrays.asList(f76224k));
        bxuw bxuw = (bxuw) bxuv.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxuw.getClass();
        ((btev) da.f164949b).f148578c = bxuw;
        btei btei = btei.CONTACT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btev) da.f164949b).f148579d = btei.mo3214a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btev) da.f164949b).f148580e = false;
        amig.m62939a();
        if (!Boolean.valueOf(cfvk.f185780a.mo6606a().mo83039p()).booleanValue()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btev btev2 = (btev) da.f164949b;
            str.getClass();
            if (!btev2.f148581f.mo73666a()) {
                btev2.f148581f = bxvk.m124021a(btev2.f148581f);
            }
            btev2.f148581f.add(str);
        }
        btcz b = mo41507b(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((btev) da.f164949b).f148582g = b;
        this.f76216d.mo41626a();
        ampm ampm = this.f76214b;
        ClientContext clientContext = this.f76213a;
        btev btev3 = (btev) da.mo74062i();
        try {
            ampl ampl = ampm.f75684b;
            long j = (long) ampm.f75683a;
            if (ampl.f75670e == null) {
                ampl.f75670e = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/UpdatePerson", ciie.m150370a(btev.f148574h), ciie.m150370a(btew.f148584b));
            }
            btew btew = (btew) ampl.f75682a.mo25553a(ampl.f75670e, clientContext, btev3, j, TimeUnit.MILLISECONDS);
            this.f76216d.mo41628a("FSA_updatePerson", 1, amwy.m63594a(btew));
            if (btew == null || (btec = btew.f148586a) == null || btec.f148492a == null || btec.f148493b == null) {
                Log.e("FSA2_ContactSyncGrpc", "Unexpected null result returned by updatePerson People API");
                throw new amxy(3);
            }
            bynx bynx = btec.f148493b;
            if (bynx == null) {
                bynx = bynx.f167143b;
            }
            if (bynx.f167145a == chus.OK.f189211r) {
                btec btec2 = btew.f148586a;
                if (btec2 == null) {
                    btec2 = btec.f148490c;
                }
                bler bler2 = btec2.f148492a;
                if (bler2 == null) {
                    bler2 = bler.f126245D;
                }
                return amww.m63581a(bler2, str);
            }
            Log.e("FSA2_ContactSyncGrpc", "Failed to updatePerson: Failed to insertPerson, responseStatus is not OK.");
            throw new amxy(3);
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amwt.a(java.util.LinkedHashMap, boolean):btbx[]
     arg types: [java.util.LinkedHashMap, int]
     candidates:
      amwt.a(bler, java.lang.String):amvp
      amwt.a(java.util.LinkedHashMap, btbx[]):amws
      amwt.a(java.util.List, java.lang.String):void
      amwr.a(java.util.List, int):void
      amwr.a(java.lang.String, int):byte[]
      amwt.a(java.util.LinkedHashMap, boolean):btbx[] */
    /* renamed from: a */
    public final amws mo41504a(LinkedHashMap linkedHashMap) {
        return mo41505a(linkedHashMap, m63566a(linkedHashMap, false));
    }

    /* renamed from: a */
    public final amws mo41505a(LinkedHashMap linkedHashMap, btbx[] btbxArr) {
        bxvd da = btby.f148232d.mo74144da();
        List asList = Arrays.asList(btbxArr);
        int i = 0;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btby btby = (btby) da.f164949b;
        if (!btby.f148234a.mo73666a()) {
            btby.f148234a = bxvk.m124021a(btby.f148234a);
        }
        bxsy.m123078a(asList, btby.f148234a);
        btcz b = mo41507b(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((btby) da.f164949b).f148236c = b;
        bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
        bxuv.mo73905a(Arrays.asList(f76224k));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxuw bxuw = (bxuw) bxuv.mo74062i();
        bxuw.getClass();
        ((btby) da.f164949b).f148235b = bxuw;
        btby btby2 = (btby) da.mo74062i();
        this.f76216d.mo41626a();
        ampm ampm = this.f76214b;
        ClientContext clientContext = this.f76213a;
        try {
            ampl ampl = ampm.f75684b;
            if (ampl.f75680o == null) {
                ampl.f75680o = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/BulkInsertContacts", ciie.m150370a(btby.f148232d), ciie.m150370a(btca.f148242b));
            }
            btca btca = (btca) ampl.f75682a.mo25553a(ampl.f75680o, clientContext, btby2, 30000, TimeUnit.MILLISECONDS);
            this.f76216d.mo41628a("FSA_bulkInsertContacts", 1, amwy.m63594a(btca));
            if (btca == null || btca.f148244a.size() != btby2.f148234a.size()) {
                Log.e("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts.");
                throw new amxy(3);
            }
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                btec btec = ((btbz) btca.f148244a.get(i)).f148240a;
                if (btec == null) {
                    btec = btec.f148490c;
                }
                if (btec.f148492a != null) {
                    btec btec2 = ((btbz) btca.f148244a.get(i)).f148240a;
                    if (btec2 == null) {
                        btec2 = btec.f148490c;
                    }
                    if (btec2.f148493b != null) {
                        btec btec3 = ((btbz) btca.f148244a.get(i)).f148240a;
                        if (btec3 == null) {
                            btec3 = btec.f148490c;
                        }
                        bynx bynx = btec3.f148493b;
                        if (bynx == null) {
                            bynx = bynx.f167143b;
                        }
                        if (bynx.f167145a == chus.OK.f189211r) {
                            btec btec4 = ((btbz) btca.f148244a.get(i)).f148240a;
                            if (btec4 == null) {
                                btec4 = btec.f148490c;
                            }
                            bler bler = btec4.f148492a;
                            if (bler == null) {
                                bler = bler.f126245D;
                            }
                            String a = amww.m63583a(bler);
                            btec btec5 = ((btbz) btca.f148244a.get(i)).f148240a;
                            if (btec5 == null) {
                                btec5 = btec.f148490c;
                            }
                            bler bler2 = btec5.f148492a;
                            if (bler2 == null) {
                                bler2 = bler.f126245D;
                            }
                            amvp a2 = amww.m63581a(bler2, a);
                            if (a2.f76092a.equals(Long.toHexString(((Long) entry.getValue()).longValue()))) {
                                arrayList.add(new anad(a2, (amvp) entry.getKey()));
                            } else {
                                throw new amxy(3);
                            }
                        } else {
                            Log.e("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts, responseStatus is not OK.");
                            linkedHashMap2.put((amvp) entry.getKey(), (Long) entry.getValue());
                        }
                        i++;
                    }
                }
                Log.e("FSA2_ContactSyncGrpc", "Failed to bulk insert contacts.");
                throw new amxy(3);
            }
            return new amws(arrayList, linkedHashMap2);
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo41506a(List list, String str) {
        if (!list.isEmpty()) {
            bxvd da = btck.f148280d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btck btck = (btck) da.f164949b;
            if (!btck.f148282a.mo73666a()) {
                btck.f148282a = bxvk.m124021a(btck.f148282a);
            }
            bxsy.m123078a(list, btck.f148282a);
            btea btea = this.f76218f;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btea.getClass();
            ((btck) da.f164949b).f148283b = btea;
            if (cfxv.f186080a.mo6606a().mo83055a()) {
                bxvd da2 = bzkd.f170374e.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzkd bzkd = (bzkd) da2.f164949b;
                bzkd.f170379d = 6;
                bzkd.f170376a |= 1;
                bxvd da3 = bzjy.f170360c.mo74144da();
                String b = bmwg.LOWER_UNDERSCORE.mo66826b(bmwg.UPPER_CAMEL, bmwb.m108442a(Build.MANUFACTURER));
                String str2 = Build.MODEL;
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 3 + String.valueOf(str2).length());
                sb.append(b);
                sb.append(" - ");
                sb.append(str2);
                String sb2 = sb.toString();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bzjy bzjy = (bzjy) da3.f164949b;
                sb2.getClass();
                bzjy.f170362a |= 1;
                bzjy.f170363b = sb2;
                bzjy bzjy2 = (bzjy) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bzkd bzkd2 = (bzkd) da2.f164949b;
                bzjy2.getClass();
                bzkd2.f170378c = bzjy2;
                bzkd2.f170377b = 3;
                bzkd bzkd3 = (bzkd) da2.mo74062i();
                bxvd da4 = bzkb.f170369c.mo74144da();
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bzkb bzkb = (bzkb) da4.f164949b;
                bzkd3.getClass();
                bzkb.f170372b = bzkd3;
                bzkb.f170371a |= 1;
                bzkb bzkb2 = (bzkb) da4.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzkb2.getClass();
                ((btck) da.f164949b).f148284c = bzkb2;
            }
            btck btck2 = (btck) da.mo74062i();
            try {
                this.f76216d.mo41626a();
                ampm ampm = this.f76214b;
                ClientContext clientContext = this.f76213a;
                try {
                    ampl ampl = ampm.f75684b;
                    long j = (long) ampm.f75683a;
                    if (ampl.f75669d == null) {
                        ampl.f75669d = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/DeletePeople", ciie.m150370a(btck.f148280d), ciie.m150370a(btcl.f148285a));
                    }
                    this.f76216d.mo41628a(str, list.size(), amwy.m63594a((btcl) ampl.f75682a.mo25553a(ampl.f75669d, clientContext, btck2, j, TimeUnit.MILLISECONDS)));
                } catch (gid e) {
                    e = e;
                    Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                    throw e;
                } catch (chuw e2) {
                    e = e2;
                    Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                    throw e;
                }
            } catch (chuw | gid e3) {
                Log.e("FSA2_ContactSyncGrpc", "deleteContactIds() failed.", e3);
                throw e3;
            }
        }
    }
}
