package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: agrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrl {

    /* renamed from: a */
    private static final ThreadLocal f66310a = new agrk();

    /* renamed from: b */
    private static final long f66311b = m54941a("1970-01-01T00:00:00.000+00:00");

    /* renamed from: e */
    private static final srn f66312e = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: c */
    private final qws f66313c;

    /* renamed from: d */
    private final Context f66314d;

    private agrl(Context context) {
        this.f66314d = context;
        if (context == null) {
            f66312e.mo26019b(agyt.m55307c()).mo68405a("Failed to create Clearcut logger without context");
            this.f66313c = null;
            return;
        }
        this.f66313c = new qws(context, "MOBILE_DATA_PLAN", null);
    }

    /* renamed from: a */
    private static int m54940a(long j) {
        int i = 0;
        if (j < 0) {
            return 0;
        }
        while (i < cfmq.m140232c().f165794a.size()) {
            if (j < cfmq.m140232c().f165794a.mo74160a(i)) {
                return i + 1;
            }
            i++;
        }
        return i + 1;
    }

    /* renamed from: b */
    private static int m54946b(long j) {
        int i = 0;
        if (j < 0) {
            return 0;
        }
        while (i < cfmq.m140233d().f165794a.size()) {
            if (j < cfmq.m140233d().f165794a.mo74160a(i)) {
                return i;
            }
            i++;
        }
        return i + 1;
    }

    /* renamed from: c */
    public static int m54949c() {
        return UUID.randomUUID().hashCode();
    }

    /* renamed from: d */
    private static String m54951d(String str) {
        if (str != null) {
            return str.length() > 32 ? str.substring(0, 32) : str;
        }
        return null;
    }

    /* renamed from: c */
    private static String m54950c(String str) {
        if (str.length() != 29 || str.charAt(26) != ':') {
            return str;
        }
        String valueOf = String.valueOf(str.substring(0, 26));
        String valueOf2 = String.valueOf(str.substring(27));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: a */
    public static long m54941a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return ((DateFormat) f66310a.get()).parse(m54950c(str)).getTime();
        } catch (ParseException e) {
            ((bnsl) f66312e.mo68388c()).mo68420a("Bad RFC-3339 date: %s", e);
            return -1;
        }
    }

    /* renamed from: b */
    public static long m54947b() {
        return UUID.randomUUID().getLeastSignificantBits();
    }

    /* renamed from: b */
    public static long m54948b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            DateFormat dateFormat = (DateFormat) f66310a.get();
            String valueOf = String.valueOf(str);
            return dateFormat.parse(m54950c(valueOf.length() == 0 ? new String("1970-01-01T") : "1970-01-01T".concat(valueOf))).getTime() - f66311b;
        } catch (ParseException e) {
            ((bnsl) f66312e.mo68388c()).mo68420a("Bad RFC-3339 time: %s", e);
            return -1;
        }
    }

    /* renamed from: a */
    public static agrl m54942a() {
        return new agrl(rpr.m34216b());
    }

    /* renamed from: a */
    public static agrl m54943a(Context context) {
        return new agrl(context);
    }

    /* renamed from: a */
    private final boot m54944a(int i, String str, String str2, long j) {
        int i2;
        bxvd da = boot.f133997z.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boot) da.f164949b).f133998a = i - 2;
        if (str2 == null) {
            str2 = "";
        }
        boot boot = (boot) da.f164949b;
        str2.getClass();
        boot.f133999b = str2;
        str.getClass();
        boot.f134002e = str;
        Context context = this.f66314d;
        if (context != null) {
            i2 = agyq.m55284e(context) ? !agyq.m55281c(this.f66314d) ? 5 : 6 : !agyq.m55281c(this.f66314d) ? 3 : 4;
        } else {
            i2 = 2;
        }
        bxvd da2 = bood.f133892k.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bood) da2.f164949b).f133894a = j;
        int a = agyu.m55308a(this.f66314d);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bood bood = (bood) da2.f164949b;
        bood.f133897d = a;
        "MDP Module".getClass();
        bood.f133895b = "MDP Module";
        bood.f133898e = i2 - 2;
        if (cfmq.f184403a.mo6606a().mo81527t()) {
            String b = agyt.m55303b(stm.m36299a(this.f66314d != null ? agqz.m54893a().mo35966a(this.f66314d) : null));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((bood) da2.f164949b).f133896c = b;
        }
        if (cfmq.f184403a.mo6606a().mo81523p()) {
            String a2 = stm.m36299a(agyq.m55285f(this.f66314d));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a2.getClass();
            ((bood) da2.f164949b).f133902i = a2;
            List g = agyq.m55286g(this.f66314d);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bood bood2 = (bood) da2.f164949b;
            if (!bood2.f133903j.mo73666a()) {
                bood2.f133903j = GeneratedMessageLite.m124021a(bood2.f133903j);
            }
            bxsy.m123078a(g, bood2.f133903j);
        }
        bood bood3 = (bood) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bood3.getClass();
        ((boot) da.f164949b).f134001d = bood3;
        return (boot) da.mo74062i();
    }

    /* renamed from: a */
    public static void m54945a(bxvd bxvd, Bundle bundle) {
        if (bundle != null) {
            bood bood = ((boot) bxvd.f164949b).f134001d;
            if (bood == null) {
                bood = bood.f133892k;
            }
            bxvd bxvd2 = (bxvd) bood.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) bood);
            if (!bundle.getString("client_package_name", "").isEmpty()) {
                String string = bundle.getString("client_package_name");
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                string.getClass();
                ((bood) bxvd2.f164949b).f133899f = string;
            }
            if (!bundle.getString("client_version_name", "").isEmpty()) {
                String string2 = bundle.getString("client_version_name");
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                string2.getClass();
                ((bood) bxvd2.f164949b).f133900g = string2;
            }
            if (bundle.getLong("client_version_code") != 0) {
                long j = bundle.getLong("client_version_code");
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                ((bood) bxvd2.f164949b).f133901h = j;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bood bood2 = (bood) bxvd2.mo74062i();
            boot boot = boot.f133997z;
            bood2.getClass();
            ((boot) bxvd.f164949b).f134001d = bood2;
        }
    }

    /* renamed from: a */
    public final boot mo35978a(int i, String str, String str2) {
        return m54944a(i, str, str2, agyt.m55299a(this.f66314d));
    }

    /* renamed from: a */
    public final void mo35979a(int i, int i2) {
        agza agza;
        agrl agrl = this;
        boot a = agrl.mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        agza agza2 = new agza();
        ArrayList arrayList = new ArrayList();
        bxzv[] values = bxzv.values();
        int length = values.length;
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            bxzv bxzv = values[i3];
            if (!(bxzv == bxzv.UNRECOGNIZED || bxzv == bxzv.TASK_UNKNOWN)) {
                bxvd da = bonu.f133857c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = z;
                }
                ((bonu) da.f164949b).f133859a = bxzv.mo3214a();
                agzf agzf = new agzf(agza2.f66897b.getLong(bxzv.name(), 0));
                bxzu[] values2 = bxzu.values();
                int length2 = values2.length;
                int i4 = 0;
                while (i4 < length2) {
                    bxzu bxzu = values2[i4];
                    if (bxzu != bxzu.UNRECOGNIZED) {
                        agza = agza2;
                        if ((((long) (1 << bxzu.mo3214a())) | agzf.f66903a) == agzf.f66903a) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bonu bonu = (bonu) da.f164949b;
                            bxzu.getClass();
                            if (!bonu.f133860b.mo73666a()) {
                                bonu.f133860b = GeneratedMessageLite.m124019a(bonu.f133860b);
                            }
                            bonu.f133860b.mo74153d(bxzu.mo3214a());
                        }
                    } else {
                        agza = agza2;
                    }
                    i4++;
                    agza2 = agza;
                }
                arrayList.add((bonu) da.mo74062i());
            }
            i3++;
            agrl = this;
            agza2 = agza2;
            z = false;
        }
        bxvd da2 = bonz.f133873h.mo74144da();
        bxvd da3 = bonv.f133861c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = z;
        }
        ((bonv) da3.f164949b).f133863a = i - 2;
        bonv bonv = (bonv) da3.f164949b;
        if (!bonv.f133864b.mo73666a()) {
            bonv.f133864b = GeneratedMessageLite.m124021a(bonv.f133864b);
        }
        bxsy.m123078a(arrayList, bonv.f133864b);
        bonv bonv2 = (bonv) da3.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = z;
        }
        bonv2.getClass();
        ((bonz) da2.f164949b).f133878d = bonv2;
        bonz bonz = (bonz) da2.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = z;
        }
        boot boot = boot.f133997z;
        bonz.getClass();
        ((boot) bxvd.f164949b).f134017t = bonz;
        agrl.mo35995a((boot) bxvd.mo74062i(), bygd.RUN_PERIODIC_WORKFLOW, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo35980a(int i, int i2, boolean z, int i3, String str, bygd bygd, int i4, int i5, Integer num, Long l) {
        bxvd da = boog.f133908g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boog) da.f164949b).f133910a = boof.m111384a(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boog boog = (boog) da.f164949b;
        boog.f133911b = z;
        boog.f133912c = i3;
        str.getClass();
        boog.f133913d = str;
        boog.f133914e = i4;
        boog.f133915f = i5;
        boog boog2 = (boog) da.mo74062i();
        bxvd da2 = boon.f133951i.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((boon) da2.f164949b).f133953a = bool.m111393a(i);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boog2.getClass();
        ((boon) da2.f164949b).f133960h = boog2;
        boon boon = (boon) da2.mo74062i();
        boot a = mo35978a(17, i != 6 ? "GTAF_Server" : "Error", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        long longValue = l.longValue();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        boot.f134015r = longValue;
        boon.getClass();
        boot.f134013p = boon;
        mo35995a((boot) bxvd.mo74062i(), bygd, num);
    }

    /* renamed from: a */
    public final void mo35981a(int i, boom boom, booa booa) {
        boot a = mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(i);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133954b = boom.mo3214a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booa.getClass();
        ((boon) da.f164949b).f133955c = booa;
        boon boon = (boon) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        boon.getClass();
        ((boot) bxvd.f164949b).f134013p = boon;
        mo35994a((boot) bxvd.mo74062i(), bygd.BG_TRIGGERING_EVENT);
    }

    /* renamed from: a */
    public final void mo35982a(int i, bygd bygd) {
        boot a = mo35978a(21, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = booq.f133980c.mo74144da();
        ArrayList arrayList = new ArrayList();
        for (agzc agzc : agyq.m55295p(this.f66314d)) {
            bxvd da2 = bopk.f134134f.mo74144da();
            String b = agzc.mo36194b();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            b.getClass();
            ((bopk) da2.f164949b).f134136a = b;
            boolean d = agzc.mo36196d();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bopk) da2.f164949b).f134137b = d;
            long c = agzc.mo36195c();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bopk) da2.f164949b).f134138c = c;
            arrayList.add((bopk) da2.mo74062i());
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booq booq = (booq) da.f164949b;
        if (!booq.f133983b.mo73666a()) {
            booq.f133983b = GeneratedMessageLite.m124021a(booq.f133983b);
        }
        bxsy.m123078a(arrayList, booq.f133983b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((booq) da.f164949b).f133982a = i - 2;
        booq booq2 = (booq) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        booq2.getClass();
        ((boot) bxvd.f164949b).f134018u = booq2;
        mo35994a((boot) bxvd.mo74062i(), bygd);
    }

    /* renamed from: a */
    public final void mo35983a(int i, bygd bygd, Integer num, Long l) {
        long j;
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(i);
        boon boon = (boon) da.mo74062i();
        boot a = mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        boot.f134015r = j;
        boon.getClass();
        boot.f134013p = boon;
        mo35995a((boot) bxvd.mo74062i(), bygd, num);
    }

    /* renamed from: a */
    public final void mo35984a(int i, Integer num, int i2, bygd bygd, long j, Integer num2) {
        bxvd da = bopn.f134145h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bopn bopn = (bopn) da.f164949b;
        bopn.f134150d = j;
        bopn.f134149c = bopm.m111422a(i);
        if (num != null) {
            int intValue = num.intValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bopn) da.f164949b).f134152f = intValue;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bopn) da.f164949b).f134153g = i2;
        mo35996a((bopn) da.mo74062i(), bygd, num2);
    }

    /* renamed from: a */
    public final void mo35985a(int i, Integer num, Long l) {
        mo35980a(6, i, false, 0, "", bygd.BACKGROUND_CONSENT_FAILURE, 0, 0, num, l);
    }

    /* renamed from: a */
    public final void mo35986a(int i, String str, Integer num, Long l) {
        long j;
        boot a = mo35978a(28, "Error", str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = boph.f134120d.mo74144da();
        bxvd da2 = bopg.f134117b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bopg) da2.f164949b).f134119a = i;
        bopg bopg = (bopg) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bopg.getClass();
        ((boph) da.f164949b).f134124c = bopg;
        boph boph = (boph) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        boph.getClass();
        ((boot) bxvd.f164949b).f134022y = boph;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boot) bxvd.f164949b).f134015r = j;
        mo35995a((boot) bxvd.mo74062i(), bygd.LIST_CPID_ENDPOINTS_ERROR, num);
    }

    /* renamed from: a */
    public final void mo35987a(int i, String str, String str2, bygd bygd, long j, Integer num) {
        mo35988a(i, str, str2, (Long) null, bygd, j, num);
    }

    /* renamed from: a */
    public final void mo35988a(int i, String str, String str2, Long l, bygd bygd, long j, Integer num) {
        bxvd da = bopn.f134145h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bopn bopn = (bopn) da.f164949b;
        bopn.f134150d = j;
        bopn.f134149c = bopm.m111422a(i);
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((bopn) da.f164949b).f134148b = str;
        }
        if (str2 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((bopn) da.f164949b).f134147a = str2;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bopn) da.f164949b).f134151e = longValue;
        }
        mo35996a((bopn) da.mo74062i(), bygd, num);
    }

    /* renamed from: a */
    public final void mo35989a(long j, long j2, int i, long j3) {
        boot a = mo35978a(17, "Error", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        ((boot) bxvd.f164949b).f134015r = j3;
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(6);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boon boon = (boon) da.f164949b;
        boon.f133957e = j;
        boon.f133956d = j2;
        boon boon2 = (boon) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boon2.getClass();
        ((boot) bxvd.f164949b).f134013p = boon2;
        mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_CPID_RESPONSE_FAILURE, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo35990a(Intent intent, boox boox, String str, bygd bygd) {
        String str2;
        int i;
        bxvd da = bwbv.f158777g.mo74144da();
        if (intent != null) {
            long longExtra = intent.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bwbv) da.f164949b).f158781c = longExtra;
            bxvd da2 = bwbt.f158758k.mo74144da();
            if (intent.getStringExtra("NOTIFICATION_LOGGING_REQUESTING_CPID") != null) {
                str2 = intent.getStringExtra("NOTIFICATION_LOGGING_REQUESTING_CPID");
            } else {
                str2 = "";
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str2.getClass();
            ((bwbt) da2.f164949b).f158763d = str2;
            int b = bwcc.m121742b(intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_GENRE", 0));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bwbt) da2.f164949b).f158766g = bwcc.m121741a(b);
            if (cfmq.f184403a.mo6606a().mo81512e()) {
                bszx a = bszx.m116352a(intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                int ordinal = bwbu.m121732a(intent.getIntExtra("NOTIFICATION_LOGGING_MESSAGE_CASE", bwbu.MESSAGEBODY_NOT_SET.f158776f)).ordinal();
                if (ordinal == 0) {
                    bxvd da3 = bwby.f158793d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bwbt bwbt = (bwbt) da2.mo74062i();
                    bwbt.getClass();
                    ((bwby) da3.f164949b).f158797c = bwbt;
                    bwby bwby = (bwby) da3.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwbv bwbv = (bwbv) da.f164949b;
                    bwby.getClass();
                    bwbv.f158780b = bwby;
                    bwbv.f158779a = 2;
                } else if (ordinal == 1) {
                    bxvd da4 = bwbz.f158798d.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bwbt bwbt2 = (bwbt) da2.mo74062i();
                    bwbt2.getClass();
                    ((bwbz) da4.f164949b).f158802c = bwbt2;
                    bwbz bwbz = (bwbz) da4.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwbv bwbv2 = (bwbv) da.f164949b;
                    bwbz.getClass();
                    bwbv2.f158780b = bwbz;
                    bwbv2.f158779a = 3;
                } else if (ordinal == 2) {
                    bxvd da5 = bwbw.f158785c.mo74144da();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bwbt bwbt3 = (bwbt) da2.mo74062i();
                    bwbt3.getClass();
                    ((bwbw) da5.f164949b).f158788b = bwbt3;
                    bwbw bwbw = (bwbw) da5.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwbv bwbv3 = (bwbv) da.f164949b;
                    bwbw.getClass();
                    bwbv3.f158780b = bwbw;
                    bwbv3.f158779a = 4;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bwbv) da.f164949b).f158782d = a.mo3214a();
            } else {
                int b2 = booy.m111408b(intent.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                if (b2 == 3) {
                    bxvd da6 = bwby.f158793d.mo74144da();
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bwbt bwbt4 = (bwbt) da2.mo74062i();
                    bwbt4.getClass();
                    ((bwby) da6.f164949b).f158797c = bwbt4;
                    bwby bwby2 = (bwby) da6.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwbv bwbv4 = (bwbv) da.f164949b;
                    bwby2.getClass();
                    bwbv4.f158780b = bwby2;
                    bwbv4.f158779a = 2;
                } else if (b2 == 4) {
                    bxvd da7 = bwbz.f158798d.mo74144da();
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    bwbt bwbt5 = (bwbt) da2.mo74062i();
                    bwbt5.getClass();
                    ((bwbz) da7.f164949b).f158802c = bwbt5;
                    bwbz bwbz2 = (bwbz) da7.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwbv bwbv5 = (bwbv) da.f164949b;
                    bwbz2.getClass();
                    bwbv5.f158780b = bwbz2;
                    bwbv5.f158779a = 3;
                } else if (b2 == 5 && cfnf.f184517a.mo6606a().mo81639f()) {
                    bxvd da8 = bwbw.f158785c.mo74144da();
                    if (da8.f164950c) {
                        da8.mo74035c();
                        da8.f164950c = false;
                    }
                    bwbt bwbt6 = (bwbt) da2.mo74062i();
                    bwbt6.getClass();
                    ((bwbw) da8.f164949b).f158788b = bwbt6;
                    bwbw bwbw2 = (bwbw) da8.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwbv bwbv6 = (bwbv) da.f164949b;
                    bwbw2.getClass();
                    bwbv6.f158780b = bwbw2;
                    bwbv6.f158779a = 4;
                }
            }
            if (cfnf.m140508i()) {
                String[] stringArrayExtra = intent.getStringArrayExtra("NOTIFICATION_ACTION_LABELS");
                int[] intArrayExtra = intent.getIntArrayExtra("NOTIFICATION_ACTION_TYPES");
                if (!(stringArrayExtra == null || intArrayExtra == null)) {
                    int length = stringArrayExtra.length;
                    int length2 = intArrayExtra.length;
                    if (length != length2) {
                        ((bnsl) f66312e.mo68388c()).mo68425a("%s: Action label and action type arrays are different lengths! Labels: %s Types: %s", "CCLog", bryx.m114908a(Integer.valueOf(length)), bryx.m114908a(Integer.valueOf(length2)));
                        i = 0;
                    } else {
                        i = 0;
                    }
                    while (i < Math.min(intArrayExtra.length, stringArrayExtra.length)) {
                        String str3 = stringArrayExtra[i];
                        int i2 = intArrayExtra[i];
                        if (str3 == null) {
                            ((bnsl) f66312e.mo68388c()).mo68424a("%s: Null action label for type %s", "CCLog", bryx.m114908a(Integer.valueOf(i2)));
                        } else if (bwcb.m121740b(i2) == 1) {
                            ((bnsl) f66312e.mo68388c()).mo68425a("%s: Unrecognized action type %s for label %s", "CCLog", bryx.m114908a(Integer.valueOf(i2)), bryx.m114908a(str3));
                        } else {
                            bxvd da9 = bwca.f158803c.mo74144da();
                            if (da9.f164950c) {
                                da9.mo74035c();
                                da9.f164950c = false;
                            }
                            bwca bwca = (bwca) da9.f164949b;
                            str3.getClass();
                            bwca.f158806b = str3;
                            bwca.f158805a = i2;
                            bwca bwca2 = (bwca) da9.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwbv bwbv7 = (bwbv) da.f164949b;
                            bwca2.getClass();
                            if (!bwbv7.f158784f.mo73666a()) {
                                bwbv7.f158784f = GeneratedMessageLite.m124021a(bwbv7.f158784f);
                            }
                            bwbv7.f158784f.add(bwca2);
                        }
                        i++;
                    }
                }
                mo36000a((bwbv) da.mo74062i(), boox, str, bygd, 0, 0, intent.getIntExtra("NOTIFICATION_ACTION_INDEX", -1));
                return;
            }
        }
        mo35998a((bwbv) da.mo74062i(), boox, str, bygd);
    }

    /* renamed from: a */
    public final void mo35991a(Bundle bundle, bygd bygd, long j, String str, String str2, Integer num, Long l) {
        boot a = mo35978a(2, "Error", str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        mo36001a(bxvd, bundle, bygd, j, str2, num, l);
    }

    /* renamed from: a */
    public final void mo35992a(booc booc, String str, Integer num) {
        boot a = mo35978a(19, "GTAF_Server", str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (booc != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            booc.getClass();
            ((boot) bxvd.f164949b).f134016s = booc;
        }
        mo35995a((boot) bxvd.mo74062i(), bygd.CACHING_SAVE_ATTEMPT, num);
    }

    /* renamed from: a */
    public final void mo35993a(booj booj, Integer num, Long l) {
        booh booh = (booh) booj.f133916p.mo74141a(booj);
        String b = agyt.m55303b(stm.m36299a(booj.f133918a));
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        b.getClass();
        ((booj) booh.f164949b).f133918a = b;
        booj booj2 = (booj) booh.mo74062i();
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(8);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booj2.getClass();
        ((boon) da.f164949b).f133959g = booj2;
        boon boon = (boon) da.mo74062i();
        boot a = mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        long longValue = l.longValue();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        boot.f134015r = longValue;
        boon.getClass();
        boot.f134013p = boon;
        mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, num);
    }

    /* renamed from: a */
    public final void mo35994a(boot boot, bygd bygd) {
        mo35995a(boot, bygd, (Integer) null);
    }

    /* renamed from: a */
    public final void mo35995a(boot boot, bygd bygd, Integer num) {
        f66312e.mo26019b(agyt.m55307c()).mo68424a("%s: eventCode: %s", "CCLog", bygd == null ? "null" : bygd.name());
        if (!cfmq.m140247r() || num == null) {
            num = 0;
        }
        if (this.f66313c != null && cfmv.f184430a.mo6606a().mo81586k()) {
            f66312e.mo26019b(agyt.m55307c()).mo68424a("%s: mdpEvent: %s", "CCLog", boot);
            qwo a = this.f66313c.mo24333a(boot);
            a.mo24328b(bygd.f166288cs);
            a.mo24323a((long) num.intValue());
            a.mo24327b();
            return;
        }
        ((bnsl) f66312e.mo68388c()).mo68424a("%s: eventCode: %s logging FAILED", "CCLog", bygd);
    }

    /* renamed from: a */
    public final void mo35996a(bopn bopn, bygd bygd, Integer num) {
        bxvd da = boou.f134023b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boou boou = (boou) da.f164949b;
        bopn.getClass();
        if (!boou.f134025a.mo73666a()) {
            boou.f134025a = GeneratedMessageLite.m124021a(boou.f134025a);
        }
        boou.f134025a.add(bopn);
        boou boou2 = (boou) da.mo74062i();
        if (boou2 != null) {
            boot a = mo35978a(9, "Ui", "MDP_UiAction");
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            boou2.getClass();
            ((boot) bxvd.f164949b).f134010m = boou2;
            mo35995a((boot) bxvd.mo74062i(), bygd, num);
        }
    }

    /* renamed from: a */
    public final void mo35997a(btap btap, String str) {
        boot a = mo35978a(27, "GTAF_Server", str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = boph.f134120d.mo74144da();
        bxvd da2 = bopf.f134114b.mo74144da();
        long j = btap.f148030b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bopf) da2.f164949b).f134116a = j;
        bopf bopf = (bopf) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bopf.getClass();
        ((boph) da.f164949b).f134123b = bopf;
        boph boph = (boph) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        boph.getClass();
        boot.f134022y = boph;
        boot.f134015r = btap.f148034f;
        mo35995a((boot) bxvd.mo74062i(), bygd.LIST_CPID_ENDPOINTS_RESPONSE, Integer.valueOf(btap.f148035g));
    }

    /* renamed from: a */
    public final void mo35998a(bwbv bwbv, boox boox, String str, bygd bygd) {
        mo35999a(bwbv, boox, str, bygd, 0, 0);
    }

    /* renamed from: a */
    public final void mo35999a(bwbv bwbv, boox boox, String str, bygd bygd, long j, long j2) {
        mo36000a(bwbv, boox, str, bygd, j, j2, -1);
    }

    /* renamed from: a */
    public final void mo36000a(bwbv bwbv, boox boox, String str, bygd bygd, long j, long j2, int i) {
        bwby bwby;
        bwby bwby2;
        bwby bwby3;
        bwbz bwbz;
        bwbz bwbz2;
        bwbz bwbz3;
        bwbw bwbw;
        bwbw bwbw2;
        bwbw bwbw3;
        bwbx bwbx;
        bwbv bwbv2 = bwbv != null ? bwbv : bwbv.f158777g;
        boot a = mo35978a(12, "GTAF_Server", str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = booz.f134072l.mo74144da();
        if (boox != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134075b = boox.mo3214a();
        }
        long j3 = bwbv2.f158781c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((booz) da.f164949b).f134074a = j3;
        if (bwbu.m121732a(bwbv2.f158779a) == bwbu.MSG_PLAN_STATUS_UPDATE) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134076c = booy.m111407a(3);
            if (bwbv2.f158779a != 2) {
                bwby = bwby.f158793d;
            } else {
                bwby = (bwby) bwbv2.f158780b;
            }
            bxyk bxyk = bwby.f158796b;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxyk.getClass();
            ((booz) da.f164949b).f134080g = bxyk;
            if (bwbv2.f158779a == 2) {
                bwby2 = (bwby) bwbv2.f158780b;
            } else {
                bwby2 = bwby.f158793d;
            }
            if (bwby2.f158797c != null) {
                if (bwbv2.f158779a == 2) {
                    bwby3 = (bwby) bwbv2.f158780b;
                } else {
                    bwby3 = bwby.f158793d;
                }
                bwbt bwbt = bwby3.f158797c;
                if (bwbt == null) {
                    bwbt = bwbt.f158758k;
                }
                String str2 = bwbt.f158760a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str2.getClass();
                ((booz) da.f164949b).f134077d = str2;
                String d = m54951d(bwbt.f158761b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                d.getClass();
                ((booz) da.f164949b).f134078e = d;
                int b = bwcc.m121742b(bwbt.f158766g);
                if (b == 0) {
                    b = 1;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booz) da.f164949b).f134079f = bwcc.m121741a(b);
                String str3 = bwbt.f158763d;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot = boot.f133997z;
                str3.getClass();
                ((boot) bxvd.f164949b).f134000c = str3;
            }
        } else if (bwbu.m121732a(bwbv2.f158779a) == bwbu.MSG_UPSELL_OFFER) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134076c = booy.m111407a(4);
            if (bwbv2.f158779a != 3) {
                bwbz = bwbz.f158798d;
            } else {
                bwbz = (bwbz) bwbv2.f158780b;
            }
            bxyk bxyk2 = bwbz.f158801b;
            if (bxyk2 == null) {
                bxyk2 = bxyk.f165095c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxyk2.getClass();
            ((booz) da.f164949b).f134080g = bxyk2;
            if (bwbv2.f158779a == 3) {
                bwbz2 = (bwbz) bwbv2.f158780b;
            } else {
                bwbz2 = bwbz.f158798d;
            }
            if (bwbz2.f158802c != null) {
                if (bwbv2.f158779a == 3) {
                    bwbz3 = (bwbz) bwbv2.f158780b;
                } else {
                    bwbz3 = bwbz.f158798d;
                }
                bwbt bwbt2 = bwbz3.f158802c;
                if (bwbt2 == null) {
                    bwbt2 = bwbt.f158758k;
                }
                String str4 = bwbt2.f158760a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str4.getClass();
                ((booz) da.f164949b).f134077d = str4;
                String d2 = m54951d(bwbt2.f158761b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                d2.getClass();
                ((booz) da.f164949b).f134078e = d2;
                String str5 = bwbt2.f158763d;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot2 = boot.f133997z;
                str5.getClass();
                ((boot) bxvd.f164949b).f134000c = str5;
                int b2 = bwcc.m121742b(bwbt2.f158766g);
                if (b2 == 0) {
                    b2 = 1;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booz) da.f164949b).f134079f = bwcc.m121741a(b2);
            }
        } else if (bwbu.m121732a(bwbv2.f158779a) == bwbu.ACCOUNT_ALERT) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134076c = booy.m111407a(5);
            if (bwbv2.f158779a != 4) {
                bwbw = bwbw.f158785c;
            } else {
                bwbw = (bwbw) bwbv2.f158780b;
            }
            bxyk bxyk3 = bwbw.f158787a;
            if (bxyk3 == null) {
                bxyk3 = bxyk.f165095c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxyk3.getClass();
            ((booz) da.f164949b).f134080g = bxyk3;
            if (bwbv2.f158779a == 4) {
                bwbw2 = (bwbw) bwbv2.f158780b;
            } else {
                bwbw2 = bwbw.f158785c;
            }
            if (bwbw2.f158788b != null) {
                if (bwbv2.f158779a == 4) {
                    bwbw3 = (bwbw) bwbv2.f158780b;
                } else {
                    bwbw3 = bwbw.f158785c;
                }
                bwbt bwbt3 = bwbw3.f158788b;
                if (bwbt3 == null) {
                    bwbt3 = bwbt.f158758k;
                }
                String str6 = bwbt3.f158760a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                str6.getClass();
                ((booz) da.f164949b).f134077d = str6;
                String d3 = m54951d(bwbt3.f158761b);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                d3.getClass();
                ((booz) da.f164949b).f134078e = d3;
                String str7 = bwbt3.f158763d;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                boot boot3 = boot.f133997z;
                str7.getClass();
                ((boot) bxvd.f164949b).f134000c = str7;
                int b3 = bwcc.m121742b(bwbt3.f158766g);
                if (b3 == 0) {
                    b3 = 1;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((booz) da.f164949b).f134079f = bwcc.m121741a(b3);
            }
        } else if (bwbu.m121732a(bwbv2.f158779a) == bwbu.OPERATION) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134076c = booy.m111407a(13);
            if (bwbv2.f158779a != 5) {
                bwbx = bwbx.f158789c;
            } else {
                bwbx = (bwbx) bwbv2.f158780b;
            }
            bxyk bxyk4 = bwbx.f158792b;
            if (bxyk4 == null) {
                bxyk4 = bxyk.f165095c;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxyk4.getClass();
            ((booz) da.f164949b).f134080g = bxyk4;
        }
        if (cfnf.m140504e()) {
            bszx a2 = bszx.m116352a(bwbv2.f158782d);
            if (a2 == null) {
                a2 = bszx.UNRECOGNIZED;
            }
            int b4 = agrq.m55006b(a2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134076c = booy.m111407a(b4);
        }
        if (cfnf.m140508i()) {
            bxwc bxwc = bwbv2.f158784f;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                bwca bwca = (bwca) bxwc.get(i2);
                bxvd da2 = boov.f134026c.mo74144da();
                String str8 = bwca.f158806b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                str8.getClass();
                ((boov) da2.f164949b).f134029b = str8;
                int b5 = bwcb.m121740b(bwca.f158805a);
                if (b5 == 0) {
                    b5 = 1;
                }
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((boov) da2.f164949b).f134028a = bwcb.m121739a(b5);
                boov boov = (boov) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                booz booz = (booz) da.f164949b;
                boov.getClass();
                if (!booz.f134083j.mo73666a()) {
                    booz.f134083j = GeneratedMessageLite.m124021a(booz.f134083j);
                }
                booz.f134083j.add(boov);
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134084k = i;
        } else {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booz) da.f164949b).f134084k = -1;
        }
        booz booz2 = (booz) da.f164949b;
        booz2.f134081h = j;
        booz2.f134082i = j2;
        booz booz3 = (booz) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot4 = boot.f133997z;
        booz3.getClass();
        ((boot) bxvd.f164949b).f134009l = booz3;
        mo35994a((boot) bxvd.mo74062i(), bygd);
    }

    /* renamed from: a */
    public final void mo36001a(bxvd bxvd, Bundle bundle, bygd bygd, long j, String str, Integer num, Long l) {
        long j2;
        if (cfmq.m140238i()) {
            m54945a(bxvd, bundle);
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        ((boot) bxvd.f164949b).f134003f = j;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot2 = (boot) bxvd.f164949b;
        boot2.f134015r = j2;
        if (str == null) {
            str = "";
        }
        str.getClass();
        boot2.f134000c = str;
        mo35995a((boot) bxvd.mo74062i(), bygd, num);
    }

    /* renamed from: a */
    public final void mo36002a(bxzv bxzv, int i, int i2) {
        boot a = mo35978a(20, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = bonz.f133873h.mo74144da();
        if (bxzv == null) {
            bxzv = bxzv.TASK_UNKNOWN;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bonz) da.f164949b).f133876b = bxzv.mo3214a();
        bxvd da2 = bont.f133854b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((bont) da2.f164949b).f133856a = i - 2;
        bont bont = (bont) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bont.getClass();
        ((bonz) da.f164949b).f133881g = bont;
        bonz bonz = (bonz) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        bonz.getClass();
        ((boot) bxvd.f164949b).f134017t = bonz;
        mo35995a((boot) bxvd.mo74062i(), bygd.CHECK_IF_TASK_DUE, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final void mo36003a(bygd bygd, int i, String str, String str2) {
        boot a = mo35978a(i, str, str2);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        mo35994a((boot) bxvd.mo74062i(), bygd);
    }

    /* renamed from: a */
    public final void mo36004a(bygd bygd, long j, String str, String str2, Integer num, Long l) {
        mo35991a((Bundle) null, bygd, j, str, str2, num, l);
    }

    /* renamed from: a */
    public final void mo36005a(bygd bygd, Integer num) {
        mo36007a(bygd, bnkn.m109661a(), (bygb) null, num);
    }

    /* renamed from: a */
    public final void mo36006a(bygd bygd, String str, String str2) {
        boot a = m54944a(25, str, str2, -1);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        mo35994a((boot) bxvd.mo74062i(), bygd);
    }

    /* renamed from: a */
    public final void mo36007a(bygd bygd, List list, bygb bygb, Integer num) {
        boot a = mo35978a(22, "Local_Cache", "MDP_BgTask");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        bxvd da = booe.f133904c.mo74144da();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            agzc agzc = (agzc) list.get(i);
            if (agzc.mo36194b() != null) {
                bxvd da2 = bopk.f134134f.mo74144da();
                String b = agzc.mo36194b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                b.getClass();
                ((bopk) da2.f164949b).f134136a = b;
                if (agzc.mo36197e() != null) {
                    bygb e = agzc.mo36197e();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ((bopk) da2.f164949b).f134139d = e.mo3214a();
                }
                if (agzc.mo36199f() != null) {
                    bxyk a2 = bxzt.m124580a(agzc.mo36199f().longValue());
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    a2.getClass();
                    ((bopk) da2.f164949b).f134140e = a2;
                }
                bopk bopk = (bopk) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                booe booe = (booe) da.f164949b;
                bopk.getClass();
                if (!booe.f133906a.mo73666a()) {
                    booe.f133906a = GeneratedMessageLite.m124021a(booe.f133906a);
                }
                booe.f133906a.add(bopk);
            }
        }
        if (bygb != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((booe) da.f164949b).f133907b = bygb.mo3214a();
        }
        booe booe2 = (booe) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        booe2.getClass();
        ((boot) bxvd.f164949b).f134020w = booe2;
        mo35995a((boot) bxvd.mo74062i(), bygd, num);
    }

    /* renamed from: a */
    public final void mo36008a(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse, boolean z, String str) {
        String str2;
        if (!z) {
            str2 = "GTAF_Server";
        } else {
            str2 = "Local_Cache";
        }
        boot a = mo35978a(3, str2, str);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (cfmq.m140238i() && mdpCarrierPlanIdRequest != null) {
            m54945a(bxvd, mdpCarrierPlanIdRequest.f80148b);
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        long j = 0;
        ((boot) bxvd.f164949b).f134003f = 0;
        Long l = mdpCarrierPlanIdResponse.f80160j;
        if (l != null) {
            j = l.longValue();
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boot) bxvd.f164949b).f134015r = j;
        bxvd da = booo.f133961c.mo74144da();
        String str3 = mdpCarrierPlanIdResponse.f80151a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booo booo = (booo) da.f164949b;
        str3.getClass();
        booo.f133963a = str3;
        booo.f133964b = mdpCarrierPlanIdResponse.f80152b;
        booo booo2 = (booo) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        booo2.getClass();
        ((boot) bxvd.f164949b).f134004g = booo2;
        mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_CPID_RESPONSE_SUCCESS, mdpCarrierPlanIdResponse.f80159i);
    }

    /* renamed from: a */
    public final void mo36009a(MdpDataPlanStatusRequest mdpDataPlanStatusRequest, MdpDataPlanStatusResponse mdpDataPlanStatusResponse, boolean z, String str) {
        String str2;
        if (mdpDataPlanStatusResponse != null) {
            if (!z) {
                str2 = "GTAF_Server";
            } else {
                str2 = "Local_Cache";
            }
            boot a = mo35978a(5, str2, str);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (cfmq.m140238i() && mdpDataPlanStatusRequest != null) {
                m54945a(bxvd, mdpDataPlanStatusRequest.f80183b);
            }
            String str3 = mdpDataPlanStatusResponse.f80186a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = (boot) bxvd.f164949b;
            boot boot2 = boot.f133997z;
            str3.getClass();
            boot.f134000c = str3;
            long j = 0;
            boot.f134003f = 0;
            Long l = mdpDataPlanStatusResponse.f80192g;
            if (l != null) {
                j = l.longValue();
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot3 = (boot) bxvd.f164949b;
            boot3.f134015r = j;
            if (mdpDataPlanStatusResponse.f80187b != null) {
                boot3.f134005h = GeneratedMessageLite.m124030de();
                MdpDataPlanStatus[] mdpDataPlanStatusArr = mdpDataPlanStatusResponse.f80187b;
                for (MdpDataPlanStatus mdpDataPlanStatus : mdpDataPlanStatusArr) {
                    bxvd da = boop.f133965n.mo74144da();
                    String str4 = mdpDataPlanStatus.f80163b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    str4.getClass();
                    ((boop) da.f164949b).f133967a = str4;
                    long a2 = m54941a(mdpDataPlanStatus.f80164c);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    boop boop = (boop) da.f164949b;
                    boop.f133968b = a2;
                    String str5 = mdpDataPlanStatus.f80165d;
                    str5.getClass();
                    boop.f133969c = str5;
                    boop.f133972f = mdpDataPlanStatus.f80176o;
                    if (cfmq.f184403a.mo6606a().mo81515h()) {
                        int b = bszi.m116340b(m54940a(mdpDataPlanStatus.f80166e));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((boop) da.f164949b).f133976j = bszi.m116339a(b);
                        int b2 = bszi.m116340b(m54946b(mdpDataPlanStatus.f80167f));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((boop) da.f164949b).f133977k = bszi.m116339a(b2);
                        int b3 = bszi.m116340b(m54940a(mdpDataPlanStatus.f80177p));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((boop) da.f164949b).f133978l = bszi.m116339a(b3);
                        int b4 = bszi.m116340b(m54946b(mdpDataPlanStatus.f80178q));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((boop) da.f164949b).f133979m = bszi.m116339a(b4);
                    } else {
                        long j2 = mdpDataPlanStatus.f80166e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boop boop2 = (boop) da.f164949b;
                        boop2.f133970d = j2;
                        boop2.f133971e = mdpDataPlanStatus.f80167f;
                        boop2.f133973g = mdpDataPlanStatus.f80177p;
                        boop2.f133974h = mdpDataPlanStatus.f80178q;
                    }
                    MdpFlexTimeWindow[] mdpFlexTimeWindowArr = mdpDataPlanStatus.f80168g;
                    if (mdpFlexTimeWindowArr != null) {
                        for (MdpFlexTimeWindow mdpFlexTimeWindow : mdpFlexTimeWindowArr) {
                            bxvd da2 = boor.f133984e.mo74144da();
                            String str6 = mdpFlexTimeWindow.f80194a;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            str6.getClass();
                            ((boor) da2.f164949b).f133986a = str6;
                            long b5 = m54948b(mdpFlexTimeWindow.f80195b);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((boor) da2.f164949b).f133987b = b5;
                            long b6 = m54948b(mdpFlexTimeWindow.f80196c);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            boor boor = (boor) da2.f164949b;
                            boor.f133988c = b6;
                            boor.f133989d = mdpFlexTimeWindow.f80197d;
                            boor boor2 = (boor) da2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            boop boop3 = (boop) da.f164949b;
                            boor2.getClass();
                            if (!boop3.f133975i.mo73666a()) {
                                boop3.f133975i = GeneratedMessageLite.m124021a(boop3.f133975i);
                            }
                            boop3.f133975i.add(boor2);
                        }
                    }
                    boop boop4 = (boop) da.mo74062i();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    boot boot4 = (boot) bxvd.f164949b;
                    boop4.getClass();
                    if (!boot4.f134005h.mo73666a()) {
                        boot4.f134005h = GeneratedMessageLite.m124021a(boot4.f134005h);
                    }
                    boot4.f134005h.add(boop4);
                }
            }
            mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_DP_STATUS_RESPONSE_SUCCESS, mdpDataPlanStatusResponse.f80191f);
        }
    }

    /* renamed from: a */
    public final void mo36010a(MdpPurchaseOfferRequest mdpPurchaseOfferRequest, MdpPurchaseOfferResponse mdpPurchaseOfferResponse, String str, String str2) {
        long j;
        boot a = mo35978a(11, "GTAF_Server", str2);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (cfmq.m140238i() && mdpPurchaseOfferRequest != null) {
            m54945a(bxvd, mdpPurchaseOfferRequest.f80202e);
        }
        bxvd da = bopb.f134091f.mo74144da();
        String str3 = mdpPurchaseOfferResponse.f80208a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bopb bopb = (bopb) da.f164949b;
        str3.getClass();
        bopb.f134093a = str3;
        String str4 = mdpPurchaseOfferResponse.f80209b;
        str4.getClass();
        bopb.f134094b = str4;
        String str5 = mdpPurchaseOfferResponse.f80211d;
        str5.getClass();
        bopb.f134095c = str5;
        String str6 = mdpPurchaseOfferResponse.f80210c;
        str6.getClass();
        bopb.f134096d = str6;
        long a2 = m54941a(mdpPurchaseOfferResponse.f80214g);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bopb) da.f164949b).f134097e = a2;
        bopb bopb2 = (bopb) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        bopb2.getClass();
        ((boot) bxvd.f164949b).f134008k = bopb2;
        String a3 = stm.m36299a(str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        a3.getClass();
        ((boot) bxvd.f164949b).f134000c = a3;
        Long l = mdpPurchaseOfferResponse.f80217j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boot) bxvd.f164949b).f134015r = j;
        mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_PURCHASE_RESPONSE_SUCCESS, mdpPurchaseOfferResponse.f80216i);
    }

    /* renamed from: a */
    public final void mo36011a(MdpUpsellOfferRequest mdpUpsellOfferRequest, MdpUpsellOfferResponse mdpUpsellOfferResponse, String str, boolean z, String str2) {
        String str3;
        long j;
        if (mdpUpsellOfferResponse != null) {
            if (!z) {
                str3 = "GTAF_Server";
            } else {
                str3 = "Local_Cache";
            }
            boot a = mo35978a(7, str3, str2);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            if (cfmq.m140238i() && mdpUpsellOfferRequest != null) {
                m54945a(bxvd, mdpUpsellOfferRequest.f80219b);
            }
            bxvd da = bopp.f134159e.mo74144da();
            String str4 = mdpUpsellOfferResponse.f80223a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bopp bopp = (bopp) da.f164949b;
            str4.getClass();
            bopp.f134161a = str4;
            String str5 = mdpUpsellOfferResponse.f80224b;
            str5.getClass();
            bopp.f134162b = str5;
            String str6 = mdpUpsellOfferResponse.f80225c;
            str6.getClass();
            bopp.f134163c = str6;
            MdpUpsellPlan[] mdpUpsellPlanArr = mdpUpsellOfferResponse.f80227e;
            if (mdpUpsellPlanArr != null) {
                int length = mdpUpsellPlanArr.length;
                int i = 0;
                while (i < length) {
                    MdpUpsellPlan mdpUpsellPlan = mdpUpsellPlanArr[i];
                    int b = byed.m124702b(mdpUpsellPlan.f80242k);
                    if (b != 0) {
                        if (b == 1) {
                            b = 2;
                        }
                        bxvd da2 = bopq.f134165k.mo74144da();
                        String str7 = mdpUpsellPlan.f80233b;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bopq bopq = (bopq) da2.f164949b;
                        str7.getClass();
                        bopq.f134168b = str7;
                        String str8 = mdpUpsellPlan.f80232a;
                        str8.getClass();
                        bopq.f134167a = str8;
                        String str9 = mdpUpsellPlan.f80234c;
                        str9.getClass();
                        bopq.f134169c = str9;
                        bopq.f134170d = mdpUpsellPlan.f80235d;
                        String str10 = mdpUpsellPlan.f80236e;
                        str10.getClass();
                        bopq.f134171e = str10;
                        String str11 = mdpUpsellPlan.f80237f;
                        str11.getClass();
                        bopq.f134172f = str11;
                        bopq.f134173g = mdpUpsellPlan.f80238g;
                        bopq.f134174h = mdpUpsellPlan.f80239h;
                        String str12 = mdpUpsellPlan.f80240i;
                        str12.getClass();
                        bopq.f134175i = str12;
                        bopq.f134176j = byed.m124701a(b);
                        bopq bopq2 = (bopq) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bopp bopp2 = (bopp) da.f164949b;
                        bopq2.getClass();
                        if (!bopp2.f134164d.mo73666a()) {
                            bopp2.f134164d = GeneratedMessageLite.m124021a(bopp2.f134164d);
                        }
                        bopp2.f134164d.add(bopq2);
                        i++;
                    } else {
                        throw null;
                    }
                }
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot = boot.f133997z;
            ((boot) bxvd.f164949b).f134006i = GeneratedMessageLite.m124030de();
            bopp bopp3 = (bopp) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot2 = (boot) bxvd.f164949b;
            bopp3.getClass();
            if (!boot2.f134006i.mo73666a()) {
                boot2.f134006i = GeneratedMessageLite.m124021a(boot2.f134006i);
            }
            boot2.f134006i.add(bopp3);
            Long l = mdpUpsellOfferResponse.f80230h;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boot boot3 = (boot) bxvd.f164949b;
            boot3.f134015r = j;
            if (str != null) {
                str.getClass();
                boot3.f134000c = str;
            }
            mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_US_OFFER_RESPONSE_SUCCESS, mdpUpsellOfferResponse.f80229g);
        }
    }

    /* renamed from: a */
    public final void mo36012a(GetConsentInformationRequest getConsentInformationRequest, GetConsentInformationResponse getConsentInformationResponse, String str, String str2, bmxv bmxv) {
        long j;
        Long l;
        ConsentStatus consentStatus;
        boot a = mo35978a(14, "GTAF_Server", str2);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (cfmq.m140238i() && getConsentInformationRequest != null) {
            m54945a(bxvd, getConsentInformationRequest.f80275e);
        }
        String a2 = stm.m36299a(str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = boot.f133997z;
        a2.getClass();
        ((boot) bxvd.f164949b).f134000c = a2;
        Long l2 = getConsentInformationResponse.f80280e;
        if (l2 != null) {
            j = l2.longValue();
        } else {
            j = 0;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        ((boot) bxvd.f164949b).f134015r = j;
        bxvd da = boos.f133990e.mo74144da();
        if (!(getConsentInformationResponse == null || (consentStatus = getConsentInformationResponse.f80276a) == null)) {
            bygb a3 = bygb.m124774a(consentStatus.f80270a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((boos) da.f164949b).f133992a = a3.mo3214a();
        }
        if (!(getConsentInformationResponse == null || (l = getConsentInformationResponse.f80278c) == null)) {
            bxyk a4 = bxzt.m124580a(l.longValue());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a4.getClass();
            ((boos) da.f164949b).f133993b = a4;
        }
        if (cfmd.m140084d()) {
            long j2 = (long) ((Status) bmxv.mo66812a(Status.f30107a)).f30115i;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((boot) bxvd.f164949b).f134003f = j2;
            ConsentAgreementText consentAgreementText = getConsentInformationResponse.f80277b;
            if (consentAgreementText != null) {
                int i = consentAgreementText.f80268g;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boos boos = (boos) da.f164949b;
                boos.f133994c = i;
                String str3 = getConsentInformationResponse.f80277b.f80269h;
                str3.getClass();
                boos.f133995d = str3;
            }
        }
        boos boos2 = (boos) da.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boos2.getClass();
        ((boot) bxvd.f164949b).f134011n = boos2;
        mo35995a((boot) bxvd.mo74062i(), bygd.MODULE_GET_CONSENT_INFORMATION_RESPONSE_SUCCESS, getConsentInformationResponse.f80279d);
    }

    /* renamed from: a */
    public final void mo36013a(String str, int i, int i2, int i3, long j, List list) {
        booh booh = (booh) booj.f133916p.mo74144da();
        String b = agyt.m55303b(stm.m36299a(str));
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        booj booj = (booj) booh.f164949b;
        b.getClass();
        booj.f133918a = b;
        booj.f133923f = booi.m111389a(2);
        if (!sqw.m36041a((Collection) list)) {
            booh.mo68922a(list);
        }
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(i);
        booj booj2 = (booj) booh.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booj2.getClass();
        ((boon) da.f164949b).f133959g = booj2;
        boon boon = (boon) da.mo74062i();
        boot a = mo35978a(17, "GTAF_Server", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        boot.f134015r = j;
        boon.getClass();
        boot.f134013p = boon;
        if (cfmq.m140242m() && i2 != 0) {
            long j2 = (long) i2;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((boot) bxvd.f164949b).f134003f = j2;
        }
        mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, Integer.valueOf(i3));
    }

    /* renamed from: a */
    public final void mo36014a(String str, int i, long j) {
        boot a = mo35978a(20, "GTAF_Server", "MDP_BgTask");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        String a2 = stm.m36299a(str);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        a2.getClass();
        boot.f134000c = a2;
        boot.f134015r = j;
        mo35995a((boot) bxvd.mo74062i(), bygd.BACKGROUND_SET_CONSENT_SUCCESS, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo36015a(String str, String str2, int i, long j, String str3, int i2, int i3, Integer num, Long l) {
        long j2;
        booh booh = (booh) booj.f133916p.mo74144da();
        String b = agyt.m55303b(stm.m36299a(str));
        if (booh.f164950c) {
            booh.mo74035c();
            booh.f164950c = false;
        }
        booj booj = (booj) booh.f164949b;
        b.getClass();
        booj.f133918a = b;
        str2.getClass();
        booj.f133919b = str2;
        booj.f133920c = i;
        booj.f133921d = j;
        str3.getClass();
        booj.f133922e = str3;
        booj.f133923f = booi.m111389a(i3);
        booj booj2 = (booj) booh.mo74062i();
        bxvd da = boon.f133951i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((boon) da.f164949b).f133953a = bool.m111393a(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        booj2.getClass();
        ((boon) da.f164949b).f133959g = booj2;
        boon boon = (boon) da.mo74062i();
        boot a = mo35978a(17, i2 != 6 ? "GTAF_Server" : "Error", "MDP_PeriodicService");
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boot boot = (boot) bxvd.f164949b;
        boot boot2 = boot.f133997z;
        boot.f134015r = j2;
        boon.getClass();
        boot.f134013p = boon;
        mo35995a((boot) bxvd.mo74062i(), bygd.CPID_REGISTER_ACTION, num);
    }

    /* renamed from: a */
    public final void mo36016a(boolean z, int i, String str, int i2, int i3, Integer num, Long l) {
        mo35980a(5, 3, z, i, str, bygd.BACKGROUND_CONSENT_SUCCESS, i2, i3, num, l);
    }
}
