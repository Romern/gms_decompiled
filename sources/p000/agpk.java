package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: agpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agpk {

    /* renamed from: b */
    public static agpk f66239b;

    /* renamed from: c */
    public static final Object f66240c = new Object();

    /* renamed from: d */
    public static final srn f66241d = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public final agpl f66242a = new agpl(rpr.m34216b(), "MdpSimBasedDatabase");

    private agpk() {
    }

    /* renamed from: a */
    public static agpk m54726a() {
        agpk agpk;
        synchronized (f66240c) {
            if (f66239b == null) {
                f66239b = new agpk();
            }
            agpk = f66239b;
        }
        return agpk;
    }

    /* renamed from: d */
    public static boolean m54727d() {
        return cfmj.m140161j() && m54726a().mo35843c() != null;
    }

    /* renamed from: b */
    public final bxzx mo35837b(Long l, String str) {
        agpw a = this.f66242a.mo35853a(l, str);
        if (a != null) {
            return a.mo35916g();
        }
        return null;
    }

    /* renamed from: c */
    public final btap mo35841c(String str) {
        return mo35825a(mo35839b(str));
    }

    /* renamed from: e */
    public final String mo35845e(String str) {
        agpw a = this.f66242a.mo35854a(str);
        if (a == null) {
            return null;
        }
        if (!cfmd.m140086f() || a.mo35917h() == null || a.mo35917h().f165216d >= TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            return a.mo35913d();
        }
        return null;
    }

    /* renamed from: f */
    public final Long mo35846f(String str) {
        bxzz h;
        agpw a = this.f66242a.mo35854a(str);
        if (a == null || (h = a.mo35917h()) == null) {
            return null;
        }
        return Long.valueOf(h.f165216d);
    }

    /* renamed from: g */
    public final bszh mo35847g(String str) {
        agpw a = this.f66242a.mo35854a(str);
        if (a != null) {
            agps a2 = this.f66242a.mo35852a(a.mo35912c());
            if (a2 == null) {
                a.mo35912c();
                return null;
            }
            btap c = a2.mo35889c();
            if (c != null) {
                bszh bszh = c.f148033e;
                return bszh == null ? bszh.f147822d : bszh;
            }
            a.mo35912c();
        }
        return null;
    }

    /* renamed from: h */
    public final MdpDataPlanStatusResponse mo35848h(String str) {
        byte[] asByteArray;
        agpy b = this.f66242a.mo35861b(mo35851k(str), str);
        if (b == null || (asByteArray = b.mo35879a().getAsByteArray("data_plan")) == null) {
            return null;
        }
        return (MdpDataPlanStatusResponse) bjdl.m103244a(asByteArray, MdpDataPlanStatusResponse.CREATOR);
    }

    /* renamed from: i */
    public final boolean mo35849i(String str) {
        if (!agqg.m54865t().booleanValue()) {
            return true;
        }
        bxzx j = mo35850j(str);
        if (j != null) {
            bygb a = bygb.m124774a(j.f165204f);
            if (a == null) {
                a = bygb.UNRECOGNIZED;
            }
            if (a == bygb.CONSENTED) {
                return true;
            }
            bygb a2 = bygb.m124774a(j.f165204f);
            if (a2 == null) {
                a2 = bygb.UNRECOGNIZED;
            }
            if (a2 != bygb.NOT_REQUIRED) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final bxzx mo35850j(String str) {
        agpw a = this.f66242a.mo35854a(str);
        if (a != null) {
            return a.mo35916g();
        }
        return null;
    }

    /* renamed from: k */
    public final Long mo35851k(String str) {
        agpw agpw;
        agpl agpl = this.f66242a;
        if (TextUtils.isEmpty("cpid") || TextUtils.isEmpty(str)) {
            agpw = null;
        } else {
            synchronized (agpl.f66245b) {
                agpm agpm = agpl.f66244a;
                if (TextUtils.isEmpty("cpid") || TextUtils.isEmpty(str)) {
                    agpw = null;
                } else {
                    agpw = agpm.mo35863a("cpid = ?", new String[]{str});
                }
            }
        }
        if (agpw != null) {
            return agpw.mo35912c();
        }
        return null;
    }

    /* renamed from: c */
    public final bxyk mo35842c(Long l) {
        bxzw f;
        agps a = this.f66242a.mo35852a(l);
        bxyk bxyk = null;
        return (a == null || (f = a.mo35892f()) == null || (bxyk = f.f165196c) != null) ? bxyk : bxyk.f165095c;
    }

    /* renamed from: d */
    public final btas mo35844d(String str) {
        agpw a = this.f66242a.mo35854a(str);
        if (a != null) {
            return a.mo35915f();
        }
        f66241d.mo26019b(agyt.m55307c()).mo68420a("No database row for ICCID %s", str);
        return null;
    }

    /* renamed from: b */
    public final ConsentAgreementText mo35838b(Long l) {
        return this.f66242a.mo35862c(l);
    }

    /* renamed from: a */
    public final agps mo35823a(Long l, String str) {
        agps a = this.f66242a.mo35852a(l);
        if (a != null) {
            String str2 = a.mo35889c() != null ? a.mo35889c().f148032d : null;
            if (str == null || !str.equals(str2)) {
                return null;
            }
            return a;
        }
        return null;
    }

    /* renamed from: b */
    public final Long mo35839b(String str) {
        agpw a = this.f66242a.mo35854a(str);
        if (a != null) {
            return a.mo35912c();
        }
        return null;
    }

    /* renamed from: b */
    public final List mo35840b() {
        List list;
        agpl agpl = this.f66242a;
        synchronized (agpl.f66245b) {
            agpm agpm = agpl.f66244a;
            agpm.mo35864a("SimCardTable", "expiration_time");
            try {
                Cursor query = agpm.getReadableDatabase().query("SimCardTable", new String[]{"iccid"}, null, null, null, null, null);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (query.moveToNext()) {
                        arrayList.add(query.getString(query.getColumnIndex("iccid")));
                    }
                    list = Collections.unmodifiableList(arrayList);
                    if (query != null) {
                        query.close();
                    }
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (SQLiteException e) {
                bnsl bnsl = (bnsl) agpm.f66246a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Cannot get readable SQLite database");
                list = Collections.emptyList();
            }
        }
        return list;
        throw th;
    }

    /* renamed from: c */
    public final bxzx mo35843c() {
        agpu b = this.f66242a.mo35860b(1L);
        if (b != null) {
            return b.mo35897c();
        }
        return null;
    }

    /* renamed from: a */
    public final Bitmap mo35824a(Long l, int i) {
        agps a = this.f66242a.mo35852a(l);
        if (a == null) {
            return null;
        }
        if (i - 1 != 0) {
            return a.mo35890d();
        }
        byte[] asByteArray = a.mo35868a().getAsByteArray("carrier_app_logo");
        if (asByteArray != null) {
            return BitmapFactory.decodeByteArray(asByteArray, 0, asByteArray.length);
        }
        return null;
    }

    /* renamed from: a */
    public final btap mo35825a(Long l) {
        agps a = this.f66242a.mo35852a(l);
        if (a != null) {
            return a.mo35889c();
        }
        return null;
    }

    /* renamed from: a */
    public final String mo35826a(String str) {
        btap c;
        agps a = this.f66242a.mo35852a(mo35839b(str));
        if (a == null || (c = a.mo35889c()) == null) {
            return null;
        }
        return stm.m36300b(c.f148031c);
    }

    /* renamed from: a */
    public final boolean mo35827a(bxzx bxzx) {
        agpl agpl = this.f66242a;
        agpu b = agpl.mo35860b(1L);
        if (b == null) {
            agpt agpt = new agpt();
            agpt.mo35895a((Long) 1L);
            agpt.mo35894a(bxzx);
            b = agpt.mo35893a();
        }
        agpt e = b.mo35899e();
        e.mo35894a(bxzx);
        return agpl.mo35856a(e.mo35893a());
    }

    /* renamed from: a */
    public final boolean mo35828a(bygb bygb, String str) {
        bxvd bxvd;
        agpl agpl = this.f66242a;
        agpu b = agpl.mo35860b(1L);
        if (b == null) {
            agpt agpt = new agpt();
            agpt.mo35895a((Long) 1L);
            b = agpt.mo35893a();
        }
        if (b.mo35897c() != null) {
            bxzx c = b.mo35897c();
            bxvd = (bxvd) c.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) c);
        } else {
            bxvd = bxzx.f165197j.mo74144da();
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxzx bxzx = bxzx.f165197j;
        ((bxzx) bxvd.f164949b).f165204f = bygb.mo3214a();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        str.getClass();
        ((bxzx) bxvd.f164949b).f165201c = str;
        long currentTimeMillis = System.currentTimeMillis();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((bxzx) bxvd.f164949b).f165205g = currentTimeMillis;
        agpt e = b.mo35899e();
        e.mo35894a((bxzx) bxvd.mo74062i());
        return agpl.mo35856a(e.mo35893a());
    }

    /* renamed from: a */
    public final boolean mo35829a(Long l, bygb bygb) {
        bxvd bxvd;
        agpl agpl = this.f66242a;
        agps a = agpl.mo35852a(l);
        if (a == null) {
            return false;
        }
        if (a.mo35892f() != null) {
            bxzw f = a.mo35892f();
            bxvd = (bxvd) f.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) f);
        } else {
            bxvd = bxzw.f165192d.mo74144da();
        }
        agpr agpr = new agpr();
        agpr.mo35887a(l);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxzw bxzw = bxzw.f165192d;
        ((bxzw) bxvd.f164949b).f165195b = bygb.mo3214a();
        agpr.mo35886a((bxzw) bxvd.mo74062i());
        return agpl.mo35855a(agpr.mo35883a());
    }

    /* renamed from: a */
    public final boolean mo35830a(Long l, ConsentAgreementText consentAgreementText) {
        bxvd bxvd;
        agpl agpl = this.f66242a;
        bxyk a = bxzt.m124580a(System.currentTimeMillis());
        agps a2 = agpl.mo35852a(l);
        if (a2 == null) {
            return false;
        }
        if (a2.mo35892f() != null) {
            bxzw f = a2.mo35892f();
            bxvd = (bxvd) f.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) f);
        } else {
            bxvd = bxzw.f165192d.mo74144da();
        }
        ByteString a3 = ByteString.m123261a(sef.m35074a(consentAgreementText));
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxzw bxzw = (bxzw) bxvd.f164949b;
        bxzw bxzw2 = bxzw.f165192d;
        a3.getClass();
        bxzw.f165194a = a3;
        a.getClass();
        bxzw.f165196c = a;
        agpr agpr = new agpr();
        agpr.mo35887a(l);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        a.getClass();
        ((bxzw) bxvd.f164949b).f165196c = a;
        agpr.mo35886a((bxzw) bxvd.mo74062i());
        return agpl.mo35855a(agpr.mo35883a());
    }

    /* renamed from: a */
    public final boolean mo35831a(Long l, String str, bxzx bxzx) {
        agpl agpl = this.f66242a;
        agpw a = agpl.mo35853a(l, str);
        if (a == null) {
            return false;
        }
        agpv i = a.mo35918i();
        i.mo35901a(bxzx);
        return agpl.mo35857a(i.mo35900a());
    }

    /* renamed from: a */
    public final boolean mo35832a(String str, btap btap) {
        agps a;
        String str2;
        agpl agpl = this.f66242a;
        agpv agpv = new agpv();
        agpv.mo35904a(Long.valueOf(btap.f148030b));
        agpv.mo35908b(str);
        boolean a2 = agpl.mo35857a(agpv.mo35900a());
        agpr agpr = new agpr();
        agpr.mo35887a(Long.valueOf(btap.f148030b));
        agpr.mo35885a(btap);
        if (cfmd.f184339a.mo6606a().mo81461m() && (a = agpl.mo35852a(Long.valueOf(btap.f148030b))) != null) {
            if (a.mo35889c() != null) {
                str2 = a.mo35889c().f148032d;
            } else {
                str2 = null;
            }
            String str3 = btap.f148032d;
            if (TextUtils.isEmpty(str3) || !str3.equals(str2)) {
                agpr.mo35884a((Bitmap) null);
            }
        }
        boolean a3 = agpl.mo35855a(agpr.mo35883a());
        agpr.mo35883a();
        return a2 && a3;
    }

    /* renamed from: a */
    public final boolean mo35833a(String str, btas btas) {
        byte[] bArr;
        if (this.f66242a.mo35854a(str) == null) {
            return false;
        }
        agpv agpv = new agpv();
        agpv.mo35908b(str);
        if (btas != null) {
            bArr = btas.serializeToBytes();
        } else {
            bArr = null;
        }
        agpv.mo35909b(bArr);
        return this.f66242a.mo35857a(agpv.mo35900a());
    }

    /* renamed from: a */
    public final boolean mo35834a(String str, MdpDataPlanStatusResponse mdpDataPlanStatusResponse) {
        byte[] bArr;
        agpx agpx = new agpx();
        agpx.mo35922a(str);
        agpx.mo35921a(mo35851k(str));
        ContentValues contentValues = agpx.f66258a;
        if (mdpDataPlanStatusResponse != null) {
            bArr = bjdl.m103245a(mdpDataPlanStatusResponse);
        } else {
            bArr = null;
        }
        contentValues.put("data_plan", bArr);
        return this.f66242a.mo35858a(agpx.mo35920a());
    }

    /* renamed from: a */
    public final boolean mo35835a(String str, Long l, String str2, long j) {
        return this.f66242a.mo35859a(str, l, str2, j);
    }

    /* renamed from: a */
    public final boolean mo35836a(String str, String str2, String str3) {
        bxvd bxvd;
        agpl agpl = this.f66242a;
        agpw a = agpl.mo35854a(str);
        if (a == null || a.mo35917h() == null) {
            bxvd = bxzz.f165211e.mo74144da();
        } else {
            bxzz h = a.mo35917h();
            bxvd = (bxvd) h.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) h);
        }
        if (str2 == null || str2.length() != 3 || str3 == null) {
            return false;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxzz bxzz = (bxzz) bxvd.f164949b;
        bxzz bxzz2 = bxzz.f165211e;
        str2.getClass();
        bxzz.f165213a = str2;
        str3.getClass();
        bxzz.f165214b = str3;
        agpv agpv = new agpv();
        agpv.mo35908b(str);
        agpv.mo35902a((bxzz) bxvd.mo74062i());
        return agpl.mo35857a(agpv.mo35900a());
    }
}
