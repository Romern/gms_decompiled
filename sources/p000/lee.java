package p000;

import android.os.Build;
import android.service.autofill.FieldClassification;
import android.service.autofill.FillEventHistory;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.operation.UserFieldTypeManager;
import com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult;
import com.google.android.gms.autofill.service.common.ClientState;
import com.google.android.gms.autofill.service.common.DetectionHistory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* renamed from: lee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lee implements ldm {

    /* renamed from: a */
    public static final /* synthetic */ int f25864a = 0;

    /* renamed from: b */
    private static final srn f25865b = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: c */
    private final kwu f25866c;

    /* renamed from: d */
    private final lef f25867d;

    /* renamed from: e */
    private final kpk f25868e;

    public lee(kwu kwu, lef lef, kpk kpk) {
        this.f25866c = kwu;
        this.f25867d = lef;
        this.f25868e = kpk;
    }

    /* renamed from: a */
    private static kzv m18972a(int i, int i2, int i3) {
        bxvd da = kzv.f25479f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzv kzv = (kzv) da.f164949b;
        int i4 = kzv.f25481a | 1;
        kzv.f25481a = i4;
        kzv.f25482b = i2;
        kzv.f25481a = i4 | 2;
        kzv.f25483c = i;
        bxvd da2 = kzu.f25475c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        kzu kzu = (kzu) da2.f164949b;
        kzu.f25477a |= 1;
        kzu.f25478b = i3;
        kzu kzu2 = (kzu) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzv kzv2 = (kzv) da.f164949b;
        kzu2.getClass();
        kzv2.f25484d = kzu2;
        kzv2.f25481a |= 4;
        return (kzv) da.mo74062i();
    }

    /* renamed from: b */
    private static kzv m18980b(int i, int i2, int i3) {
        bxvd da = kzv.f25479f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzv kzv = (kzv) da.f164949b;
        int i4 = kzv.f25481a | 1;
        kzv.f25481a = i4;
        kzv.f25482b = i2;
        int i5 = i4 | 2;
        kzv.f25481a = i5;
        kzv.f25483c = i;
        kzv.f25481a = i5 | 8;
        kzv.f25485e = i3 - 1;
        return (kzv) da.mo74062i();
    }

    /* renamed from: a */
    private static kzv m18973a(int i, int i2, int i3, int i4) {
        bxvd da = kzv.f25479f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzv kzv = (kzv) da.f164949b;
        int i5 = kzv.f25481a | 1;
        kzv.f25481a = i5;
        kzv.f25482b = i2;
        kzv.f25481a = i5 | 2;
        kzv.f25483c = i;
        bxvd da2 = kzu.f25475c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        kzu kzu = (kzu) da2.f164949b;
        kzu.f25477a |= 1;
        kzu.f25478b = i3;
        kzu kzu2 = (kzu) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzv kzv2 = (kzv) da.f164949b;
        kzu2.getClass();
        kzv2.f25484d = kzu2;
        int i6 = kzv2.f25481a | 4;
        kzv2.f25481a = i6;
        kzv2.f25481a = i6 | 8;
        kzv2.f25485e = i4 - 1;
        return (kzv) da.mo74062i();
    }

    /* renamed from: a */
    private final void m18974a(FillEventHistory.Event event, MetricsContext metricsContext, ClientState clientState) {
        HashMap hashMap = new HashMap();
        bnre i = clientState.f11671c.mo7979a().listIterator();
        while (i.hasNext()) {
            bnre i2 = ((AbstractDetectionHistory$DetectionResult) i.next()).mo7970b().listIterator();
            while (i2.hasNext()) {
                FillField fillField = (FillField) i2.next();
                hashMap.put(fillField.f11631a, fillField);
            }
        }
        bxvd da = lak.f25559f.mo74144da();
        bxvd da2 = kzz.f25505d.mo74144da();
        kzx b = metricsContext.mo7956b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        b.getClass();
        ((kzz) da2.f164949b).f25508b = b;
        lbh c = metricsContext.mo7957c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        c.getClass();
        ((kzz) da2.f164949b).f25509c = c;
        int a = metricsContext.mo7953a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((kzz) da2.f164949b).f25507a = a;
        kzz kzz = (kzz) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        kzz.getClass();
        ((lak) da.f164949b).f25561a = kzz;
        for (Map.Entry<AutofillId, FieldClassification> entry : event.getFieldsClassification().entrySet()) {
            FillField fillField2 = (FillField) hashMap.get(entry.getKey());
            if (fillField2 == null) {
                bnsl bnsl = (bnsl) f25865b.mo68388c();
                bnsl.mo68432a("lee", "a", 599, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("AutofillId supplied by Framework predictions is not supported by information contained in Detection History.");
            } else {
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                for (FieldClassification.Match match : entry.getValue().getMatches()) {
                    if (match.getScore() > 0.8f) {
                        hashSet.add(kpb.m18277a(match.getCategoryId()));
                    }
                    if (match.getScore() >= 1.0f) {
                        hashSet2.add(kpb.m18277a(match.getCategoryId()));
                    }
                }
                if (!hashSet.isEmpty()) {
                    kqg c2 = fillField2.mo7945c();
                    c2.mo14802a((Iterable) hashSet);
                    c2.mo14805a(lbc.UNKNOWN_DETECTION_METHOD);
                    FillField a2 = c2.mo14800a();
                    da.mo74014a(kwv.m18702a(fillField2));
                    da.mo74039c(kwv.m18702a(a2));
                }
                if (!hashSet2.isEmpty()) {
                    kqg c3 = fillField2.mo7945c();
                    c3.mo14802a((Iterable) hashSet2);
                    c3.mo14805a(lbc.UNKNOWN_DETECTION_METHOD);
                    da.mo74032b(kwv.m18702a(c3.mo14800a()));
                }
            }
        }
        kpb[] values = kpb.values();
        for (kpb kpb : values) {
            if (!(kpb == kpb.NOT_APPLICABLE || kpb == kpb.UNKNOWN_DATA_TYPE || kpb == kpb.UNRECOGNIZED || !clientState.f11672d.mo7964a(kpb))) {
                da.mo74103r(kpb.mo3214a());
            }
        }
        lak lak = (lak) da.mo74062i();
        if (lak.f25563c.size() > 0) {
            this.f25866c.mo14912m(new ldq(lak));
        }
    }

    /* renamed from: a */
    private final void m18975a(FillEventHistory.Event event, MetricsContext metricsContext, ClientState clientState, List list, List list2, bnhe bnhe) {
        String str;
        String str2;
        int i;
        bnhe bnhe2;
        int i2;
        kzv kzv;
        int i3;
        ArrayList arrayList;
        kzv kzv2;
        String str3;
        String str4;
        UserFieldTypeManager userFieldTypeManager;
        ClientState clientState2 = clientState;
        List list3 = list;
        List list4 = list2;
        bnhe bnhe3 = bnhe;
        bxvd da = laq.f25596d.mo74144da();
        kzx b = metricsContext.mo7956b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((laq) da.f164949b).f25598a = b;
        lbh c = metricsContext.mo7957c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((laq) da.f164949b).f25599b = c;
        bnha bnha = new bnha();
        ArrayList arrayList2 = new ArrayList();
        bngx d = clientState2.f11671c.mo7979a();
        int size = d.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.addAll(((AbstractDetectionHistory$DetectionResult) d.get(i4)).mo7970b());
        }
        UserFieldTypeManager userFieldTypeManager2 = clientState2.f11672d;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (true) {
            str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            str2 = "a";
            if (i5 >= size2) {
                break;
            }
            FillField fillField = (FillField) arrayList2.get(i5);
            AutofillId autofillId = fillField.f11631a;
            bmxv b2 = fillField.mo7944b();
            Integer valueOf = b2.mo66813a() ? Integer.valueOf(((kka) b2.mo66814b()).mo14554a().mo68741c()) : null;
            if (valueOf == null) {
                userFieldTypeManager = userFieldTypeManager2;
                bnha.mo67695b(autofillId, led.m18968a(fillField.f11634d, Integer.valueOf(fillField.f11632b), -1));
                bnsl bnsl = (bnsl) f25865b.mo68388c();
                bnsl.mo68432a("lee", str2, 345, str);
                bnsl.mo68405a("Cannot find Metrics ID or no Fingerprint provided by MetricsContext");
            } else {
                userFieldTypeManager = userFieldTypeManager2;
                bnha.mo67695b(autofillId, led.m18968a(fillField.f11634d, Integer.valueOf(fillField.f11632b), valueOf));
            }
            i5++;
            userFieldTypeManager2 = userFieldTypeManager;
        }
        bnhe b3 = bnha.mo67618b();
        Map<AutofillId, FieldClassification> fieldsClassification = event.getFieldsClassification();
        bngs bngs = new bngs();
        Iterator<Map.Entry<AutofillId, FieldClassification>> it = fieldsClassification.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<AutofillId, FieldClassification> next = it.next();
            led led = (led) b3.get(next.getKey());
            if (led == null) {
                bnsl bnsl2 = (bnsl) f25865b.mo68388c();
                bnsl2.mo68432a("lee", str2, 364, str);
                bnsl2.mo68405a("AutofillId supplied by Framework predictions is not supported by information containedin Detection History.");
            } else {
                bxvd da2 = lal.f25566d.mo74144da();
                bnic a = led.mo15011a();
                if (a != null) {
                    bnrd a2 = a.iterator();
                    while (a2.hasNext()) {
                        kpb kpb = (kpb) a2.next();
                        da2.mo74107s(kpb.mo3214a());
                        da2.mo74018a(userFieldTypeManager2.mo7964a(kpb));
                        b3 = b3;
                    }
                    bnhe2 = b3;
                } else {
                    bnhe2 = b3;
                }
                List<FieldClassification.Match> matches = next.getValue().getMatches();
                ArrayList arrayList3 = new ArrayList();
                Iterator<FieldClassification.Match> it2 = matches.iterator();
                while (it2.hasNext()) {
                    FieldClassification.Match next2 = it2.next();
                    Iterator<FieldClassification.Match> it3 = it2;
                    int a3 = kpb.m18277a(next2.getCategoryId()).mo3214a();
                    float score = next2.getScore();
                    Iterator<Map.Entry<AutofillId, FieldClassification>> it4 = it;
                    if (a3 != kpb.PAYMENT_CARD_NUMBER.mo3214a() && score > 0.8f) {
                        str4 = str;
                        str3 = str2;
                    } else if (a3 == kpb.PAYMENT_CARD_NUMBER.mo3214a()) {
                        str4 = str;
                        str3 = str2;
                        double d2 = (double) score;
                        if (d2 < 0.20952631578947367d || d2 > 0.3343333333333333d) {
                            str = str4;
                            it2 = it3;
                            it = it4;
                            str2 = str3;
                        }
                    } else {
                        it2 = it3;
                        it = it4;
                    }
                    da2.mo74110t(a3);
                    arrayList3.add(Integer.valueOf(a3));
                    str = str4;
                    it2 = it3;
                    it = it4;
                    str2 = str3;
                }
                Iterator<Map.Entry<AutofillId, FieldClassification>> it5 = it;
                String str5 = str;
                String str6 = str2;
                da.mo74013a((lal) da2.mo74062i());
                Integer valueOf2 = Integer.valueOf(led.mo15012b());
                Integer valueOf3 = Integer.valueOf(led.mo15013c());
                if (!list4.contains(valueOf3)) {
                    i2 = !list3.contains(valueOf3) ? 1 : 3;
                } else {
                    i2 = 2;
                }
                if (!arrayList3.isEmpty()) {
                    int size3 = arrayList3.size();
                    int i6 = i2;
                    int i7 = 0;
                    while (i7 < size3) {
                        Integer num = (Integer) arrayList3.get(i7);
                        if (ccjc.m130017c()) {
                            arrayList = arrayList3;
                            i3 = size3;
                            kzv2 = m18973a(valueOf2.intValue(), valueOf3.intValue(), num.intValue(), i6);
                            i6 = 1;
                        } else {
                            arrayList = arrayList3;
                            i3 = size3;
                            kzv2 = m18972a(valueOf2.intValue(), valueOf3.intValue(), num.intValue());
                        }
                        bngs.mo67668c(kzv2);
                        i7++;
                        arrayList3 = arrayList;
                        size3 = i3;
                    }
                } else if (ccjc.f179140a.mo6606a().mo76102f()) {
                    if (ccjc.m130017c()) {
                        kzv = m18973a(valueOf2.intValue(), valueOf3.intValue(), kpb.UNKNOWN_DATA_TYPE.mo3214a(), i2);
                    } else {
                        kzv = m18972a(valueOf2.intValue(), valueOf3.intValue(), kpb.UNKNOWN_DATA_TYPE.mo3214a());
                    }
                    bngs.mo67668c(kzv);
                } else {
                    str = str5;
                    b3 = bnhe2;
                    it = it5;
                    str2 = str6;
                }
                if (i2 == 2) {
                    list4.remove(valueOf3);
                } else if (i2 == 3) {
                    list3.remove(valueOf3);
                    str = str5;
                    b3 = bnhe2;
                    it = it5;
                    str2 = str6;
                }
                str = str5;
                b3 = bnhe2;
                it = it5;
                str2 = str6;
            }
        }
        String str7 = str;
        String str8 = str2;
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Integer num2 = (Integer) it6.next();
            Integer num3 = (Integer) bnhe3.get(num2);
            if (num3 != null) {
                bngs.mo67668c(m18980b(num3.intValue(), num2.intValue(), 3));
            }
        }
        Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            Integer num4 = (Integer) it7.next();
            Integer num5 = (Integer) bnhe3.get(num4);
            if (num5 != null) {
                bngs.mo67668c(m18980b(num5.intValue(), num4.intValue(), 2));
            }
        }
        this.f25866c.mo14907h(new ldo(da));
        if (!bngs.mo67664a().isEmpty()) {
            kzx b4 = metricsContext.mo7956b();
            String num6 = Integer.toString(b4.f25497b);
            Set set = userFieldTypeManager2.f11666a;
            kpb[] kpbArr = (kpb[]) set.toArray(new kpb[set.size()]);
            String str9 = b4.f25496a;
            try {
                kck b5 = this.f25868e.mo14765b(str9);
                bngx a4 = bngs.mo67664a();
                String str10 = b5.f23841b;
                bxvd da3 = kzw.f25486g.mo74144da();
                if (!da3.f164950c) {
                    i = 0;
                } else {
                    da3.mo74035c();
                    i = 0;
                    da3.f164950c = false;
                }
                kzw kzw = (kzw) da3.f164949b;
                "1".getClass();
                int i8 = kzw.f25488a | 1;
                kzw.f25488a = i8;
                kzw.f25489b = "1";
                str10.getClass();
                int i9 = 2 | i8;
                kzw.f25488a = i9;
                kzw.f25490c = str10;
                num6.getClass();
                kzw.f25488a = i9 | 4;
                kzw.f25491d = num6;
                int length = kpbArr.length;
                while (i < length) {
                    da3.mo74099q(kpbArr[i].mo3214a());
                    i++;
                }
                bnre i10 = a4.listIterator();
                while (i10.hasNext()) {
                    da3.mo74012a((kzv) i10.next());
                }
                this.f25867d.mo15017a(new ldp(da3));
            } catch (kpi e) {
                bnsl bnsl3 = (bnsl) f25865b.mo68388c();
                bnsl3.mo68432a("lee", str8, 503, str7);
                bnsl3.mo68420a("Authentication Domain could not be created from %s", str9);
            }
        }
    }

    /* renamed from: a */
    private final void m18976a(bnic bnic, MetricsContext metricsContext, ClientState clientState, FillEventHistory.Event event) {
        bnhe bnhe;
        int i;
        kzv kzv;
        int i2;
        ArrayList arrayList;
        kzv kzv2;
        String str;
        String str2;
        UserFieldTypeManager userFieldTypeManager;
        ClientState clientState2 = clientState;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        bnha h = bnhe.m109414h();
        String str3 = "lee";
        String str4 = "a";
        if (ccjc.m130017c()) {
            bnre i3 = metricsContext.mo7959e().listIterator();
            while (i3.hasNext()) {
                bnre i4 = ((MetricsContext.FillContext) i3.next()).f11648b.listIterator();
                while (i4.hasNext()) {
                    bxwc bxwc = ((lba) i4.next()).f25679c;
                    int size = bxwc.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        lbd lbd = (lbd) bxwc.get(i5);
                        int i6 = lbd.f25698c;
                        if (i6 == 0) {
                            bnsl bnsl = (bnsl) f25865b.mo68388c();
                            bnsl.mo68432a(str3, str4, 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68405a("Could not retrieve hash for NOT_APPLICABLE field.");
                        } else {
                            Integer valueOf = Integer.valueOf(i6);
                            if (!arrayList2.contains(valueOf) && !arrayList3.contains(valueOf)) {
                                int b = lbb.m18871b(lbd.f25696a);
                                if (b == 0) {
                                    b = 1;
                                }
                                h.mo67695b(valueOf, Integer.valueOf(lbb.m18870a(b)));
                            }
                            if (!bnic.contains(Integer.valueOf(lbd.f25700e))) {
                                arrayList2.add(valueOf);
                            } else {
                                arrayList3.add(valueOf);
                            }
                        }
                    }
                }
            }
        }
        bnhe b2 = h.mo67618b();
        bxvd da = laq.f25596d.mo74144da();
        kzx b3 = metricsContext.mo7956b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b3.getClass();
        ((laq) da.f164949b).f25598a = b3;
        lbh c = metricsContext.mo7957c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((laq) da.f164949b).f25599b = c;
        bnha bnha = new bnha();
        ArrayList arrayList4 = new ArrayList();
        bngx d = clientState2.f11671c.mo7979a();
        int size2 = d.size();
        for (int i7 = 0; i7 < size2; i7++) {
            arrayList4.addAll(((AbstractDetectionHistory$DetectionResult) d.get(i7)).mo7970b());
        }
        UserFieldTypeManager userFieldTypeManager2 = clientState2.f11672d;
        int size3 = arrayList4.size();
        int i8 = 0;
        while (i8 < size3) {
            String str5 = str4;
            String str6 = str3;
            FillField fillField = (FillField) arrayList4.get(i8);
            AutofillId autofillId = fillField.f11631a;
            bmxv b4 = fillField.mo7944b();
            Integer valueOf2 = b4.mo66813a() ? Integer.valueOf(((kka) b4.mo66814b()).mo14554a().mo68741c()) : null;
            if (valueOf2 == null) {
                userFieldTypeManager = userFieldTypeManager2;
                bnha.mo67695b(autofillId, led.m18968a(fillField.f11634d, Integer.valueOf(fillField.f11632b), -1));
                bnsl bnsl2 = (bnsl) f25865b.mo68388c();
                bnsl2.mo68432a(str6, str5, 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Cannot find Metrics ID or no Fingerprint provided by MetricsContext");
            } else {
                userFieldTypeManager = userFieldTypeManager2;
                bnha.mo67695b(autofillId, led.m18968a(fillField.f11634d, Integer.valueOf(fillField.f11632b), valueOf2));
            }
            i8++;
            str3 = str6;
            str4 = str5;
            userFieldTypeManager2 = userFieldTypeManager;
        }
        bnhe b5 = bnha.mo67618b();
        Map<AutofillId, FieldClassification> fieldsClassification = event.getFieldsClassification();
        bngs bngs = new bngs();
        Iterator<Map.Entry<AutofillId, FieldClassification>> it = fieldsClassification.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<AutofillId, FieldClassification> next = it.next();
            led led = (led) b5.get(next.getKey());
            if (led == null) {
                bnsl bnsl3 = (bnsl) f25865b.mo68388c();
                bnsl3.mo68432a(str3, str4, 364, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("AutofillId supplied by Framework predictions is not supported by information containedin Detection History.");
            } else {
                bxvd da2 = lal.f25566d.mo74144da();
                bnic a = led.mo15011a();
                if (a != null) {
                    bnrd a2 = a.iterator();
                    while (a2.hasNext()) {
                        kpb kpb = (kpb) a2.next();
                        da2.mo74107s(kpb.mo3214a());
                        da2.mo74018a(userFieldTypeManager2.mo7964a(kpb));
                        b5 = b5;
                    }
                    bnhe = b5;
                } else {
                    bnhe = b5;
                }
                List<FieldClassification.Match> matches = next.getValue().getMatches();
                ArrayList arrayList5 = new ArrayList();
                Iterator<FieldClassification.Match> it2 = matches.iterator();
                while (it2.hasNext()) {
                    FieldClassification.Match next2 = it2.next();
                    Iterator<FieldClassification.Match> it3 = it2;
                    int a3 = kpb.m18277a(next2.getCategoryId()).mo3214a();
                    float score = next2.getScore();
                    Iterator<Map.Entry<AutofillId, FieldClassification>> it4 = it;
                    if (a3 != kpb.PAYMENT_CARD_NUMBER.mo3214a() && score > 0.8f) {
                        str2 = str3;
                        str = str4;
                    } else if (a3 == kpb.PAYMENT_CARD_NUMBER.mo3214a()) {
                        str2 = str3;
                        str = str4;
                        double d2 = (double) score;
                        if (d2 < 0.20952631578947367d || d2 > 0.3343333333333333d) {
                            it2 = it3;
                            str3 = str2;
                            it = it4;
                            str4 = str;
                        }
                    } else {
                        it2 = it3;
                        it = it4;
                    }
                    da2.mo74110t(a3);
                    arrayList5.add(Integer.valueOf(a3));
                    it2 = it3;
                    str3 = str2;
                    it = it4;
                    str4 = str;
                }
                String str7 = str3;
                String str8 = str4;
                Iterator<Map.Entry<AutofillId, FieldClassification>> it5 = it;
                da.mo74013a((lal) da2.mo74062i());
                Integer valueOf3 = Integer.valueOf(led.mo15012b());
                Integer valueOf4 = Integer.valueOf(led.mo15013c());
                if (arrayList3.contains(valueOf4)) {
                    i = 2;
                } else if (!arrayList2.contains(valueOf4)) {
                    i = 1;
                } else {
                    i = 3;
                }
                if (!arrayList5.isEmpty()) {
                    int size4 = arrayList5.size();
                    int i9 = i;
                    int i10 = 0;
                    while (i10 < size4) {
                        Integer num = (Integer) arrayList5.get(i10);
                        if (ccjc.m130017c()) {
                            i2 = size4;
                            arrayList = arrayList5;
                            kzv2 = m18973a(valueOf3.intValue(), valueOf4.intValue(), num.intValue(), i9);
                            i9 = 1;
                        } else {
                            i2 = size4;
                            arrayList = arrayList5;
                            kzv2 = m18972a(valueOf3.intValue(), valueOf4.intValue(), num.intValue());
                        }
                        bngs.mo67668c(kzv2);
                        i10++;
                        size4 = i2;
                        arrayList5 = arrayList;
                    }
                } else if (ccjc.f179140a.mo6606a().mo76102f()) {
                    if (ccjc.m130017c()) {
                        kzv = m18973a(valueOf3.intValue(), valueOf4.intValue(), kpb.UNKNOWN_DATA_TYPE.mo3214a(), i);
                    } else {
                        kzv = m18972a(valueOf3.intValue(), valueOf4.intValue(), kpb.UNKNOWN_DATA_TYPE.mo3214a());
                    }
                    bngs.mo67668c(kzv);
                } else {
                    str3 = str7;
                    b5 = bnhe;
                    it = it5;
                    str4 = str8;
                }
                if (i == 2) {
                    arrayList3.remove(valueOf4);
                } else if (i == 3) {
                    arrayList2.remove(valueOf4);
                    str3 = str7;
                    b5 = bnhe;
                    it = it5;
                    str4 = str8;
                }
                str3 = str7;
                b5 = bnhe;
                it = it5;
                str4 = str8;
            }
        }
        String str9 = str3;
        String str10 = str4;
        int size5 = arrayList2.size();
        for (int i11 = 0; i11 < size5; i11++) {
            Integer num2 = (Integer) arrayList2.get(i11);
            Integer num3 = (Integer) b2.get(num2);
            if (num3 != null) {
                bngs.mo67668c(m18980b(num3.intValue(), num2.intValue(), 3));
            }
        }
        int size6 = arrayList3.size();
        int i12 = 0;
        while (i12 < size6) {
            String str11 = str9;
            String str12 = str10;
            Integer num4 = (Integer) arrayList3.get(i12);
            Integer num5 = (Integer) b2.get(num4);
            if (num5 != null) {
                bngs.mo67668c(m18980b(num5.intValue(), num4.intValue(), 2));
            }
            i12++;
            str9 = str11;
            str10 = str12;
        }
        this.f25866c.mo14907h(new ldo(da));
        if (!bngs.mo67664a().isEmpty()) {
            kzx b6 = metricsContext.mo7956b();
            String num6 = Integer.toString(b6.f25497b);
            Set set = userFieldTypeManager2.f11666a;
            kpb[] kpbArr = (kpb[]) set.toArray(new kpb[set.size()]);
            String str13 = b6.f25496a;
            try {
                kck b7 = this.f25868e.mo14765b(str13);
                bngx a4 = bngs.mo67664a();
                String str14 = b7.f23841b;
                bxvd da3 = kzw.f25486g.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                kzw kzw = (kzw) da3.f164949b;
                "1".getClass();
                int i13 = kzw.f25488a | 1;
                kzw.f25488a = i13;
                kzw.f25489b = "1";
                str14.getClass();
                int i14 = 2 | i13;
                kzw.f25488a = i14;
                kzw.f25490c = str14;
                num6.getClass();
                kzw.f25488a = i14 | 4;
                kzw.f25491d = num6;
                for (kpb kpb2 : kpbArr) {
                    da3.mo74099q(kpb2.mo3214a());
                }
                bnre i15 = a4.listIterator();
                while (i15.hasNext()) {
                    da3.mo74012a((kzv) i15.next());
                }
                this.f25867d.mo15017a(new ldp(da3));
            } catch (kpi e) {
                bnsl bnsl4 = (bnsl) f25865b.mo68388c();
                bnsl4.mo68432a(str9, str10, 503, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68420a("Authentication Domain could not be created from %s", str13);
            }
        }
    }

    /* renamed from: a */
    private final void m18977a(MetricsContext metricsContext) {
        MetricsContext.FillContext fillContext;
        bnre i = metricsContext.mo7959e().mo67670d().listIterator();
        while (true) {
            if (!i.hasNext()) {
                fillContext = null;
                break;
            }
            fillContext = (MetricsContext.FillContext) i.next();
            if (fillContext.f11649c.mo66813a()) {
                break;
            }
        }
        if (fillContext == null) {
            int i2 = Build.VERSION.SDK_INT;
            String str = metricsContext.mo7956b().f25496a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
            sb.append(i2);
            sb.append(" @ ");
            sb.append(str);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            bnsl bnsl = (bnsl) f25865b.mo68387b();
            bnsl.mo68437a(illegalStateException);
            bnsl.mo68432a("lee", "a", 699, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FillContext for save missing.");
            return;
        }
        bxvd da = lav.f25623e.mo74144da();
        bxvd da2 = kzz.f25505d.mo74144da();
        int a = metricsContext.mo7953a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        ((kzz) da2.f164949b).f25507a = a;
        kzx b = metricsContext.mo7956b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        b.getClass();
        ((kzz) da2.f164949b).f25508b = b;
        lbh c = metricsContext.mo7957c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        c.getClass();
        ((kzz) da2.f164949b).f25509c = c;
        kzz kzz = (kzz) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        lav lav = (lav) da.f164949b;
        kzz.getClass();
        lav.f25626b = kzz;
        lav.f25628d = fillContext.f11650d;
        if (fillContext.f11647a.mo66813a()) {
            lbf lbf = (lbf) fillContext.f11647a.mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            lbf.getClass();
            ((lav) da.f164949b).f25625a = lbf;
        }
        if (fillContext.f11649c.mo66813a()) {
            laz laz = (laz) fillContext.f11649c.mo66814b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((lav) da.f164949b).f25627c = laz.mo3214a();
        }
        kwu kwu = this.f25866c;
        da.getClass();
        kwu.mo14902c(new lds(da));
    }

    /* renamed from: a */
    private final void m18978a(MetricsContext metricsContext, FillEventHistory.Event event, ClientState clientState, bnic bnic) {
        String str;
        String str2;
        ClientState clientState2;
        int i;
        bnhe bnhe;
        Iterator<Map.Entry<AutofillId, FieldClassification>> it;
        int i2;
        String str3;
        kzv kzv;
        String str4;
        int i3;
        ArrayList arrayList;
        kzv kzv2;
        String str5;
        String str6;
        ArrayList arrayList2;
        ClientState clientState3 = clientState;
        String str7 = "lee";
        String str8 = "a";
        if (ccjc.m130016b()) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            bnha h = bnhe.m109414h();
            if (ccjc.m130017c()) {
                bnre i4 = metricsContext.mo7959e().listIterator();
                while (i4.hasNext()) {
                    bnre i5 = ((MetricsContext.FillContext) i4.next()).f11648b.listIterator();
                    while (i5.hasNext()) {
                        bxwc bxwc = ((lba) i5.next()).f25679c;
                        int size = bxwc.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            lbd lbd = (lbd) bxwc.get(i6);
                            int i7 = lbd.f25698c;
                            if (i7 == 0) {
                                bnsl bnsl = (bnsl) f25865b.mo68388c();
                                bnsl.mo68432a(str7, str8, 180, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68405a("Could not retrieve hash for NOT_APPLICABLE field.");
                            } else {
                                Integer valueOf = Integer.valueOf(i7);
                                if (!arrayList3.contains(valueOf) && !arrayList4.contains(valueOf)) {
                                    int b = lbb.m18871b(lbd.f25696a);
                                    if (b == 0) {
                                        b = 1;
                                    }
                                    h.mo67695b(valueOf, Integer.valueOf(lbb.m18870a(b)));
                                }
                                if (!bnic.contains(Integer.valueOf(lbd.f25700e))) {
                                    arrayList3.add(valueOf);
                                } else {
                                    arrayList4.add(valueOf);
                                }
                            }
                        }
                    }
                }
            }
            bnhe b2 = h.mo67618b();
            bxvd da = laq.f25596d.mo74144da();
            kzx b3 = metricsContext.mo7956b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b3.getClass();
            ((laq) da.f164949b).f25598a = b3;
            lbh c = metricsContext.mo7957c();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            c.getClass();
            ((laq) da.f164949b).f25599b = c;
            bnha bnha = new bnha();
            ArrayList arrayList5 = new ArrayList();
            bngx d = clientState3.f11671c.mo7979a();
            int size2 = d.size();
            for (int i8 = 0; i8 < size2; i8++) {
                arrayList5.addAll(((AbstractDetectionHistory$DetectionResult) d.get(i8)).mo7970b());
            }
            UserFieldTypeManager userFieldTypeManager = clientState3.f11672d;
            int size3 = arrayList5.size();
            int i9 = 0;
            while (i9 < size3) {
                String str9 = str7;
                String str10 = str8;
                FillField fillField = (FillField) arrayList5.get(i9);
                AutofillId autofillId = fillField.f11631a;
                bmxv b4 = fillField.mo7944b();
                Integer valueOf2 = b4.mo66813a() ? Integer.valueOf(((kka) b4.mo66814b()).mo14554a().mo68741c()) : null;
                if (valueOf2 == null) {
                    arrayList2 = arrayList3;
                    bnha.mo67695b(autofillId, led.m18968a(fillField.f11634d, Integer.valueOf(fillField.f11632b), -1));
                    bnsl bnsl2 = (bnsl) f25865b.mo68388c();
                    bnsl2.mo68432a(str9, str10, 345, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Cannot find Metrics ID or no Fingerprint provided by MetricsContext");
                } else {
                    arrayList2 = arrayList3;
                    bnha.mo67695b(autofillId, led.m18968a(fillField.f11634d, Integer.valueOf(fillField.f11632b), valueOf2));
                }
                i9++;
                arrayList3 = arrayList2;
                str8 = str10;
                str7 = str9;
            }
            bnhe b5 = bnha.mo67618b();
            Map<AutofillId, FieldClassification> fieldsClassification = event.getFieldsClassification();
            bngs bngs = new bngs();
            Iterator<Map.Entry<AutofillId, FieldClassification>> it2 = fieldsClassification.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<AutofillId, FieldClassification> next = it2.next();
                led led = (led) b5.get(next.getKey());
                if (led == null) {
                    bnsl bnsl3 = (bnsl) f25865b.mo68388c();
                    bnsl3.mo68432a(str7, str8, 364, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("AutofillId supplied by Framework predictions is not supported by information containedin Detection History.");
                } else {
                    bxvd da2 = lal.f25566d.mo74144da();
                    bnic a = led.mo15011a();
                    if (a != null) {
                        bnrd a2 = a.iterator();
                        while (a2.hasNext()) {
                            kpb kpb = (kpb) a2.next();
                            da2.mo74107s(kpb.mo3214a());
                            da2.mo74018a(userFieldTypeManager.mo7964a(kpb));
                            it2 = it2;
                            b5 = b5;
                        }
                        bnhe = b5;
                        it = it2;
                    } else {
                        bnhe = b5;
                        it = it2;
                    }
                    List<FieldClassification.Match> matches = next.getValue().getMatches();
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<FieldClassification.Match> it3 = matches.iterator();
                    while (it3.hasNext()) {
                        FieldClassification.Match next2 = it3.next();
                        Iterator<FieldClassification.Match> it4 = it3;
                        int a3 = kpb.m18277a(next2.getCategoryId()).mo3214a();
                        float score = next2.getScore();
                        if (a3 != kpb.PAYMENT_CARD_NUMBER.mo3214a() && score > 0.8f) {
                            str6 = str7;
                            str5 = str8;
                        } else {
                            if (a3 == kpb.PAYMENT_CARD_NUMBER.mo3214a()) {
                                str6 = str7;
                                str5 = str8;
                                double d2 = (double) score;
                                if (d2 < 0.20952631578947367d || d2 > 0.3343333333333333d) {
                                    str7 = str6;
                                    str8 = str5;
                                }
                            }
                            it3 = it4;
                        }
                        da2.mo74110t(a3);
                        arrayList6.add(Integer.valueOf(a3));
                        str7 = str6;
                        str8 = str5;
                        it3 = it4;
                    }
                    String str11 = str7;
                    String str12 = str8;
                    da.mo74013a((lal) da2.mo74062i());
                    Integer valueOf3 = Integer.valueOf(led.mo15012b());
                    Integer valueOf4 = Integer.valueOf(led.mo15013c());
                    if (arrayList4.contains(valueOf4)) {
                        i2 = 2;
                    } else if (!arrayList3.contains(valueOf4)) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                    }
                    if (!arrayList6.isEmpty()) {
                        int size4 = arrayList6.size();
                        int i10 = i2;
                        int i11 = 0;
                        while (i11 < size4) {
                            Integer num = (Integer) arrayList6.get(i11);
                            if (ccjc.m130017c()) {
                                arrayList = arrayList6;
                                i3 = size4;
                                str4 = str11;
                                kzv2 = m18973a(valueOf3.intValue(), valueOf4.intValue(), num.intValue(), i10);
                                i10 = 1;
                            } else {
                                str4 = str11;
                                arrayList = arrayList6;
                                i3 = size4;
                                kzv2 = m18972a(valueOf3.intValue(), valueOf4.intValue(), num.intValue());
                            }
                            bngs.mo67668c(kzv2);
                            i11++;
                            arrayList6 = arrayList;
                            size4 = i3;
                            str11 = str4;
                        }
                        str3 = str11;
                    } else {
                        str3 = str11;
                        if (ccjc.f179140a.mo6606a().mo76102f()) {
                            if (ccjc.m130017c()) {
                                kzv = m18973a(valueOf3.intValue(), valueOf4.intValue(), kpb.UNKNOWN_DATA_TYPE.mo3214a(), i2);
                            } else {
                                kzv = m18972a(valueOf3.intValue(), valueOf4.intValue(), kpb.UNKNOWN_DATA_TYPE.mo3214a());
                            }
                            bngs.mo67668c(kzv);
                        } else {
                            str8 = str12;
                            it2 = it;
                            b5 = bnhe;
                            str7 = str3;
                        }
                    }
                    if (i2 == 2) {
                        arrayList4.remove(valueOf4);
                    } else if (i2 == 3) {
                        arrayList3.remove(valueOf4);
                        str8 = str12;
                        it2 = it;
                        b5 = bnhe;
                        str7 = str3;
                    }
                    str8 = str12;
                    it2 = it;
                    b5 = bnhe;
                    str7 = str3;
                }
            }
            String str13 = str7;
            String str14 = str8;
            int size5 = arrayList3.size();
            for (int i12 = 0; i12 < size5; i12++) {
                Integer num2 = (Integer) arrayList3.get(i12);
                Integer num3 = (Integer) b2.get(num2);
                if (num3 != null) {
                    bngs.mo67668c(m18980b(num3.intValue(), num2.intValue(), 3));
                }
            }
            int size6 = arrayList4.size();
            int i13 = 0;
            while (i13 < size6) {
                String str15 = str14;
                String str16 = str13;
                Integer num4 = (Integer) arrayList4.get(i13);
                Integer num5 = (Integer) b2.get(num4);
                if (num5 != null) {
                    bngs.mo67668c(m18980b(num5.intValue(), num4.intValue(), 2));
                }
                i13++;
                str13 = str16;
                str14 = str15;
            }
            this.f25866c.mo14907h(new ldo(da));
            if (!bngs.mo67664a().isEmpty()) {
                kzx b6 = metricsContext.mo7956b();
                String num6 = Integer.toString(b6.f25497b);
                Set set = userFieldTypeManager.f11666a;
                kpb[] kpbArr = (kpb[]) set.toArray(new kpb[set.size()]);
                String str17 = b6.f25496a;
                try {
                    kck b7 = this.f25868e.mo14765b(str17);
                    bngx a4 = bngs.mo67664a();
                    String str18 = b7.f23841b;
                    bxvd da3 = kzw.f25486g.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    kzw kzw = (kzw) da3.f164949b;
                    "1".getClass();
                    int i14 = kzw.f25488a | 1;
                    kzw.f25488a = i14;
                    kzw.f25489b = "1";
                    str18.getClass();
                    int i15 = 2 | i14;
                    kzw.f25488a = i15;
                    kzw.f25490c = str18;
                    num6.getClass();
                    kzw.f25488a = i15 | 4;
                    kzw.f25491d = num6;
                    for (kpb kpb2 : kpbArr) {
                        da3.mo74099q(kpb2.mo3214a());
                    }
                    bnre i16 = a4.listIterator();
                    while (i16.hasNext()) {
                        da3.mo74012a((kzv) i16.next());
                    }
                    this.f25867d.mo15017a(new ldp(da3));
                    str2 = str14;
                    str = str13;
                } catch (kpi e) {
                    bnsl bnsl4 = (bnsl) f25865b.mo68388c();
                    str = str13;
                    bnsl4.mo68432a(str, str14, 503, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68420a("Authentication Domain could not be created from %s", str17);
                    str2 = str14;
                }
            } else {
                str = str13;
                str2 = str14;
            }
        } else {
            str = str7;
            str2 = str8;
        }
        if (ccip.f179070a.mo6606a().mo76055r()) {
            HashMap hashMap = new HashMap();
            clientState2 = clientState;
            bnre i17 = clientState2.f11671c.mo7979a().listIterator();
            while (i17.hasNext()) {
                bnre i18 = ((AbstractDetectionHistory$DetectionResult) i17.next()).mo7970b().listIterator();
                while (i18.hasNext()) {
                    FillField fillField2 = (FillField) i18.next();
                    hashMap.put(fillField2.f11631a, fillField2);
                }
            }
            bxvd da4 = lak.f25559f.mo74144da();
            bxvd da5 = kzz.f25505d.mo74144da();
            kzx b8 = metricsContext.mo7956b();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            b8.getClass();
            ((kzz) da5.f164949b).f25508b = b8;
            lbh c2 = metricsContext.mo7957c();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            c2.getClass();
            ((kzz) da5.f164949b).f25509c = c2;
            int a5 = metricsContext.mo7953a();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            ((kzz) da5.f164949b).f25507a = a5;
            kzz kzz = (kzz) da5.mo74062i();
            if (!da4.f164950c) {
                i = 0;
            } else {
                da4.mo74035c();
                i = 0;
                da4.f164950c = false;
            }
            kzz.getClass();
            ((lak) da4.f164949b).f25561a = kzz;
            for (Map.Entry<AutofillId, FieldClassification> entry : event.getFieldsClassification().entrySet()) {
                FillField fillField3 = (FillField) hashMap.get(entry.getKey());
                if (fillField3 == null) {
                    bnsl bnsl5 = (bnsl) f25865b.mo68388c();
                    bnsl5.mo68432a(str, str2, 599, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68405a("AutofillId supplied by Framework predictions is not supported by information contained in Detection History.");
                } else {
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    for (FieldClassification.Match match : entry.getValue().getMatches()) {
                        if (match.getScore() > 0.8f) {
                            hashSet.add(kpb.m18277a(match.getCategoryId()));
                        }
                        if (match.getScore() >= 1.0f) {
                            hashSet2.add(kpb.m18277a(match.getCategoryId()));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        kqg c3 = fillField3.mo7945c();
                        c3.mo14802a((Iterable) hashSet);
                        c3.mo14805a(lbc.UNKNOWN_DETECTION_METHOD);
                        FillField a6 = c3.mo14800a();
                        da4.mo74014a(kwv.m18702a(fillField3));
                        da4.mo74039c(kwv.m18702a(a6));
                    }
                    if (!hashSet2.isEmpty()) {
                        kqg c4 = fillField3.mo7945c();
                        c4.mo14802a((Iterable) hashSet2);
                        c4.mo14805a(lbc.UNKNOWN_DETECTION_METHOD);
                        da4.mo74032b(kwv.m18702a(c4.mo14800a()));
                    }
                }
            }
            kpb[] values = kpb.values();
            int length = values.length;
            while (i < length) {
                kpb kpb3 = values[i];
                if (!(kpb3 == kpb.NOT_APPLICABLE || kpb3 == kpb.UNKNOWN_DATA_TYPE || kpb3 == kpb.UNRECOGNIZED || !clientState2.f11672d.mo7964a(kpb3))) {
                    da4.mo74103r(kpb3.mo3214a());
                }
                i++;
            }
            lak lak = (lak) da4.mo74062i();
            if (lak.f25563c.size() > 0) {
                this.f25866c.mo14912m(new ldq(lak));
            }
        } else {
            clientState2 = clientState;
        }
        DetectionHistory detectionHistory = clientState2.f11671c;
        Map<AutofillId, String> changedFields = event.getChangedFields();
        if (!changedFields.isEmpty()) {
            Map map = (Map) detectionHistory.mo15002b().stream().flatMap(ldn.f25842a).collect(Collectors.toMap(ldu.f25852a, ldv.f25853a));
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            bnre i19 = metricsContext.mo7959e().listIterator();
            while (i19.hasNext()) {
                MetricsContext.FillContext fillContext = (MetricsContext.FillContext) i19.next();
                bnre i20 = fillContext.f11648b.listIterator();
                while (i20.hasNext()) {
                    lba lba = (lba) i20.next();
                    String valueOf5 = String.valueOf(lba.f25677a);
                    if (fillContext.f11647a.mo66813a()) {
                        hashMap2.put(valueOf5, (lbf) fillContext.f11647a.mo66814b());
                    }
                    hashMap3.put(valueOf5, lba);
                }
            }
            for (Map.Entry entry2 : ((Map) changedFields.entrySet().stream().collect(Collectors.groupingBy(ldw.f25854a, Collectors.mapping(ldx.f25855a, Collectors.toList())))).entrySet()) {
                String str19 = (String) entry2.getKey();
                Collection collection = (Collection) entry2.getValue();
                if (!hashMap3.containsKey(str19)) {
                    bnsl bnsl6 = (bnsl) f25865b.mo68388c();
                    bnsl6.mo68432a(str, str2, 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("metrics context missing metrics dataset for id");
                } else {
                    lba lba2 = (lba) hashMap3.get(str19);
                    if (!hashMap2.containsKey(str19)) {
                        bnsl bnsl7 = (bnsl) f25865b.mo68388c();
                        bnsl7.mo68432a(str, str2, 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl7.mo68405a("FillContext for dataset is missing metrics form");
                    } else {
                        lbf lbf = (lbf) hashMap2.get(str19);
                        Stream stream = collection.stream();
                        map.getClass();
                        Stream filter = stream.filter(new ldy(map));
                        map.getClass();
                        Collection collection2 = (Collection) filter.map(new ldz(map)).filter(lea.f25858a).map(leb.f25859a).collect(Collectors.toList());
                        if (collection.size() != collection2.size()) {
                            bnsl bnsl8 = (bnsl) f25865b.mo68388c();
                            bnsl8.mo68432a(str, str2, 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl8.mo68405a("autofillIdFillFieldMap missing modified autofill id(s)");
                        }
                        this.f25866c.mo14911l(new lec(metricsContext, lbf, lba2, collection2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m18979a(MetricsContext metricsContext, String str, bnia bnia, int i) {
        try {
            int parseInt = Integer.parseInt(str);
            bnre i2 = metricsContext.mo7959e().listIterator();
            while (i2.hasNext()) {
                MetricsContext.FillContext fillContext = (MetricsContext.FillContext) i2.next();
                bnre i3 = fillContext.f11648b.listIterator();
                while (i3.hasNext()) {
                    lba lba = (lba) i3.next();
                    if (lba.f25677a == parseInt) {
                        this.f25866c.mo14910k(new ldr(metricsContext, fillContext, lba, i));
                        if (ccjc.m130017c()) {
                            bxwc bxwc = lba.f25679c;
                            int size = bxwc.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                bnia.mo67629b(Integer.valueOf(((lbd) bxwc.get(i4)).f25700e));
                            }
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            bnsl bnsl = (bnsl) f25865b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("lee", "a", 553, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to convert dataset id to integer");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15029a(FillEventHistory.Event event, MetricsContext metricsContext, DetectionHistory detectionHistory) {
        Map<AutofillId, String> changedFields = event.getChangedFields();
        if (!changedFields.isEmpty()) {
            Map map = (Map) detectionHistory.mo15002b().stream().flatMap(ldn.f25842a).collect(Collectors.toMap(ldu.f25852a, ldv.f25853a));
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            bnre i = metricsContext.mo7959e().listIterator();
            while (i.hasNext()) {
                MetricsContext.FillContext fillContext = (MetricsContext.FillContext) i.next();
                bnre i2 = fillContext.f11648b.listIterator();
                while (i2.hasNext()) {
                    lba lba = (lba) i2.next();
                    String valueOf = String.valueOf(lba.f25677a);
                    if (fillContext.f11647a.mo66813a()) {
                        hashMap.put(valueOf, (lbf) fillContext.f11647a.mo66814b());
                    }
                    hashMap2.put(valueOf, lba);
                }
            }
            for (Map.Entry entry : ((Map) changedFields.entrySet().stream().collect(Collectors.groupingBy(ldw.f25854a, Collectors.mapping(ldx.f25855a, Collectors.toList())))).entrySet()) {
                String str = (String) entry.getKey();
                Collection collection = (Collection) entry.getValue();
                if (!hashMap2.containsKey(str)) {
                    bnsl bnsl = (bnsl) f25865b.mo68388c();
                    bnsl.mo68432a("lee", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("metrics context missing metrics dataset for id");
                } else {
                    lba lba2 = (lba) hashMap2.get(str);
                    if (!hashMap.containsKey(str)) {
                        bnsl bnsl2 = (bnsl) f25865b.mo68388c();
                        bnsl2.mo68432a("lee", "a", 267, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68405a("FillContext for dataset is missing metrics form");
                    } else {
                        lbf lbf = (lbf) hashMap.get(str);
                        Stream stream = collection.stream();
                        map.getClass();
                        Stream filter = stream.filter(new ldy(map));
                        map.getClass();
                        Collection collection2 = (Collection) filter.map(new ldz(map)).filter(lea.f25858a).map(leb.f25859a).collect(Collectors.toList());
                        if (collection.size() != collection2.size()) {
                            bnsl bnsl3 = (bnsl) f25865b.mo68388c();
                            bnsl3.mo68432a("lee", "a", 281, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68405a("autofillIdFillFieldMap missing modified autofill id(s)");
                        }
                        this.f25866c.mo14911l(new lec(metricsContext, lbf, lba2, collection2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15018a(FillEventHistory fillEventHistory) {
        List<FillEventHistory.Event> events;
        MetricsContext.FillContext fillContext;
        if (fillEventHistory != null && (events = fillEventHistory.getEvents()) != null) {
            ClientState a = ClientState.m7166a(fillEventHistory.getClientState());
            MetricsContext metricsContext = a.f11673e;
            if (metricsContext == null) {
                bnsl bnsl = (bnsl) f25865b.mo68387b();
                bnsl.mo68432a("lee", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Metrics context is missing from client state");
                return;
            }
            bnia bnia = new bnia();
            FillEventHistory.Event event = null;
            for (FillEventHistory.Event event2 : events) {
                int type = event2.getType();
                if (type != 0) {
                    if (type == 1) {
                        int i = Build.VERSION.SDK_INT;
                        m18979a(metricsContext, event2.getDatasetId(), bnia, event2.getType());
                    } else if (type != 2) {
                        if (type == 3) {
                            bnre i2 = metricsContext.mo7959e().mo67670d().listIterator();
                            while (true) {
                                if (!i2.hasNext()) {
                                    fillContext = null;
                                    break;
                                }
                                fillContext = (MetricsContext.FillContext) i2.next();
                                if (fillContext.f11649c.mo66813a()) {
                                    break;
                                }
                            }
                            if (fillContext == null) {
                                int i3 = Build.VERSION.SDK_INT;
                                String str = metricsContext.mo7956b().f25496a;
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
                                sb.append(i3);
                                sb.append(" @ ");
                                sb.append(str);
                                IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                                bnsl bnsl2 = (bnsl) f25865b.mo68387b();
                                bnsl2.mo68437a(illegalStateException);
                                bnsl2.mo68432a("lee", "a", 699, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("FillContext for save missing.");
                            } else {
                                bxvd da = lav.f25623e.mo74144da();
                                bxvd da2 = kzz.f25505d.mo74144da();
                                int a2 = metricsContext.mo7953a();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ((kzz) da2.f164949b).f25507a = a2;
                                kzx b = metricsContext.mo7956b();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                b.getClass();
                                ((kzz) da2.f164949b).f25508b = b;
                                lbh c = metricsContext.mo7957c();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                c.getClass();
                                ((kzz) da2.f164949b).f25509c = c;
                                kzz kzz = (kzz) da2.mo74062i();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                lav lav = (lav) da.f164949b;
                                kzz.getClass();
                                lav.f25626b = kzz;
                                lav.f25628d = fillContext.f11650d;
                                if (fillContext.f11647a.mo66813a()) {
                                    lbf lbf = (lbf) fillContext.f11647a.mo66814b();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    lbf.getClass();
                                    ((lav) da.f164949b).f25625a = lbf;
                                }
                                if (fillContext.f11649c.mo66813a()) {
                                    laz laz = (laz) fillContext.f11649c.mo66814b();
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    ((lav) da.f164949b).f25627c = laz.mo3214a();
                                }
                                kwu kwu = this.f25866c;
                                da.getClass();
                                kwu.mo14902c(new lds(da));
                            }
                        } else if (type == 4) {
                            int i4 = Build.VERSION.SDK_INT;
                            if (!ccjc.m130017c()) {
                                m18978a(metricsContext, event2, a, bnon.f131923a);
                            }
                            event = event2;
                        }
                    }
                }
                m18979a(metricsContext, event2.getDatasetId(), bnia, event2.getType());
            }
            int i5 = Build.VERSION.SDK_INT;
            if (ccjc.m130017c() && event != null) {
                m18978a(metricsContext, event, a, bnia.mo67751a());
            }
        }
    }
}
